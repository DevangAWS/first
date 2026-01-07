package Advance_Java.Annotations;
import java.lang.reflect.Method;

class AnnotationProcessor {
    static void main() throws Exception {
        Cat cat = new Cat();
        Class<?> clazz = cat.getClass();

        for(Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(Important.class)) {
                Important annotation = (Important)method.getAnnotation(Important.class);
                int priority = annotation.priority();
                System.out.println("Found Important Method " + method.getName());
                System.out.println("Priority: " + priority);

                for(int i = 0; i < priority; ++i) {
                    method.invoke(cat);
                }
            }
        }

    }
}