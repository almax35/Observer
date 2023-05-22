public class Deconat {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Group group1 = new Group("g1", teacher);
        Group group2 = new Group("g2", teacher);
        Group group3 = new Group("g3", teacher);
        teacher.estimate();
        group3.dropOut();
        teacher.estimate();
        teacher.estimate();
        teacher.estimate();
        teacher.estimate();
    }


}
