package com.java8.streams.examples;

/** Copyright (c), AnkitMittal www.JavaMadeSoEasy.com */
public class ReverseStringUsingStringBufferExample {
    public static void main(String...args){ 
           String originalString="abcde"; //String to be reversed
           StringBuffer sb=new StringBuffer(originalString);
           
           System.out.println("Original String: "+originalString);
           System.out.println("Reversed String: "+sb.reverse());      
    }
}