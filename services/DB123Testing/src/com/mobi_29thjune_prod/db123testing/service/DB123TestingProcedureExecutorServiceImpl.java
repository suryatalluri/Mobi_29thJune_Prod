/*Generated by WaveMaker Studio*/

package com.mobi_29thjune_prod.db123testing.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

@Service
public class DB123TestingProcedureExecutorServiceImpl implements DB123TestingProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DB123TestingProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("DB123TestingWMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;


}


