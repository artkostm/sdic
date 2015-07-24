package by.artkostm.reflections.context.builders.impl;

import java.lang.reflect.Method;

import by.artkostm.reflections.context.builders.ClassWrapper;

public class ClassWrapperImpl implements ClassWrapper
{
    private final Class<?> clazz;
    private final Method initMethod;
    private final Method preDestroyMethod;
    private final Method postConstructMethod;
    
    public ClassWrapperImpl(Class<?> clazz, Method initMethod, Method preDestroyMethod, Method postConstructMethod)
    {
        super();
        this.clazz = clazz;
        this.initMethod = initMethod;
        this.preDestroyMethod = preDestroyMethod;
        this.postConstructMethod = postConstructMethod;
    }

    @Override
    public Class<?> getClazz()
    {
        return clazz;
    }

    @Override
    public Method getInitMethod()
    {
        return initMethod;
    }

    @Override
    public Method getPreDestroyMethod()
    {
        return preDestroyMethod;
    }

    @Override
    public Method getPostConstructMethod()
    {
        return postConstructMethod;
    }
}
