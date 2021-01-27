/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binnarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dini
 */
public class BinnarySearch {
public static int med;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner array = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Banyak Array = ");
        int Banyakarray = array.nextInt();        
        int[] Array = new int[Banyakarray];
        
        System.out.println("=======================");
        
        // Input Nilai Array
        for (int j = 0 ; j < Array.length; j++) {
            System.out.print("Masukan Nilai Ke-" + (j+1) + " = ");
            int nilai = input.nextInt();
            Array[j] = nilai;
            }
           
           System.out.print("\nNilai Pada Array Yang Diinput : ");
           System.out.print(Arrays.toString(Array));

         // Sorting Pada Array
         for (int k = 0 ; k < Array.length ; k++){
             for (int l = k ; l < Array.length ; l++){
                if (Array[k]>Array[l]){
                    int wadah = Array[k];
                    Array[k] = Array[l];
                    Array[l] = wadah;
                }
             }
         }
         System.out.print("\nNilai Pada Array Yang Sudah Disorting : ");
         System.out.println(Arrays.toString(Array));
         
         
System.out.print("Masukan Nilai Yang Dicari : ");
        int x = input.nextInt();
        boolean notFound = true;
       
        System.out.println("======== Hasil ========");
        
        int y = 0;
        int lower = 0;
        int upper = Banyakarray - 1;

        
        //Penentu Median / Nilai tengah 
         if (Banyakarray % 2 == 1){
             med = (Banyakarray)/2;
         }
         else {
             med = (Banyakarray-1)/2;
         }
         
                             //Pencarian Pada Array
                                  if (Array[med] <= x) {
                                  for ( int i = med ; i < Array.length ; i++ ) {
                                      if (Array[i] == x) {
                                         System.out.println("Data Ditemukan pada Array ke-" + i);
                                         y = 1;
                                         }
                                     }
                                  }

                                  if (Array[med] >= x ){
                                      for ( int k = 0 ; k < med ; k++ ) {
                                          if (Array[k] == x) {
                                              System.out.println("Data Ditemukan pada Array ke-" + k);
                                              y = 1;
                                          }
                                    }
                                 }

    }
    
}
