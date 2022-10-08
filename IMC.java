package IMCP1;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class IMC extends  Observable{
    private ArrayList observers;
    private float altura;
    private float peso;
    private float immcc;
    
    public IMC(){
        //observers = new ArrayList();
    }
    
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
       
       public void setMeasurements(float altura, float peso, float immcc){
        this.altura = altura;
        this.peso = peso;
        this.immcc = immcc;
        measurementsChanged();
    }
 
        
    
    public void registersObserver(Observer o){
        observers.add(o);
    }
    
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        
        if(i>= 0){
            observers.remove(i);
        }
    }
    
 /*
    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
*/
    
    public void calcIMC (float v){
       
            v=(this.getPeso()/((this.getAltura())*(this.getAltura())));
         if(v<18.5){
             System.out.println(" Abaixo do peso");
         }
          if(v<18.5 && v<= 24.9){
             System.out.println(" normal");
             
         }
             if(v<25 && v<= 29.9){
             System.out.println(" Pré-obesidade");
             
         }
             
                 if(v<30 && v<= 34.9){
             System.out.println(" Obesidade Grau 1");
             
         }
                          if(v<35 && v<= 39.9){
             System.out.println(" Obesidade Grau 2");
             
         }
                          
                                           if(v>=40){
             System.out.println(" Obesidade Grau 3");
             
         }
           
            /*Menor que 18.5 - Abaixo do peso ;
Entre 18.5 e 24.9 - Peso normal ;
Entre 25.0 e 29.9 - Pré-obesidade ;
Entre 30.0 e 34.9 - Obesidade Grau 1 ;
Entre 35.0 e 39.9 - Obesidade Grau 2 ;
Acima de 40 - Obesidade Grau 3
*/
    }
    
    //outro métodos de weatherData aqui

    public ArrayList getObservers() {
        return observers;
    }

    public void setObservers(ArrayList observers) {
        this.observers = observers;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getImmcc() {
        return immcc;
    }

    public void setImmcc(float immcc) {
        this.immcc = immcc;
    }
}