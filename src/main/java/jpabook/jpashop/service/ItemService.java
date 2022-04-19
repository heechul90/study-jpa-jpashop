package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemService {

    private final ItemRepository itemRepository;

    /**
     * Item 저장 및 수정
     * @param item
     */
    @Transactional
    public Long saveItem(Item item) {
        itemRepository.save(item);
        return item.getId();
    }

    /**
     * Item 수정(변경감지)
     */
    @Transactional
    public void updateItem(Long itemId, String name, int price, int stockQuantity) {
        Item findItem = itemRepository.findOne(itemId);
        /*findItem.change(name, price, stockQuantity);*/
        findItem.setName(name);
        findItem.setPrice(price);
        findItem.setStockQuantity(stockQuantity);
    }

    /**
     * Item 조회(id)
     * @param id
     * @return
     */
    public Item findOne(Long id) {
        return itemRepository.findOne(id);
    }

    /**
     * Item 목록
     * @return
     */
    public List<Item> findItems() {
        return itemRepository.findAll();
    }
}
