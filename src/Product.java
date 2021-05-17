

	/**
	 * 
	 */

	/**
	 * @author madaliou
	 *
	 */

public abstract class Product {
		/**
		 * @param args
		 */
		private int ID;
		private String title;
		private String category;		
		private float cost;
		
		
		
		/**
		 * @param title
		 */
		public Product(String title) {
			super();
			this.title = title;
		}
		
		

		/**
		 * @param title
		 * @param category
		 * @param coast
		 */
		public Product(String title, String category, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.cost = cost;
		}



		/**
		 * @param title
		 * @param category
		 * @param director
		 * @param length
		 * @param coast
		 */
	



		/**
		 * @param title
		 * @param category
		 * @param director
		 * @param coast
		 */



		/**
		 * @return the title
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * @param title the title to set
		 */
		public void setTitle(String title) {
			this.title = title;
		}

		/**
		 * @return the category
		 */
		public String getCategory() {
			return category;
		}

		/**
		 * @param category the category to set
		 */
		public void setCategory(String category) {
			this.category = category;
		}

		
		/**
		 * @return the coast
		 */
		public float getCost() {
			return cost;
		}

		/**
		 * @param coast the coast to set
		 */
		public void setCost(float coast) {
			this.cost = coast;
		}
		

	}
