package ems;

public class Project {
    private int projectId;
    private String projectName;
    private String projectLocation;

    public Project(int projectId, String projectName, String projectLocation) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectLocation = projectLocation;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectLocation='" + projectLocation + '\'' +
                '}';
    }
}
