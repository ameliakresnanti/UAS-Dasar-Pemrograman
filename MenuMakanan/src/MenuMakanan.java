import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amelia
 */
public class MenuMakanan {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Menu Makanan  :");
      
      System.out.println("\n1. Nasi Goreng");
      System.out.println("\n2. Mie Goreng");
      System.out.println("\n3. Bakso");
      System.out.println("\n\tMasukan Pilihan Anda  :");
      byte menu = input.nextByte();
      
    switch (menu)
    {
            case 1 :
                System.out.println("\nAnda Memilih Nasi Goreng\n");
                break;
                
            case 2  :
                System.out.println("\nAnda Memilih Mie Goreng\n");
                break;
           
            case 3  :
                System.out.println("\nAnda Memilih Bakso\n" );
                break;
                
            
            default :System.out.println("\nPesanan yang anda masukan tidak tersedia\n" );
                break;
                
          
      }
   } 

    private static void Switch(byte menu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   

