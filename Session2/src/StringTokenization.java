import java.util.StringTokenizer; // import a built in class for tokenization

public class StringTokenization {

	public static void main(String[] args) {
	
		String names = "john, jennie, jim, jack, joe";
		System.out.println("names: "+names);
		
		String[] array = names.split(",");
		System.out.println("Total Names Found: "+array.length);
		for(String name : array) {
			System.out.println(name.trim());
		}
		
		System.out.println();

		String quote = "search the candle rather than cursing the darkness";
		String quoteAgain = quote.replace('s', 'k');
		System.out.println("quoteAgain: "+quoteAgain);
		
		String[] words = quote.split(" ");
		System.out.println("Total Words Found: "+words.length);
		for(String word : words) {
			System.out.println(word);
		}
		
		System.out.println();
		
		//StringTokenizer tokenizer = new StringTokenizer(quote);
		StringTokenizer tokenizer = new StringTokenizer(names, ", ");
		System.out.println("Total Tokens: "+tokenizer.countTokens());
		System.out.println(tokenizer.nextToken());
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		
		// Assignment: Exploratory :)
		// To Explore Tokenization and Create Word Map from this Array.
		// Simply List out top 10 words
		String [] reviews = {
				"Excellent showroom at very prime location. All the staff are extremely polite friendly and helpful. Deals in varieties. Must visit for Yokohama Tires.",
				"Best Tyre Shop in Ludhiana  Precise & Fast Service   Tyres fitted in no time  Great dealing by Bikram Madhok",
				"Best Tyre Shop in Ludhiana  Fast Service  Genuine Products",
				"quick service and premium range at best prices",
				"Good service at affordable prices. Loved their hospitality."
		};
		
		
	}

}
