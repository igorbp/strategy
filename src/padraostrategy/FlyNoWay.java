/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraostrategy;

/**
 *
 * @author Igor
 */
public class FlyNoWay implements FlyBehavior {
    
    @Override
    public void fly(){
        System.out.println("Voar não agrega valor.");
    }
    
}
