/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferran.registration;

import java.util.function.Predicate;
import org.springframework.stereotype.Service;

/**
 *
 * @author ferran
 */@Service
public class EmailValidator implements Predicate<String>{
    
     @Override
     public boolean test(String s){
         //TODO regex to validate email
         return true;
     }
}
