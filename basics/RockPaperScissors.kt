package com.example.kotlin.basics

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    print("1 -> Rock\n2 -> Paper\n3 -> Scissor\nEnter your choice: ")
    playerChoice = readln()

    when ((1..3).random()) {
        1 -> {
            computerChoice = "1"
        }
        2 -> {
            computerChoice = "2"
        }
        3 -> {
            computerChoice = "3"
        }
    }
    print(computerChoice+"\n")
    val winner = when{
        playerChoice == computerChoice -> "Tie"
        playerChoice == "1" && computerChoice == "3" -> "Player"
        playerChoice == "3" && computerChoice == "1" -> "Computer"
        playerChoice == "1" && computerChoice == "2" -> "Computer"
        playerChoice == "2" && computerChoice == "1" -> "Player"
        playerChoice == "2" && computerChoice == "3" -> "Player"
        playerChoice == "3" && computerChoice == "2" -> "Computer"
        else -> {"Wrong Choice"}
    }
    print(winner)
}