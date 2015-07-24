package by.artkostm.reflections.context.builders;

public interface Builder<T, P>
{
    T build(P param, Object...args);
}
