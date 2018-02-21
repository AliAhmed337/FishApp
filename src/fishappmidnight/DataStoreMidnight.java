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
public class DataStoreMidnight {
    
    private int troutCount = 0; //These replace the old variables which were in the mainframe
    private int codCount = 0;   //These are private because they are only used inside DataStore to be used in the
    private int wrasseCount = 0;    //increment method. Making them private ensures less problems, errors, are possible
    private int parrotfishCount = 0;   //due to these variables since they are not going to interfere with the other classes.
    private int bandedseakraitCount = 0;
    private int greenseaturtleCount = 0;
    private int oliveridelyturtleCount = 0;
    private int humpbackwhaleCount = 0;
    private int dugongCount = 0;
    private int octopusCount = 0;
    private int cuttlefishCount = 0;
    private int squidCount = 0;
    private int lemonsharkCount = 0;
    private int hammerheadsharkCount = 0;
    private int tigersharkCount = 0;
    private int whalesharkCount = 0;
    
    private int rayfinnedfishCount = 0;
    private int reptilesCount = 0;
    private int mammalsCount = 0;
    private int cephalopodsCount = 0;
    private int cartilaginousfishCount = 0;
        
    
    private final Rayfinnedfish trout = new Rayfinnedfish("trout", " Trout(s) were found", ""); //passing info to constructor
    private final Rayfinnedfish cod = new Rayfinnedfish("cod", " Cod(s) were found", "");
    private final Rayfinnedfish wrasse = new Rayfinnedfish("wrasse", " Wrasse(s) were found", "");
    private final Rayfinnedfish parrotfish = new Rayfinnedfish("parrot fish", " Parrot Fish were found", "");
    private final Reptiles bandedseakrait = new Reptiles("bandedseakrait", " Banded sea krait(s) were found", "");
    private final Reptiles greenseaturtle = new Reptiles("greenseaturtle", " Green sea turtle(s) were found", "");
    private final Reptiles oliveridelyturtle = new Reptiles("oliveridelyturtle", " Olive ridely turtle(s) were found", "");
    private final Mammals humpbackwhale = new Mammals("humpbackwhale"," Humpback Whale(s) were found", "");
    private final Mammals dugong = new Mammals("Dugong"," Dugong(s) were found", "");
    private final Cephalopods octopus = new Cephalopods("Octopus"," Octpus were found", "");
    private final Cephalopods squid = new Cephalopods("Squid"," Squid were found", "");
    private final Cephalopods cuttlefish = new Cephalopods("Cuttlefish"," Cuttlefish were found", "");
    private final Cartilaginousfish lemonshark = new Cartilaginousfish("Lemon shark"," Lemon Shark(s) were found", "");
    private final Cartilaginousfish hammerheadshark = new Cartilaginousfish("Hammerhead shark"," Hammerhead Shark(s) were found", "");
    private final Cartilaginousfish tigershark = new Cartilaginousfish("Tiger shark"," Tiger Shark(s) were found", "");
    private final Cartilaginousfish whaleshark = new Cartilaginousfish("Whale shark"," Whale Shark(s) were found", "");
    
    
    private final Rayfinnedfish rayfinnedfish = new Rayfinnedfish("","", "");
    private final Reptiles reptiles = new Reptiles("","", "");
    private final Mammals mammals = new Mammals("","", "");
    private final Cephalopods cephalopods = new Cephalopods("","", "");
    private final Cartilaginousfish cartilaginousfish = new Cartilaginousfish("","", "");
    
    
    public DataStoreMidnight(){
        
    }
    
    public String increment(String s){
        
        String animalString;
        animalString = s;
        
        switch (animalString){
            
            case "cod": //Addition button is replaced here
                codCount ++;
                rayfinnedfishCount ++;
                animalString = Integer.toString(codCount) + cod.getInfo();
                break;
                
            case "codminus": //Negative button is replaced here
                codCount --;
                rayfinnedfishCount --;
                animalString = Integer.toString(codCount) + cod.getInfo();
                break;
                
            case "codcount":
                animalString = Integer.toString(codCount);
                break;
                
            case "codprint":
                animalString = Integer.toString(codCount) + " Cod(s) were found";
                break;
                
            case "trout":
                troutCount ++;
                rayfinnedfishCount ++;
                animalString = Integer.toString(troutCount) + trout.getInfo();
                break;
                
            case "troutminus":
                troutCount --;
                rayfinnedfishCount --;
                animalString = Integer.toString(troutCount) + trout.getInfo();
                break;
                
            case "troutcount":
                animalString = Integer.toString(troutCount);
                break;
                
            case "troutprint":
                animalString = Integer.toString(troutCount) + " Trout(s) were found";
                break;
                
            case "wrasse":
                wrasseCount ++;
                rayfinnedfishCount ++;
                animalString = Integer.toString(wrasseCount) + wrasse.getInfo();
                break;
            
            case "wrasseminus":
                wrasseCount --;
                rayfinnedfishCount --;
                animalString = Integer.toString(wrasseCount) + wrasse.getInfo();
                break;
                
            case "wrassecount":
                animalString = Integer.toString(wrasseCount);
                break;
            
            case "wrasseprint":
                animalString = Integer.toString(wrasseCount) + " Wrasse(s) were found";
                break;
                
            case "parrotfish":
                parrotfishCount ++; //Replaces increment that was once done inside the "Button action performed" area
                rayfinnedfishCount ++;
                animalString = Integer.toString(parrotfishCount) + parrotfish.getInfo();
                break;
                
            case "parrotfishminus":
                parrotfishCount --;
                rayfinnedfishCount --;
                animalString = Integer.toString(parrotfishCount) + parrotfish.getInfo();
                break;
                
            case "parrotfishcount":
                animalString = Integer.toString(parrotfishCount);
                break;
            
            case "parrotfishprint":
                animalString = Integer.toString(parrotfishCount) + " Parrot fish were found";
                break;
                
            case "rayfinnedfish":
                animalString = Integer.toString(rayfinnedfishCount);
                break;
            
            case "rayfinnedfishprint":
                animalString = Integer.toString(rayfinnedfishCount) + " Rayfinned-fish were found";
                break;
                
            case "rayfinnedfishgenus":
                animalString = rayfinnedfish.getGenusInformation();
                break;
                
            case "bandedseakrait":
                bandedseakraitCount ++;
                reptilesCount ++;
                animalString = Integer.toString(bandedseakraitCount) + bandedseakrait.getInfo();
                break;
                
            case "bandedseakraitminus":
                bandedseakraitCount --;
                reptilesCount --;
                animalString = Integer.toString(bandedseakraitCount) + bandedseakrait.getInfo();
                break;
                
            case "bandedseakraitcount":
                animalString = Integer.toString(bandedseakraitCount);
                break;
                
            case "bandedseakraitprint":
                animalString = Integer.toString(bandedseakraitCount) + " Banded sea krait(s) were found";
                break;
                
            case "greenseaturtle":
                greenseaturtleCount ++;
                reptilesCount ++;
                animalString = Integer.toString(greenseaturtleCount) + greenseaturtle.getInfo();
                break;
                
            case "greenseaturtleminus":
                greenseaturtleCount --;
                reptilesCount --;
                animalString = Integer.toString(greenseaturtleCount) + greenseaturtle.getInfo();
                break;
                
            case "greenseaturtlecount":
                animalString = Integer.toString(greenseaturtleCount);
                break;
                
            case "greenseaturtleprint":
                animalString = Integer.toString(greenseaturtleCount) + " Green sea turtle(s) were found";
                break;
        
            case "oliveridelyturtle":
                oliveridelyturtleCount ++;
                reptilesCount ++;
                animalString = Integer.toString(oliveridelyturtleCount) + oliveridelyturtle.getInfo();
                break;
                
            case "oliveridelyturtleminus":
                oliveridelyturtleCount --;
                reptilesCount ++;
                animalString = Integer.toString(oliveridelyturtleCount) + oliveridelyturtle.getInfo();
                break;
            
            case "oliveridelyturtlecount":
                animalString = Integer.toString(oliveridelyturtleCount);
                break;     
                
            case "oliveridelyturtleprint":
                animalString = Integer.toString(oliveridelyturtleCount) + " Olive ridely turtle(s) were found";
                break;
                
            case "reptiles":
                animalString = Integer.toString(reptilesCount);
                break;
                
            case "reptileprint":
                animalString = Integer.toString(reptilesCount) + " Reptiles were found";
                break;
                
            case "reptilegenus":
                animalString = reptiles.getGenusInformation();
                break;
                    
            case "humpbackwhale":
                humpbackwhaleCount ++;
                mammalsCount ++;
                animalString = Integer.toString(humpbackwhaleCount) + humpbackwhale.getInfo();
                break;
                
            case "humpbackwhaleminus":
                humpbackwhaleCount --;
                mammalsCount --;
                animalString = Integer.toString(humpbackwhaleCount) + humpbackwhale.getInfo();
                break;
                
            case "humpbackwhalecount":
                animalString = Integer.toString(humpbackwhaleCount);
                break;
                
            case "humpbackwhaleprint":
                animalString = Integer.toString(humpbackwhaleCount) + " Humpback Whale(s) were found";
                break;
                
            case "dugong":
                dugongCount ++;
                mammalsCount ++;
                animalString = Integer.toString(dugongCount) + dugong.getInfo();
                break;
            
            case "dugongminus":
                dugongCount --;
                mammalsCount --;
                animalString = Integer.toString(dugongCount) + dugong.getInfo();
                break;
                
            case "dugongcount":
                animalString = Integer.toString(dugongCount);
                break;
             
            case "dugongprint":
                animalString = Integer.toString(dugongCount) + " Dugong(s) were found";
                break;    
            
            case "mammals":
                animalString = Integer.toString(mammalsCount);
                break;
                
            case "mammalsprint":
                animalString = Integer.toString(mammalsCount) + " Mammals were found";
                break;   
                
            case "mammalgenus":
                animalString = mammals.getGenusInformation();
                break;
            
            case "octopus":
                octopusCount ++;
                cephalopodsCount ++;
                animalString = Integer.toString(octopusCount) + octopus.getInfo();
                break;
            
            case "octopusminus":
                octopusCount --;
                cephalopodsCount --;
                animalString = Integer.toString(octopusCount) + octopus.getInfo();
                break;
                
            case "octopuscount":
                animalString = Integer.toString(octopusCount);
                break;
            
            case "octopusprint":
                animalString = Integer.toString(octopusCount) + " Octopus were found";
                break;
                
            case "cuttlefish":
                cuttlefishCount ++;
                cephalopodsCount ++;
                animalString = Integer.toString(cuttlefishCount) + cuttlefish.getInfo();
                break;
                
            case "cuttlefishminus":
                cuttlefishCount --;
                cephalopodsCount --;
                animalString = Integer.toString(cuttlefishCount) + cuttlefish.getInfo();
                break;
                
            case "cuttlefishcount":
                animalString = Integer.toString(cuttlefishCount);
                break;
                
            case "cuttlefishprint":
                animalString = Integer.toString(cuttlefishCount) + " Cuttle fish were found";
                break;
                
            case "squid":
                squidCount ++;
                cephalopodsCount ++;
                animalString = Integer.toString(squidCount) + squid.getInfo();
                break;
                
            case "squidminus":
                squidCount --;
                cephalopodsCount --;
                animalString = Integer.toString(squidCount) + squid.getInfo();
                break;
                
            case "squidcount":
                animalString = Integer.toString(squidCount);
                break;
                
            case "squidprint":
                animalString = Integer.toString(squidCount) + " Squid were found";
                break;
                
            case "cephalopods":
                animalString = Integer.toString(cephalopodsCount);
                break;
                
            case "cephalopodsprint":
                animalString = Integer.toString(cephalopodsCount) + " Cephalopods were found";
                break;
                
            case "cephalopodsgenus":
                animalString = cephalopods.getGenusInformation();
                break;
            
            case "lemonshark":
                lemonsharkCount ++;
                cartilaginousfishCount ++;
                animalString = Integer.toString(lemonsharkCount) + lemonshark.getInfo();
                break;
            
            case "lemonsharkminus":
                lemonsharkCount --;
                cartilaginousfishCount --;
                animalString = Integer.toString(lemonsharkCount) + lemonshark.getInfo();
                break;    
            
            case "lemonsharkcount":
                animalString = Integer.toString(lemonsharkCount);
                break;  
                
            case "lemonsharkprint":
                animalString = Integer.toString(lemonsharkCount) + " Lemon shark(s) were found";
                break;
                
            case "cartilaginousfish":
                animalString = Integer.toString(cartilaginousfishCount);
                break;
                
            case "cartilaginousfishprint":
                animalString = Integer.toString(cartilaginousfishCount) + " Cartilaginous fish were found";
                break;
                
            case "cartilaginousfishgenus":
                animalString = cartilaginousfish.getGenusInformation();
                break;
            
            case "hammerheadshark":
                hammerheadsharkCount ++;
                cartilaginousfishCount ++;
                animalString = Integer.toString(hammerheadsharkCount) + hammerheadshark.getInfo();
                break;
                
            case "hammerheadsharkminus":
                hammerheadsharkCount --;
                cartilaginousfishCount --;
                animalString = Integer.toString(hammerheadsharkCount) + hammerheadshark.getInfo();
                break;    
                
            case "hammerheadsharkcount":
                animalString = Integer.toString(hammerheadsharkCount);
                break; 
                
            case "hammerheadsharkprint":
                animalString = Integer.toString(hammerheadsharkCount) + " Hammerhead shark(s) were found";
                break; 
                
            case "tigershark":
                tigersharkCount ++;
                cartilaginousfishCount ++;
                animalString = Integer.toString(tigersharkCount) + tigershark.getInfo();
                break;
            
            case "tigersharkminus":
                tigersharkCount --;
                cartilaginousfishCount --;
                animalString = Integer.toString(tigersharkCount) + tigershark.getInfo();
                break; 
                
            case "tigersharkcount":
                animalString = Integer.toString(tigersharkCount);
                break; 
            
            case "tigersharkprint":
                animalString = Integer.toString(tigersharkCount) + " Tiger shark(s) were found";
                break;   
                
            case "whaleshark":
                whalesharkCount ++;
                cartilaginousfishCount ++;
                animalString = Integer.toString(whalesharkCount) + whaleshark.getInfo();
                break;
                
            case "whalesharkminus":
                whalesharkCount --;
                cartilaginousfishCount --;
                animalString = Integer.toString(whalesharkCount) + whaleshark.getInfo();
                break;
                
            case "whalesharkcount":
                animalString = Integer.toString(whalesharkCount);
                break; 
                
            case "whalesharkprint":
                animalString = Integer.toString(whalesharkCount) + " Whale shark(s) were found";
                break; 
        }
        
        return animalString;
    }
}
