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
public abstract class Duck {
    
    protected FlyBehavior fly_behavior;
    protected QuackBehavior quack_behavior;
    
    public void swim(){}
    public abstract void display();
    
    public void performQuack(){
        quack_behavior.quack();
    }
    public void performFly(){
        fly_behavior.fly();
    }
}
