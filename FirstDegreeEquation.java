import javax.swing.JOptionPane;

public class FirstDegreeEquation {
    public static void main (String[] args){
        String a, b;
        double result;     
        
        do{
            a = JOptionPane.showInputDialog(null, "Please input the term A of the ax+b equation", "Input the first term",JOptionPane.INFORMATION_MESSAGE);

            if(a.equals("0")){
                JOptionPane.showMessageDialog(null, "The value A must not be null. Please enter it again.");
            }
        }while(a.equals("0"));

       
        /* while(a.equals("0")){
            a = JOptionPane.showInputDialog(null, "A must not be null. please Enter again:");
        } */
        b = JOptionPane.showInputDialog(null, "Please input the the term B of the ax+b equation", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
       
        result = -Double.parseDouble(a)/Double.parseDouble(b);

        JOptionPane.showMessageDialog(null, "The result of your equation"+ " "+a+"x+"+b+" is: "+result);    

        //System.exit(0);
    }
}
