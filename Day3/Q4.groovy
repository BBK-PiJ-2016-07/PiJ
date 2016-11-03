class Point{
	double x;
	double y;
}

double distance(double x1, double x2, double y1, double y2){
	return Math.sqrt(((x1 - x2)*(x1 - x2)) - ((y1 - y2)*(y1 - y2)))
}


print "x1 : " 
String str = System.console().readLine()
Double xP1 = Double.parseDouble(str)

print "y1 : " 
str = System.console().readLine()
Double yP1 = Double.parseDouble(str)	

print "x2 : " 
str = System.console().readLine()
Double xP2 = Double.parseDouble(str)

print "y2 : " 
str = System.console().readLine()
Double yP2 = Double.parseDouble(str)

print "x3 : " 
str = System.console().readLine()
Double xP3 = Double.parseDouble(str)


print "y3 : " 
str = System.console().readLine()
Double yP3 = Double.parseDouble(str)


Point pointOne = new Point();
	pointOne.x = xP1
	pointOne.y = yP1
	
Point pointTwo = new Point();
	pointTwo.x = xP2
	pointTwo.y = yP2
	
Point pointThree = new Point();
	pointThree.x = xP3
	pointThree.y = yP3

	
//double distance = Math.sqrt(((pointOne.x - pointTwo.x)*(pointOne.x - pointTwo.x)) - ((pointOne.y - pointTwo.y)*(pointOne.y - pointTwo.y)))


distancePoint1to2 = distance(pointOne.x,pointTwo.x,pointOne.y,pointTwo.y)
distancePoint1to3 = distance(pointOne.x,pointThree.x,pointOne.y,pointThree.y)
distancePoint2to3 = distance(pointTwo.x,pointThree.x,pointTwo.y,pointThree.y)

println "Distance between point 1 and 2 is: " + distancePoint1to2
println "Distance between point 1 and 3 is: " + distancePoint1to3
println "Distance between point 2 and 3 is: " + distancePoint2to3

if(distancePoint1to2 == distancePoint1to3 && distancePoint1to3 == distancePoint2to3){
println "All points are closer !!!"

}else{
	if (distancePoint1to2 < distancePoint1to3 && distancePoint1to3 < distancePoint2to3){
		println "Point 1 and 3 are closer! "
	}else if(distancePoint2to3 < distancePoint1to2 && distancePoint1to3 < distancePoint1to2){
		println "Point 2 and 3 are closer! "
	}else{
		println "Point 1 and 2 are closer! "
}

}
