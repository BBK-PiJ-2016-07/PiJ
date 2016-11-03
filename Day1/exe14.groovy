// Printing print 1st 1000 prime

for(int i=1; i < 7919; i++){
    boolean isPrime = true;
      for(int j=2; j < i ; j++)
      {
         if(i % j == 0){
           isPrime = false;
           break;
      }
      }
  if(isPrime == true)
  print i + " "
}
