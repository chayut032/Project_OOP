/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;
import java.util.ArrayList;
import java.util.Scanner;

  class showpc  implements cpu,mainbord,vga,harddisk,ssd,power,memory{     
         ArrayList Acpu = new ArrayList();
         ArrayList Amainbord = new ArrayList();
         ArrayList Avga = new ArrayList();
         ArrayList Amemory = new ArrayList();
         ArrayList Aharddisk = new ArrayList();
         ArrayList Assd = new ArrayList();
         ArrayList Apower = new ArrayList();
         public int sc,sm,sv,sme,sh,ss,sp;
         public String aa,bb,cc,dd,ee,ff,gg,y;
        // member m = new member();
         showpc(){            
                            
         }
         showpc(String confirm){
             this();
         }
         
    public void select(){
             Scanner sc = new Scanner(System.in);
             System.out.print("Select Components: ");
             String selectcom = sc.nextLine();

             if(selectcom.equalsIgnoreCase("cpu")){
                 System.out.println("******Central Processing Unit******");
                 showcpu();
             }else if(selectcom.equalsIgnoreCase("mainbord")){
                 System.out.println("******MAINBORD******");
                 showmainbord();
             }else if(selectcom.equalsIgnoreCase("vga")){
                 System.out.println("*****Video Graphic Adapter*****");
                 showvga();
             }else if(selectcom.equalsIgnoreCase("memory")){
                 System.out.println("*****MEMORY*****");
                 showmemory();
             }else if(selectcom.equalsIgnoreCase("harddisk")){
                 System.out.println("*****Hard Disk Drive*****");
                 showharddisk();
             }else if(selectcom.equalsIgnoreCase("ssd")){
                 System.out.println("*****Solid state drive*****");
                 showssd();
             }else if(selectcom.equalsIgnoreCase("PowerSupply")){
                 System.out.println("*****Power Supply*****");
                 showpower();
             }else {
                 System.out.print("");
             }             
    }             
    public void showcpu() { 
        Scanner s1 = new Scanner(System.in);
        for(int c=0;c<Mcpu.length;c++){
                 showitem cpu = new showitem(Bcpu[c],Mcpu[c],Pcpu[c]);
                 Acpu.add(cpu);
                 System.out.println((c+1)+" CPU || " + Acpu.get(c));                
            }
        System.out.print("Select CPU Number: ");
         sc = s1.nextInt();
         //aa =Mcpu[sc-1];
         //m.Filter();
         
        
    }
    public void showmainbord(){
     Scanner s2 = new Scanner(System.in);
        for(int c=0;c<Mmainbord.length;c++){
                 showitem mainbord = new showitem(Bmainbord[c],Mmainbord[c],Pmainbord[c]);
                 Amainbord.add(mainbord);
                 System.out.println((c+1)+" MAINBORD || " + Amainbord.get(c));                
            }
        System.out.print("Select MAINBORD Number: ");
         sm = s2.nextInt();
         //bb = Mmainbord[sm-1];
         //m.Filter();
 }
    public void showvga(){ 
        Scanner s3 = new Scanner(System.in);
        for(int c=0;c<Mvga.length;c++){
                 showitem vga = new showitem(Bvga[c],Mvga[c],Pvga[c]);
                 Avga.add(vga);
                 System.out.println((c+1)+" VGA CARD || " + Avga.get(c));                
            }
        System.out.print("Select VGA Number: ");
         sv = s3.nextInt();
         //cc = Mvga[sv-1];
         //m.Filter();
 }
    public void showmemory(){  
        Scanner s4 = new Scanner(System.in);
        for(int c=0;c<Mmemory.length;c++){
                 showitem memory = new showitem(Bmemory[c],Mmemory[c],Pmemory[c]);
                 Amemory.add(memory);
                 System.out.println((c+1)+" MEMORY || " + Amemory.get(c));                
            }
        System.out.print("Select MEMORY Number: ");
         sme = s4.nextInt();
         //dd = Mmemory[sme-1];
         //m.Filter();
 }
    public void showharddisk(){    
        Scanner s5 = new Scanner(System.in);
        for(int c=0;c<Mharddisk.length;c++){
                 showitem harddisk = new showitem(Bharddisk[c],Mharddisk[c],Pharddisk[c]);
                 Aharddisk.add(harddisk);
                 System.out.println((c+1)+" HARDDISK || " + Aharddisk.get(c));                
            }
        System.out.print("Select HARDDISK Number: ");
         sh = s5.nextInt();
         //ee = Mharddisk[sh-1];
         //m.Filter();
 }
    public void showssd(){     
        Scanner s6 = new Scanner(System.in);
        for(int c=0;c<Mssd.length;c++){
                 showitem ssd = new showitem(Bssd[c],Mssd[c],Pssd[c]);
                 Assd.add(ssd);
                 System.out.println((c+1)+" Solid State Drive || " + Assd.get(c));                
            }
        System.out.print("Select Solid State Drive Number: ");
         ss = s6.nextInt();
         //ff = Mssd[ss-1];
         
 }
    public void showpower(){    
        Scanner s7 = new Scanner(System.in);
        for(int c=0;c<Mpower.length;c++){
                 showitem power = new showitem(Bpower[c],Mpower[c],Ppower[c]);
                 Apower.add(power);
                 System.out.println((c+1)+" Power Supply || " + Apower.get(c));                
            }
        System.out.print("Select Power Supply Number: ");
         sp = s7.nextInt();
         //gg = Mpower[sp-1];
         //m.Filter();
 }        
 }

