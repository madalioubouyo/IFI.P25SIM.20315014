import javax.swing.JOptionPane;
public class Operations {
    public static void main (String[] args){
        String strNum1, strNum2, choice;
        Double result;
        String strNotification = "You've just entered : ";

        while (true) {

            choice = JOptionPane.showInputDialog(null, "Please input a number for an operation : \n 1 for SUM, \n 2 for DIFFERENCE, \n 3 for PRODUCT, \n 4 for QUOTIENT \n ", "Choose a number", JOptionPane.INFORMATION_MESSAGE);
        switch (choice) {
            case "1":

                strNum1 = JOptionPane.showInputDialog(null, "Please input the first number", "First number", JOptionPane.INFORMATION_MESSAGE);
                strNotification += strNum1 + " and "; 
        
                strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", "First number", JOptionPane.INFORMATION_MESSAGE);
                strNotification += strNum2;

                result = Double.parseDouble(strNum1) + Double.parseDouble(strNum2);

                JOptionPane.showMessageDialog(null, strNum1 +" + "+ strNum2 + " = "+ (int)Math.round(result), "Your sum is ", JOptionPane.INFORMATION_MESSAGE);
                
                break;

            case "2":

                strNum1 = JOptionPane.showInputDialog(null, "Please input the first number", "First number", JOptionPane.INFORMATION_MESSAGE);
                strNotification += strNum1 + " and "; 
        
                strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", "First number", JOptionPane.INFORMATION_MESSAGE);
                strNotification += strNum2;

                result = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);

                JOptionPane.showMessageDialog(null, strNum1 +" - "+ strNum2 + " = "+ (int)Math.round(result), "Your difference is ", JOptionPane.INFORMATION_MESSAGE);

                
                break;

            case "3":

            strNum1 = JOptionPane.showInputDialog(null, "Please input the first number", "First number", JOptionPane.INFORMATION_MESSAGE);
            strNotification += strNum1 + " and "; 
    
            strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", "First number", JOptionPane.INFORMATION_MESSAGE);
            strNotification += strNum2;

            result = Double.parseDouble(strNum1) * Double.parseDouble(strNum2);

            JOptionPane.showMessageDialog(null, strNum1 +" * "+ strNum2 + " = "+ (int)Math.round(result), "Your product is ", JOptionPane.INFORMATION_MESSAGE);

            
            break;

            case "4":

            strNum1 = JOptionPane.showInputDialog(null, "Please input the first number", "First number", JOptionPane.INFORMATION_MESSAGE);
            strNotification += strNum1 + " and "; 
    
            strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", "First number", JOptionPane.INFORMATION_MESSAGE);
            strNotification += strNum2;

            if (Double.parseDouble(strNum2) != 0) {
                result = Double.parseDouble(strNum1) / Double.parseDouble(strNum2);

                JOptionPane.showMessageDialog(null, strNum1 +" / "+ strNum2 + " = "+ result, "Your quotient is ", JOptionPane.INFORMATION_MESSAGE);
                
            } else {                

            JOptionPane.showMessageDialog(null, "Error ! Dividing by zero is not possible in Euclide's mathematics", "Error ", JOptionPane.INFORMATION_MESSAGE);
                
            }         
            
            break;
        
            default:
               
                break;
        }      

        //System.exit(0);       
        
        }

         }

        
}