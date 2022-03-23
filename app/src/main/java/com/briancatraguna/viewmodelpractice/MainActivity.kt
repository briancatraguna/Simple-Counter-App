package com.briancatraguna.viewmodelpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvCount: TextView
    private lateinit var btnPlus: Button
    private lateinit var btnMinus: Button

    /**
     * Count state
     */
    private var count = STARTING_NUMBER

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Initialize count
         */
        tvCount = findViewById(R.id.txt_count)
        tvCount.text = count.toString()

        /**
         * Initialize buttons
         */
        btnPlus = findViewById(R.id.btn_plus)
        btnMinus = findViewById(R.id.btn_minus)

        /**
         * Adds the count
         */
        btnPlus.setOnClickListener {
            count += 1
            tvCount.text = count.toString()
        }

        /**
         * Minuses the count
         */
        btnMinus.setOnClickListener {
            count -= 1
            tvCount.text = count.toString()
        }
    }

    companion object {
        const val STARTING_NUMBER = 0
    }
}