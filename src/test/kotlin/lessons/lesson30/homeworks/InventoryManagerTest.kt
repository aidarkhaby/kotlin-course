package lessons.lesson30.homeworks

import org.example.lessons.lesson30.homeworks.InventoryManager
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test as Test

class InventoryManagerTest {

    private val inventory = InventoryManager(10)

    @Test
    fun shouldAddItemAndReturnItemCount() {
        inventory.addItem("spoon", 3)
        assertEquals(3, inventory.getItemCount("spoon"))
    }

    @Test
    fun getItemCountWithMultipleInventory() = with(inventory) {
        addItem("spoon", 2)
        addItem("fork", 1)
        assertEquals(2, getItemCount("spoon"))
        assertEquals(1, getItemCount("fork"))
    }

    @Test
    fun shouldReturnItemCountZeroIfInventoryNotExist() {
        assertEquals(0, inventory.getItemCount("fork"))
    }

    @Test
    fun `should be thrown when inventory count more than capacity`() {
        assertThrows(IllegalStateException::class.java) {
            inventory.addItem("knife", 19)
        }
    }

    @Test
    fun shouldRemoveItem() = with(inventory){
        addItem("bowl", 5)
        removeItem("bowl", 3)
        assertEquals(2, inventory.getItemCount("bowl"))
    }

    @Test
    fun `should return false when the amount to be removed exceeds the current amount`(){
        inventory.addItem("teapot", 2)
        assertFalse(inventory.removeItem("teapot", 20))
    }

    @Test
    fun `should return true when the item removed`(){
        inventory.addItem("teaspoon", 7)
        assertTrue(inventory.removeItem("teaspoon", 7))
    }

    @Test
    fun `item not removed if it is not exist`(){
        assertFalse(inventory.removeItem("lighter", 1))
    }


}
