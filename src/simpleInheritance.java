class Square{
    float length, width;
    public void get(float x, float y){
        length = x;
        width = y;
    }
    float area(){
        return(length * width);
    }
}

class Cube extends Square{
    float height;
    public void getMeasurements(float x, float y, float z){
        get(x,y);
        height = z;
    }
    float volume(){
        return (length * width * height);
    }
}

public class simpleInheritance {
    public static void main(String[] args){
        Cube C = new Cube();
        C.getMeasurements(10,20,30);

        float b1 = C.area();
        System.out.println("Area of the square " + b1);

        float b2 = C.volume();
        System.out.println("Volume of the square " + b2);
    }
}
