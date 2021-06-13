

import java.io.File;
import java.util.Scanner;

public class MyList 
{

	public static void main(String[] args) 
	{
		String fold;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print(" ENTER NAME OF FOLDER : ");
		fold=scan.next();
		
		File f1=new File(fold);
		
		String cont[]=f1.list();
		
		//String cont[]=new String[10];
		
		for(int i=0;i<cont.length;i++)
		{
			System.out.println(" "+cont[i]);
		}
	}

}
