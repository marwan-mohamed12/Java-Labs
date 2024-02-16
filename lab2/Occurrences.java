class Occurrences {

	public static void main(String args[]) {
	
		if (args.length == 0) {
			System.out.println("Enter The Word and The Sentence.");
			return;
		} 
		
		String word = args[0];
		String sentence = args[1];
		
		String[] wordList = sentence.split(" ");
		int wordCount = 0;
		
		for (int i = 0; i < wordList.length; i++) {
			if (word.equals(wordList[i])){
				wordCount++;
			}
		}
		
		System.out.println("Word Count: " + wordCount);
	
	}
	
}

//ITI develops people and ITI house of developers and ITI for people