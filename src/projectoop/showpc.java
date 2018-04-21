
package projectoop;
import java.util.ArrayList;
import java.util.Scanner;

  class showpc  implements cpu,mainbord,vga,harddisk,ssd,
          power,memory{     
         ArrayList Acpu = new ArrayList();
         ArrayList Amainbord = new ArrayList();
         ArrayList Avga = new ArrayList();
         ArrayList Amemory = new ArrayList();
         ArrayList Aharddisk = new ArrayList();
         ArrayList Assd = new ArrayList();
         ArrayList Apower = new ArrayList();
         ArrayList Ashop = new ArrayList();
         public static int c,sc,sm,sv,sme,sh,ss,sp,y,yy=0,
                 admina1=0,ca,v=0, w=5,e=5,r=5,t=5,p=5,u=5,q=5;
         public String aa,bb,cc,dd,ee,ff,gg;
         Login ll = new Login();
         public String con1;
         public showitem a1,a2,a3,a4,a5,a6,a7;
         public int price1=53300,price2=45000,price3=71000;
         
        
         showpc(){            
                            
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
        if(aa!=null&&bb!=null&&cc!=null&&dd!=null&&ee!=null&&
                ff!=null&&gg!=null){
            Scanner co = new Scanner(System.in);
            System.out.print("Confirm Selected and buy it[Y/y] "
                    + "or Edit[N/n]: ");
            String con = co.nextLine();
            
            if(con.equalsIgnoreCase("y")){
                mylist ms =new mylist();
                ms.addlist();
                ll.ddd();
                            
            }else if(con.equalsIgnoreCase("n")){
                ll.mem();
            }
        }
        if(y!=10 || admina1==1){
          select(); 
        }      
    }
    public void addItem(){
        Scanner qs = new Scanner(System.in);
        System.out.println("What do you want to add item? ");
        System.out.println("- CPU"+"\n"+"- MAINBORD"+"\n"+"- VGA"+"\n"+
        "- MEMORY"+"\n"+"- HARDDISK"+"\n"+"- SSD"+"\n"+"- POWERSUPPLY");
        System.out.print("Choose >> ");
        String aadd = qs.nextLine();
        System.out.println("-----------------------------------------"
                + "-------------------------");
        if(aadd.equalsIgnoreCase("cpu")){
                 System.out.println("******Central Processing Unit******");
                 addCpu();
             }else if(aadd.equalsIgnoreCase("mainbord")){
                 System.out.println("******MAINBORD******");
                 addmainbord();
             }else if(aadd.equalsIgnoreCase("vga")){
                 System.out.println("*****Video Graphic Adapter*****");
                 addvga();
             }else if(aadd.equalsIgnoreCase("memory")){
                 System.out.println("*****MEMORY*****");
                 addmemory();
             }else if(aadd.equalsIgnoreCase("harddisk")){
                 System.out.println("*****Hard Disk Drive*****");
                 addharddisk();
             }else if(aadd.equalsIgnoreCase("ssd")){
                 System.out.println("*****Solid state drive*****");
                 addssd();
             }else if(aadd.equalsIgnoreCase("PowerSupply")){
                 System.out.println("*****Power Supply*****");
                 addpower();
             }else {
                 System.out.print("");
             }  
      
                
    }
    public void showcpu() { 
        Scanner s1 = new Scanner(System.in);
        for( c=0;c<Mcpu.length;c++){
            if(Bcpu[c]!=null&&Mcpu[c]!=null&&Pcpu[c]!=0){
                 showitem cpu = new showitem(Bcpu[c],Mcpu[c],Pcpu[c]);
                 Acpu.add(cpu);
                 System.out.println((c+1)+" CPU || "+ "\t" + Acpu.get(c));     
        }
            }
        System.out.print("Select CPU Number: ");
         sc = s1.nextInt();
         aa =Mcpu[sc-1];
         Filter();
    }
        public void addCpu() {      
        String aName;
        String aModel;
        int aPrice;
        
            Scanner aad = new Scanner(System.in);
            System.out.println("Brand: ");
            aName = aad.nextLine();
            Bcpu[w] = aName;
            System.out.println("Model: ");
            aModel = aad.nextLine();
            Mcpu[w] = aModel;
            System.out.println("Price: ");
            aPrice = aad.nextInt();
            Pcpu[w] = aPrice;
            System.out.println(" CPU || "+"\t" + Bcpu[w]+"\t"+
                    Mcpu[w]+"\t\t"+Pcpu[w]);
        w++;
            
      ll.ddd();
        }
    public void showmainbord(){
     Scanner s2 = new Scanner(System.in);
        for(int c=0;c<Mmainbord.length;c++){
            if(Bmainbord[c]!=null&&Mmainbord[c]!=null&&Pmainbord[c]!=0){
                 showitem mainbord = new showitem(Bmainbord[c],
                         Mmainbord[c],Pmainbord[c]);
                 Amainbord.add(mainbord);
                 System.out.println((c+1)+" MAINBORD || " + Amainbord.get(c)); 
            }
            }
        System.out.print("Select MAINBORD Number: ");
         sm = s2.nextInt();
         bb = Mmainbord[sm-1];
         Filter();
 }
    public void addmainbord() {      
        String aName;
        String aModel;
        int aPrice;
        
            Scanner aad = new Scanner(System.in);
            System.out.println("Brand: ");
            aName = aad.nextLine();
            Bmainbord[e] = aName;
            System.out.println("Model: ");
            aModel = aad.nextLine();
            Mmainbord[e] = aModel;
            System.out.println("Price: ");
            aPrice = aad.nextInt();
            Pmainbord[e] = aPrice;
            System.out.println(" MAINBORD || "+"\t" + Bmainbord[e]+
                    "\t"+Mmainbord[e]+"\t"+Pmainbord[e]);
        e++;
            
      ll.ddd();
        }
    public void showvga(){ 
        Scanner s3 = new Scanner(System.in);
        for(int c=0;c<Mvga.length;c++){
            if(Bvga[c]!=null&&Mvga[c]!=null&&Pvga[c]!=0){
                 showitem vga = new showitem(Bvga[c],Mvga[c],Pvga[c]);
                 Avga.add(vga);
                 System.out.println((c+1)+" VGA CARD || " + Avga.get(c));                
            }}
        System.out.print("Select VGA Number: ");
         sv = s3.nextInt();
         cc = Mvga[sv-1];
         Filter();
 }
    public void addvga() {      
        String aName;
        String aModel;
        int aPrice;
        
            Scanner aad = new Scanner(System.in);
            System.out.println("Brand: ");
            aName = aad.nextLine();
            Bvga[r] = aName;
            System.out.println("Model: ");
            aModel = aad.nextLine();
            Mvga[r] = aModel;
            System.out.println("Price: ");
            aPrice = aad.nextInt();
            Pvga[r] = aPrice;
            System.out.println(" VGA || "+"\t" + Bvga[r]+"\t"+Mvga[r]+"\t"
                    +Pvga[r]);
        r++;
            
      ll.ddd();
        }
    public void showmemory(){  
        Scanner s4 = new Scanner(System.in);
        for(int c=0;c<Mmemory.length;c++){
            if(Bmemory[c]!=null&&Mmemory[c]!=null&&Pmemory[c]!=0){
                 showitem memory = new showitem(Bmemory[c],Mmemory[c],
                         Pmemory[c]);
                 Amemory.add(memory);
                 System.out.println((c+1)+" MEMORY || " + Amemory.get(c));                
            }}
        System.out.print("Select MEMORY Number: ");
         sme = s4.nextInt();
         dd = Mmemory[sme-1];
         Filter();
 }
    public void addmemory() {      
        String aName;
        String aModel;
        int aPrice;
        
            Scanner aad = new Scanner(System.in);
            System.out.println("Brand: ");
            aName = aad.nextLine();
            Bmemory[t] = aName;
            System.out.println("Model: ");
            aModel = aad.nextLine();
            Mmemory[t] = aModel;
            System.out.println("Price: ");
            aPrice = aad.nextInt();
            Pmemory[t] = aPrice;
            System.out.println(" MEMORY || "+"\t" + Bmemory[t]+
                    "\t"+Mmemory[t]+"\t"+Pmemory[t]);
        t++;
            
      ll.ddd();
        }
    public void showharddisk(){    
        Scanner s5 = new Scanner(System.in);
        for(int c=0;c<Mharddisk.length;c++){
            if(Bharddisk[c]!=null&&Mharddisk[c]!=null&&Pharddisk[c]!=0){
                 showitem harddisk = new showitem(Bharddisk[c],
                         Mharddisk[c],Pharddisk[c]);
                 Aharddisk.add(harddisk);
                 System.out.println((c+1)+" HARDDISK || " + Aharddisk.get(c));                
            }}
        System.out.print("Select HARDDISK Number: ");
         sh = s5.nextInt();
         ee = Mharddisk[sh-1];
         Filter();
 }
    public void addharddisk() {      
        String aName;
        String aModel;
        int aPrice;
        
            Scanner aad = new Scanner(System.in);
            System.out.println("Brand: ");
            aName = aad.nextLine();
            Bharddisk[p] = aName;
            System.out.println("Model: ");
            aModel = aad.nextLine();
            Mharddisk[p] = aModel;
            System.out.println("Price: ");
            aPrice = aad.nextInt();
            Pharddisk[p] = aPrice;
            System.out.println(" HARDDISK || "+"\t" + Bharddisk[p]
                    +"\t"+Mharddisk[p]+"\t"+Pharddisk[p]);
        p++;
            
      ll.ddd();
        }
    public void showssd(){     
        Scanner s6 = new Scanner(System.in);
        for(int c=0;c<Mssd.length;c++){
            if(Bssd[c]!=null&&Mssd[c]!=null&&Pssd[c]!=0){
                 showitem ssd = new showitem(Bssd[c],Mssd[c],Pssd[c]);
                 Assd.add(ssd);
                 System.out.println((c+1)+" Solid State Drive || "
                         + Assd.get(c));                
            }}
        System.out.print("Select Solid State Drive Number: ");
         ss = s6.nextInt();
         ff = Mssd[ss-1];
         Filter();
 }
    public void addssd() {      
        String aName;
        String aModel;
        int aPrice;
        
            Scanner aad = new Scanner(System.in);
            System.out.println("Brand: ");
            aName = aad.nextLine();
            Bssd[u] = aName;
            System.out.println("Model: ");
            aModel = aad.nextLine();
            Mssd[u] = aModel;
            System.out.println("Price: ");
            aPrice = aad.nextInt();
            Pssd[u] = aPrice;
            System.out.println(" SSD || "+"\t"  + Bssd[u]+"\t"
                    +Mssd[u]+"\t"+Pssd[u]);
        u++;
            
      ll.ddd();
        }
    public void showpower(){    
        Scanner s7 = new Scanner(System.in);
        for(int c=0;c<Mpower.length;c++){
            if(Bpower[c]!=null&&Mpower[c]!=null&&Ppower[c]!=0){
                 showitem power = new showitem(Bpower[c],Mpower[c],Ppower[c]);
                 Apower.add(power);
                 System.out.println((c+1)+" Power Supply || " + Apower.get(c));                
            }}
        System.out.print("Select Power Supply Number: ");
         sp = s7.nextInt();
         gg = Mpower[sp-1];
         Filter();
 }        
    public void addpower() {      
        String aName;
        String aModel;
        int aPrice;
        
            Scanner aad = new Scanner(System.in);
            System.out.println("Brand: ");
            aName = aad.nextLine();
            Bpower[q] = aName;
            System.out.println("Model: ");
            aModel = aad.nextLine();
            Mpower[q] = aModel;
            System.out.println("Price: ");
            aPrice = aad.nextInt();
            Ppower[q] = aPrice;
            System.out.println(" SHOWPOWER || "+"\t"  
                    + Bpower[q]+"\t"+Mpower[q]+"\t"+Ppower[q]);
        q++;
            
      ll.ddd();
        }
    
    public void shop(){
        Scanner shq = new Scanner(System.in);
              System.out.println("Choose set number");
              System.out.println("Press 1 Set promotion1");
              System.out.println("Press 2 Set promotion2");
              System.out.println("press 3 Set promotion3");
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
        System.out.println("CPU           "+"\t"      + Ashop.get(0));
        System.out.println("MAINBORD      "+"\t"      + Ashop.get(1));
        System.out.println("VGA           "+"\t"      + Ashop.get(2));
        System.out.println("MEMORY        "+"\t"      + Ashop.get(3));
        System.out.println("HardDisk      "+"\t"      + Ashop.get(4));
        System.out.println("SSD           "+"\t"      + Ashop.get(5));
        System.out.println("PowerSupply   "+"\t"      + Ashop.get(6));
        System.out.println("====================");
        System.out.println("Total Price "+price1);
        
        if(mm.s1!=10){
            Scanner co1 = new Scanner(System.in);
            System.out.print("Confirm Selected and buy it[Y/y] or Edit[N/n]: ");
             con1 = co1.nextLine();
            
            if(con1.equalsIgnoreCase("y")){
                mm.calcu1();
                //ll.aaa();
                            
            }else if(con1.equalsIgnoreCase("n")){
                select();
                //member m = new member();
                
            }
        }
        }
    

    public void shop2(){
                 
        mylist mm = new mylist();
        System.out.println("CPU          "+"\t"      + Ashop.get(7));
        System.out.println("MAINBORD     "+"\t"      + Ashop.get(8));
        System.out.println("VGA          "+"\t"      + Ashop.get(9));
        System.out.println("MEMORY       "+"\t"      + Ashop.get(10));
        System.out.println("HardDisk     "+"\t"      + Ashop.get(1));
        System.out.println("SSD          "+"\t"      + Ashop.get(12));
        System.out.println("PowerSupply  "+"\t"      + Ashop.get(13));
        System.out.println("====================");
        System.out.println("Total Price "+price2);
        if(mm.s1!=10){
        Scanner co2 = new Scanner(System.in);
            System.out.print("Confirm Selected and buy it[Y/y] or Edit[N/n]: ");
            String con2 = co2.nextLine();
            
            if(con2.equalsIgnoreCase("y")){
                mm.calcu2();
                //ll.aaa();
                            
            }else if(con2.equalsIgnoreCase("n")){
                select();
                //member m = new member();
                
            }
        }
    } 
    
    public void shop3(){
                 
        mylist mm = new mylist();
        System.out.println("CPU        "+"\t"      + Ashop.get(14));
        System.out.println("MAINBORD   "+"\t"      + Ashop.get(15));
        System.out.println("VGA        "+"\t"      + Ashop.get(16));
        System.out.println("MEMORY     "+"\t"      + Ashop.get(17));
        System.out.println("HardDisk   "+"\t"      + Ashop.get(18));
        System.out.println("SSD        "+"\t"      + Ashop.get(19));
        System.out.println("PowerSupply"+"\t"      + Ashop.get(20));
        System.out.println("====================");
        System.out.println("Total Price "+price3);
        if(mm.s3!=10){
        Scanner co3 = new Scanner(System.in);
            System.out.print("Confirm Selected and buy it[Y/y] or Edit[N/n]: ");
            String con3 = co3.nextLine();
            
            if(con3.equalsIgnoreCase("y")){
                mm.calcu3();
                //ll.aaa();
                            
            }else if(con3.equalsIgnoreCase("n")){
                select();
                //member m = new member();
            }
        }
        
    }
    
 }

