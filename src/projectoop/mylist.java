/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

/**
 *
 * @author lenovo
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class mylist extends showpc {
    Login lo =new Login();
    String name;
    public double totalprice,adminprice,allmoneyadmin,change1,change2;
    public double moneyadmin,totalmoneyadmin;
    public static int s1=0,s2=0,s3=0,ca;
    Login log = new Login();
         ArrayList<showitem> lcpu = new ArrayList<showitem>();
         ArrayList<showitem> lmainbord = new ArrayList<showitem>();
         ArrayList<showitem> lvga = new ArrayList<showitem>();
         ArrayList<showitem> lmemory = new ArrayList<showitem>();
         ArrayList<showitem> lharddisk = new ArrayList<showitem>();
         ArrayList<showitem> lssd = new ArrayList<showitem>();
         ArrayList<showitem> lpower = new ArrayList<showitem>();

    public void addlist(){
                System.out.println("*****My List*****");
                
        
            showitem list1 = new showitem(Bcpu[sc-1],Mcpu[sc-1],Pcpu[sc-1]);
            showitem list2 = new showitem(Bmainbord[sm-1],Mmainbord[sm-1],Pmainbord[sm-1]);
            showitem list3 = new showitem(Bvga[sv-1],Mvga[sv-1],Pvga[sv-1]);
            showitem list4 = new showitem(Bmemory[sme-1],Mmemory[sme-1],Pmemory[sme-1]);
            showitem list5 = new showitem(Bharddisk[sh-1],Mharddisk[sh-1],Pharddisk[sh-1]);
            showitem list6 = new showitem(Bssd[ss-1],Mssd[ss-1],Pssd[ss-1]);
            showitem list7 = new showitem(Bpower[sp-1],Mpower[sp-1],Ppower[sp-1]);
            lcpu.add(list1);
            lmainbord.add(list2);
            lvga.add(list3);
            lmemory.add(list4);
            lharddisk.add(list5);
            lssd.add(list6);
            lpower.add(list7);
                                  
            System.out.println(lcpu.get(0));
            System.out.println(lmainbord.get(0));;
            System.out.println(lvga.get(0));
            System.out.println(lmemory.get(0));
            System.out.println(lharddisk.get(0));
            System.out.println(lssd.get(0));
            System.out.println(lpower.get(0));
            totalprice = Pcpu[sc-1]+Pmainbord[sm-1]+Pvga[sv-1]+
  Pvga[sv-1]+Pmemory[sme-1]+Pharddisk[sh-1]+Pssd[ss-1]+Ppower[sp-1]; 
        System.out.println("Totalprice: " + totalprice + " Bath");
        
        Scanner p = new Scanner(System.in);
        System.out.println("Do you want to buy Yes[Y/y] or No[N/n]");
        String pr = p.nextLine();
        
        if(pr.equalsIgnoreCase("y")){
                    
                calcu();
                
            }else if(pr.equalsIgnoreCase("n")){
               
            }
        
    }
   
    
   
    public void calcu(){
           
        
        
        Scanner cc = new Scanner(System.in);
        System.out.print("Enter money: ");
         ca = cc.nextInt();
       
        if(ca>=totalprice){
            double change = ca-totalprice;
                       
            System.out.println("Change: "+ change);
            System.out.println("***** purchase successfully *****");
            log.home();
        }else {
            System.out.println("not enough money");
            calcu();
        }
        
        System.out.println("******Thank You********");
    } 
    public void calcu1(){
        Scanner cc = new Scanner(System.in);
        System.out.print("Enter money: ");
         ca = cc.nextInt();
       
        if(ca>=price1){
            double change1 = ca-price1;
            
            System.out.println("Change: "+ change1);
            System.out.println("***** purchase successfully *****");
            log.home();
        }else {
            System.out.println("not enough money");
            calcu1();
        }
        
        System.out.println("******Thank You********");
        
    }
    public void calcu2(){
    Scanner cc = new Scanner(System.in);
        System.out.print("Enter money: ");
         ca = cc.nextInt();
       
        if(ca>=price2){
            double change2 = ca-price2;
            
            System.out.println("Change: "+ change2);
            System.out.println("***** purchase successfully *****");
            log.home();
        }else {
            System.out.println("not enough money");
            calcu2();
        }
        
        System.out.println("******Thank You********");
    }
    public void calcu3(){
    Scanner cc = new Scanner(System.in);
        System.out.print("Enter money: ");
         ca = cc.nextInt();
       
        if(ca>=price3){
            double change3 = ca-price3;
            
            System.out.println("Change: "+ change3);
            System.out.println("***** purchase successfully *****");
            log.home();
        }else {
            System.out.println("not enough money");
            calcu3();
        }
        
        System.out.println("******Thank You********");
    }
    
    
  
   
}
