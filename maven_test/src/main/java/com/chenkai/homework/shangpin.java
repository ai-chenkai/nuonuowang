package com.chenkai.homework;

import java.util.Objects;

public class shangpin {
    private String name;
    private int num;

    public shangpin() {
    }

    public shangpin(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        shangpin shangpin = (shangpin) o;
        return num == shangpin.num &&
                Objects.equals(name, shangpin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }
}
