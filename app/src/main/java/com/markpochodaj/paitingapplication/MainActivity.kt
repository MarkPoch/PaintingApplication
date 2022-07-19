package com.markpochodaj.paitingapplication

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.markpochodaj.paitingapplication.PaintView.Companion.colorList
import com.markpochodaj.paitingapplication.PaintView.Companion.currentBrush
import com.markpochodaj.paitingapplication.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {

        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redButton =findViewById<ImageButton>(R.id.redColor)
        val blueButton =findViewById<ImageButton>(R.id.blueColor)
        val blackButton =findViewById<ImageButton>(R.id.blackColor)
        val eraser =findViewById<ImageButton>(R.id.whiteColor)

        redButton.setOnClickListener{
            Toast.makeText(this,"Clicked!",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        blueButton.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
        blackButton.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }
        eraser.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }


    }

    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}