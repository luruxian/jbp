package com.jbp.model;

import java.io.Serializable;
import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;

@Model(schemaVersion = 1)
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute
    private String birthday;
    
    @Attribute
    private String country;

    @Attribute
    private String email;

    @Attribute
    private String sex;

    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Attribute
    private Date enterday;

    @Attribute
    private String memo;

    @Attribute
    private String riskType;
    
    @Attribute
    private String tel;

    @Attribute(primaryKey = true)
    private Key userId;

    @Attribute
    private String userName;

    @Attribute(version = true)
    private Long version;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Users other = (Users) obj;
        if (userId == null) {
            if (other.userId != null) {
                return false;
            }
        } else if (!userId.equals(other.userId)) {
            return false;
        }
        return true;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public Date getEnterday() {
        return enterday;
    }

    public String getMemo() {
        return memo;
    }

    public String getRiskType() {
        return riskType;
    }

    public String getTel() {
        return tel;
    }

    public Key getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        return result;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setEnterday(Date enterday) {
        this.enterday = enterday;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

   
    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setUserId(Key userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}
