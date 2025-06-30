package exceptions;

import java.io.*;

public class Explanation {
    /*
               Object class
                    |
               throwable
    |                           |
    EXCEPTION       and        Error
    |                            |
 checked and unchecked        StackOverFlowError
    |           |
                RuntimeException
                            |
    IO,SQL exception     AIOB,NPE,CCE exception
      */
    //Object class is the parent class of all the classes in Java
    //throwable class is the parent of all the class in exception handling framework
    //checked exception:java forces you to catch them(weak bridge on top of the river so you need safety boats)
    //unchecked exception: java does not force you to catch them because you are expected to make sure that they do not occur(strong bridge on top of the river so you do not need safety boats)
    //RuntimeException class  is a parent class of all unchecked exceptions
    //you have to use try-catch block to handle exceptions
    // there can be more than one catch blocks but there can be only one finally block

    // the entire exception information is stored in a stack, so exception handling is an expensive operation, you should use it carefully
    public static void main(String[] args) throws FileNotFoundException{
        try {
            exceptionHandling();
        } catch(FileNotFoundException e) {
            System.out.println(e);
            throw e;
        }
    }

    private static void exceptionHandling() throws FileNotFoundException{

        //with try block you need either catch block(s) and/or finally block
        // there can be multiple catch blocks but only one finally block
        InputStream is = null;
        try {//try contains the code that might throw an exception
            is = new FileInputStream("nonExistentFile.txt");// this line might throw a FileNotFoundException if file does not exist
            System.out.println("after accessing the file");
            //is.close();
            //e is the name of the object of a particular exception, you can give any name to it, it contains the information about the exception
        } catch (FileNotFoundException e) {//this catch block will be executed if file is not found
            System.out.println("file not found. sorry." + e.getMessage());
            throw e;
        } catch (IOException e) {
            System.out.println("IOException occurred." + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception occurred." + e.getMessage());
        } finally {// the finally block is always executed whether there is an exception or not an exception
            //the code related to releasing the resources should be written in the finally block
            if (is != null) {
                try {
                    is.close();// this will close an opened stream (connection) with the file
                } catch (
                        IOException e) {// if connection is not closed for some reason it will throw IOException and this catch block will catch that exception

                    System.out.println("exception while closing the stream." + e.getMessage());
                }
            }
        }
        System.out.println("end of program");

    }

}
