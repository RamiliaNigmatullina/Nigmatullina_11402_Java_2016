package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.nigmatullina.entity.*;
import ru.kpfu.itis.nigmatullina.service.*;

import java.util.*;

/**
 * Created by ramilanigmatullina on 18.04.16.
 */
@Controller
@RequestMapping("/basket")
public class BasketController {

    @Autowired
    BasketService basketService;

    @Autowired
    BaseCabinetService baseCabinetService;

    @Autowired
    CabinetForBuiltInAppliancesService cabinetForBuiltInAppliancesService;

    @Autowired
    DoorService doorService;

    @Autowired
    DrawerFrontService drawerFrontService;

    @Autowired
    HighCabinetService highCabinetService;

    @Autowired
    LegService legService;

    @Autowired
    WallCabinetService wallCabinetService;

    @RequestMapping(method = RequestMethod.GET)
    public String basketGet(ModelMap modelMap) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Basket> basket = basketService.getItemsByUserId(user);

        ArrayList<ArrayList> allItemsView = new ArrayList<>();

        for (Basket b : basket) {
            ArrayList<String> itemsView = new ArrayList<>();
            if (b.getBaseCabinetId() != null) {
                BaseCabinet baseCabinet = b.getBaseCabinetId();
                itemsView.add(baseCabinet.getName());
                itemsView.add(Integer.toString(baseCabinet.getArticleNumber()));
                itemsView.add(baseCabinet.getDescription());
                itemsView.add(Integer.toString(b.getAmount()));
                itemsView.add(Integer.toString(baseCabinet.getPrice() * b.getAmount()));
                //itemsView.add(Integer.toString(b.getId()));
            } else if (b.getCabinetForBuiltInAppliancesId() != null) {
                CabinetForBuiltInAppliances cabinetForBuiltInAppliances = b.getCabinetForBuiltInAppliancesId();
                itemsView.add(cabinetForBuiltInAppliances.getName());
                itemsView.add(Integer.toString(cabinetForBuiltInAppliances.getArticleNumber()));
                itemsView.add(cabinetForBuiltInAppliances.getDescription());
                itemsView.add(Integer.toString(b.getAmount()));
                itemsView.add(Integer.toString(cabinetForBuiltInAppliances.getPrice() * b.getAmount()));
                //itemsView.add(Integer.toString(b.getId()));
            } else if (b.getDoorId() != null) {
                Door door = b.getDoorId();
                itemsView.add(door.getName());
                itemsView.add(Integer.toString(door.getArticleNumber()));
                itemsView.add(door.getDescription());
                itemsView.add(Integer.toString(b.getAmount()));
                itemsView.add(Integer.toString(door.getPrice() * b.getAmount()));
                //itemsView.add(Integer.toString(b.getId()));
            } else if (b.getDrawerFrontId() != null) {
                DrawerFront drawerFront = b.getDrawerFrontId();
                itemsView.add(drawerFront.getName());
                itemsView.add(Integer.toString(drawerFront.getArticleNumber()));
                itemsView.add(drawerFront.getDescription());
                itemsView.add(Integer.toString(b.getAmount()));
                itemsView.add(Integer.toString(drawerFront.getPrice() * b.getAmount()));
                //itemsView.add(Integer.toString(b.getId()));
            } else if (b.getHighCabinetId() != null) {
                HighCabinet highCabinet = b.getHighCabinetId();
                itemsView.add(highCabinet.getName());
                itemsView.add(Integer.toString(highCabinet.getArticleNumber()));
                itemsView.add(highCabinet.getDescription());
                itemsView.add(Integer.toString(b.getAmount()));
                itemsView.add(Integer.toString(highCabinet.getPrice() * b.getAmount()));
                //itemsView.add(Integer.toString(b.getId()));
            } else if (b.getLegId() != null) {
                Leg leg = b.getLegId();
                itemsView.add(leg.getName());
                itemsView.add(Integer.toString(leg.getArticleNumber()));
                itemsView.add(leg.getDescription());
                itemsView.add(Integer.toString(b.getAmount()));
                itemsView.add(Integer.toString(leg.getPrice() * b.getAmount()));
                //itemsView.add(Integer.toString(b.getId()));
            } else if (b.getWallCabinetId() != null) {
                WallCabinet wallCabinet = b.getWallCabinetId();
                itemsView.add(wallCabinet.getName());
                itemsView.add(Integer.toString(wallCabinet.getArticleNumber()));
                itemsView.add(wallCabinet.getDescription());
                itemsView.add(Integer.toString(b.getAmount()));
                itemsView.add(Integer.toString(wallCabinet.getPrice() * b.getAmount()));
                //itemsView.add(Integer.toString(b.getId()));
            }
            allItemsView.add(itemsView);
        }
        modelMap.addAttribute("allItemsView", allItemsView);
        modelMap.addAttribute("user_id", user.getId());
        return "basket";
    }

    @RequestMapping(value = "/delete_item/{user_id}/{baslet_id}", method = RequestMethod.POST)
    public String deleteItem() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String basketPost() {
        return "basket";
    }

    @RequestMapping(value = "/add/{item_name}/{item_id}", method = RequestMethod.POST)
    public String regPost(ModelMap modelMap, @RequestParam Integer amount, @PathVariable String item_name, @PathVariable Integer item_id) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Basket basket = new Basket();
        basket.setUserId(user);
        basket.setAmount(amount);

        switch (item_name) {
            case "base_cabinets":
                basket.setBaseCabinetId(baseCabinetService.getById(item_id));
                break;
            case "cabinets_for_built_in_appliances":
                basket.setCabinetForBuiltInAppliancesId(cabinetForBuiltInAppliancesService.getById(item_id));
                break;
            case "doors":
                basket.setDoorId(doorService.getById(item_id));
                break;
            case "drawer_fronts":
                basket.setDrawerFrontId(drawerFrontService.getById(item_id));
                break;
            case "high_cabinets":
                basket.setHighCabinetId(highCabinetService.getById(item_id));
                break;
            case "legs":
                basket.setLegId(legService.getById(item_id));
                break;
            case "wall_cabinets":
                basket.setWallCabinetId(wallCabinetService.getById(item_id));
        }

        basketService.addBasket(basket);
        //modelMap.addAttribute("success", "Товар был успешно добавлен");
        return "redirect:/catalog/" + item_name + "/" + item_id;
    }
}
/*
    private Integer id;
    private User userId;
    private Integer amount;
    private BaseCabinet baseCabinetId;
    private CabinetForBuiltInAppliances cabinetForBuiltInAppliancesId;
    private DrawerFront drawerFrontId;
    private HighCabinet highCabinetId;
    private Leg legId;
    private WallCabinet wallCabinetId;*/
