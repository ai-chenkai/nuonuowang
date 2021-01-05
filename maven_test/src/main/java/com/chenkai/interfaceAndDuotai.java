package com.chenkai;

public class interfaceAndDuotai {
    public static void main(String[] args) {
        foodMenu fm=new chinesecooker();
        customer chenkai=new customer(fm);
        chenkai.order();
    }
}
interface foodMenu{
    void danchaofan();
    void gaijiaofan();
}
class chinesecooker implements foodMenu{
    public void danchaofan(){
        System.out.println("中国人炒蛋炒饭");
        }
    public void gaijiaofan() {
        System.out.println("中国人做盖浇饭");
    }
}
class AmericanCooker implements foodMenu{
    public void danchaofan() {
        System.out.println("西餐厨师做蛋炒饭");
    }
    public void gaijiaofan() {
        System.out.println("西餐厨师做盖浇饭");
    }
}
class customer{
    private foodMenu setFoodMenu;
    public customer(foodMenu setFoodMenu) {
        this.setFoodMenu = setFoodMenu;
    }
    public void setFm(foodMenu setFoodMenu) {
        this.setFoodMenu = setFoodMenu;
    }
    public foodMenu getFm() {
        return setFoodMenu;
    }
    public void order(){
        setFoodMenu.danchaofan();
        setFoodMenu.gaijiaofan();
    }
}