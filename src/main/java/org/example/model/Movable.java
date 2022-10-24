package org.example.model;

public class Movable {

    private Movable(){}

    public static Boolean movable(int moveValue){
        if (moveValue >= 4){
            return true;
        }
        return false;
    }

}
