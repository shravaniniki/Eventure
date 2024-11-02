package Input_Output_Stream;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\SR166\\Desktop\\JavaTraining\\Workout_Problems","09-Sep-2024.txt");
		
		System.out.println("file name is: "+file.getName());
		System.out.println("file exists : "+file.exists());
		System.out.println("file name is: "+file.isFile());

//	File newFile=new File("C:\\\\Users\\\\SR166\\\\Desktop\\\\JavaTraining\\\\Workout_Problems","hello.txt");
//		if(file.renameTo(newFile)) {
//			System.out.println("file renamed successfully");
//		}else {
//			System.out.println("File is not renamed");
//		}
//		file  = new File("C:\\");
//		
//		String fileList[]=file.list();
//		
//		System.out.println("file count is:"+fileList.length);
//		
//		for(String f:fileList) {
//			File currFile=new File("C:\\Users\\SR166\\Desktop\\JavaTraining",f);
//			
//			if(currFile.isFile()) {
//				System.out.println("file is: "+currFile);
//			}else {
//				System.out.println("dir is: "+currFile);
//			}
//			
//			System.out.println();
//		}
//
//
	}

}
