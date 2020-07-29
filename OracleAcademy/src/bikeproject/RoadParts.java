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
public interface RoadParts {
     //constant declaration     
    public final String TERRAIN = "track_racing";  
 
    //required methods after implementation     
    public int getTyreWidth();
    public void setTyreWidth(int newValue);
    public int getPostHeight();
    public void setPostHeight(int newValue);
}
