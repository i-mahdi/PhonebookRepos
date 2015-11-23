package models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Seven on 2015/11/23.
 */
@Table(name = "Roles")
public class Role extends Model {

    @Column(name="RoleDesc")
    private String _RoleDescription;

    public Role(){
        super();
    }

    public Role(String RoleDesc){
        super();
        this._RoleDescription = RoleDesc;
    }

    public String getRoleDescription(){
        return this._RoleDescription;
    }

    public void setRoleDescription(String RoleDesc){
        this._RoleDescription = RoleDesc;
    }
}
