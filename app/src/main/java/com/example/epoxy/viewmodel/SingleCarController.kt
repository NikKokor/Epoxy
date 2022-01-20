package com.example.epoxy.viewmodel

import com.airbnb.epoxy.EpoxyController
import com.example.epoxy.Car.Car
import com.example.epoxy.Car.CarDataFactory
import com.example.epoxy.Car.epoxy.SingleCarModel_

class SingleCarController : EpoxyController(){

    var carItems : List<Car> = CarDataFactory.getCarItems(10)

    init {
        carItems = CarDataFactory.getCarItems(10)
    }

    private var index = 0L

    override fun buildModels() = carItems.forEach{
        SingleCarModel_(it)
            .id(index++)
            .addTo(this)
    }
}