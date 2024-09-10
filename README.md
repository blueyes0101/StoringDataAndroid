# Simple Android Storing Data App

This is a simple Android application designed to store and retrieve user input (age) using **SharedPreferences**. The app demonstrates how to use local data storage in Android to save and retrieve a user's age, and also how to delete stored data.

## Features
- Save user input (age) using **SharedPreferences**.
- Retrieve and display the saved age when reopening the app.
- Delete the saved age from local storage.

## Technologies Used
- **Android Studio**
- **Java**
- **SharedPreferences**
- **ViewCompat** and **WindowInsetsCompat** for UI handling.
- **EdgeToEdge** for immersive UI experience.

## Code Overview

The app consists of a simple user interface with:
- An **EditText** to input the user's age.
- A **TextView** to display the saved or default age.
- A "Save" button to store the entered age.
- A "Delete" button to remove the saved age from **SharedPreferences**.

### Main Components
1. **MainActivity**:  
   - Initializes UI elements like **EditText** and **TextView**.
   - Uses **SharedPreferences** to store and retrieve an integer value representing the user's age.
   - Includes methods to save and delete data:
     - **save(View view)**: Saves the user's age from the input field to **SharedPreferences**.
     - **delete(View view)**: Deletes the saved age from **SharedPreferences** and resets the displayed value.

### Layout
The layout consists of:
- An input field to enter the user's age.
- A text field to display the current stored age.
- Save and Delete buttons.

## Getting Started

### Prerequisites
To run this project, you need:
- Android Studio installed on your computer.
- Basic knowledge of Kotlin/Java and Android development.

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/blueyes0101/StoringDataAndroid
    ```

2. Open the project in Android Studio.

3. Build and run the project on an emulator or physical device.

## Usage

1. Enter an age in the input field.
2. Press "Save" to store the entered age.
3. Reopen the app to see the saved age displayed.
4. Use the "Delete" button to remove the saved age.

## Contributing
Feel free to contribute by opening issues or submitting pull requests.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
