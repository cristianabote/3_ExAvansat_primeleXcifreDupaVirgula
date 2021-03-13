package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// creeaza un program care afiseaza primele x cifre dupa virgula,ale valorii PI,unde x va avea urmatoarele valori: 2,7,12,20
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti cate numere doriti sa vedeti dupa virgula: ");
       int nrDupaVirgula=scan.nextInt();    //se citeste cate numere vor fi afisate dupa virgula
        DecimalFormat decimalFormat=new DecimalFormat("0.0");   //formatul .0
        String nrP=decimalFormat.format(Math.pow(10,nrDupaVirgula));    //10 la puterea numarului dorit dupa virgula
        double pi=Math.PI;
        System.out.println(pi);
        double finalPi=Math.round(pi*Math.pow(10,nrDupaVirgula))/(Double.parseDouble(nrP)); //rotunjire la cate numere dorim dupa virgula
        System.out.println(finalPi);

    }
}
