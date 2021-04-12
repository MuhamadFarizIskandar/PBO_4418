/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Fariz
 */
public class Car {
    private boolean seatbelt = false;
    
    public Car(){
        
    }
    
    public void setSeatBelt(boolean seatbelt){
        this.seatbelt = seatbelt;
    }
    
    public boolean getSeatBelt(){
        return seatbelt;
    }
}