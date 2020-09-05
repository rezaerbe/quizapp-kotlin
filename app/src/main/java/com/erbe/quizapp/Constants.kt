package com.erbe.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWER: String = "correct_answers"

    fun getQuestions() : ArrayList<Question> {

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What number is it?",
            R.drawable.ic_launcher_background,
            "1",
            "2",
            "3",
            "4",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "What number is it?",
            R.drawable.ic_launcher_background,
            "1",
            "2",
            "3",
            "4",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "What number is it?",
            R.drawable.ic_launcher_background,
            "1",
            "2",
            "3",
            "4",
            3
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "What number is it?",
            R.drawable.ic_launcher_background,
            "1",
            "2",
            "3",
            "4",
            4
        )

        questionsList.add(que4)

        return questionsList
    }
}