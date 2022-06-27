package com.angha

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.doOnEnd

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        AnimatorSet().apply {
            play(
                ObjectAnimator.ofFloat(
                    findViewById<ImageView>(R.id.iv_background),
                    View.ALPHA,
                    1F,
                    0.3F
                ).apply {
                    duration = 1400
                }).with(
                ObjectAnimator.ofFloat(
                    findViewById<TextView>(R.id.tv_app_name),
                    View.ALPHA,
                    0F,
                    1F
                ).apply {
                    duration = 1400
                })
            doOnEnd {
                navigateToMainActivity()
            }
            start()
        }
    }

    private fun navigateToMainActivity() {
        Intent(this, MainActivity::class.java).run {
            startActivity(this)
            finish()
        }
    }
}