package com.example.dynamicimagecontent

import platform.UIKit.*
import platform.Foundation.*
import platform.CoreGraphics.*

actual class PlatformRenderer {
    actual fun render(data: DisplayData) {
        val imageView = UIImageView().apply {
            val url = NSURL(string = data.imageURL)
            val data = NSData.dataWithContentsOfURL(url!!)
            this.image = UIImage(data = data!!)
        }

        val label = UILabel().apply {
            text = data.text
            textAlignment = NSTextAlignmentCenter
        }

        val view = UIView().apply {
            addSubview(imageView)
            addSubview(label)
        }
    }
}