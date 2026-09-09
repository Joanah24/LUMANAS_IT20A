package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Joanah");
        names.add("Rocha");
        
        System.out.println(names);
        
        names.set(0, "Joanah");
        
    }
}