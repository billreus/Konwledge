package test;

import java.util.Set;

public class ProductEntity {
    int id;
    String name;
    float price;
    Category category;
    public Category getCategory(){
        return category;
    }
    public void setCategory(Category category){
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    Set<User> users;
    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }

}
