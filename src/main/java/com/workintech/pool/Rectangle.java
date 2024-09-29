package com.workintech.pool;

public class Rectangle {
private double width;
private double length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectangle(double width, double length){
    if (width<0 && length <0){
        width = 0;
        length = 0;
    }
    else {

        this.width = width;
        this.length =length;
    }
}
public  double getArea(){
        return width * length;
}
}
