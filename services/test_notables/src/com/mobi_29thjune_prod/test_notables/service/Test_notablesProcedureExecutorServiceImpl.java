/*Generated by WaveMaker Studio*/

package com.mobi_29thjune_prod.test_notables.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

@Service
public class Test_notablesProcedureExecutorServiceImpl implements Test_notablesProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test_notablesProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("test_notablesWMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;


}

