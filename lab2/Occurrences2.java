class Occurrences2 {
	public static void main(String args[]) {
		
		if (args.length == 0) {
			System.out.println("Enter The Word and The Sentence.");
			return;
		} 
		
		String word = args[0];
		String sentence = args[1];
		
		int wordCount = 0;
		
		int index = sentence.indexOf(word);
		while(index != -1) {
			wordCount++;
			index = sentence.indexOf(word, index + 1);
		}
		
		System.out.println("Word Count: " + wordCount);
		
	}
}