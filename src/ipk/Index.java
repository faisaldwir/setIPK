/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipk;

import java.util.Scanner;

/**
 *
 * @author Faisal
 */
public class Index {
    
    public static void main(String[] args) {
        SessionBean sb = new SessionBean();
        Scanner sc = new Scanner(System.in);
        
        String nama = "", nilai = "";
        int number=0, arr=0, sks = 0, bobot = 0;
        double skor = 0;
        
        String[] nm,nl;
        Integer[] sk, bbt, no;
        Double[] skr;
        
        // untuk menerima inputan dari user
        
        no = new Integer[10];
        nm = new String[10];
        nl = new String[10];
        sk = new Integer[10];
        bbt = new Integer[10];
        skr = new Double[10];
        
        while(number<=10){
        
            number++;
            arr = number;
            System.out.print("Nama MK : ");
            nama = sc.next();
        
            System.out.print("SKS : ");
            sks = sc.nextInt();
        
            System.out.print("Nilai : ");
            nilai = sc.next().toUpperCase();
        
            sb.setIPK(nama, sks, nilai);
            bobot = sb.getBobot();
            skor = sb.getSkor();
            
            no[number] = number;
            nm[number] = nama;
            sk[number] = sks;
            nl[number] = nilai;
            bbt[number] = bobot;
            skr[number] = skor;
        
            System.out.println();
            System.out.println("______________________________________________________________");
            System.out.println("No."+"\t"+"MK"+"\t"+"SKS"+"\t"+"Nilai"+"\t"+"Bobot"+"\t"+"Skor");
            System.out.println("______________________________________________________________");
            for(int i = 1; i <= arr; i++){
                System.out.println(no[i]+"\t"+nm[i]+"\t"+sk[i]+"\t"+nl[i]+"\t"+bbt[i]+"\t"+skr[i]);
            }
            System.out.println();
            arr = 0;
        }
    }   
}
