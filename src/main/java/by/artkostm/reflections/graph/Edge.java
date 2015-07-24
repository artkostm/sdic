package by.artkostm.reflections.graph;

public interface Edge<T, V, D>
{
    Node<T> getInPoint();
    Node<T> getOutPoint();
    D getDirection();
    void setDirection(D direction);
    V getValue();
    void setValue(V value);
}
