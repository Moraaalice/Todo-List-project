package com.example.moraatodolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moraatodolist.databinding.TodosBinding

class Adapter (var todos: List<todolist>):RecyclerView.Adapter<TodoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        var binding = TodosBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        var todo = todos.get(position)
        holder.binding.itTask.text = todo.title
        holder.binding.itTask.text=todo.tasks
        holder.binding.itTask1.text=todo.task1
        holder.binding.itTask2.text=todo.task2
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}
class TodoViewHolder(var binding: TodosBinding):RecyclerView.ViewHolder(binding.root){

}

