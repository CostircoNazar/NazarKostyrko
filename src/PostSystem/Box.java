package PostSystem;

import java.util.Scanner;

public class Box {
    private int hight;
    private int width;
    private int length;

    public Box() {
        hight = 0;
        width = 0;
        length = 0;
    }

    public Box(int hight, int width, int length) {
        this.hight = hight;
        this.width = width;
        this.length = length;
    }

    public Box (Box obj) {
        hight = obj.getHight();
        width = obj.getWidth();
        length = obj.getLength();
    }


    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private boolean validateSize(int size) {
        if (size < 0 || size > 150)
            return false;
        return true;
    }

    private int inputSize() {
        Scanner input = new Scanner(System.in);
        int tempValue = 0;

        do {
            System.out.println("Please enter your new size");
            tempValue = input.nextInt();

        } while (!validateSize(tempValue));

        return tempValue;
    }

    public void setHight() {
        this.hight = inputSize();
    }

    public void setWidth() {
        this.width = inputSize();
    }

    public void setLength() {
        this.length = inputSize();
    }

    @Override
    public String toString() {
        return "Box{" +
                "hight=" + hight +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
