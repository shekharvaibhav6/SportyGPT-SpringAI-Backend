package com.example.springaicode.controller;

import com.example.springaicode.Movie;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.converter.BeanOutputConverter;
import org.springframework.ai.converter.ListOutputConverter;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class MovieController {

    private ChatClient chatClient;

    public MovieController(OpenAiChatModel chatModel){
        this.chatClient=ChatClient.create(chatModel);
    }
    @GetMapping("movies")
    public List<String> getMovies(@RequestParam String name){
        String message= """
                List Top 5 movies of {name}
                {format}
                """;

        ListOutputConverter opCon=new ListOutputConverter(new DefaultConversionService());
        Prompt prompt = PromptTemplate.builder()
                .template(message)
                .variables(Map.of("name", name, "format", opCon.getFormat()))
                .build()
                .create();
        List<String> movies=opCon.convert(chatClient.prompt(prompt).call().content());
        return movies;
    }
    @GetMapping("/movie")
    public Movie getMovieData(@RequestParam String name){
        String message= """
                Get me the best movie of {name}
                {format}
                """;
        BeanOutputConverter<Movie> opCon= new BeanOutputConverter<>(Movie.class);
        Prompt prompt = PromptTemplate.builder()
                .template(message)
                .variables(Map.of("name", name, "format", opCon.getFormat()))
                .build()
                .create();
        Movie movie=opCon.convert(chatClient.prompt(prompt).call().content());
        return movie;
    }
    @GetMapping("/moviesList")
    public List<Movie> getMovieList(@RequestParam String name){
        String message= """
                Top 5 movies of {name}
                {format}
                """;
        BeanOutputConverter<List<Movie>> opCon= new BeanOutputConverter<>(
                new ParameterizedTypeReference<List<Movie>>() {}
        );
        Prompt prompt = PromptTemplate.builder()
                .template(message)
                .variables(Map.of("name", name, "format", opCon.getFormat()))
                .build()
                .create();
        List<Movie> movies=opCon.convert(chatClient.prompt(prompt).call().content());
        return movies;
    }
}
