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
public class MotorCycle {
     private int numGear = 0;
    
    public MotorCycle(){
        
    }
    
    public void setGearFoot(int numGear){
        this.numGear = numGear;
    }
    
    public int getGearFoot(){
        return numGear;
    }
}