import java.util.Observable;

public abstract class Expression <E> extends Observable {
    abstract E evaluate();
}
