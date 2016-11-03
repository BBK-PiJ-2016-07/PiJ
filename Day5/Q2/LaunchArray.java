public class LaunchArray{

  public static void main(String[] args){
      int[] fixArray = new int[3];
      fixArray[0] = 1;
      fixArray[1] = 2;
      fixArray[2] = 3;

      int[] variableArray = new int[args.length];
      for(int i = 0; i < args.length; i++)
      {
          variableArray[i] = Integer.parseInt(args[i]);
      }
      ArrayCopier myCopier = new ArrayCopier();
      myCopier.copy(fixArray,variableArray);
      for(int j = 0; j < args.length; j++)
      {
          System.out.println(variableArray[j] + " ");
      }
      System.out.println();
    }
}
