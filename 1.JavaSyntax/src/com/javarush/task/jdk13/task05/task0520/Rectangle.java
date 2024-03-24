package com.javarush.task.jdk13.task05.task0520;

/* 
Заполнить класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int top;
    private int left;
    private int height;
    private int width;
    public Rectangle(int top, int left, int height, int width){
        this.top=top;
        this.left=left;
        this.height=height;
        this.width=width;
    }
    public Rectangle(int top, int left){
        this.top=top;
        this.left=left;
    }
    public Rectangle(int top, int left, int width){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }
    public Rectangle(Rectangle secondRect){
        this.top=secondRect.top;
        this.left=secondRect.left;
        this.height=secondRect.height;
        this.width= secondRect.width;
    }

    public static void main(String[] args) {

    }
}
