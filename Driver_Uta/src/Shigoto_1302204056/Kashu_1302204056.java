/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shigoto_1302204056;

/**
 *
 * @author ASUS
 */

import java.text.SimpleDateFormat ;

import java.text.ParseException ;

import java.util.Date ;


public class Kashu_1302204056 {
    
    private String namae;
    
    private Date tanjoubi;
    
    private int toushi;
    
    public void setNamae(String name){
        
        namae = name ;
        
    }
    
    public void setTanjoubi(Date hinichi){
        
        tanjoubi = hinichi ;
        
    }
    
    public void setToushi(int age) {
        
        toushi = age ;
        
    }
    
    public String getNamae(){
        
        if(namae != null){
            
            return namae ;
            
        } else {
            
            return null ;
            
        }
    }
    
    public String getTanjoubi(){
        
        SimpleDateFormat formatHinichi = new SimpleDateFormat(" yyyy-MM-dd ") ; 
        
        String stringDate = formatHinichi.format(tanjoubi) ;
        
        int Tsuki = Integer.parseInt(stringDate.substring(5, 7)) ;
        
        if(Tsuki == 1){
            stringDate = stringDate.substring(8, 10) + " January " + stringDate.substring(0, 4) ; 
            
        } else if(Tsuki == 2){
            
            stringDate = stringDate.substring(8, 10) + " February " + stringDate.substring(0, 4) ;
            
        } else if(Tsuki == 3){
            
            stringDate = stringDate.substring(8, 10) + " March " + stringDate.substring(0, 4) ;
            
        } else if(Tsuki == 4){
            
            stringDate = stringDate.substring(8, 10) + " April " + stringDate.substring(0, 4) ;
            
        } else if(Tsuki == 5){
            
            stringDate = stringDate.substring(8, 10) + " May " + stringDate.substring(0, 4) ;
            
        } else if(Tsuki == 6){
            
            stringDate = stringDate.substring(8, 10) + " June " + stringDate.substring(0, 4) ;
            
        } else if(Tsuki == 7){
            stringDate = stringDate.substring(8, 10) + " July " + stringDate.substring(0, 4) ;
            
        } else if(Tsuki == 8){
            stringDate = stringDate.substring(8, 10) + " August " + stringDate.substring(0, 4) ;
            
        } else if(Tsuki == 9){
            stringDate = stringDate.substring(8, 10) + " September " + stringDate.substring(0, 4) ;
            
        } else if(Tsuki == 10){
            stringDate = stringDate.substring(8, 10) + " October " + stringDate.substring(0, 4) ;
            
        } else if(Tsuki == 11){
            stringDate = stringDate.substring(8, 10) + " November " + stringDate.substring(0, 4) ;
            
        } else if(Tsuki == 12){
            
            stringDate = stringDate.substring(8, 10) + " December " + stringDate.substring(0, 4) ;
            
        }
        
        return stringDate;
    }
    
    public int getToushi(){
        
        if(toushi != 0){
            
            return toushi ;
            
        } else {
            
            return 0 ;
            
        }
    }
    
    public Kashu_1302204056(String inputName, String _tanjoubi) throws ParseException{
        
        namae = inputName ;
        
        SimpleDateFormat formatTanggal = new SimpleDateFormat(" yyyy-MM-dd ") ;
         
        toushi = 2021 - Integer.parseInt(_tanjoubi.substring(0, 4)) ;
        
        tanjoubi = formatTanggal.parse(_tanjoubi) ;
        
    }
    
    public void displayInfo(){
        
        System.out.println("Artist    = " + getNamae()) ;
        
        System.out.println("Birthdate = " + getTanjoubi()) ;
        
        System.out.println("Age       = " + getToushi()) ;
        
    }
    
}
