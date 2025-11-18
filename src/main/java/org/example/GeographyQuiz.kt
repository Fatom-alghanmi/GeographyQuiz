package org.example

import kotlin.random.Random

fun main() {

    val provinces = arrayOf(
        "Alberta", "British Columbia", "Manitoba", "New Brunswick",
        "Newfoundland & Labrador", "Northwest Territories",
        "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan", "Yukon"
    )

    val capitals = arrayOf(
        "Edmonton", "Victoria", "Winnipeg", "Fredericton",
        "St. John's", "Yellowknife", "Halifax", "Iqaluit", "Toronto",
        "Charlottetown", "Quebec City", "Regina", "Whitehorse"
    )

    var duplicates = arrayOf(
        false, false, false, false,
        false, false, false, false,
        false, false, false, false,
        false
    )

    var answer: String
    var correct = 0

    println("Welcome to the Provinces Geography Quiz - Good Luck!")

    var question = 0

    for (count in 0..12) {

        // pick unused question index
        do {
            question = Random.nextInt(0, 13)
        } while (duplicates[question])

        duplicates[question] = true

        println("What is the capital of ${provinces[question]}?")
        print("Your answer: ")

        answer = readln()

        if (answer.equals(capitals[question], ignoreCase = true)) {
            println("Congratulations, you are correct!")
            correct += 1
        } else {
            println("Sorry, you are incorrect. The correct answer is ${capitals[question]}.")
        }
        println() // blank line for readability
    }

    println("You got $correct question(s) correct.")
}
