/*Generated by WaveMaker Studio*/
package com.mobi_29thjune_prod.jhgjj;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * Table2 generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`TABLE2`")
public class Table2 implements Serializable {

    private Integer id;
    private String column2;
    @JsonProperty(access = Access.READ_ONLY)
    private byte[] column3;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`COLUMN2`", nullable = true, length = 255)
    public String getColumn2() {
        return this.column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    @Column(name = "`COLUMN3`", nullable = true)
    public byte[] getColumn3() {
        return this.column3;
    }

    public void setColumn3(byte[] column3) {
        this.column3 = column3;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table2)) return false;
        final Table2 table2 = (Table2) o;
        return Objects.equals(getId(), table2.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

