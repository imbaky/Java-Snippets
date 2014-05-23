
public class reverse_string {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		reverse("HELLOworld", 0);
	}

	static void reverse(String s, int counter){
		char[] word=s.toCharArray();
		String tampered="";
		char  temp[]=new char[s.length()];
		
		if (counter<s.length()){
			
			for(int i=0; i<s.length(); ++i){ //coping array word into temp
				   temp[i]=word[i];
				}
			
			word[counter]=word[s.length()-1]; //moves the last character to the character in counter position
			
				for(int i=counter; i<s.length()-1;i++){ //saves the characters after the char in the counter position shifted over by one array and excluding the last char
				word[i+1]=temp[i];
				}
		
				tampered=String.valueOf(word); // converts the array word into a string and saves it to tampered
			
		
		
		reverse(tampered,counter+1);	 // recursion function calls it self
		}
			
		else{
			System.out.print(s); // when the counter reaches the end of the string it prints out the final string given in the last recursion
		}
	}
	
	
}
