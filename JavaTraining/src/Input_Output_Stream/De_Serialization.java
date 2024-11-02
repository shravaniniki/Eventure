package Input_Output_Stream;

import java.io.*;

public class De_Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream(new File("C:\\Users\\SR166\\Desktop\\JavaTraining\\Workout_Problems\\gold.txt"));
			ObjectInputStream ois=new ObjectInputStream(fis);
			Product product=(Product) ois.readObject();
			System.out.println("Object deserialized");
		  System.out.println(product);	
		}catch(Exception e) {
			System.out.println("exception :"+e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
