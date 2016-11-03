class Comparator{

  public static void main(String[] args){
      Comparator myComparator = new Comparator();
      System.out.println(myComparator.getMax(1,2));
      System.out.println(myComparator.getMax(1.0,2.0));
      System.out.println(myComparator.getMax("1","2"));

  }

    public int getMax(int n, int m) {
        return (int) getMax((double)n, (double)m);
    }

    public double getMax(double d1, double d2){
            if (d1 > d2) {
                return d1;
            } else {
                return d2;
            }
    }
    public String getMax(String number1, String number2) {
        double n1 = Double.parseDouble(number1);
        double n2 = Double.parseDouble(number2);
        return String.valueOf(getMax(n1,n2));
    }

}
