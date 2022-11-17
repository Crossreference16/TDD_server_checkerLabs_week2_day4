public class Guest {

    private int sober;
    private int age;
    private boolean areTheyBanned;
    private double wallet;
    private boolean poundSterling;


    public Guest(int sober, int age, boolean areTheyBanned, double wallet, boolean poundSterling){
        this.sober = sober;
        this.age = age;
        this.areTheyBanned = areTheyBanned;
        this.wallet = wallet;
        this.poundSterling = poundSterling;


    }


    public int getSober() {return sober;}
    public void  setName(int sober){this.sober = sober;}

    public int getAge(){return age;}
    private void  setAge(int age){this.age = age;}

    public boolean getAreTheyBanned() {return areTheyBanned;}
    public void  setAreTheyBanned(String name){this.areTheyBanned = areTheyBanned;}

    public double getWallet() {return wallet;}
    public void setWallet(double wallet){this.wallet = wallet;}

    public boolean isPoundSterling() {return poundSterling;}
    public void  setPoundSterling(String name){this.poundSterling = poundSterling;}


}
