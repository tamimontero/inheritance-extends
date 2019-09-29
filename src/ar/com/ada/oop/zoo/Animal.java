package ar.com.ada.oop.zoo;

import java.util.Objects;

public class Animal {
    private String breed;

    public Animal(String breed) {
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Animal: " +breed;
    }
    @Override
    public int hashCode() {
        return -23 * Objects.hash(breed);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != getClass()) return false;
        Animal that = (Animal) o;
        return this.hashCode() == that.hashCode();
    }
}
