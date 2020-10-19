package com.company;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Dog){
            String objName = ((Dog)obj).getName();
            return this.name.equals(obj);
        }
        return false;
    }
}
