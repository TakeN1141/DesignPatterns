class View1 implements Observer {
    private Student student;

    public View1(Student s) {
        this.student = s;
    }

    public void update() {
        System.out.println("View1:" + student.getId() + student.getName());
    }
}