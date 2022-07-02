/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_uta;

/**
 *
 * @author ASUS
 */

import java.text.ParseException ;

import Kashune_1302204056.Uta_130220456 ; 

import Shigoto_1302204056.Kashu_1302204056 ;

public class Driver_Uta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
       Kashu_1302204056 m1 = new Kashu_1302204056("Budi Doremi", "1984-09-19") ;
       
       Kashu_1302204056 m2 = new Kashu_1302204056("Ed Sheeran", "1991-02-17");
       
        m1.displayInfo() ;
        
        System.out.println() ;
        
        m2.displayInfo() ;
        
        System.out.println() ;
        
        Uta_130220456 uta1 = new Uta_130220456("Melukis Senja", m1, "2020-06-29") ;
        
        Uta_130220456 uta2 = new Uta_130220456("Photograph", m2, "2015-05-10") ;
        
        uta1.displayInfo() ;
        
        System.out.println() ;
        
        uta1.displayInfo() ;
        
    }
    
}
