import com.google.gson.Gson;
import com.google.inject.Guice;
import com.google.inject.Injector;
import flight.dto.entity.Airports;
import org.junit.Test;
import scala.collection.Seq;

import javax.inject.Inject;
import javax.inject.Singleton;

public class FlightServicesTest {

    private flight.http.impl.FlightServicesAPI flightServicesAPI;
    Gson gson = new Gson();

    @Inject
    public FlightServicesTest(flight.http.impl.FlightServicesAPI flightServicesAPI) {
        this.flightServicesAPI = flightServicesAPI;
    }

    private void printJSON(Object object) {
        System.out.println(gson.toJson(object));
    }

    public void runFlightSearch() {
        String cityAirportCodeOrName = "LON";
        Seq<Airports> airports = flightServicesAPI.getAirports(cityAirportCodeOrName);
        printJSON(airports);
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        flight.http.impl.FlightServicesAPI flightServicesAPI = injector.getInstance(flight.http.impl.FlightServicesAPI.class);

        FlightServicesTest servicesTest = new FlightServicesTest(flightServicesAPI);
        servicesTest.runFlightSearch();

    }
}
