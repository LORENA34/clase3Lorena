/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballo;

/**
 *
 * @author LAB15
 */
public class Caballo 
{
  //Declaracion de atributos de Clase
    String altura;
    String color;     
    String peso;       
    String  raza;
    int patas = 4, edad;
    
    //Metodo constructor
    public Caballo(String nuevoNombre)
    {
     raza = nuevoNombre;
    
    }
    //Metodo get y get de la clase
    public void relichar()
    {
        
    }
    public String obtenerRaza()
    {
     //Sentencia obligatoria de retorno
        
        return raza;
    }
    public int obtenerEdad()
    {
    return edad;        
    
    }
    }