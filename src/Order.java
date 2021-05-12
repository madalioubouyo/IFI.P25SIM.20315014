import java.util.ArrayList;
import java.util.List;

/**
 * @author madaliou
 *
 */
public class Order {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private List<Product> listOfProducts = new ArrayList<Product>();
	
	int i = 0, qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[i] = disc;
			i++;
			qtyOrdered++;
		}else {
			System.out.println("You can't add new disc, max elements reached");
		}
		
		
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {

	  for (int i = 0; i < itemsOrdered.length; i++) {
	       if (itemsOrdered[i] != null && itemsOrdered[i] == disc){
	    	   itemsOrdered[i] = null;
	    	   qtyOrdered--;
	         break; 
	       }
	
	       if (i == itemsOrdered.length - 1) {
	           System.out.println("That requested item is not in this array.");
	       }
	  }

	}
	
	public float totalCoast() {
		
		Float totalCoast = 0.0f;
		
		for (int i = 0; i < qtyOrdered; i++) {
			totalCoast =  totalCoast + itemsOrdered[i].getCoast();
		}
		return totalCoast;
	}
}
