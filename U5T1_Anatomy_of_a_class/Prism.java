package U5T1_Anatomy_of_a_class;

public class Prism {
    private int length;
    private int width;
    private int height;

    Prism(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String dimensions(){
        return "Length = " + length + ",\nWidth = " + width + ",\nHeight = " + height;
    }

    public int volume(){
        return length * width * height;
    }

    public int surfaceArea(){
        return length * width * 2 + length * height * 2 + width * height * 2;
    }
    
}
