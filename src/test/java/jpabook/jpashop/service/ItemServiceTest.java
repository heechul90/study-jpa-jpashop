package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ItemServiceTest {

    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void saveItem() {
        //given
        Item item = new Item();
        item.setName("itemA");

        //when
        Long saveItemId = itemService.saveItem(item);

        //then
        Item findItem = itemRepository.findOne(saveItemId);
        assertThat(findItem).isEqualTo(item);
    }

    @Test
    void updateItem() {
        //given
        Item item = new Item();
        item.setName("itemA");
        Long savedItemId = itemService.saveItem(item);

        Item paramItem = new Item();
        paramItem.setId(savedItemId);
        paramItem.setName("itemB");

        //when
        Long updatedItem = itemService.saveItem(paramItem);

        //then
        Item findItem = itemRepository.findOne(savedItemId);
        assertThat(findItem.getName()).isEqualTo("itemB");
    }

    @Test
    void findOne() {
        //given
        Item item = new Item();
        item.setName("itemA");
        Long savedId = itemService.saveItem(item);

        //when
        Item findItem = itemRepository.findOne(savedId);

        //then
        assertThat(findItem).isEqualTo(item);
    }

    @Test
    void findItems() {
        //given
        Item item1 = new Item();
        item1.setName("itemA");
        itemService.saveItem(item1);

        Item item2 = new Item();
        item2.setName("itemA");
        itemService.saveItem(item2);

        //when
        List<Item> resultItems = itemService.findItems();

        //then
        assertThat(resultItems.size()).isEqualTo(2);
    }
}