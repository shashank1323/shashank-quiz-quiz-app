# APP NAME
# shashank-quiz-app 


# PURPOSE ????

# i made this app for enhancing knowledge in general awareness and even subject of basic electrical engineering for my sir and testing his students by conducting quiz with 10  questions covering the high level questions to check their score  which help them in part b of examination like mock test 


# USEFUL FOR ????

# it will be useful to many people to test themselves in general awareness with score and appraisal also given at END
# useful for every student and sir to check their progress in the partcular subject ...

# WORKING 

# when every app user gives correct answer out of option indicates GREEN FOR CORRECT ANSWER  and RED FOR WRONG ANSWER and then after attempting all answers it will show score
# it shows the perfect view of test assesment of questions




# CONCEPTS
 # DATA TYPES USED :
 
  VARIABLE var   # changeable
  
  VARIABLE varx  # unchangeable (constants)
   INT # integer values like numbers 
   FLOAT # number with decimals
   
   








# FUNCTONALITY OR FUNCTIONS USED :-

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


# questionaire data setting (get response) 

package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
  
  # vectors used in android 
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
  
  # 










# APPLICATION LINK









# FUTURE SCOPE






