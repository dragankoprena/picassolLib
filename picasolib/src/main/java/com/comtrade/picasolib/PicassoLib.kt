package com.comtrade.picasolib

import android.widget.ImageView
import com.squareup.picasso.Picasso

object PicassoLib {
    fun load(url: String, imageView: ImageView) {
        Picasso.get()
            .load(url)
            .resize(50, 50)
            .centerCrop()
            .into(imageView)
    }
}