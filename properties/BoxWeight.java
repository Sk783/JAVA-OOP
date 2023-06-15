package com.sharad.properties;

import com.sharad.properties.Box;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight = -2;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    BoxWeight(double l, double h, double w, double weight){
        super(l,h,w);
        this.weight = weight;
    }
}
