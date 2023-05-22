public class Group implements IObserver{

    private String name;
    IObservable teacher;

    public String getName() {
        return name;
    }

    public Group(String name, IObservable t)
    {
        this.name = name;
        teacher = t;
        teacher.registerObserver(this);
    }
    public void update(Object ob)
    {
        EducationInfo info = (EducationInfo)ob;
        var marks = info.getMark().get(this);
        System.out.println("group "+getName()+" marks: "+marks);
    }

    public void dropOut()
    {
        System.out.println("group "+getName()+" delete");
        teacher.removeObserver(this);
        teacher = null;
    }
}
