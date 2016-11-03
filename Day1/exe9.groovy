//Exercise 9 - Going Up

print "Please enter a number: "
String str = System.console().readLine()
int inputNumber = Integer.parseInt(str)
int maxNumber = 0;
int minNumber = 0;

maxNumber = input;

while(inputNumber != -1)
{
    print "Please enter a number: "
    str = System.console().readLine()
    inputNumber = Integer.parseInt(str)

    if(inputNumber > maxNumber)
    {
        maxNumber = inputNumber;
    }
}
println "Max: " + maxNumber;
