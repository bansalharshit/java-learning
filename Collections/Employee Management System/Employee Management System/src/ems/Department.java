package ems;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private int departmentId;
    private String departmentName;
    private String departmentLocation;
    private Set<Project> projects;

    public Department(int departmentId, String departmentName, String departmentLocation) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentLocation = departmentLocation;
        this.projects = new HashSet<>();
    }

    public String getDepartmentName()
    {
        return departmentName;
    }
    public void addProjects(Project project)
    {
        projects.add(project);
    }
}
