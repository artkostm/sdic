package by.artkostm.reflections;
import java.util.HashSet;
import java.util.Set;

import by.artkostm.reflections.scanners.ClassScanner;
import by.artkostm.reflections.scanners.PackageClassScanner;

public class Stub
{
    public static void main(String[] args)
    {
        final Set<Class<?>> classes = getAnnotatedClasses();
        for (Class<?> cls : classes)
        {
            System.out.println("Name: " + cls.getName() + " Interface: " + cls.isInterface());
        }
    }
    
    private static Set<Class<?>> getAnnotatedClasses()
    {
        ClassScanner<Class<?>, String> classScanner = new PackageClassScanner();
        final Set<Class<?>> classes = classScanner.scan("org.reflections");
        Set<Class<?>> annotatedCls = new HashSet<>();
        for (Class<?> clazz : classes)
        {
            if (clazz.getAnnotations() != null && clazz.getAnnotations().length > 0)
            {
                annotatedCls.add(clazz);
            }
        }
        return annotatedCls;
    }
}
