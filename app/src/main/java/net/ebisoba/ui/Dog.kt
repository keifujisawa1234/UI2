package net.ebisoba.ui

import android.util.Log

open class Dog: Animal, Movable {

    constructor(name: String, age: Int, hobby: String): super(name, age, hobby){
    }

    override fun say(){
        Log.d("kotlintest", this.name + " " + this.age)
    }

    override fun move(){
        Log.d("kotlintest", this.name + " " + this.age)
    }

}