package moviles.hotel.data;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
public class item {
    private int id;
    private String nameITEM;
    private double priceitem;
    private int quantityInStock;

    public item(int id, String nameITEM, double priceitem, int quantityInStock) {
        this.id = id;
        this.nameITEM = nameITEM;
        this.priceitem = priceitem;
        this.quantityInStock = quantityInStock;
    }

    public int getId() {
        return id;
    }

    public String getNameITEM() {
        return nameITEM;
    }

    public double getPriceitem() {
        return priceitem;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameITEM(String nameITEM) {
        this.nameITEM = nameITEM;
    }

    public void setPriceitem(double priceitem) {
        this.priceitem = priceitem;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}
