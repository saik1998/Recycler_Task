package com.firstapp.addingripple_recyclerview.Model;

public class HeroModel {
   int image;
   String heroname,heroage,heromoives;

    public HeroModel(int image, String heroname, String heroage, String heromoives) {
        this.image = image;
        this.heroname = heroname;
        this.heroage = heroage;
        this.heromoives = heromoives;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeroname() {
        return heroname;
    }

    public void setHeroname(String heroname) {
        this.heroname = heroname;
    }

    public String getHeroage() {
        return heroage;
    }

    public void setHeroage(String heroage) {
        this.heroage = heroage;
    }

    public String getHeromoives() {
        return heromoives;
    }

    public void setHeromoives(String heromoives) {
        this.heromoives = heromoives;
    }
}
