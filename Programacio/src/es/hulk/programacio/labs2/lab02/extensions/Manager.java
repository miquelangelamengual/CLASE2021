package es.hulk.programacio.labs2.lab02.extensions;

import es.hulk.programacio.labs2.lab02.Employee;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Manager extends Employee {

    private String deptName;

    public Manager() {
        super();
    }
}
