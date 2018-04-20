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
/**
 *
 * @author User
 */
public class admin extends showpc {
   //arrItem ar=new arrItem();
    mylist mz = new mylist();
    
    Login zz = new Login();
   
    public void homeadmin(){
        Scanner ac = new Scanner(System.in);
       System.out.println("Select Menu");
       System.out.println("Press 1 Add items to list");
       System.out.println("Press 2 Select specification ");
       System.out.println("Press 3 Logout ");
       System.out.print("Enter Num: ");
       int admin = ac.nextInt();
       
       
       if(admin==1){ 
           addItem();
       }else if(admin==2){
              Filter();
       }else if(admin == 3){
            zz.home();
       }else{
       homeadmin();
       }
    }
    

    public void printt(){
        
    }
    
    

    }
