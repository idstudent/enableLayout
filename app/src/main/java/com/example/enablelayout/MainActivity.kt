package com.example.enablelayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        oneLayout.setOnClickListener {
            btnEnable(0)
        }
        twoLayout.setOnClickListener {
            btnEnable(1)
        }
        threeLayout.setOnClickListener {
            btnEnable(2)
        }
        fourLayout.setOnClickListener {
            btnEnable(3)
        }
    }
    fun btnEnable(index : Int) {
        var arrayLayout : Array<ConstraintLayout> = arrayOf(oneLayout, twoLayout, threeLayout, fourLayout)

        for(i in arrayLayout.indices){
            if(index == i){
                arrayLayout[i].setBackgroundResource(R.color.colorPrimary)
            }else {
                arrayLayout[i].setBackgroundColor(Color.rgb(255,255,255))
            }
        }
    }
}
