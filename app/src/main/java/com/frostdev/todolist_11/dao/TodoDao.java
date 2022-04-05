package com.frostdev.todolist_11.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.frostdev.todolist_11.entities.Todo;

import java.util.List;

@Dao
public interface TodoDao {

    @Query("SELECT * FROM todo ORDER BY id DESC")
    List< Todo > getAllTodo();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTodo(Todo todo);

    @Delete
    void deleteTodo(Todo todo);
}
