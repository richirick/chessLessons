package com.example.chess

//import android.content.Intent
//import android.content.Intent.*
//import android.net.Uri
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//import android.widget.Button

class LessonLinks : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson_links)

        val onClickGoMain1 : Button = findViewById(R.id.lesson_btn1)
        onClickGoMain1.setOnClickListener{
//    fun onClickGoMain1(view: View) {
//        val lessonLinks : Button=findViewById(R.id.lesson_btn1)
//        lessonLinks.setOnClickListener {
//            val openURL1 = Intent(ACTION_VIEW)
//            openURL1.data=
//                Uri.parse("https://www.youtube.com/watch?v=JorvZnyHe6A&ab_channel=ChessSemenov")
//            startActivity(openURL1)
//        }
            val lesson_btn1 = Uri.parse("https://www.youtube.com/watch?v=JorvZnyHe6A&ab_channel=ChessSemenov")
            val intent = Intent(Intent.ACTION_VIEW, lesson_btn1)
            startActivity(intent)
        }
        val onClickGoMain2 : Button = findViewById(R.id.lesson_btn2)
        onClickGoMain2.setOnClickListener{
//        fun onClickGoMain2(view: View) {
            val lesson_btn2 = Uri.parse("https://www.youtube.com/watch?v=o-ZyiU1d0uQ&ab_channel=Valbdemar")
            val intent = Intent(ACTION_VIEW, lesson_btn2)
            startActivity(intent)
//        val lessonLinks : Button=findViewById(R.id.lesson_btn2)
//        lessonLinks.setOnClickListener {
//            val openURL2 = Intent(ACTION_VIEW)
//            openURL2.data=
//                Uri.parse("https://www.youtube.com/watch?v=o-ZyiU1d0uQ&ab_channel=Valbdemar")
//            startActivity(openURL2)
//        }
        }
        val onClickGoMain3 : Button = findViewById(R.id.lesson_btn3)
        onClickGoMain3.setOnClickListener{
//        fun onClickGoMain3(view: View) {
            val lesson_btn3 = Uri.parse("https://youtu.be/hviFNzPmZvY")
            val intent = Intent(ACTION_VIEW, lesson_btn3)
            startActivity(intent)
//        val lessonLinks : Button=findViewById(R.id.lesson_btn3)
//        lessonLinks.setOnClickListener {
//            val openURL3 = Intent(ACTION_VIEW)
//            openURL3.data=
//                Uri.parse("https://youtu.be/hviFNzPmZvY")
//            startActivity(openURL3)
//        }
        }
        val onClickGoMain4: Button = findViewById(R.id.lesson_btn4)
        onClickGoMain4.setOnClickListener{
//        fun onClickGoMain4(view: View) {
            val lesson_btn4 = Uri.parse("https://youtu.be/_Getwc8_CpM")
            val intent = Intent(ACTION_VIEW, lesson_btn4)
            startActivity(intent)
//        val lessonLinks : Button=findViewById(R.id.lesson_btn4)
//        lessonLinks.setOnClickListener {
//            val openURL4 = Intent(ACTION_VIEW)
//            openURL4.data=
//                Uri.parse("https://youtu.be/_Getwc8_CpM")
//            startActivity(openURL4)
//        }
        }
        val onClickGoMain5: Button = findViewById(R.id.lesson_btn5)
        onClickGoMain5.setOnClickListener{
//        fun onClickGoMain5(view: View) {
            val lesson_btn5 = Uri.parse("https://youtu.be/1ZErbuUKiSM")
            val intent = Intent(ACTION_VIEW, lesson_btn5)
            startActivity(intent)
//        val lessonLinks : Button=findViewById(R.id.lesson_btn5)
//        lessonLinks.setOnClickListener {
//            val openURL5 = Intent(ACTION_VIEW)
//            openURL5.data=
//                Uri.parse("https://youtu.be/1ZErbuUKiSM")
//            startActivity(openURL5)
//        }
        }

        val onClickGoMain6 : Button = findViewById(R.id.next_button2)
        onClickGoMain6.setOnClickListener{
//        fun onClickGoMain6(view: View) {
            val intent = Intent(this, LastActivity::class.java)
            startActivity(intent)
        }


    }


//    fun onClickGoMain2(view: View) {
//        val lesson_btn2 = Uri.parse("https://www.youtube.com/watch?v=o-ZyiU1d0uQ&ab_channel=Valbdemar")
//        val intent = Intent(ACTION_VIEW, lesson_btn2)
//        startActivity(intent)
////        val lessonLinks : Button=findViewById(R.id.lesson_btn2)
////        lessonLinks.setOnClickListener {
////            val openURL2 = Intent(ACTION_VIEW)
////            openURL2.data=
////                Uri.parse("https://www.youtube.com/watch?v=o-ZyiU1d0uQ&ab_channel=Valbdemar")
////            startActivity(openURL2)
////        }
//    }
//    fun onClickGoMain3(view: View) {
//        val lesson_btn3 = Uri.parse("https://youtu.be/hviFNzPmZvY")
//        val intent = Intent(ACTION_VIEW, lesson_btn3)
//        startActivity(intent)
////        val lessonLinks : Button=findViewById(R.id.lesson_btn3)
////        lessonLinks.setOnClickListener {
////            val openURL3 = Intent(ACTION_VIEW)
////            openURL3.data=
////                Uri.parse("https://youtu.be/hviFNzPmZvY")
////            startActivity(openURL3)
////        }
//    }
//    fun onClickGoMain4(view: View) {
//        val lesson_btn4 = Uri.parse("https://youtu.be/_Getwc8_CpM")
//        val intent = Intent(ACTION_VIEW, lesson_btn4)
//        startActivity(intent)
////        val lessonLinks : Button=findViewById(R.id.lesson_btn4)
////        lessonLinks.setOnClickListener {
////            val openURL4 = Intent(ACTION_VIEW)
////            openURL4.data=
////                Uri.parse("https://youtu.be/_Getwc8_CpM")
////            startActivity(openURL4)
////        }
//    }
//    fun onClickGoMain5(view: View) {
//        val lesson_btn5 = Uri.parse("https://youtu.be/1ZErbuUKiSM")
//        val intent = Intent(ACTION_VIEW, lesson_btn5)
//        startActivity(intent)
////        val lessonLinks : Button=findViewById(R.id.lesson_btn5)
////        lessonLinks.setOnClickListener {
////            val openURL5 = Intent(ACTION_VIEW)
////            openURL5.data=
////                Uri.parse("https://youtu.be/1ZErbuUKiSM")
////            startActivity(openURL5)
////        }
//    }
//
//    fun onClickGoMain6(view: View) {
//        val intent = Intent(this, LastActivity::class.java)
//        startActivity(intent)
//    }


    //    fun onClickGoMain1(view: View) {
//        val lessonLinks : Button=findViewById(R.id.lesson_btn1)
//        lessonLinks.setOnClickListener {
//            val openURL1 = Intent(ACTION_VIEW)
//            openURL1.data=
//                Uri.parse("https://www.youtube.com/watch?v=JorvZnyHe6A&ab_channel=ChessSemenov")
//            startActivity(openURL1)
//        }
//    }
//    val lesson_btn1 : Button = findViewById(R.id.lesson_btn1)
//    val lesson_btn1 = Uri.parse("https://www.youtube.com/watch?v=JorvZnyHe6A&ab_channel=ChessSemenov")
//    lesson_btn1
//    val intent = Intent(Intent.ACTION_VIEW, lesson_btn1)
//    startActivity(intent)

}

