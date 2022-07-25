/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjproyecto;

/**
 *
 * @author Luis Carlos Sanchez Nuñez
 */
public class calculadora {
    
    private double peso;
    private double altura;
    private double total;

    //Constructor por defecto
    public calculadora() {
    }

    //Calculo imc
    public double imc(double peso, double altura){
        total = Math.ceil(peso/(altura*altura));
        return total;
    }
    
    //Metodo para comparar los datos IMC
    public String imctext (){
        String cad="";
        if(total<16.00){
          cad="Infrapeso: Delgadez Severa";
        }else if(total<=16.00 || total<=16.99){
          cad="Infrapeso: Delgadez moderada";
        }else if(total<=17.00 ||total<=18.49){
          cad="Infrapeso: Delgadez leve";
        }else if(total<=18.50 || total<=24.99){
          cad="Peso Normal";
        }else if(total<=25.00 || total<=29.99){
          cad="Sobrepeso";
        }else if(total<=30.00 || total<=34.99){
          cad="Obeso: Tipo I";
        }else if(total<=35.00 || total== 39.99){
          cad="Obeso: Tipo II";
        }else if(total>=40.00){
          cad="Obeso: Tipo III";
        }else{
          cad="no existe clasificacion";
        }
  return cad;
    }   
}