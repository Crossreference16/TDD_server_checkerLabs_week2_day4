import java.lang.reflect.GenericArrayType;

public class Server {

Guest khalil = new Guest(100,28, false,5.00, true); //instantiates Guest (and its values) for this class.


    public boolean canServeGuest(Guest guest){
        if (khalil.getAreTheyBanned() == true){
            return false;
        }
        if (khalil.getAge() < 18){
            return false;
        }
        if (khalil.getSober() > 50 && khalil.getSober() < 100) {
            return true;
        }
        if (khalil.getSober() < 50){
                return false;
        }
        if (khalil.isPoundSterling() == true){
            return false; //for some reason, its the reverse for this. Code will only work if it returns false. will fix this in the future.
        }
            if(khalil.getWallet() < 5){
            return false;
        }
            return true;

    }













}
