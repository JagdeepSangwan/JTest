package com.jss;

import java.util.logging.Logger;

public class JssMain {
    public static final Logger LOG = Logger.getLogger("JssMain");

    public static void main(String[] args) {
        int a = 4;
        int b = 249;
        String email = "xyz@gmail.com";
        String emailEncoded = encodeEmail(email);
        String emailDecoded = decodeEmail(emailEncoded);
        printLog("Hello Jagdeep");
        printLog("Sum is: "+add(a, b));
        printLog("Encoded email: "+emailEncoded);
        printLog("Decoded email: "+emailDecoded);
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static String encodeEmail(String email){
        char[] emailArray = email.toCharArray();
        char[] emailEncoded = new char[email.length()];
        for(int i=0;i<email.length();i++){
            emailEncoded[i] = (char) (emailArray[i]+10);
        }
        return String.valueOf(emailEncoded);
    }

    public static String decodeEmail(String emailEncoded) {
        char[] emailArray = emailEncoded.toCharArray();
        char[] emailDecoded = new char[emailEncoded.length()];
        for(int i=0;i<emailEncoded.length();i++){
            emailDecoded[i] = (char) (emailArray[i]-10);
        }
        return String.valueOf(emailDecoded);
    }

    public static void printLog(String str) {
        LOG.info(str);
    }

}
