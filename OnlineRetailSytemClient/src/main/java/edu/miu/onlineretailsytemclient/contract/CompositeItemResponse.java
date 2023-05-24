package edu.miu.onlineretailsytemclient.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompositeItemResponse extends ItemResponse {
    private List<ItemResponse> subItems = new ArrayList<>();

    // Constructors, getters, and setters

    public void addSubItem(ItemResponse item) {
        subItems.add(item);
    }

    public void removeSubItem(ItemResponse item) {
        subItems.remove(item);
    }

    @Override
    public double getPrice() {
        return calculatePrice();
    }

    private double calculatePrice() {
        double sum = 0;
        for (ItemResponse item : subItems) {
            sum += item.getPrice();
        }
        return sum;
    }

}
