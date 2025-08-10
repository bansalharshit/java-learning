package ems;

import java.time.LocalDate;

public class EmployeeWorkOn {
    private Project project;
    private int durationInMonth;
    private LocalDate startDate;

    public EmployeeWorkOn(Project project, int durationInMonth, LocalDate startDate) {
        this.project = project;
        this.durationInMonth = durationInMonth;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "EmployeeWorkOn{" +
                "project=" + project +
                ", durationInMonth=" + durationInMonth +
                ", startDate=" + startDate +
                '}';
    }
}
