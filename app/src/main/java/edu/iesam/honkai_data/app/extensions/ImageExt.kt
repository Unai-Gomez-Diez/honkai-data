package edu.iesam.honkai_data.app.extensions

import android.widget.ImageView
import coil.load

fun ImageView.loadImg(string: String){
    this.load(string)
}