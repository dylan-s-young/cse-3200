package com.example.lab2.model

data class Question (
    val id: Int,
    val val_question: String,
    val val_image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
    )