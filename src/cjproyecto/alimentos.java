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
public class alimentos {
    
    //Variables
    protected String tipo;
    protected String nombre;
    protected double calorias;
    protected double carbohidratos;
    protected double proteinas;
    protected double grasas;
    
    //Constructor por defecto
    public alimentos() {
    }

    //Constructor con parametros   
    public alimentos(String tipo, String nombre, double calorias, double carbohidratos,
            double proteinas, double grasas) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.calorias = calorias;
        this.carbohidratos = carbohidratos;
        this.proteinas = proteinas;
        this.grasas = grasas;
    }

    //Metodos get&set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }
    
    
    //Metodo toString
    @Override
    public String toString(){
        System.out.println(
               "El alimento: " + nombre + " es un: " + tipo + 
               " con una cantidad de 100 gramos tiene las " +
               "siguentes caracteristicas\n" + 
               calorias  + " Kcal \n" +
               carbohidratos + " gr. de carbohidratos \n" + 
               proteinas + " gr. de proteinas \n" +
               grasas + " gr. de grasas\n");
        return nombre;
    }

}