
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;


    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest(100,18, false,5.00, true);
    }


    // TODO: test that guest can only get served if over 18
    @Test
    public void canServeOver18(){
        boolean result = server.canServeGuest(guest);

            if (guest.getAge() > 18) {
            assertThat(result).isEqualTo(true);
        }
    }


    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    public void canPayForDrink(){
        boolean wallet = server.canServeGuest(guest);
            if (guest.getWallet() > 5){
            assertThat(wallet).isEqualTo(true);
        }
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    @Test
    public void canBeSober(){
        boolean sober = server.canServeGuest(guest);
         if (guest.getSober() > 50 && guest.getSober() < 100){
            assertThat(sober).isEqualTo(true);
        }
        if (guest.getSober() < 50){
            assertThat(sober).isEqualTo(false);
        }
    }

    // TODO: test that guest can only get served if guest is not banned from the pub

    @Test
    public void areTheyBanned(){
        boolean areTheyBanned = server.canServeGuest(guest);
        {
            assertThat(areTheyBanned).isEqualTo(false);
        }
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    @Test
    public void foreignCurrency(){
        boolean currency = server.canServeGuest(guest);
        {
            assertThat(currency).isEqualTo(false);
        }
    }


    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)










}
