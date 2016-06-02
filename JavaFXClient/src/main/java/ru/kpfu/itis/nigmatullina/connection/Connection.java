package ru.kpfu.itis.nigmatullina.connection;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import ru.kpfu.itis.nigmatullina.entity.*;

import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

/**
 * Created by ramilanigmatullina on 28.05.16.
 */

public class Connection {
    private RestTemplate restTemplate;
    private String serverURL = "http://localhost:8080/rest/api";
    private String data;
    private HttpHeaders httpHeaders;
    public User user;

    public Connection() {
        restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(Collections.<HttpMessageConverter<?>>singletonList(new MappingJacksonHttpMessageConverter()));
    }

    public User auth(String username, String password) {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/" + username;
        byte[] bytes = (username + ":" + password).getBytes();
        data = "Basic " + Base64.getEncoder().encodeToString(bytes);
        try {
            user = restTemplate.exchange(url, HttpMethod.GET, request(), User.class).getBody();
            /*user = new User();
            user.setUsername("user");
            user.setPassword("User4627");*/
            return user;
        } catch (Exception e) {
            return null;
        }
    }

    public void catalog() {
    }

    public List<BaseCabinet> getBaseCabinets() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/basecabinets";
        return restTemplate.getForObject(url, List.class);
    }

    public List<CabinetForBuiltInAppliances> getCabinetsForBuiltInAppliances() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/cabinetsforbuiltinappliances";
        return restTemplate.getForObject(url, List.class);
    }

    public List<Door> getDoors() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/doors";
        return restTemplate.getForObject(url, List.class);
    }

    public List<DrawerFront> getDrawerFronts() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/drawerfronts";
        return restTemplate.getForObject(url, List.class);
    }

    public List<HighCabinet> getHighCabinets() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/highcabinets";
        return restTemplate.getForObject(url, List.class);
    }

    public List<Leg> getLegs() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/legs";
        return restTemplate.getForObject(url, List.class);
    }

    public List<WallCabinet> getWallCabinets() {
        RestTemplate restTemplate = new RestTemplate();
        String url = serverURL + "/wallcabinets";
        return restTemplate.getForObject(url, List.class);
    }

    private HttpEntity request() throws IOException {
        httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", data);
        return new HttpEntity(httpHeaders);
    }

    public void logout() {
        String url = "http://localhost:8080/logout";
        restTemplate.delete(url);
    }
}
