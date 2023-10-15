package com.chobo.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.chobo.imageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = arrayOf(
            R.drawable.android,
            R.drawable.robot
        )

        var currentImageIndex = 0

        var robot1 = binding.ivProfile
        robot1.setImageResource(images[currentImageIndex])


        binding.btnToast.setOnClickListener(){
            Toast.makeText( this@MainActivity, "버튼이 클릭 되었습니다.", Toast.LENGTH_SHORT).show()
            currentImageIndex = (currentImageIndex +1 ) % images.size
            robot1.setImageResource(images[currentImageIndex])
        }
    }
}