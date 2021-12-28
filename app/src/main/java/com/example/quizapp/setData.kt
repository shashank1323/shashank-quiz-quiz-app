package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "Which of the following is First Browser ?",

            "Google",
            "Archie",
           "Knahsash",
            "Firefox",
           2
       )
       var question2 = QuestionData(
           2,
           "Who is the first Indian CEO of TWITTER ?",

           " Arvind Krishna",
           " Mary Williams",
           "Jack Dorsey",
           "Parag Agarwal",
           4
       )
       var question3 = QuestionData(
           3,
           "In what year did Tony Blair become British Prime Minister ?",

           "1992",
           "1997",
           "1988",
           "19996",
           2
       )
       var question4 = QuestionData(
           4,
           "Who was the first President of India ?",

           "Abdul Kalam",
           "Lal Bahadur Shastri",
           "Dr. Rajendra Prasad",
           "Zakir Hussain",
           3
       )

       var question5 = QuestionData(
           5,
           "What is the capital of New Zealand ?",

           "Auckland",
           "Allizo",
           "Otago",
           "Wellington",
           4
       )


       var question6 = QuestionData(
           6,
           "What is the largest country in the world ?",

           "China",
           "Russia",
           "U S A",
           "Brazil",
           2
       )

       var question7 = QuestionData(
           7,
           "Which UK city is Banksy from ?",

           "Gunther",
           "Munther",
           "Bristol",
           "Vristal",
           3
       )

       var question8 = QuestionData(
           8,
           "How many bones does a shark have ?",

           "1236",
           "41253",
           "7856",
           "None",
           4
       )

       var question9 = QuestionData(
           9,
           "What is the capital of Iceland ?",

           "Borgarness",
           "Selfoss",
           "Njorvik",
           "Reykjavik",
           4
       )

       var question10 = QuestionData(
           10,
           "Grand Central Terminal, Park Avenue, New York is the world's ?",

           "largest railway station",
           " tallest railway station",
           "longest railway station",
           "highest railway station",
           1
       )
       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       que.add(question6)
       que.add(question7)
       que.add(question8)
       que.add(question9)
       que.add(question10)
       return que
   }
}