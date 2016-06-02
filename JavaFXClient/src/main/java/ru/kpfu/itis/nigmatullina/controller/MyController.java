package ru.kpfu.itis.nigmatullina.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import ru.kpfu.itis.nigmatullina.connection.Connection;
import ru.kpfu.itis.nigmatullina.javafx.Loader;
import ru.kpfu.itis.nigmatullina.entity.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by ramilanigmatullina on 28.05.16.
 */

@Configurable
public class MyController {

    @Autowired
    public Loader loader;

    @Autowired
    public Connection connection;

    @FXML
    private List<Label> aList;


    public void catalogue(ActionEvent actionEvent) throws IOException {
        loader.redirect("catalogue");
    }

    public void baseCabinets(ActionEvent actionEvent) throws IOException {
        loader.redirect("baseCabinets");
        List<BaseCabinet> baseCabinets = connection.getBaseCabinets();

        for (int i = 0; i < baseCabinets.size(); i++) {
            ObjectMapper mapper = new ObjectMapper();
            byte[] json = mapper.writeValueAsBytes(baseCabinets.get(i));
            BaseCabinet baseCabinet = mapper.readValue(json, new TypeReference<BaseCabinet>() {
            });
            aList.get(i).setText("ID: " + baseCabinet.getId() + " Article number: " + baseCabinet.getArticleNumber() +
                    " Name: " + baseCabinet.getName() + " Description: " + baseCabinet.getDescription() +
                    " Price: " + baseCabinet.getPrice());
        }
    }

    public void cabinetsForBuiltInAppliances(ActionEvent actionEvent) throws IOException {
        loader.redirect("cabinetsForBuiltInAppliance");
        List<CabinetForBuiltInAppliances> cabinetsForBuiltInAppliance = connection.getCabinetsForBuiltInAppliances();

        for (int i = 0; i < cabinetsForBuiltInAppliance.size(); i++) {
            ObjectMapper mapper = new ObjectMapper();
            byte[] json = mapper.writeValueAsBytes(cabinetsForBuiltInAppliance.get(i));
            CabinetForBuiltInAppliances cabinetForBuiltInAppliances = mapper.readValue(json, new TypeReference<BaseCabinet>() {
            });
            aList.get(i).setText("ID: " + cabinetForBuiltInAppliances.getId() + " Article number: " + cabinetForBuiltInAppliances.getArticleNumber() +
                    " Name: " + cabinetForBuiltInAppliances.getName() + " Description: " + cabinetForBuiltInAppliances.getDescription() +
                    " Price: " + cabinetForBuiltInAppliances.getPrice());        }
    }

    public void doors(ActionEvent actionEvent) throws IOException {
        loader.redirect("doors");
        List<Door> doors = connection.getDoors();

        for (int i = 0; i < doors.size(); i++) {
            ObjectMapper mapper = new ObjectMapper();
            byte[] json = mapper.writeValueAsBytes(doors.get(i));
            Door door = mapper.readValue(json, new TypeReference<BaseCabinet>() {
            });
            aList.get(i).setText("ID: " + door.getId() + " Article number: " + door.getArticleNumber() +
                    " Name: " + door.getName() + " Description: " + door.getDescription() +
                    " Price: " + door.getPrice());        }
    }

    public void drawerFronts(ActionEvent actionEvent) throws IOException {
        loader.redirect("drawerFronts");
        List<DrawerFront> drawerFronts = connection.getDrawerFronts();

        for (int i = 0; i < drawerFronts.size(); i++) {
            ObjectMapper mapper = new ObjectMapper();
            byte[] json = mapper.writeValueAsBytes(drawerFronts.get(i));
            DrawerFront drawerFront = mapper.readValue(json, new TypeReference<BaseCabinet>() {
            });
            aList.get(i).setText("ID: " + drawerFront.getId() + " Article number: " + drawerFront.getArticleNumber() +
                    " Name: " + drawerFront.getName() + " Description: " + drawerFront.getDescription() +
                    " Price: " + drawerFront.getPrice());        }
    }

    public void highCabinets(ActionEvent actionEvent) throws IOException {
        loader.redirect("highCabinets");
        List<HighCabinet> highCabinets = connection.getHighCabinets();

        for (int i = 0; i < highCabinets.size(); i++) {
            ObjectMapper mapper = new ObjectMapper();
            byte[] json = mapper.writeValueAsBytes(highCabinets.get(i));
            HighCabinet highCabinet = mapper.readValue(json, new TypeReference<BaseCabinet>() {
            });
            aList.get(i).setText("ID: " + highCabinet.getId() + " Article number: " + highCabinet.getArticleNumber() +
                    " Name: " + highCabinet.getName() + " Description: " + highCabinet.getDescription() +
                    " Price: " + highCabinet.getPrice());        }
    }

    public void legs(ActionEvent actionEvent) throws IOException {
        loader.redirect("legs");
        List<Leg> legs = connection.getLegs();

        for (int i = 0; i < legs.size(); i++) {
            ObjectMapper mapper = new ObjectMapper();
            byte[] json = mapper.writeValueAsBytes(legs.get(i));
            Leg leg = mapper.readValue(json, new TypeReference<BaseCabinet>() {
            });
            aList.get(i).setText("ID: " + leg.getId() + " Article number: " + leg.getArticleNumber() +
                    " Name: " + leg.getName() + " Description: " + leg.getDescription() +
                    " Price: " + leg.getPrice());        }
    }

    public void wallCabinets(ActionEvent actionEvent) throws IOException {
        loader.redirect("wallCabinets");
        List<WallCabinet> wallCabinets = connection.getWallCabinets();

        for (int i = 0; i < wallCabinets.size(); i++) {
            ObjectMapper mapper = new ObjectMapper();
            byte[] json = mapper.writeValueAsBytes(wallCabinets.get(i));
            WallCabinet wallCabinet = mapper.readValue(json, new TypeReference<BaseCabinet>() {
            });
            aList.get(i).setText("ID: " + wallCabinet.getId() + " Article number: " + wallCabinet.getArticleNumber() +
                    " Name: " + wallCabinet.getName() + " Description: " + wallCabinet.getDescription() +
                    " Price: " + wallCabinet.getPrice());        }
    }

    public void logout() {
        connection.logout();
        loader.redirect("login");
    }
}
