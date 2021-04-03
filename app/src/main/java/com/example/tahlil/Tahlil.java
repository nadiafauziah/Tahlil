package com.example.tahlil;

import java.io.Serializable;
import java.util.List;

public class Tahlil implements Serializable {
    private String title;
    private String arabic;
    private String translation;

    public Tahlil(String title, String arabic, String translation) {
        this.title = title;
        this.arabic = arabic;
        this.translation = translation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}


