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
    

// use the main method only for calling the function where your logic lies. :-)

public class ThirdSort {

    /**
     * @param args the command line arguments
     */
    public String ThirdGreatest(String[]strArr){
        String sortedString = "";
        boolean finalSort =  true;
        while(finalSort){
            for(int i = 0; i < strArr.length-1; i++){
                if(strArr[i].length() < strArr[i+1].length()){
                    sortedString = strArr[i];
                    strArr[i] = strArr[i+1];
                    strArr[i+1]= sortedString;
                    finalSort = false;
                };
            }
        }
        return strArr[2];
    }
    public static void main(String[] args) {
        String[] myArr={"hello", "world", "before", "all"};
        System.out.println(ThirdGreatest(myArr));
    }


}
