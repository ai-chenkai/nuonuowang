package com.chenkai;

public class PrinterDemo {
    public static void main(String[] args) {
		/*BlackPrinter bp=new BlackPrinter("惠普");
		ColorPrinter cp=new ColorPrinter("戴尔");
		School school=new School();
		school.setBlackPrinter(bp);
		school.blackPrint("Hello World!");
		school.setColorPrinter(cp);
		school.colorPrint("Hello Java!");*/
        Printer bp=new BlackPrinter("惠普");
        Printer cp=new ColorPrinter("戴尔");
        Printer zp=new ZhenPrinter("联想");
        School school=new School();
        school.setPrinter(bp);
        school.print("Hello World!");
        school.setPrinter(cp);
        school.print("Hello Java!");
        school.setPrinter(zp);
        school.print("Hello CJLU");
    }
}
class Printer{

    public String brand;

    public Printer(String brand) {
        this.brand=brand;
    }

    public String getMessage() {
        return brand;
    }

    //将做什么和怎么做分离开
    public void print(String content) {

    }
}

class BlackPrinter extends Printer{
    public BlackPrinter(String brand) {
        super(brand);
    }

    public void print(String content) {
        System.out.println(getMessage()+"黑白打印："+content);
    }
}

//满足is-a关系
class ColorPrinter extends Printer{
    public ColorPrinter(String brand) {
        super(brand);
    }

    public void print(String content) {
        System.out.println(getMessage()+"彩色打印："+content);
    }
}

class ZhenPrinter extends Printer{
    public ZhenPrinter(String brand) {
        super(brand);
    }

    public void print(String content) {
        System.out.println(getMessage()+"针式打印："+content);
    }
}

class School{
    public Printer p;//父类的引用变量可以指向其任意子类的对象

    //越抽象越稳定,父类的引用变量可以指向其任意子类的对象，实现了多态
    public void setPrinter(Printer p) {
        this.p=p;
    }

    public void print(String content) {
        p.print(content);
    }
}

//has-a关系
/*class School{

	public BlackPrinter bp;
	public ColorPrinter cp;

	//违反开闭原则
	//安装黑白打印机
	public void setBlackPrinter(BlackPrinter bp) {
		this.bp=bp;
	}

	//使用黑白打印机打印
	public void blackPrint(String content) {
		bp.print(content);
	}

	//安装彩色打印机
	public void setColorPrinter(ColorPrinter cp) {
		this.cp=cp;
	}

	//使用彩色打印机打印
	public void colorPrint(String content) {
		cp.print(content);
	}
}*/
