//Exercise 12 - Pyramid Numberss

print "Enter Pyramid Size(1-9): "
String str = System.console().readLine();
int size = Integer.parseInt(str);

int numberofSpaces = size;

for(int i = 1; i <= size; i++)
   {
        for (int j = size - 1; j >= i; j--)
            {
              print "  "
            }

        for (int k = 1; k <= i; k++)
            {
                print  i + " "
            }

        println(" ");
        numberofSpaces = numberofSpaces - 1;

    }
