package by.artkostm.reflections.graph.impl.node;

public class BeanWrapperImpl implements BeanWrapper
{
    private Object bean;
    private String name;
    private BeanScope scope;
    
    public BeanWrapperImpl(String name, BeanScope scope)
    {
        super();
        this.name = name;
        this.scope = scope;
    }

    @Override
    public Object getValue()
    {
        return bean;
    }

    @Override
    public void setValue(Object value)
    {
        bean = value;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public BeanScope getScope()
    {
        return scope;
    }
}
