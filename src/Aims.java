/**
 * 
 */

/**
 * @author madaliou
 *
 */
public class Aims {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animartion", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science Fiction", "George Lucas ", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Test", "Animation", 50.99f);
		anOrder.addDigitalVideoDisc(dvd4);
		
		//anOrder.removeDigitalVideoDisc(dvd4);
		
		System.out.println("Total coast is : ");
		System.out.println(anOrder.totalCoast());

	}

}
