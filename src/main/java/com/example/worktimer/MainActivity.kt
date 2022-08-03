package com.example.worktimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.text.SimpleDateFormat
import java.util.*
import com.google.android.material.snackbar.Snackbar



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // move varis here
        val simpleDateFormat = SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z")




        val startButton: Button = findViewById(R.id.button2)
        startButton.setOnClickListener{

            // came from here
            val currentDateAndTime: String = simpleDateFormat.format(Date())
            val toast = Toast.makeText(this, currentDateAndTime, Toast.LENGTH_SHORT)
            toast.show()

            //testList
            val arrayAdapter: ArrayAdapter<*>
            var users = arrayOf(
                currentDateAndTime
            )
            var mListView = findViewById<ListView>(R.id.testList)
            arrayAdapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, users)
            mListView.adapter = arrayAdapter

            //users = users.plus(currentDateAndTime)

            //val startTimeList = listOf(currentDateAndTime)
            //println(startTimeList)





        }
        val endButton: Button = findViewById(R.id.button3)
        endButton.setOnClickListener{

            val currentEndDateAndTime: String = simpleDateFormat.format(Date())
            val toast = Toast.makeText(this, currentEndDateAndTime, Toast.LENGTH_SHORT)
            toast.show()

            //testList
            val arrayAdapter: ArrayAdapter<*>
            var users = arrayOf(
                currentEndDateAndTime
            )
            var mListView = findViewById<ListView>(R.id.testList2)
            arrayAdapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, users)
            mListView.adapter = arrayAdapter



            val toasty = Toast.makeText(this, currentEndDateAndTime, Toast.LENGTH_SHORT)
            toasty.show()
        }

        //val startyView: TextView = findViewById(R.id.textView)
        //startyView.text = startTimeList




    }
}


