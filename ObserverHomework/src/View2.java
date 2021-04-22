class View2 implements Observer {
    private Student student;

    public View2(Student s) {
        this.student = s;
    }

    public void update() {
        System.out.println("View2:" + student.getId() + student.getBirth());
    }
}