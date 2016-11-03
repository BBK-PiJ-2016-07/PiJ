//Exercise 7 - Naive Sorting
print "Please enter 1st number: "
String str = System.console().readLine()
int number1 = Integer.parseInt(str)
print "Please enter 2nd number: "
str = System.console().readLine()
int number2 = Integer.parseInt(str);
print "Please enter 3rd number: "
str = System.console().readLine()
int number3 = Integer.parseInt(str);

    if(number1 <= number2 && number2 <= number3){
      println number1
      println number2
      println number3
    }
    else if(number2 <= number1 && number1 <= number3)
    {
      println number2
      println number1
      println number3
    }
    else if(number3 <= number1 && number3 <= number2 && number1 <= number2)
    {
      println number3
      println number1
      println number2
    }
    else
    {
      println number3
      println number2
      println number1
    }
