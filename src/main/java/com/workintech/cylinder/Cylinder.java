package com.workintech.cylinder;


public   class Cylinder extends Circle {

    private double heigth;

    public double getHeight() {
        return heigth;
    }

    public  Cylinder (double radius, double heigth){
        super(radius);
        if (heigth<0){
            this.heigth = 0;
        }
        else {
            this.heigth = heigth;
        }

    }
    public  double getVolume(){
        return  getArea() * heigth;
    }
}
