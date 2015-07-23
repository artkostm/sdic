package by.artkostm.reflections.context;

public interface BeanWrapper
{
    String getName();
    Object getBean();
    BeanScope getScope();
    void setScope(BeanScope scope);
    
    public enum BeanScope
    {
        Singleton, Prototype;
    }
}
