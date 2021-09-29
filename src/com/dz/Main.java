package com.dz;

public class Main {

    public static void main(String[] args) {
        MovableRectangle rectangleMovable = new MovableRectangle(1, 1, 5, 6);
        System.out.println(rectangleMovable);
        rectangleMovable.move(1,1, -1, -2);
        System.out.println(rectangleMovable);
    }
}
