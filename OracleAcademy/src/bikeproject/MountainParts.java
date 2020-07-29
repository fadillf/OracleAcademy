/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeproject;

/**
 *
 * @author Fadillah
 */
public interface MountainParts {
     //constant declaration     
    public final String TERRAIN = "off_road";  
 
    //required methods after implementation     
    public String getSuspension();
    public void setSuspension(String newValue);
    public String getType();
    public void setType(String newValue);
}
