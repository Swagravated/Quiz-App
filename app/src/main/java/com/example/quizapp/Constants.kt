package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What Valorant agent is this?",
            R.drawable.astra,
            "Astra", "Jett",
            "Raze", "Omen",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,"What Valorant agent is this?",
            R.drawable.breach,
            "Kayo", "Skye",
            "Breach", "Omen",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3,"What Valorant agent is this?",
            R.drawable.brimstone,
            "Omen", "Brimstone",
            "Astra", "Viper",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4,"What Valorant agent is this?",
            R.drawable.chamber,
            "Kill Joy", "Chamber",
            "Reyna", "Sage",
            2
        )
        questionsList.add(que4)

        val que5 = Question(
            5,"What Valorant agent is this?",
            R.drawable.cypher,
            "Sova", "Sage",
            "Neon", "Cypher",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6,"What Valorant agent is this?",
            R.drawable.jett,
            "Jett", "Sage",
            "Reyna", "Phoenix",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,"What Valorant agent is this?",
            R.drawable.kayo,
            "Astra", "Yoru",
            "Skye", "Kayo",
            4
        )
        questionsList.add(que7)

        val que8 = Question(
            8,"What Valorant agent is this?",
            R.drawable.killjoy,
            "Chamber", "KillJoy",
            "Neon", "Cypher",
            2
        )
        questionsList.add(que8)

        val que9 = Question(
            9,"What Valorant agent is this?",
            R.drawable.neon,
            "Neon", "Reyna",
            "Raze", "Jett",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            10,"What Valorant agent is this?",
            R.drawable.omen,
            "Omen", "Reyna",
            "Astra", "Breach",
            1
        )
        questionsList.add(que10)

        val que11 = Question(
            11,"What Valorant agent is this?",
            R.drawable.phoenix,
            "Raze", "Yoru",
            "Phoenix", "Brimstone",
            3
        )
        questionsList.add(que11)

        val que12 = Question(
            12,"What Valorant agent is this?",
            R.drawable.raze,
            "Skye", "Sage",
            "Sova", "Raze",
            4
        )
        questionsList.add(que12)

        val que13 = Question(
            13,"What Valorant agent is this?",
            R.drawable.reyna,
            "Reyna", "KillJoy",
            "Viper", "Kayo",
            1
        )
        questionsList.add(que13)

        val que14 = Question(
            14,"What Valorant agent is this?",
            R.drawable.sage,
            "Chamber", "Sage",
            "Viper", "Jett",
            2
        )
        questionsList.add(que14)

        val que15 = Question(
            15,"What Valorant agent is this?",
            R.drawable.skye,
            "Phoenix", "Breach",
            "Skye", "Jett",
            3
        )
        questionsList.add(que15)

        val que16 = Question(
            16,"What Valorant agent is this?",
            R.drawable.sova,
            "Raze", "Omen",
            "Kayo", "Sova",
            4
        )
        questionsList.add(que16)

        val que17 = Question(
            17,"What Valorant agent is this?",
            R.drawable.viper,
            "Brimstone", "Omen",
            "Reyna", "Viper",
            4
        )
        questionsList.add(que17)

        val que18 = Question(
            18,"What Valorant agent is this?",
            R.drawable.yoru,
            "Yoru", "Skye",
            "KillJoy", "Cypher",
            1
        )
        questionsList.add(que18)

        return questionsList
    }

}