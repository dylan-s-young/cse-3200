package com.example.lab2.utils

import com.example.lab2.R
import com.example.lab2.model.Question

object Constants {

    fun getQuestions(): MutableList<Question> {
        val questions = mutableListOf<Question>()

        val quest1 = Question(
            1,
            "What State is this?",
            R.drawable.alabama,
            "Alabama",
            "Connecitcut",
            "Texas",
            "Vermont",
             1
        )
        questions.add(quest1)

        val quest2 = Question(
            2,
            "What State is this?",
            R.drawable.california,
            "Alabama",
            "California",
            "NewMexico",
            "North Dakota",
            2
        )
        questions.add(quest2)

        val quest3 = Question(
            3,
            "What State is this?",
            R.drawable.connecticut,
            "New Hampshire",
            "Connecitcut",
            "New Jersey",
            "Oregon",
            2
        )
        questions.add(quest3)

        val quest4 = Question(
            4,
            "What State is this?",
            R.drawable.delaware,
            "Detroid",
            "Pennsylvania",
            "Delaware",
            "Rhode Island",
            3
        )
        questions.add(quest4)

        val quest5 = Question(
            5,
            "What State is this?",
            R.drawable.hawaii,
            "New Zealand",
            "South Dakota",
            "Hawaii",
            "Utah",
            3
        )
        questions.add(quest5)

        val quest6 = Question(
            6,
            "What State is this?",
            R.drawable.illinois,
            "Illinois",
            "Connecitcut",
            "Wyoming",
            "Vermont",
            1
        )
        questions.add(quest6)

        val quest7 = Question(
            7,
            "What States is this?",
            R.drawable.kansas,
            "Washington",
            "Virginia",
            "Utah",
            "Kansas",
            4
        )
        questions.add(quest7)

        val quest8 = Question(
            8,
            "What States is this?",
            R.drawable.maine,
            "Maine",
            "Vermont",
            "Wisconsin",
            "South Dakota",
            1
        )
        questions.add(quest8)

        val quest9 = Question(
            9,
            "What States is this?",
            R.drawable.newmexico,
            "Alabama",
            "New Mexico",
            "Wisconsin",
            "Alaska",
            2
        )
        questions.add(quest9)

        val quest10 = Question(
            10,
            "What States is this?",
            R.drawable.vermont,
            "Arizona",
            "Florida",
            "Georgia",
            "Vermont",
            1
        )
        questions.add(quest10)
        return questions
    }
}