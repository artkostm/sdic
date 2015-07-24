package by.artkostm.reflections.graph;

import java.util.Collection;

public interface Graph<T, V, D>
{
    Collection<? extends Node<T>> getNodes();
    Collection<? extends Edge<T, V, D>> getEdges();
    Node<T> createNode(T value);
    Edge<T, V, D> createEdge(Node<T> in, Node<T> out, D direstion, V value);
    void deleteNode(Node<T> node);
    void deleteEdge(Edge<T, V, D> edge);
    String getName();
    void setName(String name);
}
