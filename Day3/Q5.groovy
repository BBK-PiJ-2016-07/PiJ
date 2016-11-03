class Point{
	double x;
	double y;
}

class Rectangle{
	Point upLeft;
	Point downRight;
}



print "Where is the top of the rectangle? : "
String str = System.console().readLine()
Double top = Double.parseDouble(str);

print "Where is the bottom of the rectangle? : "
str = System.console().readLine()
Double down = Double.parseDouble(str);

print "Where is the left of the rectangle? : "
str = System.console().readLine()
Double left = Double.parseDouble(str);

print "Where is the right of the rectangle? : "
str = System.console().readLine()
Double right = Double.parseDouble(str);


//Main Logic
//Create the Points
Point upLeft = new Point();
upLeft.x = left;
upLeft.y = top;
Point downRight = new Point();
downRight.x = right;
downRight.y = down;

//Create the Rectangle
Rectangle myRectangle = new Rectangle();
myRectangle.upLeft = upLeft
myRectangle.downRight = downRight

//Calculate perimeters and area
double height = myRectangle.upLeft.y - myRectangle.downRight.y
double breadth = myRectangle.downRight.x - myRectangle.upLeft.x
double area = height * breadth
double perimeter = 2 * height + 2 * breadth

//Print result on scree
println "The area of the Rectangle is: " + area	
println "The perimeter of the Rectangle is: " + perimeter	
