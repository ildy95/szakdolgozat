package hu.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PKR_LAKCIM")
public class Address extends BaseEntity {
    
    @Column(name = "ORSZAG")
    private String orszag; //orr szag

    @Column(name = "IRANYITOSZAM")
    private String iranyitoszam;

    @Column(name = "MEGYE")
    private String megye;

    @Column(name = "VAROS")
    private String varos;

    @Column(name = "UTCA")
    private String utca;

    @Column(name = "HAZSZAM")
    private String hazszam;

}
