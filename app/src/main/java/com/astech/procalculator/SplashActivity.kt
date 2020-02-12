package com.astech.procalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        /***
         * Methods
         */

        splash()

    }

    //Todo make method for splash
    private fun splash(){
        Handler().postDelayed(Runnable {
            val intent = Intent(applicationContext , MainActivity::class.java)
            startActivity(intent)
        },2000)
    }
}
