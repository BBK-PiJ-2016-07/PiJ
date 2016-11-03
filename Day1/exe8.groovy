//Exercise 8 - Maximizing

print "Please enter a number: "
String str = System.console().readLine()
int input = Integer.parseInt(str)
int maxNumber = 0;
int minNumber = 0;

maxNumber = input;

while(input != -1)
{
    print "Please enter a number: "
    str = System.console().readLine()
    input = Integer.parseInt(str)

    if(input > maxNumber)
    {
        maxNumber = input;
    }
}
println "Max: " + maxNumber;
