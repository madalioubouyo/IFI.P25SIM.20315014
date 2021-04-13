import java.util.Arrays; 

import javax.swing.JOptionPane;

public class SortArray {
	public static void main(String[] args) {
		String strNum, arrayElement, response ="";
		int sum = 0, arrayLength, elementToAdd;
		boolean restart = false;
		
			
		do {		
			
		
			strNum = JOptionPane.showInputDialog(null, "Please enter the height of the array :  " );
			arrayLength = Integer.parseInt(strNum);
			int[] myArray = new int[arrayLength];
			
			
			for (int i = 0; i < Integer.parseInt(strNum); i++) {
				
				arrayElement = JOptionPane.showInputDialog(null, "Please enter the element n° "+(i+1));
				
				elementToAdd = Integer.parseInt(arrayElement);
				
				myArray[i] = elementToAdd;
				sum = sum + elementToAdd;
				
			}
			Arrays.sort(myArray);
			System.out.println(Arrays.toString(myArray));
			JOptionPane.showMessageDialog(null, "Your array sort is : "+Arrays.toString(myArray)+ 
					"the sum of all array elements is : "+sum+" and the average is "+sum/arrayLength
					);	
			
			response = JOptionPane.showInputDialog(null, "Did you want to continue? y/n");
			            
			 			if(response.toLowerCase().equals("n")){
			 				break;
			 			}      	
			
			}while(response.toLowerCase().equals("y"));
		
        
		 }
	
	
}
