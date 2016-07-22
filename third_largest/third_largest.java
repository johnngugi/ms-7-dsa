/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyproblem1;

/**
 *
 * @author john
 */
import java.util.Arrays;
public class ToyProblem1 {

    /**
     * @param array
     * @return 
     */
    
    public static String arr(String[] array) {
        boolean sort = true;
        String value = "";
        while(sort) {
            for (int i = 0; i < array.length-1; i++) {
                if(array[i].length() < array[i+1].length()) {
                    value = array[i];
                    array[i] = array[i+1];
                    array[i+1] = value;
                }
                
            }
            sort = false;
        }
        return value;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String[] s = {"petr", "johnkarush", "simon"};
        arr(s);
        int a = s.length-1;
        System.out.println(s[a]);
    }
    
}
