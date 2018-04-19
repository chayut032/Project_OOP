/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

/**
 *
 * @author User
 */
import java.util.Scanner;
 class member extends showpc{
     public String selectcom;
     String filter[][] = new String[10][7]; 
    member(){
       Scanner c = new Scanner(System.in);
       System.out.println("Select Menu");
       System.out.println("Press 1 Select specification");
       System.out.println("Press 2 My List");
       System.out.println("Press 3 Logout");
       System.out.print("Enter Num: ");
       int member = c.nextInt();     
        switch(member){
            case 1 : Filter();
                     break;
            case 2 : mylist();
                     break;
            case 3 : 
        }
    } 
    member(String name){
       
    }
    public void Filter(){
        System.out.println("------------------------------------------");    
      
        System.out.println("********Filter Menu********");
        System.out.println("CPU" + "\t" + aa);
        System.out.println("MAINBORD"+"\t" + bb);
        System.out.println("VGA"+"\t" + cc);
        System.out.println("MEMORY"+"\t" + dd);
        System.out.println("HardDisk"+"\t" + ee);
        System.out.println("SSD"+"\t" + ff);
        System.out.println("PowerSupply"+"\t" + gg);        
          select();

          
    }
    public void mylist(){
        
    }

    
   
}
