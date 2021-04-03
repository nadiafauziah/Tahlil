package com.example.tahlil;

import java.io.Serializable;
import java.util.List;

public class ObjekBesar  implements Serializable {
    private List<Tahlil> data;

    public ObjekBesar(List<Tahlil> data) {
        this.data = data;
    }

    public List<Tahlil> getData() {
        return data;
    }

    public void setData(List<Tahlil> data) {
        this.data = data;
    }
}