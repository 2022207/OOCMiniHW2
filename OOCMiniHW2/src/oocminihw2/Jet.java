/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author castr
 */
public class Jet extends Vehicle implements Flyable{

    @Override
    public void changeAltitude(float change) {
        
    }

    @Override
    public float getAltitude() {
        
        System.out.println("Give me the altitude");
        return 0;
    }

    @Override
    public void accelerate(float speed) {
       
    }

    @Override
    public void brake() {
       
    }

    @Override
    public void turn(float angle) {
       
    }

    @Override
    public float getDirection() {
    
        System.out.println("Get me the direction");
        return 60;
    }

    @Override
    public float getSpeed() {
    
            System.out.println("Get me the speed");
            return 120;
    }

    @Override
    public String getMake() {
        
        System.out.println("Make something");
        return "";
    }

    @Override
    public String getType() {
        
        System.out.println("Type something");
        return "";
    }
    
}
