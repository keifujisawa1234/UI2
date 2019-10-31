package net.ebisoba.ui

import android.util.Log

open class Dog: Animal, Movable {

    constructor(name: String, age: Int): super(name, age){
    }

    override fun say(){
        Log.d("kotlintest", this.name + " " + this.age)
    }

    override fun move(){
        Log.d("kotlintest", this.name + " " + this.age)
    }

}