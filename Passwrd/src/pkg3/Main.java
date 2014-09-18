package pkg3;

import java.util.*;
import java.io.*;
		public class Main{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=in.nextLine();
		System.out.println("Enter the age");
		int age=in.nextInt();
		String [] s=name.split(" ");
		int size=s.length,i;
		StringBuffer pass1=new StringBuffer("");
		StringBuffer pass2=new StringBuffer("");
		StringBuffer finalpass=new StringBuffer("");
		for(i=0;i<size;i++){

			pass1.append((s[i].charAt(0)));			
		}
		int size1=s[0].length( );
		pass2.append(s[0].substring(1,size1));
		finalpass.append(pass1);
		finalpass.append("_");
		finalpass.append(pass2);
		finalpass.append("_");
		finalpass.append(age);
		String f=new String(finalpass);
		f.toLowerCase();
		System.out.println("The password is " + finalpass);
	}
}
