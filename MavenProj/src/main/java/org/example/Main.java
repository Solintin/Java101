package org.example;
//import org.example.utility.ShowName;

import java.util.stream.DoubleStream;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(ShowName);

        static double add ( double...operands){
            return DoubleStream.of(operands)
                    .sum();
        }
    }
}