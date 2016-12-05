package edesdan.microservices.coffee.Boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("coffee")
public class CoffeeResource {

    @GET
    public String coffee() {
        return "dark roast\n";
    }

}
