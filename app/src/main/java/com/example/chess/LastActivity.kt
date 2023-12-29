package com.example.chess

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.last_activity)

        val mailLink: TextView = findViewById(R.id.mail_link)
        mailLink.movementMethod = LinkMovementMethod.getInstance()
        mailLink.setLinkTextColor(Color.GREEN)

        val onClickGoMain7: Button = findViewById(R.id.back_button)
        onClickGoMain7.setOnClickListener {
            finish()
        }
    }
}