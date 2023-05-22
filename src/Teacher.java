import java.util.ArrayList;

public class Teacher implements IObservable{
    public EducationInfo educationInfo;
    public ArrayList<IObserver> observers;

    public Teacher()
    {
        educationInfo = new EducationInfo();
        observers = new ArrayList<IObserver>();
    }

    public void registerObserver(IObserver o)
    {
        observers.add(o);
    }

    public void removeObserver(IObserver o)
    {
        observers.remove(o);
    }

    public void notifyObservers()
    {
        for (IObserver o : observers)
        {
            o.update(educationInfo);
        }
    }

    public void estimate()
    {
        System.out.println("Marks: ");
        for (IObserver observer : observers)
        {
            if (educationInfo.getMark().containsKey(observer))
            {
                educationInfo.getMark().put(observer,(int)((Math.random()*4)+2));
            }
            else
            {
                educationInfo.getMark().put(observer, (int)((Math.random()*4)+2));
            }
        }
        notifyObservers();
    }

}
