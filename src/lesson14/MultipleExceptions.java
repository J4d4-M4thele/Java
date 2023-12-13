/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Jada
 */
public class MultipleExceptions {

    public static void main(String[] args) {
     try{
     createFile();
     }catch(IOException ioe) {
         System.out.println(ioe);
     }
    }

    public static void createFile() throws IOException {
        File testF = new File("C:/notWriteableDir");
        File tempF = testF.createTempFile("te", null, testF);
        System.out.println("Temp Filename: " + tempF.getPath());
        int myInt[] = new int[5];
        myInt[5] = 25;
    }
}
