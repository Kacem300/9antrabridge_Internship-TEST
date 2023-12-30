package antraback.kacem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class course {
   @Id
   private long id ;
    private  String img;
    private  String name;
    private   int price;

    public course( String img, String name, int price) {
        this.img = img;
        this.name = name;
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
