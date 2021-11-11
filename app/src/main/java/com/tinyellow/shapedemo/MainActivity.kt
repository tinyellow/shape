package com.tinyellow.shapedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tinyellow.shape.selector
import com.tinyellow.shape.shape
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.shape().colorRes(R.color.design_default_color_secondary).radius(20f).setBackground()
        bottom.selector()
            .colorRes(R.color.design_default_color_secondary,R.color.design_default_color_primary).radius(10f)
            .editPress()
            .colorRes(R.color.design_default_color_primary,R.color.design_default_color_secondary)
            .radius(20f)
            .setBackground()
        bottom.setOnClickListener {  }
    }
}