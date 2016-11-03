//Obtain the input
print "Enter any text: "
String str = System.console().readLine()

print "Enter any letter you want to find in [" + str + "] : "
String str1 = System.console().readLine()


int ecount = 0

for(int i=0; i<str.length(); i++){
	if(str.charAt(i) == str1){
		ecount++;
	}

}
//Output
print "In the string [" + str + "] there are " + ecount + " [" + str1 + "'s]"