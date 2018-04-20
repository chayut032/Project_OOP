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
public interface power {
      String Bpower[] = {"ANTEC","ANTEC","CORSAIR","CORSAIR","CORSAIR",null,null,null};
      String Mpower[] = {"VP500P","VP600P","RM750x","HX850i","RM650x Gold",null,null,null};
      double Ppower[] = {1450,1890,5390,6950,4790,0,0,0};
      
    abstract void showpower();
}
