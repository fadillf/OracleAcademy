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
public interface BikeParts {
    //constant declaration     
    public final String MAKE = "Oracle Bikes";  
 
    //required methods after implementation     
    public String getHandleBars();     
    public void setHandleBars(String newValue);     
    public String getTyres();     
    public void setTyres(String newValue);     
    public String getSeatType();         
    public void setSeatType(String newValue);    
}
