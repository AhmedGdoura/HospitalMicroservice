package com.project.planning.planning;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "planning")
public class Planning {

	 @Id
	    private int _id;
	    private String nomd;
	    private List<Disponibilite> Dispo;


	    public int getId() {
	        return _id;
	    }

	    public void setId(int id) {
	        this._id = id;
	    }

	    public String getNomd() {
	        return nomd;
	    }

	    public void setNomd(String nomd) {
	        this.nomd = nomd;
	    }
		public List<Disponibilite> getDispo() {
			return Dispo;
		}

		public void setDispo(List<Disponibilite> dispo) {
			Dispo = dispo;
		}

	    @Override
	    public String toString() {
	        return "User (_id=" + _id + ", nom=" + nomd + ", dateDispo" + Dispo+ ")";
	    }


}
