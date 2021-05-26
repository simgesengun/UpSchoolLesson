package com.simgesengun.viewpager2rvapplication

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("android:setPrice")
fun setPrice (textview : TextView, price : Double){
    textview.text = "$price \u20BA"
}
@BindingAdapter("android:image_resource")
fun imageResource (imageView : ImageView, picture_path : String){
    val id = imageView.context.resources.getIdentifier(picture_path,"drawable", imageView.context.packageName)
    imageView.setImageResource(id)
}