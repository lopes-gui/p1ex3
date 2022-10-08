/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMCP1;

/**
 *
 * @author guilh
 */
public class CalcularIMC {
    public static void main (String [] args){
        IMC imc = new IMC();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(imc);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(imc);
        IMCDisplay forecastDisplay = new IMCDisplay(imc);
        
        imc.setMeasurements(80, 65, 30.4f);
        imc.setMeasurements(82, 70, 29.2f);
        imc.setMeasurements(78, 90, 29.2f);
        
        
        
    }
}
