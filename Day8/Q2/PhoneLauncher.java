public class PhoneLauncher{
    public static void main(String[] args){
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    public void launch(){

        SmartPhone mySmartphone = new SmartPhone();
        mySmartphone.call("00123456789093");
        mySmartphone.call("01234567890");
        mySmartphone.call("00932332322232");
        mySmartphone.call("07540393102");
        mySmartphone.call("00923322229911");
        mySmartphone.call("01234567890");
        mySmartphone.call("00966304913943");
        mySmartphone.call("00332423432434");
        mySmartphone.call("00932332322232");
        mySmartphone.call("07913307138");

        mySmartphone.printLastNumbers();

        
    }

}
