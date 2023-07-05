package com.example.moraatodolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moraatodolist.databinding.ActivityMain2Binding
import com.example.moraatodolist.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
            tasks()
        }
    fun tasks(){
        var task1 = todolist("Today's summary progress","My tasks","Finishing Kotlin assignment","Doing my python project")
        var task2 = todolist("Today's summary progress","My tasks","Going to the gym","Doing mentors project")
        var task3 = todolist("Today's summary progress","My tasks","Practising algorithms","Finishing product management")
        var task4 = todolist("Today's summary progress","My tasks","Doing my research project","Going to play")
        var task5 = todolist("Today's summary progress","My tasks","Group work","Presentation on final projects")
        var task6 = todolist("Today's summary progress","My tasks","Read on react","Finish on my website")
        var todos = listOf<todolist>(task1,task2,task3,task4,task5,task6)
        binding.rvTodos.layoutManager=LinearLayoutManager(this)
        val todoAdapter = Adapter(todos)
        binding.rvTodos.adapter = todoAdapter

    }
}