package MapTopic;

import java.util.HashMap;

public class BasicMap {
    public static void main(String[] args) {
    	
        HashMap<String, String> studentInfo = new HashMap<>();

        // Add entries
        studentInfo.put("name", "Alice");
        studentInfo.put("id", "12345");
        studentInfo.put("major", "Computer Science");

        // Retrieve values
        System.out.println("Name: " + studentInfo.get("name"));  
        System.out.println("ID: " + studentInfo.get("id"));      
        
        if (studentInfo.containsKey("city")) {
            System.out.println("City: " + studentInfo.get("city"));
        } else {
            System.out.println("City not found.");
        } 

        // Remove an entry
        studentInfo.remove("major");
        System.out.println(studentInfo);  
        
    }
}
