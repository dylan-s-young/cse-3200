package com.example.lab2.ui

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.lab2.R
import com.example.lab2.model.Question
import com.example.lab2.utils.Constants

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var progressBar: ProgressBar
    private lateinit var textViewProgress: TextView
    private lateinit var textViewQuestion: TextView
    private lateinit var stateImage: ImageView

    private lateinit var textViewOptionOne: TextView
    private lateinit var textViewOptionTwo: TextView
    private lateinit var textViewOptionThree: TextView
    private lateinit var textViewOptionFour: TextView

    private lateinit var checkButton: Button

    private var questionCounter = 0
    private lateinit var questionsList: MutableList<Question>
    private var selectedAnswer = 0
    private lateinit var currentQuestion: Question
    private var answered = false
    private var score = 0


    private var selectedOptionPosition = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        progressBar = findViewById(R.id.progressBar)
        textViewProgress =  findViewById(R.id.text_view_progress)
        textViewQuestion = findViewById(R.id.question_text_view)
        stateImage = findViewById(R.id.image_flag)
        checkButton = findViewById(R.id.button_check)

        textViewOptionOne = findViewById(R.id.text_view_option_one)
        textViewOptionTwo = findViewById(R.id.text_view_option_two)
        textViewOptionThree = findViewById(R.id.text_view_option_three)
        textViewOptionFour = findViewById(R.id.text_view_option_four)

        textViewOptionOne.setOnClickListener(this)
        textViewOptionTwo.setOnClickListener(this)
        textViewOptionThree.setOnClickListener(this)
        textViewOptionFour.setOnClickListener(this)
        checkButton.setOnClickListener(this)

        questionsList = Constants.getQuestions()
        Log.d("QuestionSize", "${questionsList.size}")

        showNextQuestion()
    }

    private fun showNextQuestion() {
        val question = questionsList[questionCounter]
        stateImage.setImageResource(question.val_image)
        progressBar.progress = questionCounter
        textViewProgress.text = "$questionCounter/${progressBar.max}"
        textViewQuestion.text = question.val_question
        textViewOptionOne.text = question.optionOne
        textViewOptionTwo.text = question.optionTwo
        textViewOptionThree.text = question.optionThree
        textViewOptionFour.text = question.optionFour

        if (questionCounter < questionsList.size) {
            checkButton.text = "CHECK"
            currentQuestion = questionsList[questionCounter]
        } else {
            checkButton.text = "FINISH"
            Intent(this, ResultActivity::class.java).also {
                startActivity(it)
            }
        }

        questionCounter++
        answered = false
        resetOptions()
    }

    private fun resetOptions() {
        val options = mutableListOf<TextView>()
        options.add(textViewOptionOne)
        options.add(textViewOptionTwo)
        options.add(textViewOptionThree)
        options.add(textViewOptionFour)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.text_view_option_one -> {
                selectedOption(textViewOptionOne, 1)
            }
            R.id.text_view_option_two -> {
                selectedOption(textViewOptionTwo, 2)
            }
            R.id.text_view_option_three -> {
                selectedOption(textViewOptionThree, 3)
            }
            R.id.text_view_option_four -> {
                selectedOption(textViewOptionFour, 4)
            }
            R.id.button_check -> {
                if (!answered) {
                    checkAnswer()
                } else {
                    showNextQuestion()
                }
                selectedAnswer = 0
            }
        }
    }

    private fun selectedOption(textView: TextView, selectedOptionNumber: Int) {
        resetOptions()

        selectedAnswer = selectedOptionNumber


        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

    private fun checkAnswer() {
        answered = true

        if (selectedAnswer == currentQuestion.correctAnswer) {
            score++
            when(selectedAnswer) {
                1 -> {
                    textViewOptionOne.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.correct_option_border_bg
                    )
                }
                2 -> {
                    textViewOptionTwo.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.correct_option_border_bg
                    )
                }
                3 -> {
                    textViewOptionThree.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.correct_option_border_bg
                    )
                }
                4 -> {
                    textViewOptionFour.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.correct_option_border_bg
                    )
                }
            }
        } else {
            when(selectedAnswer) {
                1 -> {
                    textViewOptionOne.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.wrong_option_border_bg
                    )
                }
                2 -> {
                    textViewOptionTwo.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.wrong_option_border_bg
                    )
                }
                3 -> {
                    textViewOptionThree.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.wrong_option_border_bg
                    )
                }
                4 -> {
                    textViewOptionFour.background = ContextCompat.getDrawable(
                        this,
                        R.drawable.wrong_option_border_bg
                    )
                }
            }
        }
        checkButton.text = "NEXT"

    }
}