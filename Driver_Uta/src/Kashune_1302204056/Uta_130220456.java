/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kashune_1302204056 ;

/**
 *
 * @author ASUS
 */

import Shigoto_1302204056.Kashu_1302204056 ;

import java.util.Date ;

import java.text.SimpleDateFormat ;

import java.text.ParseException ;

public class Uta_130220456 {
    
    private String taitoru ;
    
    private Kashu_1302204056 kashu ;
    
    private Date release ;
    
    public void setTitle(String inputTaitoru){
        
        taitoru = inputTaitoru ;
        
    }
    
    public void setKashu(Kashu_1302204056 inputKashu){
        
        kashu = inputKashu ;
        
    }
    
    public void setRelease(Date inputRelease){
        
        release = inputRelease ;
        
    }
    
    public String getTaitoru(){
        
        if(taitoru != null){
            
            return taitoru ;
            
        } else {
            
            return null ;
            
        }
    }
    
    public Kashu_1302204056 getKashu(){
        
        if(kashu != null){
            
            return kashu ;
            
        } else {
            
            return null ;
            
        }
    }
    
    public Date getRelease(){
        if(release != null) {
            return release;
        } else {
            return null;
        }
    }
    
    public Uta_130220456(String inputTaitoru, Kashu_1302204056 inputKashu, String _release) throws ParseException{
        
        taitoru = inputTaitoru ; 
        
        kashu = inputKashu ;
        
        SimpleDateFormat formatTanggal = new SimpleDateFormat(" yyyy-MM-dd ") ;
        
        release = formatTanggal.parse(_release) ;
        
    }
    
    public void displayInfo(){
        
        System.out.println("Title         = " + getTaitoru()) ;
        
        System.out.println("Artist        = " + kashu.getNamae()) ;
        
        SimpleDateFormat formatTanggal = new SimpleDateFormat(" yyyy-MM-dd ") ;
        
        String stringDate = formatTanggal.format(release) ;
        
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
        
        System.out.println("Release       = " + stringDate) ;
        
        System.out.println("Artist age is = " + kashu.getToushi() + " when song released") ;
        
    }
}
