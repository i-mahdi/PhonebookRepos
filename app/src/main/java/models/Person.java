package models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Seven on 2015/11/23.
 */
@Table(name = "Persons")
public class Person extends Model {

    @Column(name = "Fname")
    private String _FirstName;
    @Column(name = "Lname")
    private String _LastName;

    public Person() {
        super();
    }

    public Person(String Fname, String Lname) {
        super();
        this._FirstName = Fname;
        this._LastName = Lname;
    }

    public String getFirstName() {
        return this._FirstName;
    }

    public void setFirstName(String Fname) {
        this._FirstName = Fname;
    }

    public String getLastName() {
        return this._LastName;
    }

    public void setLastName(String Lname) {
        this._LastName = Lname;
    }
}
