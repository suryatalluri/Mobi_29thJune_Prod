/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/
package com.mobi_29thjune_prod.db123testing;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * AllTypes generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`AllTypes`")
public class AllTypes implements Serializable {

    private Integer id;
    private byte byteCol;
    private short shortCol;
    private int intCol;
    private long longCol;
    private double floatCol;
    private BigDecimal doubleCol;
    private BigInteger bigintCol;
    private BigDecimal bigdecCol;
    private String stringCol;
    private String textCol;
    private String clobCol;
    private Date dateCol;
    @Type(type = "DateTime")
    private LocalDateTime datetimeCol;
    private Time timeCol;
    @Type(type = "DateTime")
    private LocalDateTime timestampCol;
    private boolean booleanCol;
    @JsonProperty(access = Access.READ_ONLY)
    private byte[] blobCol;

    @Id
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`BYTE COL`", nullable = false, scale = 0, precision = 2)
    public byte getByteCol() {
        return this.byteCol;
    }

    public void setByteCol(byte byteCol) {
        this.byteCol = byteCol;
    }

    @Column(name = "`SHORT COL`", nullable = false, scale = 0, precision = 5)
    public short getShortCol() {
        return this.shortCol;
    }

    public void setShortCol(short shortCol) {
        this.shortCol = shortCol;
    }

    @Column(name = "`INT COL`", nullable = false, scale = 0, precision = 10)
    public int getIntCol() {
        return this.intCol;
    }

    public void setIntCol(int intCol) {
        this.intCol = intCol;
    }

    @Column(name = "`LONG COL`", nullable = false, scale = 0, precision = 18)
    public long getLongCol() {
        return this.longCol;
    }

    public void setLongCol(long longCol) {
        this.longCol = longCol;
    }

    @Column(name = "`FLOAT COL`", nullable = false, scale = 4, precision = 8)
    public double getFloatCol() {
        return this.floatCol;
    }

    public void setFloatCol(double floatCol) {
        this.floatCol = floatCol;
    }

    @Column(name = "`DOUBLE COL`", nullable = false, scale = 8, precision = 18)
    public BigDecimal getDoubleCol() {
        return this.doubleCol;
    }

    public void setDoubleCol(BigDecimal doubleCol) {
        this.doubleCol = doubleCol;
    }

    @Column(name = "`BIGINT COL`", nullable = false, scale = 0, precision = 35)
    public BigInteger getBigintCol() {
        return this.bigintCol;
    }

    public void setBigintCol(BigInteger bigintCol) {
        this.bigintCol = bigintCol;
    }

    @Column(name = "`BIGDEC COL`", nullable = false, scale = 15, precision = 35)
    public BigDecimal getBigdecCol() {
        return this.bigdecCol;
    }

    public void setBigdecCol(BigDecimal bigdecCol) {
        this.bigdecCol = bigdecCol;
    }

    @Column(name = "`STRING COL`", nullable = false, length = 255)
    public String getStringCol() {
        return this.stringCol;
    }

    public void setStringCol(String stringCol) {
        this.stringCol = stringCol;
    }

    @Column(name = "`TEXT COL`", nullable = false, length = 255)
    public String getTextCol() {
        return this.textCol;
    }

    public void setTextCol(String textCol) {
        this.textCol = textCol;
    }

    @Column(name = "`CLOB  COL`", nullable = false, length = 255)
    public String getClobCol() {
        return this.clobCol;
    }

    public void setClobCol(String clobCol) {
        this.clobCol = clobCol;
    }

    @Column(name = "`DATE_COL`", nullable = false)
    public Date getDateCol() {
        return this.dateCol;
    }

    public void setDateCol(Date dateCol) {
        this.dateCol = dateCol;
    }

    @Column(name = "`DATETIME COL`", nullable = false)
    public LocalDateTime getDatetimeCol() {
        return this.datetimeCol;
    }

    public void setDatetimeCol(LocalDateTime datetimeCol) {
        this.datetimeCol = datetimeCol;
    }

    @Column(name = "`TIME COL`", nullable = false)
    public Time getTimeCol() {
        return this.timeCol;
    }

    public void setTimeCol(Time timeCol) {
        this.timeCol = timeCol;
    }

    @Column(name = "`TIMESTAMP COL`", nullable = false)
    public LocalDateTime getTimestampCol() {
        return this.timestampCol;
    }

    public void setTimestampCol(LocalDateTime timestampCol) {
        this.timestampCol = timestampCol;
    }

    @Column(name = "`BOOLEAN COL`", nullable = false)
    public boolean isBooleanCol() {
        return this.booleanCol;
    }

    public void setBooleanCol(boolean booleanCol) {
        this.booleanCol = booleanCol;
    }

    @Column(name = "`BLOB COL`", nullable = false)
    public byte[] getBlobCol() {
        return this.blobCol;
    }

    public void setBlobCol(byte[] blobCol) {
        this.blobCol = blobCol;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AllTypes)) return false;
        final AllTypes allTypes = (AllTypes) o;
        return Objects.equals(getId(), allTypes.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

