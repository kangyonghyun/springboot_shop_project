package project.shop.service.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.shop.domain.item.Item;
import project.shop.repository.item.ItemRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    @Override
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public Optional<Item> findOne(Long itemId) {
        return itemRepository.findById(itemId);
    }

    @Override
    public Optional<Item> findOneByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Item> findItems() {
        return itemRepository.findAll();
    }


}