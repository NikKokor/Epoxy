package com.example.epoxy.Car.epoxy
//package com.airbnb.epoxy.sample


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxy.R
import com.example.epoxy.Car.Car
import com.example.epoxy.Car.epoxy.KotlinHolder

@EpoxyModelClass(layout = R.layout.item_list)
abstract class SingleCarModel (@EpoxyAttribute var car: Car) :     EpoxyModelWithHolder<SingleCarModel.CarHolder>(){


    override fun bind(holder: CarHolder) {
        holder.imageView?.setImageResource(car.image)
        holder.titleView?.text = car.title
        holder.descView?.text= car.desc
    }

    inner class CarHolder : KotlinHolder(){

        val imageView by bind<ImageView>(R.id.image)
        val titleView by bind<TextView>(R.id.title)
        val descView by bind<TextView>(R.id.desc)

    }
}