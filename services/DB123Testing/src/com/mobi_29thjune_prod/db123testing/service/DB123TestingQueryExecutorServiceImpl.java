/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.mobi_29thjune_prod.db123testing.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;

import com.mobi_29thjune_prod.db123testing.models.query.InsertQueryRequest;

@Service
public class DB123TestingQueryExecutorServiceImpl implements DB123TestingQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DB123TestingQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("DB123TestingWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "DB123TestingTransactionManager")
    @Override
    public Integer executeInsert_query(InsertQueryRequest insertQueryRequest) {
        Map params = new HashMap(3);

        params.put("Name", insertQueryRequest.getName());
        params.put("City", insertQueryRequest.getCity());
        params.put("Icon", insertQueryRequest.getIcon());

        return queryExecutor.executeNamedQueryForUpdate("insert_query", params);
    }

}


