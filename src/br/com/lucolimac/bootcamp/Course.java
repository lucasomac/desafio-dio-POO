package br.com.lucolimac.bootcamp;

public class Course extends Content {

    private int workload;

    @Override
    public double calculateXp() {
        return XP_DEFAULT * workload;
    }

    public Course() {
    }


    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return String.format("Course{title='%s', description='%s', workload=%d}", getTitle(), getDescription(), getWorkload());
    }
}
