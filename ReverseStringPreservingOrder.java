package com.vids.may21;

public class ReverseStringPreservingOrder {

	public static void main(String[] args) {
		//String input = "abcd";
		String input = "I am a java developer";
		String[] words = input.split(" ");
		//Single word as input so reverse chars
		if(words.length==1){
			char[] chars = input.toCharArray();
			for(int i=chars.length-1; i>=0; i--){
				System.out.print(chars[i]);
			}
		}
		else{
			for(int i=words.length-1; i>=0; i--){
				System.out.print(words[i]+" ");
			}
		}

	}

}
