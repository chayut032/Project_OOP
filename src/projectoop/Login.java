/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;
import java.util.ArrayList;
/**
 *
 * @author User
 */
import java.util.Scanner;
public class Login {
    
    public static String user,pass,id,code;
    ArrayList str= new ArrayList();
    ArrayList strpass = new ArrayList();
    public int checkadmin,i,x;
    
    
    public  void regis(){
    
Scanner st = new Scanner(System.in);
System.out.print("Enter E-mail: ");
 id =st.nextLine();
str.add(id);

System.out.print("Enter Password: ");
 code =st.nextLine();
str.add(code);
    home();
}
    
    
    public void login(){
        final String useradmin = "admin";
        final String passadmin = "123456";
       
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Username: ");
         user = sc.nextLine();
         
        System.out.print("Enter Password: ");
         pass = sc.nextLine();
        
        if(user.equals(useradmin) && pass.equals(passadmin)){
             checkadmin = 999;
            System.out.println("Welcome: " + useradmin);
            admin a = new admin();
            a.homeadmin();
        }
        
        for( i=0; i<=str.size()-1;i++){
            
        if(user.equals(str.get(i))  && pass.equals(str.get(i+1))){  
            checkadmin = 9;
             System.out.println("Welcome: " + str.get(i)); 
             member m = new member();
             
        }
        }     
        
         if(checkadmin != 9 && checkadmin!=999) {
            System.out.println("Username or Password is incorrect");
            System.out.println("===============================");
            home();
        }
        
         
    }
    
    public void home(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Login press 1");
        System.out.println("Register press 2");
        System.out.print("Enter Number: ");
        int choose = sc2.nextInt();
        
        if(choose == 1){
            System.out.println("=============================");
            System.out.println("*****Login*****");
            login();
        }else if(choose == 2){
            System.out.println("*****Register*****");
            regis();
            System.out.println("=============================");
            
        }else {
            System.out.println("Press 1 or 2");
            home();
        }       
    }
    public void mem(){
         member m = new member();
    }
 
    public void ddd(){
        admin mq = new admin();
        mq.homeadmin();

    }
    public void aaa(){
        mylist mq = new  mylist();
        mq.calcu();
    }
    
    
}
