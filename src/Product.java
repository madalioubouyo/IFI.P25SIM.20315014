

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
		private String title;
		private String category;
		private String director;
		private int length;
		private float coast;
		
		
		
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
		public Product(String title, String category, float coast) {
			super();
			this.title = title;
			this.category = category;
			this.coast = coast;
		}



		/**
		 * @param title
		 * @param category
		 * @param director
		 * @param length
		 * @param coast
		 */
		public Product(String title, String category, String director, int length, float coast) {
			super();
			this.title = title;
			this.category = category;
			this.director = director;
			this.length = length;
			this.coast = coast;
		}



		/**
		 * @param title
		 * @param category
		 * @param director
		 * @param coast
		 */
		public Product(String title, String category, String director, float coast) {
			super();
			this.title = title;
			this.category = category;
			this.director = director;
			this.coast = coast;
		}



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
		 * @return the director
		 */
		public String getDirector() {
			return director;
		}

		/**
		 * @param director the director to set
		 */
		public void setDirector(String director) {
			this.director = director;
		}

		/**
		 * @return the length
		 */
		public int getLength() {
			return length;
		}

		/**
		 * @param length the length to set
		 */
		public void setLength(int length) {
			this.length = length;
		}

		/**
		 * @return the coast
		 */
		public float getCoast() {
			return coast;
		}

		/**
		 * @param coast the coast to set
		 */
		public void setCoast(float coast) {
			this.coast = coast;
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			

		}

	}
