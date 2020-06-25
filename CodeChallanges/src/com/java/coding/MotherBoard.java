package com.java.coding;

import com.java.learning.MobilePhone;

public class MotherBoard {
    String model;

    public MotherBoard(String model) {
        this.model = model;
    }
    // static nested Class
    static class USB{
       static final int usb2 =2;
        static int usb3 =1;
        static int getTotalPorts(){
            MotherBoard mb = new MotherBoard("Intel");
            if(mb.model.equals("Intel")){
                return 4;

            }
            else {
                return usb2+usb3;
            }
        }
    }


    public static void main(String[] args){
        USB.usb3 = 4;
        System.out.println("TotalPorts = " +USB.getTotalPorts());
    }
}

