package com.Siso;

public interface NodeList {

    boolean addItem(ListItem newItem);
    boolean removeItem(ListItem item);
    void iterateList(ListItem head);
    ListItem getHead();

}
