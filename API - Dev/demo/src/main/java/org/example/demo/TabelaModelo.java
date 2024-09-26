package org.example.demo;

import javafx.beans.property.SimpleStringProperty;

public class TabelaModelo {
    private final SimpleStringProperty coluna1;
    private final SimpleStringProperty coluna2;

    public TabelaModelo() {
        this.coluna1 = new SimpleStringProperty();
        this.coluna2 = new SimpleStringProperty();
    }

    // Métodos getters e setters
    public String getColuna1() {
        return coluna1.get();
    }

    public void setColuna1(String value) {
        coluna1.set(value);
    }

    public String getColuna2() {
        return coluna2.get();
    }

    public void setColuna2(String value) {
        coluna2.set(value);
    }
}
