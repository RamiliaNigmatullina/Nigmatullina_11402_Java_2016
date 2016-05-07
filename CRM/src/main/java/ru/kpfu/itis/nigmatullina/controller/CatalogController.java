package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.nigmatullina.service.*;

/**
 * Created by ramilanigmatullina on 03.05.16.
 */
@Controller
@RequestMapping("/catalog")
public class CatalogController {
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
    public String portfolio(Model model) {
        model.addAttribute("base_cabinets", baseCabinetService.getAll());
        model.addAttribute("cabinets_for_built_in_appliances", cabinetForBuiltInAppliancesService.getAll());
        model.addAttribute("doors", doorService.getAll());
        model.addAttribute("drawer_fronts", drawerFrontService.getAll());
        model.addAttribute("high_cabinets", highCabinetService.getAll());
        model.addAttribute("legs", legService.getAll());
        model.addAttribute("wall_cabinets", wallCabinetService.getAll());
        return "catalog";
    }

    @RequestMapping(value="/{item}/{id}", method = RequestMethod.GET)
    public String item(Model model, @PathVariable String item, @PathVariable Integer id) {
        switch (item) {
            case "base_cabinets":
                model.addAttribute("item", baseCabinetService.getById(id));
                model.addAttribute("category", item);
                model.addAttribute("name", "Напольный шкаф");
                break;
            case "cabinets_for_built_in_appliances":
                model.addAttribute("item", cabinetForBuiltInAppliancesService.getById(id));
                model.addAttribute("category", item);
                model.addAttribute("name", "Шкаф для встраиваемой техники");
                break;
            case "doors":
                model.addAttribute("item", doorService.getById(id));
                model.addAttribute("category", item);
                model.addAttribute("name", "Дверь");
                break;
            case "drawer_fronts":
                model.addAttribute("item", drawerFrontService.getById(id));
                model.addAttribute("category", item);
                model.addAttribute("name", "Фронтальная панель");
                break;
            case "high_cabinets":
                model.addAttribute("item", highCabinetService.getById(id));
                model.addAttribute("category", item);
                model.addAttribute("name", "Высокий шкаф");
                break;
            case "legs":
                model.addAttribute("item", legService.getById(id));
                model.addAttribute("category", item);
                model.addAttribute("name", "Ножка");
                break;
            case "wall_cabinets":
                model.addAttribute("item", wallCabinetService.getById(id));
                model.addAttribute("category", item);
                model.addAttribute("name", "Навесной шкаф");
                break;
        }
        return "item";
    }
}