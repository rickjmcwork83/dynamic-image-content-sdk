package com.example.dynamicimagecontent

import android.content.Context
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import coil.load

actual class PlatformRenderer(private val context: Context, private val layout: LinearLayout) {
    actual fun render(data: DisplayData) {
        val imageView = ImageView(context)
        imageView.load(data.imageURL)

        val textView = TextView(context)
        textView.text = data.text

        layout.addView(imageView)
        layout.addView(textView)
    }
}