// Exercise 8 - Read text from user and display the same text letter by letter on next line	

// Part	- A - display text letter by letter
/*
	print "Please enter any text string: "
	String str = System.console().readLine();
	
	int strLength = str.length();
	
	for (int i=0; i<strLength;i++){
		char ch = str.charAt(i)
		println " " + ch
	}
*/


// Part	- B - display words with spaces on next lines

	print "Please enter any text string: "
	String str = System.console().readLine();
	
	int strLength = str.length();
	int j = 0;
	
	for (int i=0; i<strLength;i++){
		char space = str.charAt(i)
			if(space == " "){
				String str2 = str.substring(j,i);
				println "" + str2
				j = i+1;
			}
		
	}
	println "" + str.substring(j)
	