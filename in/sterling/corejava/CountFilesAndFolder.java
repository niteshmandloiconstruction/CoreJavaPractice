package in.sterling.corejava;

import java.io.File;
import java.util.Scanner;

public class CountFilesAndFolder {
	public static int countFiles=0;
	public static int countFolders=0;
	
	public static void countFileFolder(File[] fl) throws Exception{
		
		for(File fl1:fl) {
			if(fl1.isDirectory()) {
				countFolders++;
				System.out.println(fl1.getName());
				File[] newFile1=fl1.listFiles();
				try {
				countFileFolder(newFile1);
				}
				catch(NullPointerException npe) {
					npe.printStackTrace();
				}
			}
			else if(fl1.isFile()) {
				countFiles++;
				System.out.println(fl1.getName()); 
			}
		}
	}
	
public static void main(String[] args) throws Exception{
		
	//Path for fetching files and folders 
		/*File f=new File("D:\\Sterling_ins\\Java\\IO");
		if(f.exists()) {
			File[] fl=f.listFiles();
			try{
				countFileFolder(fl);	
			}
			catch(NullPointerException npe) {
				npe.printStackTrace();
			}
		}
		else System.out.println("File does not exist, Please enter Correct Path");*/
		
		//folders and files from drives
		File[] f=File.listRoots();
		try {
		countFileFolder(f);
		}
		catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		
	System.out.println("Number of Files: "+countFiles);
		System.out.println("Number of Folders: "+countFolders);
		
}
}
	
