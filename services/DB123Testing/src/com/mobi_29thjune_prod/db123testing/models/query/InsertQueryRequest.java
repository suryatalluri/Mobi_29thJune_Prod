/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/
package com.mobi_29thjune_prod.db123testing.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class InsertQueryRequest implements Serializable {


    @JsonProperty("Name")
    @NotNull
    private String name;

    @JsonProperty("City")
    @NotNull
    private String city;

    @JsonProperty(value = "Icon", access = Access.READ_ONLY)
    private byte[] icon;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public byte[] getIcon() {
        return this.icon;
    }

    public void setIcon(byte[] icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InsertQueryRequest)) return false;
        final InsertQueryRequest insertQueryRequest = (InsertQueryRequest) o;
        return Objects.equals(getName(), insertQueryRequest.getName()) &&
                Objects.equals(getCity(), insertQueryRequest.getCity()) &&
                Objects.equals(getIcon(), insertQueryRequest.getIcon());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),
                getCity(),
                getIcon());
    }
}
