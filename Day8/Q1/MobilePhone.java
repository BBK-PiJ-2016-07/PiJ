public class MobilePhone extends OldPhone{

      private String[] listOfDailedNumbers = new String[10];
      private int indexOfLastNumberStored = 0;

      public void ringAlarm(String alarm){
          System.out.println("Alerm Alert! its " + alarm + "AM");
      }

      public void playGame(String game){
          System.out.println("Playing a game: " + game);
      }

      public void call(String dialNumber){
            if(indexOfLastNumberStored == listOfDailedNumbers.length){
                for(int i =0; i<listOfDailedNumbers.length;i++){
                    listOfDailedNumbers[i-1] = listOfDailedNumbers[i];
                    listOfDailedNumbers[indexOfLastNumberStored] = dialNumber;
                }
            } else  {
                listOfDailedNumbers[indexOfLastNumberStored] = dialNumber;
                indexOfLastNumberStored++;
            }
      }
      public void printLastNumbers(){
          System.out.println("Last dialed numbers: ");
          for(int i =0; i<indexOfLastNumberStored;i++) {
              System.out.println(listOfDailedNumbers[i]);
          }
      }
}
