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
public class RubberDuck extends Duck {
    
    public RubberDuck(){
        fly_behavior = new FlyNoWay();
        quack_behavior = new Squeak();        
    }
    
    public void display(){
        System.out.println("Rubber Duck!");
    }
}
