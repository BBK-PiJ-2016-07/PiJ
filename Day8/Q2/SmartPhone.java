public class SmartPhone extends MobilePhone{

      public void browseWeb(String web){
          System.out.println(web);
      }
      public void findPosition(){
          System.out.println("No co-ordinates found for positing! May be next time");
      }

      @Override
      public void call(String internationalNumber){
            super.call(internationalNumber);
            if(internationalNumber.charAt(0) == '0' && internationalNumber.charAt(1) == '0'){
                System.out.println("Calling " + internationalNumber + " through internet to save money.");
            } else {
                System.out.println("Calling Local: " + internationalNumber);
            }
      }






}
