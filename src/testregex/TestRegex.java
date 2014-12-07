
package testregex;

import java.util.regex.*;

public class TestRegex {

    public static void main(String[] args) {
      
        String longString ="2-(232)-343-2322 donthadineshkumar@yahoo.com Derek  (3)-(232)-343-2322 Banas  CA AK 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
        String strangeString ="1Z aaa **** *** \\\\\\ {{{ {{ { ";
        String tokens="Dinesh kumar dontha";
        
       // regexChecker("\\S", tokens);
        //Word that has 2-20 
        // \\s space
        // \\S not a space
        // \\[A-Za-z] can contain A-Z or a-z letters
        // \\[^A-Za-z] cannot contain A-Z or a-z letters
        // \\s[A-Za-z]{2,20}
        
       // regexChecker("\\s[A-Za-z]{2,20}\\s",longString);
        
       // regexChecker("\\s\\d{5}\\s", longString);
        
        //states with 2 letters that start with a C or A
        // A[KLRZ] | C[AOT]
        
        //regexChecker("A[KLRZ] | C[AOT]", longString);
        
        // minimum times and any number for maximum
        //{5,}
        //+  for one or more occurences
        // . ^ + ? {} [] \ | ()
        //for searching above characters umust use \
        // period '.' is used for any thing
        // to get { one or more times
        
        //regexChecker("(\\{{1,})", strangeString);
        
        // regexChecker("(\\{+)", strangeString);
        
      //   regexChecker(".{3}", strangeString);
         
         // \\w [A-Za-z0-9]
         // \\W [A-Za-z0-9]
         // * for zero or more times
         
         // regexChecker("\\w*", strangeString);
        
        // johnsmith@hotmail.com
        
       // regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-za-z]{2,4}", longString);
       
        //(2)-(412)555-1212 1-(412)555-1212 (412)555-1212 412-555-1234 412 555-1234
        
        //regexChecker("(([0-9]( |-)?)?|((\\()?[0-9](\\)?)( |-)?))(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?[0-9]{3}( |-)?[0-9]{4}|[0-9]{7}", longString);
        
      //  regexReplace(longString);
        
    }
    
    public static void regexChecker(String theRegex, String str2Check){
        
        Pattern checkRegex=Pattern.compile(theRegex);
        
        Matcher regexMatcher=checkRegex.matcher(str2Check);
        
        while (regexMatcher.find()) {            
            if(regexMatcher.group().length()!=0){
                System.out.println(regexMatcher.group().trim());
            }
            System.out.println("start index: "+regexMatcher.start());
            System.out.println("end index: "+regexMatcher.end());
        }
        
    }
    public static void regexReplace(String str2Replace)
    {
        Pattern replace=Pattern.compile("\\s+");
        
        Matcher regexMatcher=replace.matcher(str2Replace.trim());
        
        System.out.println(regexMatcher.replaceAll(", "));
        
    }
}
