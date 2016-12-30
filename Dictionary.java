//package com.example.nicholas.grabble;
//
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//
//public class Dictionary {
//    ArrayList<String> Dict = new ArrayList<String>();
//
//    public Dictionary() {
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//        String word = null;
//        try {
//            word = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            while (word != null) {
//                Dict.add(word);
//                word = reader.readLine();
//            }
//            reader.close();
//            is.close();
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }
//    }
//
//}