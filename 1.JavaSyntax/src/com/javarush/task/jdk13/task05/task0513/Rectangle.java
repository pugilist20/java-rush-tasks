package com.javarush.task.jdk13.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int height;
    private int width;
    public void initialize(int top, int left, int height, int width){
        this.top=top;
        this.left=left;
        this.height=height;
        this.width=width;
    }
    public void initialize(int top, int left){
        this.top=top;
        this.left=left;
    }
    public void  initialize(int top, int left, int width){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }
    public void initialize(Rectangle secondRect){
        this.top=secondRect.top;
        this.left=secondRect.left;
        this.height=secondRect.height;
        this.width= secondRect.width;
    }

    public static void main(String[] args) {

    }
}
