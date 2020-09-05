/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.method.pkgfor.assignment;

import static main.method.pkgfor.assignment.RoomDimension.length;
import static main.method.pkgfor.assignment.RoomDimension.width;



/**
 *
 * @author abenezerfetsum
 */
public class RoomCarpet {
 public static void main(String[] args) {
        // TODO code application logic here
     
      
       
     
    }
  RoomDimension size;
    static double CarpetCost;
   public RoomCarpet(RoomDimension size, double cost){
       CarpetCost=cost;
        
  
}
    public static double getTotalCost(double cost) {
       
      
       
        double TotalCost= RoomDimension.getArea(length,width)*cost;
        return TotalCost;
       
    }
    
}
