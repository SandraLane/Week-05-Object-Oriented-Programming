package week05;

		public class Card {
			String name;
			String suit;
			int value;
			
			public Card() {}
			
			public Card(String name, String suit, int value) {
				this.name = name;
				this.suit = suit;
				this.value = value;
			}


			public void describe() {
				System.out.println("Card name: " + name);
				System.out.println("Card suit: " + suit);
				System.out.println("Card value: " + value);
				System.out.println(this.name + " of " + this.suit + " -- " + this.value);
			}
		
			public void setName(String name) {
			  this.name = name;
			}
		  
			public String getName() {
			  return name;
			}
			public void setSuit(String suit) {
			  this.suit = suit;
			}
		  
			public String getSuit() {
			  return suit;
			}
			public void setValue(int value) {
			  this.value = value;
			}
		  
			public int getValue() {
			  return value;
		

}
}
