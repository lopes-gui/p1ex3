/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMCP1;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
   Observable observable;
    
    private float peso;
    private float altura;
    
     /*
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    */
   
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    CurrentConditionsDisplay(IMC weatherData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   public void update(Observable obs, Object arg){
        if(obs instanceof IMC){
            IMC weatherData = (IMC)obs;
            this.peso = weatherData.getPeso();
            this.altura = weatherData.getAltura();
            display();
        }
    }
    
   
     /*
     public void update (float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    */
    public void display(){
        System.out.println("Current Conditions: " + peso + "F degress and" + altura + " % humidity");
    }
   
}