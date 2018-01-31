package com.ChrisFrahm;

/**
 * @author Chris Frahm
 * Custom Exception for number between 0 and 100
 */
public class InvalidTestScore extends Exception{

    public InvalidTestScore (){
        super("Error: Number must be between 0 and 100");
    }
}
