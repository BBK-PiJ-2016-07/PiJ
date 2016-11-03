//Exercise 4 - is number a Prime 

print "Please enter any number: "
String str = System.console().readLine()
int number = Integer.parseInt(str);

boolean isNumberPrime = true;
int divisor = 2
while(isNumberPrime == true && divisor < number){
	
	
	if(number % divisor == 0){
	isNumberPrime = false
	}
divisor++;
}
if (isNumberPrime == true){
	print number +" is Prime"	
} else{
	print number +" is not Prime"
}

