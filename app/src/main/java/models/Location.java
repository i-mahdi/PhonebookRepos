package models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Seven on 2015/11/23.
 */
@Table(name = "Locations")
public class Location extends Model {

    @Column(name="LocationDesc")
    private String _LocationDescription;

    public Location(){
        super();
    }

    public Location(String LocationDescription){
        super();
        this._LocationDescription = LocationDescription;
    }

    public String getLocationDescription(){
        return this._LocationDescription;
    }

    public void setLocationDescription(String LocationDescription){
        this._LocationDescription = LocationDescription;
    }
}
