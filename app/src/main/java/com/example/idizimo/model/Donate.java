package com.example.idizimo.model;

public class Donate {
    private static double totalDonateGlobal = 0;

    public static void calculaTotal(double cash){
        totalDonateGlobal +=cash ;
    }
    public static double calculaTotal(){
       return  totalDonateGlobal  ;
    }

    public static  double zeradoTotal(){
        return totalDonateGlobal=0;
    }

}
