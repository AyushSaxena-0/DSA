package OOPS.Lecture_3_Part_1;
//This is example of Multi Level Inheritance

//          Box
//           |
//        BoxWeight
//           |
//        BoxPrice

public class BoxPrice extends BoxWeight {
    double cost;

    public BoxPrice() {
        this.cost=-1;
    }
    public BoxPrice(double cost) {
        super();
        this.cost = cost;
    }
    public BoxPrice(int length,int width,int height,int weight,double cost) {
        super(length,width,height,weight);
        this.cost=cost;
    }
    public BoxPrice(BoxPrice other){
        super(other);
        this.weight=other.weight;
    }

    public BoxPrice(int side, int weight, int cost) {
        super(side,weight);
        this.cost=cost;
    }
}
