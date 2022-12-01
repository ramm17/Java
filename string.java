/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Practice;

/**
 *
 * @author DELL
 */
public class string {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String greeting="Hello World!";
        System.out.println(greeting);
        
        int len=greeting.length();
        System.out.println("The length of greeting is "+len);
        
        System.out.println("Uppercase "+greeting.toUpperCase());
        System.out.println("Lowercase "+greeting.toLowerCase());
        System.out.println("Index "+greeting.indexOf('W'));
        
        String fName="Ram";
        String lName="Rana";
        System.out.println(fName.concat(lName));
        
        String x="10";
        String y="20";
        System.out.println(x+y);
        
        
    }
}
