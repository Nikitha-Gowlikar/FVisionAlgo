package com.example.fvisionalgo


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {


   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
       // connecting Main and Content page
       supportFragmentManager.beginTransaction()
           .add(com.google.android.material.R.id.container, ContentFragment()).commit()
   }
}
