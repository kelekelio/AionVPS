package pl.aionpb.aion.items.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.aionpb.aion.items.object.ItemObj;
import pl.aionpb.aion.translation.service.TranslationService;

import java.text.DecimalFormat;

/**
 * @author Grzegorz Nowakowski
 */
@Service
public class ItemBuilderService {

    @Autowired
    private ItemService itemService;

    @Autowired
    private TranslationService translationService;

    public ItemObj itemBuilder(int id) {
        ItemObj itemObj = new ItemObj();
        itemObj.setItemEntity(itemService.get(id));
        itemObj.setDescription(translationService.findByName(itemObj.getItemEntity().getDescription()).getLocaString());
        itemObj.setDescLong(translationService.findByName(itemObj.getItemEntity().getDescLong()).getLocaString());
        itemObj.setPrice(numberFormat(itemObj.getItemEntity().getPrice()));



        return itemObj;
    }

    public static String numberFormat (Integer number) {

        if (number == null) {
            return null;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        return decimalFormat.format(number);
    }
}