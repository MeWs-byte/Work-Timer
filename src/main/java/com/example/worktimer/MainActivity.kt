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

        // list stuff here
        var startyList = listOf<String>()
        startyList = mutableListOf()

        var endyList = listOf<String>()
        endyList = mutableListOf()


// start work button
        val startButton: Button = findViewById(R.id.button2)
        startButton.setOnClickListener{


            val currentDateAndTime: String = simpleDateFormat.format(Date())
            val toast = Toast.makeText(this, currentDateAndTime, Toast.LENGTH_SHORT)
            toast.show()

            //testList
            var arrayAdapter: ArrayAdapter<*>

            // adding to testyList here
            startyList.add(currentDateAndTime)

            // update list in list view

            var mListView = findViewById<ListView>(R.id.testList)
            arrayAdapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, startyList)
            mListView.adapter = arrayAdapter


        }
        val endButton: Button = findViewById(R.id.button3)
        endButton.setOnClickListener{

            val currentEndDateAndTime: String = simpleDateFormat.format(Date())
            val toast = Toast.makeText(this, currentEndDateAndTime, Toast.LENGTH_SHORT)
            toast.show()

            //testList

            //testList
            var arrayAdapter: ArrayAdapter<*>

            // adding to testyList here
            endyList.add(currentEndDateAndTime)

            // update list in list view




            var mListView = findViewById<ListView>(R.id.testList2)
            arrayAdapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, endyList)
            mListView.adapter = arrayAdapter



            val toasty = Toast.makeText(this, currentEndDateAndTime, Toast.LENGTH_SHORT)
            toasty.show()
        }

        //val startyView: TextView = findViewById(R.id.textView)
        //startyView.text = startTimeList




    }
}

