package shopAndGoods;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;


public class ShopTest {
    private Shop shop;


    @Before
    public void setup(){
        this.shop = new Shop();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetShelvesShouldReturnUnmodifiableCollection(){
        this.shop.getShelves().clear();

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddGoodsShouldFailForInvalidShelve() throws OperationNotSupportedException {
        this.shop.addGoods("invalid test",null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddGoodsShouldFailExistingGood() throws OperationNotSupportedException {
        Goods goods = new Goods("test","test_code");
        shop.addGoods("Shelves1",goods);
        shop.addGoods("Shelves1",goods);
    }

    @Test
    public void testAddGoodShouldReturnCorrectMessage() throws OperationNotSupportedException {
        Goods goods = new Goods("test_good","test_code");
        String expected = "Goods: test_code is placed successfully!";
        String actual = shop.addGoods("Shelves1",goods);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveGoodShouldFailForNotExistingShelve() throws OperationNotSupportedException {
        Goods goods = new Goods("test_good","test_code");
        shop.addGoods("Shelves1",goods);
        shop.removeGoods("shelv_test", goods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveGoodShouldFailForDifferentGoodForTheSameShelve() throws OperationNotSupportedException {
        Goods goods = new Goods("test_good","test_code");
        Goods goods2 = new Goods("test_good2","test_code2");
        shop.addGoods("Shelves1",goods);
        shop.removeGoods("Shelves1",goods2);
    }

    @Test
    public void testRemoveGoodShouldReturnCorrectMessage() throws OperationNotSupportedException {
        Goods goods = new Goods("test_good","test_code");
        shop.addGoods("Shelves1",goods);
        String actualMessage = shop.removeGoods("Shelves1", goods);
        String expectedMessage = "Goods: test_code is removed successfully!";
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Test
    public void testRemoveGoodsShouldRemoveValue() throws OperationNotSupportedException {
        Goods goods = new Goods("test_good","test_code");
        shop.addGoods("Shelves1",goods);

        shop.removeGoods("Shelves1", goods);
        Goods emptyGood = shop.getShelves().get("Shelves1");

        Assert.assertNull(emptyGood);
    }

}
