//Exercise 6 - Multiplication
print "Please enter 1st number: "
String str = System.console().readLine()
int number1 = Integer.parseInt(str)
print "Please enter 2nd number: "
str = System.console().readLine()
int number2 = Integer.parseInt(str);
int result
int count = 0
while(count < number2){
     result = result + number1
     count++;
}

print "Product of " + number1 + " and " + number2 + " is : " + result
