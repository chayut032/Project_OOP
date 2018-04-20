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
public class showitem {

    private String ItemBrand;
    private double ItemPrice;
    private String Model;
    public String state;
    
   

 public showitem(String ItemBrand, String ItemModel , double ItemPrice ){
        
        this.ItemBrand = ItemBrand;
        this.Model = ItemModel;
        this.ItemPrice = ItemPrice;
        
}

    showitem() {
        System.out.print(toString());
    }

    


public String getItemBrand() {
    return ItemBrand;
}

public double getItemPrice() {
    return ItemPrice;
}

public String getItemGen() {
    return Model;
}
public void setItemName(String ItemBrand)
{
    this.ItemBrand = ItemBrand;
}

    public void setItempPrice(double ItemPrice)
{
    this.ItemPrice = ItemPrice;
}
    public void setItemGen(String ItemGen)
{
    this.Model = ItemGen;
}

public String toString(){
     state = ItemBrand + "\t\t\t||  MODEL: " + Model + "\t\t\t Price: " + ItemPrice;
    return state;
}


}
