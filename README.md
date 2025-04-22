

# Palestinian Cities App

## 📱 Overview
An educational Android application that introduces users to key Palestinian cities through rich content and an interactive quiz. The app includes descriptive texts, city images, and a fun true/false quiz to test and track user knowledge.

---

## ✨ Features

### 🏙️ City Explorer
- Discover five major cities: **Jenin**, **Nablus**, **Ramallah**, **Bethlehem**, and **Jerusalem**
- View city descriptions and high-quality images
- Navigate using “Previous” and “Next” buttons

### ❓ Interactive Quiz
- 5-question **true/false quiz** based on city facts
- Instant feedback after each question
- Score displayed as a percentage after completion
- Retake the quiz to improve your score

### 📊 Score Tracking
- Displays your most recent quiz scores on the main screen
- Allows unlimited quiz attempts to reinforce learning

---

## 🧱 Project Structure

### Activities
- `MainActivity`: Launch screen with navigation options
- `CityInfoActivity`: Displays city details and images
- `QuizActivity`: Hosts the quiz interface and logic

### Core Classes
- `Question`: Model class for quiz questions
- `Answers`: Handles score storage using a static list

---

## ⚙️ Technical Details
- Developed in **Java** for **Android**
- Uses standard UI components: `TextView`, `ImageView`, `Button`, `RadioButton`, etc.
- Activity navigation handled via **Intents**
- Scores stored **in-memory**

---

## 🚀 Getting Started

### Prerequisites
- Android Studio (latest version)
- JDK 8 or higher
- Android SDK (min API level 21)
- Git (for cloning)

### Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/palestinian-cities-app.git
   ```
2. Open the project in Android Studio
3. Let Gradle finish syncing
4. Connect an Android device or start an emulator
5. Click **Run** or press `Shift + F10` to launch

### Resource Requirements
Ensure the following assets are in the project:
- Images: `jenin.jpg`, `nablus.jpg`, `ramallah.jpg`, `bethlehem.jpg`, `jerusalem.jpg`
- Strings in `strings.xml`:
  - `jenin_info`, `nablus_info`, `ramallah_info`, `bethlehem_info`, `jerusalem_info`

---

## 🧭 How to Use
1. Launch the app
2. Tap **City Information** to explore cities
3. Tap **Start Quiz** to test your knowledge
4. View your score after the quiz
5. Retake the quiz any time

---

## 🔧 Requirements
- Android 5.0 (API 21) or higher
- Compatible Gradle version with Android Studio

---

## 🤝 Contributing

### Reporting Issues
- Use the issue tracker to report bugs or suggest features
- Include detailed steps to reproduce and screenshots if possible

### Submitting Code
1. Fork the repo
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Make and test your changes
4. Commit with a clear message:
   ```bash
   git commit -m "Add feature: your description"
   ```
5. Push and create a Pull Request

### Code Style
- Follow Java naming conventions
- Comment non-obvious logic
- Keep UI/UX consistent


---


## 🌟 Future Improvements
- Add more cities and facts
- Expand quiz with difficulty levels
- Save scores using persistent storage
- Add videos and interactive maps
- Support multi-language UI
- Animate UI transitions

---

## 🙏 Acknowledgements
- All images are used for educational purposes
- Thanks to all contributors for their efforts!

---
