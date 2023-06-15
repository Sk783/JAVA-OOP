package com.sharad.properties;

public class classs {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(3, 5, 6);
        BoxWeight box2 = new BoxWeight();
        BoxWeight box3 = new BoxWeight(3,5,1,5);
        BoxWeight box4 = new BoxWeight(2.3,6.3,9.2,2);

        System.out.println(box.l);
        System.out.println(box1.l+" "+box1.h+" "+box1.w);
        System.out.println(box2.h+" "+box2.weight);
        System.out.println(box3.l+ " "+box3.h+" "+box3.w+" "+box3.weight);
        System.out.println(box4.l+" "+box4.weight);

        //here we have used another class in the same package:---
        Human human = new Human();
        System.out.println(human.age);
    }
}
