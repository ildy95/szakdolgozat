package hu.sms.domain.user;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import hu.sms.domain.Address;
import hu.sms.domain.BaseEntity;
import hu.sms.domain.enums.Sex;

@Entity
@Table(name = "KTR_USER")
public class User extends BaseEntity {
    
    @Column(name = "USERNAME", unique = true, nullable = false, length = 50)
    private String felhasznaloNev;
    
    @Column(name = "NAME", length = 150)
    private String nev;
    
    @Column(name = "PASSWORD", nullable = false, length = 50)
    private String jelszo;
    
    @Column(name = "EMAIL_ADDRESS", nullable = false, length = 100)
    private String emailCim;
    
    @Column(name = "PHONE_NUMBER", length = 100)
    private String telefonSzam;
    
    @Column(name = "MOBILE_NUMBER", length = 100)
    private String mobilSzam;
    
    @Column(name = "SZEM_IG_SZAM", length = 10)
    private String szemelyiIgSzam;
    
    @Column(name = "NEM")
    private Sex nem;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LAKCIM_ID")
    private Address lakcim;
    
    @Column(name = "LOCALE", length = 20)
    private String locale;
    
    
    @ElementCollection(targetClass = UserRole.class)
    @CollectionTable(name = "KTR_USER_ROLE", joinColumns = @JoinColumn(name = "USER_ROLE_ID"))
    @Column(name = "ROLE_ID")
    private List<UserRole> userRoles;
 

}
