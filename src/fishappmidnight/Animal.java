/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishappmidnight;

/**
 *
 * @author AhmedAli
 */
public abstract class Animal { //Creates an abstract class Animal that will be used as a super class
                               //Abstract means Animal cannot have objects instantiated from them
    public String info;  
    private String genus;
    public String GenusInformation;
    
    public Animal(String g, String i, String gi){ //This is a constructor, takes three parameters,
        genus = g;                                //The parameters have been defined as three string values/variables
        info = i;
        GenusInformation = gi;
    } 



    public String getGenus(){                      //These are methods of the class Animal that can be called by their names. 
        return genus;
    }
    
       public String getInfo() {
        
        return info;
    }    
      
       public String getGenusInformation(){
           return GenusInformation;
       }
      
}



