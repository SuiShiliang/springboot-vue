package com.ssl.springbootvue.model.pojo;

import java.io.Serializable;

/**
 * address
 * @author 
 */
public class Address implements Serializable {
    /**
     * 地址id
     */
    private String id;

    /**
     * 国家id
     */
    private String countryId;

    /**
     * 省份id
     */
    private String provenceId;

    /**
     * 市 id
     */
    private String cityId;

    /**
     * 区，街道 id
     */
    private String streetId;

    /**
     * 镇id
     */
    private String townId;

    /**
     * 村id
     */
    private String villageId;

    /**
     * 其他的具体地址
     */
    private String another;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getProvenceId() {
        return provenceId;
    }

    public void setProvenceId(String provenceId) {
        this.provenceId = provenceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getStreetId() {
        return streetId;
    }

    public void setStreetId(String streetId) {
        this.streetId = streetId;
    }

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    public String getVillageId() {
        return villageId;
    }

    public void setVillageId(String villageId) {
        this.villageId = villageId;
    }

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Address other = (Address) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getProvenceId() == null ? other.getProvenceId() == null : this.getProvenceId().equals(other.getProvenceId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getStreetId() == null ? other.getStreetId() == null : this.getStreetId().equals(other.getStreetId()))
            && (this.getTownId() == null ? other.getTownId() == null : this.getTownId().equals(other.getTownId()))
            && (this.getVillageId() == null ? other.getVillageId() == null : this.getVillageId().equals(other.getVillageId()))
            && (this.getAnother() == null ? other.getAnother() == null : this.getAnother().equals(other.getAnother()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getProvenceId() == null) ? 0 : getProvenceId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getStreetId() == null) ? 0 : getStreetId().hashCode());
        result = prime * result + ((getTownId() == null) ? 0 : getTownId().hashCode());
        result = prime * result + ((getVillageId() == null) ? 0 : getVillageId().hashCode());
        result = prime * result + ((getAnother() == null) ? 0 : getAnother().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", countryId=").append(countryId);
        sb.append(", provenceId=").append(provenceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", streetId=").append(streetId);
        sb.append(", townId=").append(townId);
        sb.append(", villageId=").append(villageId);
        sb.append(", another=").append(another);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}