//Obtain the input
print "Enter any text: "
String str = System.console().readLine()

print "Enter a short string to find from [" + str + "] : "
String str1 = System.console().readLine()

int j = 0;
int count = 0;

for(int i=0; i<str.length(); i++){	
	
	

	if(str.substring(j,i) != str1){
		print " sub - "	+ str.substring(j,i)
		count++;
		j = i + 1;
	}

}
//Output
print "In the string [" + str + "] there are " + count + " [" + str1 + "'s]"