import javax.swing.JOptionPane;

public class SecondDegreeEquation {
    public static void main (String[] args){
        String strNum1, strNum2, strNum3;
        Double a, b , c;
        Double discriminant;
        do{
            strNum1 = JOptionPane.showInputDialog(null, "Please input the term A of the ax²+bx+c equation", "Input the first term",JOptionPane.INFORMATION_MESSAGE);
            a = Double.parseDouble(strNum1);
            if(a == 0) {									
                JOptionPane.showMessageDialog(null, "A must not be null. Please enter it again.");
            }

        }while(a == 0);
        

        strNum2 = JOptionPane.showInputDialog(null, "Please input the term B of the ax²+bx+c equation", "Input the second term",JOptionPane.INFORMATION_MESSAGE);
        b = Double.parseDouble(strNum2);
        strNum3 = JOptionPane.showInputDialog(null, "Please input the term C of the ax²+bx+c equation", "Input the third term",JOptionPane.INFORMATION_MESSAGE);
        c = Double.parseDouble(strNum3);
        
        discriminant = Math.pow(b, 2) -(4*a*c);
        if(discriminant > 0) {            
            
            double X1 = (-b -Math.sqrt(discriminant))/(2*a);
            
            double X2 = (-b +Math.sqrt(discriminant))/(2*a);            
            
            JOptionPane.showMessageDialog(null, "Your equation "+strNum1+"x²+"+strNum2+"x+"+strNum3+" has two roots X1 = "+X1+" and X2 = "+X2);

        }
        if(discriminant == 0) {
            
            double X = -b/(2*a);	
            
            JOptionPane.showMessageDialog(null, "Your equation "+strNum1+"x²+"+strNum2+"x+"+strNum3+" has one double root X = "+X);
            
        }
        else if(discriminant < 0) {
            
            JOptionPane.showMessageDialog(null, "Your equation "+strNum1+"x²+"+strNum2+"x+"+strNum3+" has no root");

        }
    }
    
}
