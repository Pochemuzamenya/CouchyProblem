package com.company;

import java.io.IOException;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
         new Euler(0, 1, 0, 10) {
             @Override
             public double tochnoeZnach(double x) {
                 return (pow(x,3)*Math.exp(pow(x,3)))/3;

             }

             @Override
             public double calculateF(double x, double y) {
                 return 3* pow(x,2)*y+ pow(x,2)*Math.exp(pow(x,3));
             }
         };
    }
}



