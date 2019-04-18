package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.barcode.DataBarExpanded
import android.opengl.ETC1.getHeight
import android.opengl.ETC1.getWidth
import android.util.Log
import com.example.barcode.DatabarLimited


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     /*   val databar  = DataBarExpanded()
        databar.setStacked()
        databar.setContent("[01]09010374000019[21]09015404907555605563[10]01245013497")
        val width = databar.getWidth()
        val height = databar.getHeight()
*/

        val databarLimited = DatabarLimited()
        databarLimited.setContent("15012345678907")

        for (rectangle in databarLimited.rectangles) {
            Log.d("TADA", "Hi Josef, I am fucking rectangle. I live on x: ${rectangle.x} , y:${rectangle.y} and my dimensions are h:${rectangle.height} / w:${rectangle.width}")
        }

    }
}
