package com.example.osgeo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.content.Intent
import android.view.WindowManager

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //making this activity full screen to hide action bar
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)


        //sending intent after 3 seconds using CountDownTimer
        object: CountDownTimer(3000, 1000){
            override fun onTick(millisUntilFinished: Long) {
            }
            override fun onFinish() {
                //send intent to MainActivity
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                //finish activity
                finish()
            }
        }.start()

    }
}
