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
public interface memory {
    String Bmemory[] = {"corsair","corsair","corsair","G.SKILL",
        "G.SKILL",null,null,null};
    String Mmemory[] = {"VENGEANCE RGB DDR4 32GB 3200 (2*16GB)",
        "Vengeance LPX DDR4 2400 8GB Black",
        "Vengeance LPX DDR4 16GB 2400(8GB*2)",
        "Trident Z DDR4 16GB 3200(8GB*2)GTZ",
        "Aegis DDR3L 1600 16GB(8GB*2)",null,null,null};
      double Pmemory[] = {18500,3790,7690,8950,4900,0,0,0};
      
      abstract void showmemory();
}
