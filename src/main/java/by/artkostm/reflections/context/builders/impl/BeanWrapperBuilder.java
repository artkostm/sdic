package by.artkostm.reflections.context.builders.impl;

import by.artkostm.reflections.context.builders.Builder;
import by.artkostm.reflections.context.builders.ClassWrapper;
import by.artkostm.reflections.graph.impl.node.BeanWrapper;
import by.artkostm.reflections.graph.impl.node.BeanWrapperImpl;
import by.artkostm.reflections.graph.impl.node.BeanWrapper.BeanScope;

public class BeanWrapperBuilder implements Builder<BeanWrapper, ClassWrapper>
{
    @Override
    public BeanWrapper build(final ClassWrapper classWrapper, final Object... args)
    {
        final String beanName = (String) args[0];
        final BeanScope scope = (BeanScope) args[1];
        BeanWrapper beanWrapper = new BeanWrapperImpl(beanName, scope);
        beanWrapper.setValue(new Object());//stub implementation; use factory to create an object; 
        return beanWrapper;
    }
}
