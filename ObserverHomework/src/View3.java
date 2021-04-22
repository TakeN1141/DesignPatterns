class View3 {
    private Student student;

    public View3(Student s) {
        this.student = s;
    }

    public void changeStudent() {
        student.setId(2+1);
    }
}
