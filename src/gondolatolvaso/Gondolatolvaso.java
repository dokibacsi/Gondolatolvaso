/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gondolatolvaso;

import java.util.Scanner;




public class Gondolatolvaso {

    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        Kirak();
        Kever();
        EzVolt();
    }
    
    
    public static void Kirak(){
        
        int melyik = Melyik();
        int[] tomb = new int[9];
        
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] += i;
            if (i%3 == 0 ) {
                System.out.println("");
            }
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
        
    }
    
    public static int Melyik(){
        
        int oszlop = sc.nextInt();
        
        if(oszlop < 1 || oszlop > 3){
            oszlop = sc.nextInt();
        }
        return oszlop;
        
        
    }
    
    public static void Kever(){
        
    }
    
    
    public static void EzVolt(){
        
    }
    
}
