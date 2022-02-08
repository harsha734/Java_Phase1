package com.simplilearn.inneritance;
public interface Second {
    default void show()
    {
        System.out.println("Default Method of Second");
    }
}
