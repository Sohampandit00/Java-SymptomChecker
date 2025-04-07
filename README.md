# Java-SymptomChecker

A Java program that asks the user about fever and other symptoms and provides basic medical advice.

## Features

* Asks the user if they have a fever (yes/no).
* Asks the user if they have any other symptoms (yes/no).
* Provides medical advice based on the user's responses:
    * "Make a doctor's appointment" if both fever and other symptoms are "yes."
    * "Rest" if only fever is "yes."
    * "Hopefully symptoms improve" if only other symptoms are "yes."
* Handles user input using `Scanner` and conditional statements.

## Technologies Used

* Java

## How to Run

1.  Ensure you have the Java Development Kit (JDK) installed.
2.  Compile the `SymptomChecker.java` file using `javac SymptomChecker.java`.
3.  Run the compiled program using `java SymptomChecker`.
4.  Follow the on-screen prompts to answer the questions.

## Example Output

Do you have a fever? (yes/no): yes
Do you have any other symptoms? (yes/no): yes
Make a doctor's appointment
