package com.firstapp.recycler_vertical.Model;

public class UserPojo {
    int image;
    String animalname,animalage,animalweight;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAnimalname() {
        return animalname;
    }

    public void setAnimalname(String animalname) {
        this.animalname = animalname;
    }

    public String getAnimalage() {
        return animalage;
    }

    public void setAnimalage(String animalage) {
        this.animalage = animalage;
    }

    public String getAnimalweight() {
        return animalweight;
    }

    public void setAnimalweight(String animalweight) {
        this.animalweight = animalweight;
    }

    public UserPojo(int image, String animalname, String animalage, String animalweight) {
        this.image = image;
        this.animalname = animalname;
        this.animalage = animalage;
        this.animalweight = animalweight;
    }
}
