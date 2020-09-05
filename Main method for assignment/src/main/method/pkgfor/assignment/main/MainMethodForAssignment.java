/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.method.pkgfor.assignment;


import java.util.Scanner;
import static main.method.pkgfor.assignment.RoomDimension.length;
import static main.method.pkgfor.assignment.RoomDimension.width;


/**
 *
 * @author abenezerfetsum
 */
public class MainMethodForAssignment {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner object = new Scanner(System.in);
        System.out.println("User pls enter the length dimension of the carpet");
       RoomDimension.length= object.nextDouble();
       System.out.println("User pls enter the width dimension of the carpet");
       RoomDimension.width=object.nextDouble();
       System.out.println("Area");
       RoomDimension.getArea( length,width);
       System.out.println(RoomDimension.getArea( length,width));
        System.out.println("User pls enter the cost of carpet per square foot ");
        RoomCarpet.CarpetCost=object.nextDouble();
        System.out.println("Result:The total cost of the carpet is");
        System.out.println(RoomCarpet.getTotalCost(RoomCarpet.CarpetCost));
        
    }
    
}
