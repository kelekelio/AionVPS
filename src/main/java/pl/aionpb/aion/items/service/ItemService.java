package pl.aionpb.aion.items.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.aionpb.aion.items.entity.ItemEntity;
import pl.aionpb.aion.items.repository.ItemRepository;
import pl.aionpb.aion.translation.repository.TranslationRepository;
import pl.aionpb.aion.translation.service.TranslationService;

import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
@Service
public class ItemService {


    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private TranslationRepository translationRepository;

    @Autowired
    private TranslationService translationService;

    public ItemEntity get(Integer id) {
        return itemRepository.findById(id).get();
    }

    public List<ItemEntity> findByEquipmentSlots (String equipmentSlots) {
        return itemRepository.findAllByEquipmentSlots(equipmentSlots);
    }

    public List<ItemEntity> findByWeaponType (String weaponType) {
        return itemRepository.findAllByWeaponType(weaponType);
    }



    public List<ItemEntity> findByArmorType(String slot) {
        return itemRepository.findAllByArmorType(slot);
    }

    public List<ItemEntity> findAllByIdBetween (Integer lowestId, Integer highestId) {
        return itemRepository.findAllByIdBetween(lowestId, highestId);
    }
}