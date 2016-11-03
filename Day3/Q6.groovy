class Point{
	double x;
	double y;
}

class Rectangle{
	Point firstpoint;
	Point secondPoint;
}



boolean inside = true;


	print "Enter [x] coordinate of the first point: "
	String str = System.console().readLine();
	Double xP1 = Double.parseDouble(str);
	
	print "Enter [x] coordinate of the second point: "
	str = System.console().readLine();
	Double xP2 = Double.parseDouble(str);
	
	print "Enter [y] coordinate of the first point: "
	str = System.console().readLine();
	Double yP1 = Double.parseDouble(str);
	
	print "Enter [y] coordinate of the second point: "
	str = System.console().readLine();
	Double yP2 = Double.parseDouble(str);

	print "Enter [x] coordinate of the third point: "
	str = System.console().readLine();
	Double xP3 = Double.parseDouble(str);
	
	print "Enter [y] coordinate of the third point: "
	str = System.console().readLine();
	Double yP3 = Double.parseDouble(str);


	
	
Point pointA = new Point();
	pointA.x = xP1;
	pointA.y = yP1;
Point pointB = new Point();
	pointB.x = xP2;
	pointB.y = yP2;
Point pointC = new Point();
	pointC.x = xP3;
	pointC.y = yP3;
	
println "--------------------------------------------------";
println "Point [A] is : (" + pointA.x + "," + pointA.y + ")";
println "Point [B] is : (" + pointB.x + "," + pointB.y + ")";
println "Point [C] is : (" + pointC.x + "," + pointC.y + ")";



Rectangle myRectangle = new Rectangle();
myRectangle.firstpoint = pointA;
myRectangle.secondPoint = pointB;
	

if (pointC.x < pointA.x && pointC.x < pointB.x) {
	inside = false;
}	
if (pointC.y < pointA.y && pointC.y < pointB.y) {
	inside = false;
}
if (pointC.x > pointA.x && pointC.x > pointB.x) {
	inside = false;
}	
if (pointC.y > pointA.y && pointC.y > pointB.y) {
	inside = false;
}

print("The third point is ");
if (!inside) {
	print "not ";
} 
println "inside the rectangle"
if ((Math.abs(pointA.x-pointB.x)) == (Math.abs(pointA.y-pointB.y))) {
	println "(its is a square";
}