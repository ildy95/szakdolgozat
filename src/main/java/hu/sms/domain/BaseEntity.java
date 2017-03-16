package hu.sms.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
public abstract class BaseEntity {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_SEQ")
    @SequenceGenerator(name="ID_SEQ",sequenceName="ID_SEQUENCE")        
	private Long id;
	
	@Column(name = "CREATED_BY")
	@CreatedBy
	private String createdBy;
	
	@Column(name = "MODIFIED_BY")
	@LastModifiedBy
	private String modifiedBy;
	
	@Column(name = "CREATED_DATE")
	@CreatedDate
	private LocalDateTime createdDate;
	
	@Column(name = "MODIFIED_DATE")
	@LastModifiedDate
	private LocalDateTime modifiedDate;
	
	@Column(name = "REMOVED")
	private Boolean removed = false;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return the modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * @param modifiedBy the modifiedBy to set
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * @return the createdDate
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return the modifiedDate
     */
    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    /**
     * @param modifiedDate the modifiedDate to set
     */
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * @return the removed
     */
    public Boolean getRemoved() {
        return removed;
    }

    /**
     * @param removed the removed to set
     */
    public void setRemoved(Boolean removed) {
        this.removed = removed;
    }

}
