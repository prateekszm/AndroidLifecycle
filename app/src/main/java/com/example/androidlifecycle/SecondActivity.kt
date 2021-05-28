package com.example.androidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    private val TAG="SecondActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val actionBar=supportActionBar
//        if(actionBar!=null){
//            actionBar.title="SecondActivity"
//        }

        val toast= Toast.makeText(this,"Second onCreate",Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
        actionBar!!.title="SecondActivity"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onStart() {
        Log.d(TAG,"Second onStart: called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"Second onResume: called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"Second onPause: called")
        super.onPause()
    }

    override fun onRestart() {
        Log.d(TAG,"Second onRestart: called")
        super.onRestart()
    }

    override fun onStop() {
        Log.d(TAG,"Second onStop: called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"Second onDestroy: called")
        super.onDestroy()
    }
}