package com.example.lab2

import com.example.lab2.utils.Constants
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class questionfunctionality {
    @Test
    fun testQuestionTotal() {
        val myQuestions = Constants
        val totalQuestions = myQuestions.getQuestions().count()

        Assert.assertEquals(totalQuestions, 10)
    }

    @Test
    fun testQuestionOneAnswer() {
        val myQuestions = Constants
        val questions = myQuestions.getQuestions()
        val questionOne = questions[0]

        Assert.assertEquals(questionOne.correctAnswer, 1)
    }
    @Test
    fun testQuestionOneHasQuestion() {
        val myQuestions = Constants
        val questions = myQuestions.getQuestions()
        val questionOne = questions[0]

        Assert.assertEquals(questionOne.val_question.isNotEmpty(), true)
    }

    @Test
    fun testQuestionTwoAnswer() {
        val myQuestions = Constants
        val questions = myQuestions.getQuestions()
        val questionOne = questions[1]

        Assert.assertEquals(questionOne.correctAnswer, 2)
    }

    @Test
    fun testQuestionThreeAnswer() {
        val myQuestions = Constants
        val questions = myQuestions.getQuestions()
        val questionOne = questions[2]

        Assert.assertEquals(questionOne.correctAnswer, 2)
    }

    @Test
    fun testQuestionFourAnswer() {
        val myQuestions = Constants
        val questions = myQuestions.getQuestions()
        val questionOne = questions[3]

        Assert.assertEquals(questionOne.correctAnswer, 3)
    }

    @Test
    fun testQuestionFiveAnswer() {
        val myQuestions = Constants
        val questions = myQuestions.getQuestions()
        val questionOne = questions[4]

        Assert.assertEquals(questionOne.correctAnswer, 3)
    }
}