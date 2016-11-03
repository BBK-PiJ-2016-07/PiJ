void printNumbers(int n)
{
    if (n <= 0) {
        return;
    }
    println "" + n
    printNumbers(n-2);
    printNumbers(n-3);
    println "" + n
}

String buggyMethod(int n){
    if (n == 0) {
        return;
    }
    return n + " " + buggyMethod(n - 2);
}

print "Please enter a number: "
String str = System.console().readLine()
int inputNumber = Integer.parseInt(str)
println "Result is: " + printNumbers(inputNumber)
println "Buggy Method: " + buggyMethod(inputNumber)
