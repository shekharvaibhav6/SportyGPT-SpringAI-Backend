#SportyGPT — AI Powered Sports Intelligence Platform

Your personal AI sports companion built with Spring AI, delivering real-time sports conversations, predictions, insights, and analytics with the power of LLMs.


🚀 Overview
SportyGPT is a modern AI-driven sports platform built using Spring Boot + Spring AI that enables users to interact with sports data in a conversational way.
From match summaries and player stats to AI-generated predictions and smart sports discussions — SportyGPT brings the future of sports engagement into one platform.
Whether you're a football fanatic, cricket analyst, fantasy league player, or casual sports lover, SportyGPT delivers intelligent responses powered by Large Language Models.

✨ Features
🤖 AI Sports Chat


Ask anything about sports naturally


AI-powered responses using Spring AI


Context-aware conversations


📊 Match Insights


Live match summaries


Team performance analysis


Win probability discussions


Tactical breakdowns


🧠 AI Predictions


Match outcome predictions


Player performance expectations


Fantasy sports suggestions


⚡ Real-Time Experience


Fast Spring Boot backend


REST APIs for scalability


Reactive and modern architecture


🔐 Secure Backend


JWT Authentication


Role-based access


Protected endpoints


🌍 Multi-Sport Support


Cricket


Football


Basketball


Tennis


More coming soon...



🛠️ Tech Stack
TechnologyPurposeJava 21Backend LanguageSpring Boot 3Backend FrameworkSpring AIAI IntegrationOpenAI / GeminiLLM ProviderMavenDependency ManagementMySQL / PostgreSQLDatabaseJWTAuthenticationReact / Next.jsFrontendTailwind CSSUI Styling

🧠 Spring AI Integration
SportyGPT leverages Spring AI to integrate powerful AI capabilities directly into the Spring ecosystem.
Supported AI Features


Prompt Engineering


Chat Completion


AI Service Layer


Structured Responses


Memory & Context Handling


AI-powered REST APIs



📂 Project Structure
sportygpt/│├── backend/│   ├── controller/│   ├── service/│   ├── repository/│   ├── security/│   ├── ai/│   └── config/│├── frontend/│   ├── components/│   ├── pages/│   ├── services/│   └── utils/│└── README.md

⚙️ Getting Started
1️⃣ Clone Repository
git clone https://github.com/yourusername/sportygpt.gitcd sportygpt

2️⃣ Configure Environment Variables
Create an .env file:
OPENAI_API_KEY=your_api_keyDB_URL=jdbc:mysql://localhost:3306/sportygptDB_USERNAME=rootDB_PASSWORD=passwordJWT_SECRET=your_secret

3️⃣ Run Backend
cd backendmvn spring-boot:run
Backend runs on:
http://localhost:8080

4️⃣ Run Frontend
cd frontendnpm installnpm run dev
Frontend runs on:
http://localhost:3000

🔥 Example AI Prompt
Who has a better chance of winning today’s match between India and Australia?
AI Response
Based on current form, bowling depth, and recent head-to-head statistics,India appears to have a slight advantage in today's match.

📡 API Endpoints
MethodEndpointDescriptionPOST/api/chatAI Sports ChatGET/api/matchesLive MatchesGET/api/teamsTeams DataGET/api/playersPlayer StatisticsPOST/api/predictMatch Prediction

🔐 Authentication
SportyGPT uses JWT authentication.
Features


User Signup/Login


Token-based authentication


Secure APIs


Role-based authorization



🖼️ Future Enhancements


🎙️ Voice AI Sports Assistant


📺 Live Commentary Generation


🧠 Fantasy Team Generator


📈 AI Betting Analytics


🏟️ Real-Time Match Streaming Integration


🌐 Multi-language Support



🤝 Contributing
Contributions are welcome!
Fork → Clone → Create Branch → Commit → Push → Pull Request

⭐ Why SportyGPT?
Because sports are emotional.
And AI makes them intelligent.
SportyGPT combines:


Modern AI


Scalable backend engineering


Real-time sports engagement


Conversational user experience


into one powerful platform.

📜 License
This project is licensed under the MIT License.

👨‍💻 Author
Built with ❤️ using Java, Spring Boot & AI.
🌟 Show Your Support
If you like this project:
⭐ Star the repository
🍴 Fork it
🧠 Build something amazing with AI & Sports
