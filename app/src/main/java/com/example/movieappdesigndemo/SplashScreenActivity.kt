package com.example.movieappdesigndemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {

    lateinit var bounce : Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


         bounce = AnimationUtils.loadAnimation(this,R.anim.bounce)
         val logoImage = findViewById<ImageView>(R.id.logo_image)
         logoImage.setAnimation(bounce)

                Handler().postDelayed({
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()

        },4000)

    }
}