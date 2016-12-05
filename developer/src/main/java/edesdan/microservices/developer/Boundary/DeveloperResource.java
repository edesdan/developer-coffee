package edesdan.microservices.developer.Boundary;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@Path("developer")
public class DeveloperResource {

    private Client client;

    private WebTarget target;

    @PostConstruct
    public void init() {
        this.client = ClientBuilder.newClient();
        this.target = this.client.target("http://coffee:8080/coffee/resources/coffee");
    }

    @GET
    public String developer() {
        return "Developer drinks: " + this.target
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
    }

}
