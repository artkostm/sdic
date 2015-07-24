package by.artkostm.reflections.graph.impl.node;

import by.artkostm.reflections.graph.Node;

public interface BeanWrapper extends Node<Object>
{
    String getName();
    BeanScope getScope();
    
    public enum BeanScope
    {
        Singleton, Prototype;
    }
}
