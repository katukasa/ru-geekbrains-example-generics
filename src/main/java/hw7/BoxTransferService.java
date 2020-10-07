package hw7;

public class BoxTransferService {

    public <T extends Fruit> Box<T> aggregate(Box<T> from, Box<T> to){
        to.box.addAll(from.box);
        from.box.clear();
        return to;
    }

}
