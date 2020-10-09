package apartment;

public class Apartment {
	
		private int rooms; 
		private int squareMeters; 
		private int price; 

		public Apartment(int rooms, int squareMeters, int price){ 
		this.rooms = rooms; 
		this.squareMeters = squareMeters; 
		this.price = price; 
		
		}
		
		public boolean larger(Apartment otherApartment) { 
			
			return this.squareMeters > otherApartment.squareMeters;
		}	
		public int pricePerSquare(){ 
			return price / squareMeters  ;
		}
				
		public int priceDifference(Apartment otherApartment) {
			return this.price-otherApartment.price;
		}
		public boolean moreExpensiveThan(Apartment otherApartment) {
			return this.price > otherApartment.price;
		}
}