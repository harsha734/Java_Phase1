package com.simplilearn.inneritance;

public interface First {
    default void show()
    {
        System.out.println("Default Method of First");
    }
}