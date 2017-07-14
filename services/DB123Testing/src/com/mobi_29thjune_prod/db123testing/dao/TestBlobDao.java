/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/
package com.mobi_29thjune_prod.db123testing.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.mobi_29thjune_prod.db123testing.TestBlob;

/**
 * Specifies methods used to obtain and modify TestBlob related information
 * which is stored in the database.
 */
@Repository("DB123Testing.TestBlobDao")
public class TestBlobDao extends WMGenericDaoImpl<TestBlob, Integer> {

    @Autowired
    @Qualifier("DB123TestingTemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}
