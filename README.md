# APP NAME
# shashank-quiz-app 


# PURPOSE 

 i made this app for enhancing knowledge in general awareness and even subject of basic electrical engineering for my sir and testing his students by conducting quiz with 10  questions covering the high level questions to check their score  which help them in part b of examination like mock test 


# USEFUL FOR 

 it will be useful to many people to test themselves in general awareness with score and appraisal also given at END
 useful for every student and sir to check their progress in the partcular subject ...

# WORKING 

 when every app user gives correct answer out of option indicates GREEN FOR CORRECT ANSWER  and RED FOR WRONG ANSWER and then after attempting all answers it will show score
 it shows the perfect view of test assesment of questions




# CONCEPTS 
 
 # DATA TYPES USED :
   MAIN CLASS
   
   STATIC CLASS
   
   PUBLIC CLASS
   
   VARIABLE var   # changeable
 
  
   VARIABLE varx  # unchangeable (constants)
   
   INT # integer values like numbers 
   
   FLOAT # number with decimals
   
   String means OUR OWN TEXT OR ANYTHING CAN BE DISPLAYED BETWEEN QUOTES
  
  # IF ELSE CONDITION USED AS EXAMPLES USED IN MAIN ACTIVITY FOR SETTING COLOUR OF ANSWER (KOTLIN FILE )
   
    if(selecedOption!=0)
            {
                val question=questionList!![currentPosition-1]
                if(selecedOption!=question.correct_ans)
                {
                   setColor(selecedOption,R.drawable.wrong_question_option)
                }else{
                    score++;
                }
                setColor(question.correct_ans,R.drawable.correct_question_option)
                if(currentPosition==questionList!!.size)
                    submit.text="THANKS,SEE U AGAIN"
                else
                    submit.text="Press NEXT Twice"
            }else{
                currentPosition++
                when{
                    currentPosition<=questionList!!.size->{
                        setQuestion()
                    }
                    else->{
                       var intent= Intent(this,Result::class.java)
                        intent.putExtra(setData.name,Name.toString())
                        intent.putExtra(setData.score,score.toString())
                        intent.putExtra("total size",questionList!!.size.toString())

                        startActivity(intent)
                        finish()
                    }
                }
            }
            selecedOption=0
        }

    }
    
  # GRADLE TOOL 
   
 Gradle is a build automation tool for multi-language software development. It controls the development process in the tasks of compilation and packaging to testing, deployment, and publishing. 
 // Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    ext.kotlin_version = "1.4.31"
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:7.0.4'
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}

# What is XML

XML stands for extensible markup language. A markup language is a set of codes, or tags, that describes the text in a digital document. The most famous markup language is hypertext markup language (HTML), which is used to format Web pages. XML, a more flexible cousin of HTML, makes it possible to conduct complex business over the Internet.

Extensible Markup Language (XML) is a markup language that defines a set of rules for encoding documents in a format that is both human-readable and machine-readable. 
here it changes the user input and change of text size and colors ,audio if applied  or image 

# USED FOR GETTING RESPONSE WHEN ANSWER OPTION IS CLICKED CORRECT OR WRONG


<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">

<stroke android:color="@color/purple_700"
    android:width="2dp"></stroke>

    <solid android:color="@color/white"/>
    <corners android:radius="5dp"/>

# </shape>
 <?xml version="1.0" encoding="utf-8"?>
 <shape xmlns:android="http://schemas.android.com/apk/res/android"
     android:shape="rectangle">

 
    <solid android:color="#4CAF50"/>
    <corners android:radius="5dp"/>

</shape>
 


# FUNCTONALITY OR FUNCTIONS USED  

 # android manifest it describes of android app name and themes used and versions given,label app name icon image ,resolution size etc...

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.quizapp">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="BEE Quiz BY PRASHANT"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.QuizApp">
        <activity android:name=".Result"
            android:theme="@style/Theme.QuizApp"
            ></activity>
        <activity android:name=".QuestionActivity" />
        <activity
            android:name=".MainActivity"
            android:screenOrientation="portrait"
            android:theme="@style/Theme.QuizApp"
            android:windowSoftInputMode="adjustResize">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>

        <meta-data
            android:name="preloaded_fonts"
            android:resource="@array/preloaded_fonts" />
    </application>

</manifest>


# questionaire data setting MAIN KOTLIN FILE giving and getting response (get response) 

package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
  
 # VECTORS USED IN ANDROID  FOR CHANGING WIDTH,HEIGHT,COLOUR,SCALING RATIO,LIKE GROUPING ALL CALLED VECTOR
 
 <vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108"
    android:tint="#FFF700">
  <group android:scaleX="1.4248879"
      android:scaleY="1.4248879"
      android:translateX="36.901344"
      android:translateY="38.326233">
    <path
        android:fillColor="@android:color/white"
        android:pathData="M19,3h-4.18C14.4,1.84 13.3,1 12,1c-1.3,0 -2.4,0.84 -2.82,2L5,3c-1.1,0 -2,0.9 -2,2v14c0,1.1 0.9,2 2,2h14c1.1,0 2,-0.9 2,-2L21,5c0,-1.1 -0.9,-2 -2,-2zM12,3c0.55,0 1,0.45 1,1s-0.45,1 -1,1 -1,-0.45 -1,-1 0.45,-1 1,-1zM14,17L7,17v-2h7v2zM17,13L7,13v-2h10v2zM17,9L7,9L7,7h10v2z"/>
  </group>
</vector>
  
 # PACKAGES 
 what is the package of present version ,it says that
 
 package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val userName=intent.getStringExtra(setData.name)
        val score=intent.getStringExtra(setData.score)
        val totalQuestion=intent.getStringExtra("total size")

        congo.text="Congratulations ${userName} !!"
        Score.text="${score} / ${totalQuestion}"
        button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}
# APP SCREENSHOTS
![app quiz](https://user-images.githubusercontent.com/80461983/147851173-81224b66-0d7c-48cd-87f2-ef4b682effa4.png)
![QUESTION LAYOUT ACTIVITY LIKE TEMP](https://user-images.githubusercontent.com/80461983/147851175-10d13836-08a1-4833-83bc-7c67f6f41ec8.png)
![WhatsApp Image 2021-12-31 at 15 26 23 (1) (1)](https://user-images.githubusercontent.com/80461983/147851177-2bc562a2-2818-43a5-b537-ef61d02ce525.jpeg)
![WhatsApp Image 2021-12-31 at 15 26 23 (2)](https://user-images.githubusercontent.com/80461983/147851178-3c31e95a-2af4-4747-ad9e-d4d1392a6ddf.jpeg)
![ICON EDIT ](https://user-images.githubusercontent.com/80461983/147851179-886880c8-b4d6-45fc-8d3b-e1357a3cbd37.png)

 
 
 
 
# APPLICATION LINK  

 DOWNLOAD LINK IS DIRECTED TO MEGA.NZ IS USED FOR DOWNLOADING 

https://mega.nz/file/FsEyXZKI#qtoE-aF4OY_OZ2P2nyq85T6K8QFafo7wQZb81RvT418



# FUTURE SCOPE 
the future scope is which here mainly in future applications it can be used for many subjects or topics just question data is changed ,so that is code free syntax any one with basic kotlin learner can modify and use it for personal use ,thank you ! !

THANKS TO AKSHAT PATEL SIR ,TUSHAR SHARMA SIR AND RISHI GOYAL SIR
 



