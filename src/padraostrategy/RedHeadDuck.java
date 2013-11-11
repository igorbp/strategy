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
public class RedHeadDuck extends Duck {
    
    public RedHeadDuck(){
        fly_behavior = new FlyWithWings();
        quack_behavior = new MuteQuack();
    }
    
    public void display(){
        System.out.println("Red Head Duck!");
    }
    
}
