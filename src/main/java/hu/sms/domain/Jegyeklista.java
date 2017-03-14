package hu.sms.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Jegyeklista")
public class Jegyeklista {

	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private long id;

	    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinColumns({
	        @JoinColumn(name="Jegyeklista_Id",referencedColumnName="Id"),
	        @JoinColumn(name="Jegyek_Id",referencedColumnName="Id")
	    })
	    private List<Jegyek> jegyek;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public List<Jegyek> getJegyek() {
			return jegyek;
		}

		public void setJegyek(List<Jegyek> jegyek) {
			this.jegyek = jegyek;
		}
	    
	    

}
