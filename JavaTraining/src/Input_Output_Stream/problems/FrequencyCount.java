package Input_Output_Stream.problems;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
    
        
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\SR166\\Desktop\\JavaTraining\\Workout_Problems\\gold.txt"));
        		FileWriter writer = new FileWriter("C:\\Users\\SR166\\Desktop\\JavaTraining\\Workout_Problems\\freq_count.txt")) {

    	        Map<String, Integer> wordCounts = new HashMap<>();

    	       String line;
               while ((line = reader.readLine()) != null) {
 	                String[] words = line.toLowerCase().split("\\s+"); 
 	                
    	            for (String word : words) {
    	                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
    	                }
    	            }

    	          // Write word counts to the output file
             for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
 	                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
 	            }
             
             System.out.println("Word count written to: " + writer);

           } catch (IOException e) {
           System.err.println("Error reading or writing file: " + e.getMessage());
         }

    }
}
