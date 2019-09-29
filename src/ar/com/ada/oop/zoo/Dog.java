package ar.com.ada.oop.zoo;

import java.util.Objects;

public class Dog extends Animal {
    private Integer legs;
    private Integer age;

    public Dog (String breed, Integer legs, Integer age) {
        super(breed);
        this.legs = legs;
        this.age = age;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getLegs() {
        return legs;
    }
    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog: " +getBreed()+ " - " +legs+ " patas - " +age;
    }
    @Override
    public int hashCode() {
        return -20 * Objects.hash(getBreed(), legs, age);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Dog that = (Dog) o;
        return this.hashCode() == that.hashCode();
    }
}
