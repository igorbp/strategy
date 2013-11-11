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
public class PadraoStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("3 patinhos foram passear!");
        
        Duck red = new RedHeadDuck();
        Duck mal = new MallardDuck();
        Duck borracha = new RubberDuck();
        
        red.display();
        red.performFly();
        red.performQuack();
        
        mal.display();
        mal.performFly();
        mal.performQuack();
        
        borracha.display();
        borracha.performFly();
        borracha.performQuack();
        
    }
    
}
