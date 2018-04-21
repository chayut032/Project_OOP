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
import java.util.ArrayList;
import java.util.Scanner;
 class member extends showpc{
         ArrayList listcpu = new ArrayList();
         ArrayList listmainbord = new ArrayList();
         ArrayList listvga = new ArrayList();
         ArrayList listmemory = new ArrayList();
         ArrayList listharddisk = new ArrayList();
         ArrayList listssd = new ArrayList();
         ArrayList listpower = new ArrayList();
     public String selectcom,name;
        
    member(){
        
       Scanner c = new Scanner(System.in);
       System.out.println("Select Menu");
       System.out.println("Press 1 Select specification");
       System.out.println("Press 2 Choose from a list by shop");
       System.out.println("Press 3 Logout");
       System.out.print("Enter Num: ");
       int member1 = c.nextInt();
       if(member1 == 1){
           Filter();
       }else if(member1 == 2){
           shop();       
       }else if(member1 == 3){
           Login ho =new Login();
           ho.home();
       }else{
           Login ho =new Login();
           ho.mem();
       }
       
    } 
    member(String name){   
       
    }
 
}