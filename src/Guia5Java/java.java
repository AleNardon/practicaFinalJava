package Guia5Java;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;




public class java {
    static Scanner input = new Scanner(System.in);
    
    public static int[][] matrixgenerator(int t){
        int[][] list = new int[t][t];
        for (int e = 0; e < t; e++) {
            
            for (int i = 0; i < t; i++) {
                System.out.print("Insert number on " + e +" - "+i+ "position: ");
                list[e][i] = input.nextInt();
            }    
        }
        return list;
    }
    public static boolean ej27() {
        int t =3;
        int[][] list = matrixgenerator(t);
        int sumv = 0 , sumh = 0 , sumd = 0 ; 
        for (int i = 0; i < t; i++) {
            sumv+=list[i][0];
            sumh+=list[1][i];
            sumd+=list[i][i];
        }
        if(sumv==sumh && sumv==sumd && sumd==sumh ){
            System.out.println("is a magic cube");
            return true;
        }
        else{
            System.out.println("isnt a magic cube");
            return false;
        }   
    }
    
//    System.out.print("Inisert size of square: ");
//        int t = input.nextInt();
//        int[][] list = new int[t][t];
//        for (int e = 0; e < t; e++) {
//            
//            for (int i = 0; i < t; i++) {
//                System.out.print("Insert number on " + e +" - "+i+ "position: ");
//                list[e][i] = input.nextInt();
//            }    
//        }
//            
    
    public static void main(String[] args) {
        boolean b = ej27();
    }
    
}
