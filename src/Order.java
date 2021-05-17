import java.util.ArrayList;
import java.util.List;

/**
 * @author madaliou
 *
 */
	public class Order {
		
	private ArrayList<Product> itemOrdered = new ArrayList<Product>();
	    
		void addProduct(Product product){
			    	itemOrdered.add(product);
			    	
			
		}
		void removeProduct(Product product){
			if(!itemOrdered.isEmpty()) {
				if(itemOrdered.contains(product)) {
					
					itemOrdered.remove(product);
				}else {
					System.out.println("The removal product does not exist");
				}
			}else {
				System.out.println("The product list is empty");
			}
				
		}
		
		float totalCost(){
			 float total_amount=0;
			 if(!itemOrdered.isEmpty()) {
				 for(int i = 0; i < itemOrdered.size(); i++) {
					 total_amount=total_amount+itemOrdered.get(i).getCost();
				 }
			 }
			 return total_amount;
		}
	
	
}
