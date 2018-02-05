package com.ChrisFrahm;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidTestScore {
//Challenge #1 -------------------------------
        /*
        double[] testScores = new double[]{-24, 88.8, 100, 95};
        TestScores challenge1 = new TestScores(testScores);

        System.out.println(" Average score of tests: " + challenge1.testScoreAverage());

        */
        //Challenge # 2 -----------------------------------
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of spaces for Cesarean shift:");
        String shiftInput = keyboard.nextLine();
        int shift = Integer.parseInt(shiftInput);
        if (shift>26){
            shift = shift%26;
        } else if (shift <0){
            shift = (shift%26)+26;
        }

        try{
            File file = new File("cleanMessage.txt");
            Scanner inputFile = new Scanner(file);
            String fileContent = "";

            while(inputFile.hasNext()){
               fileContent += inputFile.nextLine();
            }

            //Call FileEncrypt, create FileCrypt object, run encryption method, write toFile
            FileEncrypt encrypt = new FileEncrypt(fileContent);
            encrypt.Encryption(shift);
            encrypt.toFile();

            //Call FileDecrypt
            FileDecrypt decrypt = new FileDecrypt(encrypt.getEncryptedFile());
            decrypt.Decryption(shift);
            decrypt.toFile();

            System.out.println("Message in Code: " + encrypt.toString());
            System.out.println("Message in plain Text: " + decrypt.toString());
            inputFile.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


        System.out.println(shift);
            String text = "They saw what you did last summer.";
            String cipher = FileEncryptAlternate.encryptString(text, 23);
            System.out.println(cipher);
            String uncipher = FileDecryptAlternate.decryptString(cipher, 23);
            System.out.println(uncipher);
    }
}
