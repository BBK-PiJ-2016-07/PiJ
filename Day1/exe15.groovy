//Exercise 12 - Pyramid Numberss

int numberToGuess = Math.abs(1000 * Math.random())

println "Try to guess my number "
println "You only have 5 tries "
print "Tell me a number: "
String str = System.console().readLine();
int myNumber = Integer.parseInt(str);

int guessCounter = 0

while(true && guessCounter < 4)
{
    if(myNumber < numberToGuess)
    {
        println "No! My number is higher. "
        print "Tell me a number: "
        str = System.console().readLine();
        myNumber = Integer.parseInt(str);
        //guessCounter++;
    }
    else
    if(myNumber > numberToGuess)
    {
        println "No! My number is Lower. "
        print "Tell me a number: "
        str = System.console().readLine();
        myNumber = Integer.parseInt(str);
        //guessCounter++;
    }
    else
    if(myNumber == numberToGuess)
    {
        println "!!! CORRECT !!!"
        break;
        false;
    }
    guessCounter++;

    if(guessCounter == 4)
    {
        println "Sorry all 5 turns used!!! GAME OVER !!!"
    }


}
