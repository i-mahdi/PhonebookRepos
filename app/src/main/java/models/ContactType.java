package models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Seven on 2015/11/23.
 */
@Table(name = "ContactTypes")
public class ContactType extends Model {

    @Column(name="ContactType")
    private String _ContactType;

    public ContactType(){
        super();
    }

    public ContactType(String ContactType){
        super();
        this._ContactType = ContactType;
    }

    public String getContactType(){
        return this._ContactType;
    }

    public void setContactType(String ContactType){
        this._ContactType = ContactType;
    }
}
