package by.artkostm.reflections.processors;

import java.lang.annotation.Annotation;

public interface AnnotationProcessor
{
    Object processAnnotation(final Class<? extends Annotation> annotationClass);
}
