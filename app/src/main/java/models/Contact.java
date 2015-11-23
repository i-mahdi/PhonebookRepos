package models;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

/**
 * Created by Seven on 2015/11/23.
 */
@Table(name="Contacts")
public class Contact {
    @Column(name="Person")
    private Person _Person;
    @Column(name="Role")
    private Role _Role;
    @Column(name="Location")
    private Location _Location;
    @Column(name="ContactType")
    private ContactType _ContactType;
    @Column(name="ContactDesc")
    private String _ContactDescription;

    public Person getPerson() {
        return this._Person;
    }
    public void setPerson(Person Person) {
        this._Person = Person;
    }

    public Role getRole() {
        return this._Role;
    }
    public void setRole(Role Role) {
        this._Role = Role;
    }

    public Location getLocation() {
        return this._Location;
    }
    public void setLocation(Location Location) {
        this._Location = Location;
    }

    public ContactType getContactType() {
        return this._ContactType;
    }
    public void setContactType(ContactType ContactType) {
        this._ContactType = ContactType;
    }

    public String getContactDescription() {
        return this._ContactDescription;
    }
    public void setContactDescription(String ContactDescription) {
        this._ContactDescription = ContactDescription;
    }
}
