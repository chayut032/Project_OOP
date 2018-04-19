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
public interface cpu{
      String Bcpu[] = {"AMD","AMD","INTEL","INTEL","INTEL"};
      String Mcpu[] = {"Ryzen 3 1200","Ryzen 5 1600","core i7-7740x","core i9-7900x","Pentium G4600"};
      double Pcpu[] = {3290,6500,10500,34500,2370};
          
    abstract void showcpu();
} 
