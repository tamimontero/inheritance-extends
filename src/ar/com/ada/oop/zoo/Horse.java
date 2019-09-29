package ar.com.ada.oop.zoo;

import java.util.Objects;

public class Horse extends Animal {
    private Integer power;
    private String name;

    public Horse (String breed, Integer power, String name) {
        super(breed);
        this.power = power;
        this.name = name;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Horse: " +getBreed()+ " - horse power: " +power+ " - " +name;
    }
    @Override
    public int hashCode() {
        return -39 * Objects.hash(getBreed(), power, name);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Horse that = (Horse) o;
        return this.hashCode() == that.hashCode();
    }
}
