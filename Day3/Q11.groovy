//Obtain the input

print "Enter any text: "
String str = System.console().readLine()
String str2 = ""; 


while(true){
	
	print "Enter any letter you want to find in [" + str + "] : "
	String str1 = System.console().readLine();
	
	// Check this is not a char that have been entered before
	boolean charEntered = false
		
	for(int i=0; i<str2.length(); i++)
	{
		if(str2.charAt(i) == str1)
		{
			charEntered = true;
			break;
		}
	}	
	if(charEntered)
	{
		println "[" + str1 + "] letter already entered: Good Bye"
		break;
	}
	else
	{
	int count = 0;	
	for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == str1)
			{
				count++;
			}
		}	
		println "In string [" + str + "] there are: " + count + " [" + str1 + "'s]"
		str2 = str2 + str1;
	} 
}