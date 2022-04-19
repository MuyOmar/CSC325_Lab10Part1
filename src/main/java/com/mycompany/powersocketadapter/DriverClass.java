/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketadapter;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
    
    public static void main(String[] args) {
        
        AmericanPlug usaPlug = new American230vAppliancePlug();
        //LAB PART 1
        //Check if my 110v works
        AmericanPlug us2 = new American110vAppliancePlug();
        
        
        EuropeanPowerSocket eSocket= new EuropeanPowerSocket();
        EuropeanPlug ePlug= new AmericanToEuropeanPlugAdapter(usaPlug);
        
        //European convert now for my socket
        EuropeanPowerSocket es2 = new EuropeanPowerSocket();
        EuropeanPlug ep2 = new AmericanToEuropeanPlugAdapter(us2);
        
        eSocket.plugIn(ePlug);
        es2.plugIn(ep2);
        // Conversion works, now push/commit/branch
    }
    
}
