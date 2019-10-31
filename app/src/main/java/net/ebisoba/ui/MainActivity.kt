package net.ebisoba.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3, "baseball")

        dog.move()

//        Log.d("kotlintest", "dog.move")

        val kei = Human("秀樹", 20, "soccer")

//        Log.d("kotlintest", "val kei")

        kei.say()
        kei.think()
    }

}