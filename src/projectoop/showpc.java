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
         ArrayList Ashop = new ArrayList();
         public static int sc,sm,sv,sme,sh,ss,sp,y,yy=0,admina1=0;
         public String aa,bb,cc,dd,ee,ff,gg;
         Login ll = new Login();
         public String con1;
         public showitem a1,a2,a3,a4,a5,a6,a7;
         public int price1=5000,price2=60000,price3=1000;
         
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
    public void Filter(){
        System.out.println("------------------------------------------");    
      
        System.out.println("********Filter Menu********");
        System.out.println("CPU" + "\t\t" + aa);
        System.out.println("MAINBORD"+"\t" + bb);
        System.out.println("VGA"+"\t\t" + cc);
        System.out.println("MEMORY"+"\t\t" + dd);
        System.out.println("HardDisk"+"\t" + ee);
        System.out.println("SSD"+"\t\t" + ff);
        System.out.println("PowerSupply"+"\t" + gg);  
        if(aa!=null&&bb!=null&&cc!=null&&dd!=null&&ee!=null&&ff!=null&&gg!=null){
            Scanner co = new Scanner(System.in);
            System.out.print("Confirm Selected and buy it[Y/y] or Edit[N/n]: ");
            String con = co.nextLine();
            
            if(con.equalsIgnoreCase("y")){
                ll.ddd();
                            
            }else if(con.equalsIgnoreCase("n")){
                select();
                Filter();
            }
        }
        if(y!=10 || admina1==1){
          select(); 
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
         aa =Mcpu[sc-1];
         Filter();
         
        
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
         bb = Mmainbord[sm-1];
         Filter();
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
         cc = Mvga[sv-1];
         Filter();
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
         dd = Mmemory[sme-1];
         Filter();
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
         ee = Mharddisk[sh-1];
         Filter();
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
         ff = Mssd[ss-1];
         Filter();
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
         gg = Mpower[sp-1];
         Filter();
 }        
    
    public void shop(){
        Scanner shq = new Scanner(System.in);
              System.out.println("Choose set number");
              System.out.println("Set promotion1");
              System.out.println("Set promotion2");
              System.out.println("Set promotion3");
              int sh = shq.nextInt();
 
                 showitem cpu = new showitem(Bcpu[0],Mcpu[0],Pcpu[0]);
                 Ashop.add(cpu);
                 showitem mainbord = new showitem(Bmainbord[1],Mmainbord[1],Pmainbord[1]);
                 Ashop.add(mainbord);
                 showitem vga = new showitem(Bvga[2],Mvga[2],Pvga[2]);
                 Ashop.add(vga);
                 showitem memory = new showitem(Bmemory[3],Mmemory[3],Pmemory[3]);
                 Ashop.add(memory);
                 showitem harddisk = new showitem(Bharddisk[3],Mharddisk[3],Pharddisk[3]);
                 Ashop.add(harddisk);
                  showitem ssd = new showitem(Bssd[1],Mssd[1],Pssd[1]);
                 Ashop.add(ssd);
                    showitem power = new showitem(Bpower[2],Mpower[2],Ppower[2]);
                 Ashop.add(power);
                 
                 
                 showitem cpu2 = new showitem(Bcpu[2],Mcpu[2],Pcpu[2]);
                 Ashop.add(cpu2);
                 showitem mainbord2 = new showitem(Bmainbord[1],Mmainbord[1],Pmainbord[1]);
                 Ashop.add(mainbord2);
                 showitem vga2 = new showitem(Bvga[0],Mvga[0],Pvga[0]);
                 Ashop.add(vga2);
                 showitem memory2 = new showitem(Bmemory[4],Mmemory[4],Pmemory[4]);
                 Ashop.add(memory2);
                 showitem harddisk2 = new showitem(Bharddisk[3],Mharddisk[3],Pharddisk[3]);
                 Ashop.add(harddisk2);
                  showitem ssd2 = new showitem(Bssd[4],Mssd[4],Pssd[4]);
                 Ashop.add(ssd2);
                    showitem power2 = new showitem(Bpower[3],Mpower[3],Ppower[3]);
                 Ashop.add(power2);
                 
                 showitem cpu3= new showitem(Bcpu[3],Mcpu[3],Pcpu[3]);
                 Ashop.add(cpu3);
                 showitem mainbord3 = new showitem(Bmainbord[2],Mmainbord[2],Pmainbord[2]);
                 Ashop.add(mainbord3);
                 showitem vga3 = new showitem(Bvga[2],Mvga[2],Pvga[2]);
                 Ashop.add(vga3);
                 showitem memory3 = new showitem(Bmemory[0],Mmemory[0],Pmemory[0]);
                 Ashop.add(memory3);
                 showitem harddisk3 = new showitem(Bharddisk[3],Mharddisk[3],Pharddisk[3]);
                 Ashop.add(harddisk3);
                  showitem ssd3 = new showitem(Bssd[2],Mssd[2],Pssd[2]);
                 Ashop.add(ssd3);
                    showitem power3 = new showitem(Bpower[2],Mpower[2],Ppower[2]);
                 Ashop.add(power3);
              
                 if(sh == 1){
                     shop1();
                                 
                 }else if(sh == 2){
                     shop2();
                 }else if(sh == 3){
                     shop3();
                 }
            
    }
    public void shop1(){
        mylist mm = new mylist();
        System.out.println("CPU" + "\t\t" + Ashop.get(0));
        System.out.println("MAINBORD"+"\t" + Ashop.get(1));
        System.out.println("VGA"+"\t\t" + Ashop.get(2));
        System.out.println("MEMORY"+"\t" + Ashop.get(3));
        System.out.println("HardDisk"+"\t" + Ashop.get(4));
        System.out.println("SSD"+"\t\t" + Ashop.get(5));
        System.out.println("PowerSupply"+"\t" + Ashop.get(6));
        System.out.println("Price "+price1);
        
        if(mm.s1!=10){
            Scanner co1 = new Scanner(System.in);
            System.out.print("Confirm Selected and buy it[Y/y] or Edit[N/n]: ");
             con1 = co1.nextLine();
            
            if(con1.equalsIgnoreCase("y")){
                
                ll.aaa();
                            
            }else if(con1.equalsIgnoreCase("n")){
                select();
                Filter();
            }
        }
        }
    

    public void shop2(){
                 
        mylist mm = new mylist();
        System.out.println("CPU" + "\t\t" + Ashop.get(7));
        System.out.println("MAINBORD"+"\t" + Ashop.get(8));
        System.out.println("VGA"+"\t\t" + Ashop.get(9));
        System.out.println("MEMORY"+"\t" + Ashop.get(10));
        System.out.println("HardDisk"+"\t" + Ashop.get(1));
        System.out.println("SSD"+"\t\t" + Ashop.get(12));
        System.out.println("PowerSupply"+"\t" + Ashop.get(13));
        if(mm.s1!=10){
        Scanner co2 = new Scanner(System.in);
            System.out.print("Confirm Selected and buy it[Y/y] or Edit[N/n]: ");
            String con2 = co2.nextLine();
            
            if(con2.equalsIgnoreCase("y")){
                
                ll.aaa();
                            
            }else if(con2.equalsIgnoreCase("n")){
                select();
                
            }
        }
    } 
    
    public void shop3(){
                 
        mylist mm = new mylist();
        System.out.println("CPU" + "\t\t" + Ashop.get(14));
        System.out.println("MAINBORD"+"\t" + Ashop.get(15));
        System.out.println("VGA"+"\t\t" + Ashop.get(16));
        System.out.println("MEMORY"+"\t" + Ashop.get(17));
        System.out.println("HardDisk"+"\t" + Ashop.get(18));
        System.out.println("SSD"+"\t\t" + Ashop.get(19));
        System.out.println("PowerSupply"+"\t" + Ashop.get(20));
        if(mm.s3!=10){
        Scanner co3 = new Scanner(System.in);
            System.out.print("Confirm Selected and buy it[Y/y] or Edit[N/n]: ");
            String con3 = co3.nextLine();
            
            if(con3.equalsIgnoreCase("y")){
                ll.aaa();
                            
            }else if(con3.equalsIgnoreCase("n")){
                
            }
        }
        
    } 
 }

