/*
    Overloading Constructors
*/

package Classes;

class Box {
    
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {

        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        
        width = height = depth = len;
    }

    double volume() {
        
        return width * height * depth;
    }
}

class BoxDemo {
    
    public static void main(String[] args) {

        Box myBox = new Box(10, 20, 15);
        System.out.println("Volume is " + myBox.volume());

        Box myBox2 = new Box();
        System.out.println("Volume is " + myBox2.volume());

        // Cube
        Box myBox3 = new Box(7);
        System.out.println("Volume is " + myBox3.volume());
    }
}
