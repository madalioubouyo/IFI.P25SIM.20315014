/**
 * @author madaliou
 *
 */
public class Order {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	int i = 0;
	
	//private Float totalCoast = 0.0f;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		
		itemsOrdered[i] = disc;
		i++;
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
	//itemsOrdered = ArrayUtils.removeElement(itemsOrdered, disc);

	  for (int i = 0; i < itemsOrdered.length; i++) {
	       if (itemsOrdered[i] != null && itemsOrdered[i] == disc){
	    	   itemsOrdered[i] = null;
	         break; 
	       }
	
	       if (i == itemsOrdered.length - 1) {
	           System.out.println("That requested item is not in this array.");
	       }
	  }

	}
	
	public float totalCoast() {
		
		Float totalCoast = 0.0f;
		
		for (int i = 0; i < itemsOrdered.length; i++) {
			//System.out.println(itemsOrdered[i].getCoast());
			totalCoast =  totalCoast + itemsOrdered[i].getCoast();
		}
		return totalCoast;
	}
}
