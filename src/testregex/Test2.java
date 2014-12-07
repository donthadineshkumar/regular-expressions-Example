/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testregex;

import java.util.regex.*;

public class Test2 {
    //Find Spider-Man, Spiderman, SPIDER-MAN, etc.
    
    public static void main(String[] args) {
        String str="Spider  Man Menaces Spider-ManCity!";
        //(?i) case insensitive mode
        //regex must match entire string
        String regex="(?i).*spider[- ]?man.*";
        
        if(str.matches(regex))
        {
            System.out.println("Matched: "+str);
        }
    }
}
