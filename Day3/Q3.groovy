class Q3{
	public static void main(String[] args){
	
	

	Double result 
	if(args.length > 2){
		String operator = args[1]
			switch(operator){
				case "+":
					String str = args[0]
					Double numberOne = Double.parseDouble(str)
					str = args[2]
					Double numberTwo = Double.parseDouble(str)
				
					result = numberOne + numberTwo
					println result
					break;
			
				case "-":
					String str = args[0]
					Double numberOne = Double.parseDouble(str)
					str = args[2]
					Double numberTwo = Double.parseDouble(str)
				
					result = numberOne - numberTwo
					println result
					break;
			
				case "x":
					String str = args[0]
					Double numberOne = Double.parseDouble(str)
					str = args[2]
					Double numberTwo = Double.parseDouble(str)
				
					result = numberOne * numberTwo
					println result
					break;
				
				case "/":
					String str = args[0]
					Double numberOne = Double.parseDouble(str)
					str = args[2]
					Double numberTwo = Double.parseDouble(str)
					if(numberTwo != 0){
					result = numberOne / numberTwo
					println result
					break;
					}else{
						println "cannot divide by zero !"
			}	
		
		}
	
		
	}else{
		println "No argument !!!"
	}
			
	}

}