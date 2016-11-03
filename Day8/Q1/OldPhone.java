public class OldPhone implements Phone{
    private String number = "";

    public void call(String dialNumber){
        if(this.number == null){
            this.number = dialNumber;
            return;
        }
    }
}
