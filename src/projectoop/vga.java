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
public interface vga {
    String Bvga[] = {"ASUS","ASUS","MSI","MSI","MSI",null,null,null};
    String Mvga[] = {"GTX1050Ti OC 4GB","ROG STRIX GTX1080Ti GAMING OC 11GB","GTX1050 PH 2GB","GTX1050 2G OC 2GB","GTX1080Ti SEA HAWK EK X 11GB",null,null,null};
    double Pvga[] = {6390,31290,3990,4270,34890,0,0,0};
       abstract void showvga();
}
