public class PhoneLauncher{
    public static void main(String[] args){
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    public void launch(){
        MobilePhone myPhone = new MobilePhone();
        myPhone.call("07540292103");
        myPhone.call("07910007138");
        myPhone.call("07234290432");
        myPhone.call("07540342342");
        myPhone.call("07540444444");
        myPhone.call("07645555333");
        myPhone.call("07340664532");
        myPhone.call("07433562343");
        myPhone.call("07999999999");
        myPhone.call("07400200200");
        myPhone.printLastNumbers();
        
        SmartPhone mySmartphone = new SmartPhone();
        mySmartphone.browseWeb("Internet is too Boaring");
        mySmartphone.findPosition();

    }

}
