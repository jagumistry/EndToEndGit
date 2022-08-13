package com.string.code;

public class String_Assignment {

	public static void main(String[] args) {
		// 1. length()
		String S1 = "I am learning Java";
		System.out.println(S1.length());
		
		//2. isEmpty()
		String S2 = "";
		System.out.println(S2.isEmpty());
		
		//3.Trim() //Hendle space before and after space
		String S3 = "    I am learning   Java     ";
		System.out.println(S3.length());
		System.out.println(S3.trim());
		
		//4. Trim() and Length() together
		String S4 = "            In this summer its a nice weather              ";
		System.out.println(S4.length());
		System.out.println(S4.trim().length());
		
		//5.equals() equalsIgnorecase()
		String S5 = "Summer";
		String S6 = "Winter";
		System.out.println(S5.equals(S6));
		String S7 = "sUmMeR";
		System.out.println(S5.equalsIgnoreCase(S7));
		
		//6.CompareTo()
		System.out.println(S5.compareTo(S6));
		String S8 = "I am not in mood to learning Java";
		String S9 = "I am very much mood to learning Java";
		System.out.println(S8.compareTo(S9));
		String S10 = "ABC";
		String S11 = "abc";
		System.out.println(S10.compareTo(S11));
		
		//7. CompareToIgnorecase()
		String S12 = "Leptop";
		String S13 = "Computer With Keybord";
		System.out.println(S12.compareToIgnoreCase(S13));
		
		//8.How to join Strings()
		String S14 = "ABCD";
		String S15 = "10";
		String S16 = "EFGH";
		String S17 = "20";
		String S18 = "IJKL";
		String S19 = "30";
		System.out.println(S14+S15+S16+S17+S18+S19);
		System.out.println(S14.concat(S15).concat(S16).concat(S17).concat(S18).concat(S19));
		System.out.println(String.join(" & ", S14 , S15, S16, S17, S18, S19));
		
		//9. subSequence()
		String S20 = "I love to learn Automation";
		System.out.println(S20.subSequence(9, 18));
		
		//10. substring()
		String S21 = "I am tring to make my future in IT";
		System.out.println(S21.substring(0));
		System.out.println(S21.substring(15));
		System.out.println(S21.substring(5 , 18));
		
		//11. replace()
		String S22 = "Night";
		System.out.println(S22.replace('N', 'H'));
		
		//12. ReplaceFirst()
		String S23 = "I am learning in Java";
		System.out.println(S23.replaceFirst("learning", "working"));
		
		//13.replaceAll()
		String S24 = "All Automation codding done in Java";
		String replaceString = S24.replaceAll("a", "x");
		System.out.println(replaceString);
		
		//14. indexOf()
		System.out.println(S24.indexOf("codding"));
		System.out.println(S24.indexOf("a" , 7));
		System.out.println(S24.indexOf("o", 10));
		
		//15. lastIndexOf()
		System.out.println(S24.lastIndexOf("Java"));
		
		//16. contains()
		String S25 = "All type of Automation codding done in Java";
		System.out.println(S25.contains("type of"));
		System.out.println(S25.contains("done in java")); //'upperletter' & 'lowerletter' should affect
		System.out.println(S25.contains("Hello World"));
		
		//17. charAt()
		System.out.println(S25.charAt(13));
		
		//18. endsWith()
		String S26 = "Logout";
		System.out.println(S26.endsWith("out"));
		
		
		//19. startsWith()
		 String S27 = "Login";
		 System.out.println(S27.startsWith("log"));
		 System.out.println(S27.startsWith("Log"));
		 System.out.println(S27.startsWith("ogi"));
		 
		
		

	}

}
