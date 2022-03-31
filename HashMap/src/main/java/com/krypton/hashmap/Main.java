
package com.krypton.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
//        HashMap<String, String> data = new HashMap<>();
//        data.put("hola", "1");
//        data.put("hola", "2");
//        System.out.println(data.get("hola"));
//        String nombre = "cadena de texto de un parrafo de el comercion";
//        System.out.println(nombre.substring(0, 10));
        
        List<Integer> nums = Arrays.asList(1, 2, 0, 4, 5, 6);
        
        nums.forEach(num -> {
            try {
                float result = 0/num;
                System.out.println(num);
            } catch (Exception e) {
                System.out.println("División para cero es indeterminado");
            }
        });
        
    }
    
}
