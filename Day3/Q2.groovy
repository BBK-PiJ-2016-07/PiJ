// Exe2- Calculator

print "Please enter 1st number: "
String str = System.console().readLine()
Double numberOne = Double.parseDouble(str)

print "Please enter 2nd number: "
str = System.console().readLine()
Double numberTwo = Double.parseDouble(str)

print "Now choose your operator: [+] [-] [*] [/]  ->   "
String operator = System.console().readLine()

double result

if(operator == "+" || operator == "-" || operator == "*" || operator == "/"){
	switch(operator){

		case "+":
		result = numberOne + numberTwo
		print "result: " + result
		break;

		case "-":
		result = numberOne - numberTwo
		print "result: " + result
		break;

		case "*":
		result = numberOne * numberTwo
		print "result: " + result
		break;

		case "/":
		if (numberTwo == 0){
		print " cannot divide by Zero !"

		} else {
		result = numberOne / numberTwo
		print "result: " + result
		break;
		}


	}
} else {		
print "[ "+ operator + " ] is !!! Invalid Operator !!! - valid operator are: [+][-][*][/]"
} 
	

	