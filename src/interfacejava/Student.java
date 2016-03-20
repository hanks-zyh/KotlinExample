package interfacejava;

import org.jetbrains.annotations.NotNull;

/**
 * Created by hanks on 16/3/20.
 */
public class Student implements Person{
    @NotNull
    @Override
    public String name() {
        return "student";
    }
}
