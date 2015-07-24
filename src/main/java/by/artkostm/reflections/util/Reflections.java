package by.artkostm.reflections.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public final class Reflections
{
    public static Method findPreDestroyMethod(final Class<?> clazz)
    {
        return findMethodAnnotatedWith(clazz, PreDestroy.class);
    }
    
    public static Method findPostConstructMethod(final Class<?> clazz)
    {
        return findMethodAnnotatedWith(clazz, PostConstruct.class);
    }
    
    public static Method findMethodAnnotatedWith(final Class<?> clazz, Class<? extends Annotation> annotationClass)
    {
        final Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods)
        {
            if (method.isAnnotationPresent(annotationClass))
            {
                return method;
            }
        }
        return null;
    }
}
