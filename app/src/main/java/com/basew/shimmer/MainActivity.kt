package com.basew.shimmer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.image)

        val shimmerContainer = findViewById<ShimmerFrameLayout>(R.id.shimmer_view_container2)
        shimmerContainer.startShimmer()

        Handler(Looper.getMainLooper()).postDelayed({
            shimmerContainer.stopShimmer()
            shimmerContainer.visibility = View.GONE
            image.visibility = View.VISIBLE
        }, 5000)

    }
}