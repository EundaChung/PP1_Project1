package org.example;

import java.util.ArrayList;

public interface ICRUD {
    Object add();
    void addItem();
    void listAll();
    ArrayList<Integer> listAll(String keyword);
    void listAll(int level);
    void updateItem();
    void deleteItem();
    void loadFile();
    void saveFile();
    void searchLevel();
    void searchWord();

}
