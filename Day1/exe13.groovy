// Printing print numbers upto 1000
for(int i=1; i < 1000; i++){
      boolean isPrime = true;
      for(int j=2; j < i ; j++){
         if(i % j == 0){
           isPrime = false;
           break;
           }
      }
  if(isPrime == true)
  print i + " "
}
