package Input_Output_Stream;

//Java program to count the 
//number of lines, words, sentences,   
//characters, and whitespaces in a file 
import java.io.*; 

public class Words_Paragraph_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\\\Users\\\\SR166\\\\Desktop\\\\JavaTraining\\\\Workout_Problems\\\\gold.txt"); 
	     FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(file);
		    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); 
		    BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 

		     String line; 
		     int wordCount = 0; 
		     int paraCount = 0; 
		     int sentenceCount = 0;
			while ((line = bufferedReader.readLine()) != null) { 
		            if (line.equals("")) { 
		                paraCount += 1; 
		            } 
		            else { 
		                String words[] = line.split("\\s+"); 
		                wordCount += words.length; 
		               
		            } 
		        } 
		       
		        System.out.println("Total word count = "+ wordCount); 
		        System.out.println("Number of paragraphs = "+ paraCount); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
