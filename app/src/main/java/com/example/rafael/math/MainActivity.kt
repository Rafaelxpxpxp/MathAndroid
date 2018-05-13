package com.example.rafael.math

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val equationTask = EquationTask()
        val equationTextView = findViewById<TextView>(R.id.equation)

        val valuable = equationTask
                .execute()
                .get()
        if (valuable != null) {
            equationTextView.text = valuable
                    .get(0).description
        }
    }
}
