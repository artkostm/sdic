package by.artkostm.reflections.context.builders;

import java.lang.reflect.Method;

public interface ClassWrapper
{
    Class<?> getClazz();
    Method getInitMethod();
    Method getPreDestroyMethod();
    Method getPostConstructMethod();
}
