package project.shop.service.item;

import project.shop.domain.UploadFile;
import project.shop.domain.item.Item;
import project.shop.domain.item.ItemType;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    public void saveItem(Item item);

    public Optional<Item> findOne(Long itemId);

    public Optional<Item> findOneByName(String name);

    public List<Item> findItems();

    void updateItem(Long id, String name, int price, int stockQuantity, ItemType itemType, UploadFile attachFile);

    void deleteItem(Long id);

}
