package codes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainDrive {
	public static void main(String[] args) {

		writeToFile();
		readFile();

	}

	static void writeToFile(String content) {

	}
	
	static void readFile() {
		File myFile = new File("myTest.txt");
		
		FileReader fr;
		try {
			fr = new FileReader(myFile);
			BufferedReader br = new BufferedReader(fr);
			while(true){
				String line = br.readLine();
				if(line==null) {
					System.out.println("끝까지 읽음");
					break;
				}
				System.out.println(line);
			}
			br.close();
			fr.close();
			
						
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			
			
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		
	}
	
	static void writeToFile() {
		File myFile = new File("myTest.txt");
		
		try {
			FileWriter fw = new FileWriter(myFile,true);
			
	BufferedWriter bw = new BufferedWriter(fw);
			
			bw.append("수고하셨습니다.");
			bw.newLine();
			
			bw.close();
			fw.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
