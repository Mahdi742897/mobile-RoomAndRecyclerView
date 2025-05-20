package com.example.roomandrecyclerview;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Item {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;

    public Item(String name) {
        this.name = name;
    }
}
