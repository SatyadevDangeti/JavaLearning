package com.java.coding;

public class Box {
    private double width;
    private double depth;
    private double height;
    double i;

    Box(Box objBox) {
        this.height = objBox.height;
        width = objBox.width;
        depth = objBox.depth;

    }
     // constructor when no dimension specified
    Box() {
      width = -1;
      height =-1;
      depth = -1;
    }
   // constructor when equal valued parameters are specified
    Box(double len) {
        width = depth = height = len;
    }

    Box(double w, double h, double d){
        width =w;
        height =h;
        this.depth =d;
    }
    double volume(){
        return width * height * depth;
    }

}
