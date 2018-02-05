package com.ChrisFrahm;
import java.io.*;
import java.util.*;


    /**
     * FileDecrypt:
     * After the construct accepts a string, the strings letters are shifted
     * based on the amount selected from the decryption method.
     * @author cfrahm
     */

    public class FileDecrypt
    {
        String encryptedFile;
        String decryptedFile = "";

        /**
         *  The encrypted file is accepted to the constructor as a string
         *  @param file
         */
        public FileDecrypt(String file)
        {
            this.encryptedFile = file;
        }

        public void Decryption(int shift){

            for(int i =0; i<encryptedFile.length(); i++)
            {
                //save individual chars
                char ch = encryptedFile.charAt(i);

                //if the character is a space or common punctuation, keep them unchanged
                if(Character.isLetter(ch)) {
                    if (Character.isLowerCase(ch)) {
                        char c = (char) (ch - shift);
                        if (c < 'a') {
                            this.decryptedFile += (char) (ch + (26 - shift));
                        } else {
                            this.decryptedFile += c;
                        }
                    } else if (Character.isUpperCase(ch)) {
                        char c = (char) (ch - shift);
                        if (c < 'A') {
                            this.decryptedFile += (char) (ch + (26 - shift));
                        } else {
                            this.decryptedFile += c;
                        }
                    }
                }else {
                    this.decryptedFile += ch;
                }
                /*
                if(Character.isLetter(c))
                {
                    c = (char)(encryptedFile.charAt(i) - shift);
                    if((c>'Z' && c <'a') || (shift > 6 && (c <= 'Z' && c > 'S')))
                    {
                        //avoids chars that are not letters
                        this.decryptedFile += (char)(c-6);
                    } else if (c < 'A')
                    {
                        //brings range back to the alphabet
                        this.decryptedFile += (char)(c+58);
                    } else {
                        this.decryptedFile += c;
                    }


                } else {
                    this.decryptedFile += ch;
                }*/

            }
        }


        /**
         * toFile:
         * opens "decryptMessage.txt".
         * Write decryptedFile to it, then close file.
         */

        public void toFile()
        {
            try{
                PrintWriter outputFile = new PrintWriter("decryptMessage.txt" );
                outputFile.print(decryptedFile);
                System.out.println("File Decrypted.");
                outputFile.close();
            } catch (FileNotFoundException e) {
                e.getMessage();
            }
        }

        @Override
        public String toString() {
            return decryptedFile;
        }
    }

