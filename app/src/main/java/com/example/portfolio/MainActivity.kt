package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.btSkills)

        buttonSkills.setOnClickListener{
            intent = Intent(this,Skills::class.java )
            startActivity(intent )

            val buttonEducation = findViewById<Button>(R.id.btEducation)

            buttonEducation.setOnClickListener {
                intent = Intent(this,Education::class.java)
                startActivity(intent)

                val buttonProjects = findViewById<Button>(R.id.btProject)

                buttonProjects.setOnClickListener {
                    intent = Intent(this, Projects::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}