package com.example.prac3

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.prac3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Student s = new Student();
    //var s: Student
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,
        R.layout.activity_main)

        var student = Student("Ali","RIT",20)

       binding.btnSetValue.setOnClickListener(){
           student.age=28
           student.programme="REI"
         binding.apply{
             invalidateAll() //call to refresh
         }

       }
        binding.btnGetValue.setOnClickListener(){

            binding.myData=student
        }

    }
}