package models;

/**
 * Created by Seven on 2015/11/23.
 */
public class Person {
    private int _Pid;
    private String _FirstName;
    private String _LastName;

    public Person(String Fname, String Lname){
        this._FirstName = Fname;
        this._LastName = Lname;
    }

    public String getFirstName(){
        return this._FirstName;
    }

    public void setFirstName(String Fname){
        this._FirstName = Fname;
    }

    public String getLastName(){
        return this._LastName;
    }

    public void setLastName(String Lname){
        this._LastName = Lname;
    }
}
