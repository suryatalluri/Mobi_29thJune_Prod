/*Generated by WaveMaker Studio*/
package com.mobi_29thjune_prod.jhgjj.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.mobi_29thjune_prod.jhgjj.Table1;

/**
 * Specifies methods used to obtain and modify Table1 related information
 * which is stored in the database.
 */
@Repository("jhgjj.Table1Dao")
public class Table1Dao extends WMGenericDaoImpl<Table1, Integer> {

    @Autowired
    @Qualifier("jhgjjTemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

