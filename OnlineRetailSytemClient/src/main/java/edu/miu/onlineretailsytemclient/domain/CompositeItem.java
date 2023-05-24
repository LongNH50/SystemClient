package edu.miu.onlineretailsytemclient.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CompositeItem extends Item {
    private List<Item> subItems = new ArrayList<>();

    // Constructors, getters, and setters

    public void addSubItem(Item item) {
        subItems.add(item);
    }

    public void removeSubItem(Item item) {
        subItems.remove(item);
    }

    @Override
    public double getPrice() {
        return calculatePrice();
    }

    private double calculatePrice() {
        double sum = 0;
        for (Item item : subItems) {
            sum += item.getPrice();
        }
        return sum;
    }
}
