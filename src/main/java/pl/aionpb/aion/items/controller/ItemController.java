package pl.aionpb.aion.items.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.aionpb.aion.items.object.ItemObj;
import pl.aionpb.aion.items.object.ItemTypeObj;
import pl.aionpb.aion.items.service.ItemBuilderService;
import pl.aionpb.aion.items.service.ItemService;
import pl.aionpb.aion.translation.service.TranslationService;

/**
 * @author Grzegorz Nowakowski
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private TranslationService translationService;

    @Autowired
    private ItemBuilderService itemBuilderService;




    @RequestMapping({"/item/{id}"})
    public String itemView(@PathVariable(value = "id") Integer id, Model model) {

        /*
        ItemObj itemObj = new ItemObj();
        itemObj.setItemEntity(itemService.get(id));
        itemObj.buildItem(translationService);

         */

        ItemObj itemObj = itemBuilderService.itemBuilder(id);
        model.addAttribute("item", itemObj);


        return "item";
    }

    @RequestMapping({"/tooltip/{id}"})
    public String itemTooltipView(@PathVariable(value = "id") Integer id, Model model) {

        ItemObj itemObj = itemBuilderService.itemBuilder(id);
        model.addAttribute("item", itemObj);


        return "items/item";
    }


    @RequestMapping(value = {"/items/{type}"})
    public String listItems(@PathVariable("type") String type, Model model) {

        ItemTypeObj itemType = new ItemTypeObj(type);

        model.addAttribute("itemType", itemType);

        return "items";
    }



}