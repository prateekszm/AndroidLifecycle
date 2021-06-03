package com.example.androidlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    private val TAG="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show()

        val textView:TextView=findViewById(R.id.tvFirstActivity)
        val actionBar=supportActionBar
        actionBar!!.title="FirstActivity"

        textView.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d(TAG,"onClick: called")
                val intent=Intent(this@MainActivity,SecondActivity::class.java)
                startActivity(intent)
            }
        })
    }

    override fun onStart() {
        Log.d(TAG,"onStart: called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"onResume: called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause: called")
        super.onPause()
    }
    override fun onRestart() {
        Log.d(TAG,"Second onRestart: called")
        super.onRestart()
    }

    override fun onStop() {
        Log.d(TAG,"onStop: called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy: called")
        super.onDestroy()
    }
}
