package net.ebisoba.ui

import android.util.Log

open class Human: Animal, Thinkable {

    var hobby: String

    constructor(name: String, age: Int, hobby: String): super(name, age){

        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest2", "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("kotlintest2", "私は" + hobby + "について考える。")
    }
}