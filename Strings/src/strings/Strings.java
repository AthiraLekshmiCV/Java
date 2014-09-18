/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.*;

public class Strings{
  public static void main(String [] args){
    String str1="Welcome to Ooty";
    String str2="Nice to meet you......";
    System.out.println(str1);
    System.out.println(str2);
    int result=str1.compareTo(str2);  //returns 0 if equal;+ve if str2 is greater;and -ve otherwise
    if(result > 0)
      System.out.println("String 1 is smaller than String2");
    else if(result< 0)
      System.out.println("String 1 is longer than String 2");
    else
      System.out.println("String 1 and String 2 are equal");
    
    System.out.println("The lenght of String 1 is" + str1.length());
    int count=0,i=0;
    for(i=0;i<str1.length();i++){
      if(str1.charAt(i)==' ' && str1.charAt(i+1)!=' ')
        count++;
    }

String trimmed = str1.trim();
int words = trimmed.split("\\s+").length; // \\s is equivalent to [ \\t\\n\\x0B\\f\\r] ,it splits a string with 
                                                                  //  all white space characters as delimiters


    System.out.println("The number of words in string 1 are " + words);
    System.out.println("In upper case");
    System.out.println(str1.toUpperCase());
    
    System.out.println("Checking whether the str2 contains the substring meet you");
    if(str2.contains("meet you"))
      System.out.println("String 2 contains the substring \"meet you\" ");
    else
      System.out.println("String 2 does not contain the substring \"meet you\" ");
    
    str1= str1.replace('O','o');
    
    System.out.println("Replacing O in String1 with o \n" + str1);
    
    System .out.println("Checking whether str1 is prefixed with \"Hello\" ");
    if(str1.startsWith("Hello"))
      System.out.println("str1 starts with \"Hello\"");
    else
      System.out.println("str1 does not start with \"Hello\" ");
    
    System .out.println("Checking whether str1 is suffixed with \"ooty\" ");
    
     if(str1.endsWith("ooty"))
      System.out.println("str1 ends with \"ooty\"");
    else
      System.out.println("str1 does not start with \"ooty\" ");
    
    
    
    
  }

}
