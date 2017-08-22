/*Generated by WaveMaker Studio*/
package com.mobi_29thjune_prod.db123testing.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.mobi_29thjune_prod.db123testing.AllTypes;


/**
 * ServiceImpl object for domain model class AllTypes.
 *
 * @see AllTypes
 */
@Service("DB123Testing.AllTypesService")
public class AllTypesServiceImpl implements AllTypesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AllTypesServiceImpl.class);


    @Autowired
    @Qualifier("DB123Testing.AllTypesDao")
    private WMGenericDao<AllTypes, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<AllTypes, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "DB123TestingTransactionManager")
    @Override
	public AllTypes create(AllTypes allTypes) {
        LOGGER.debug("Creating a new AllTypes with information: {}", allTypes);
        AllTypes allTypesCreated = this.wmGenericDao.create(allTypes);
        return allTypesCreated;
    }

	@Transactional(readOnly = true, value = "DB123TestingTransactionManager")
	@Override
	public AllTypes getById(Integer alltypesId) throws EntityNotFoundException {
        LOGGER.debug("Finding AllTypes by id: {}", alltypesId);
        AllTypes allTypes = this.wmGenericDao.findById(alltypesId);
        if (allTypes == null){
            LOGGER.debug("No AllTypes found with id: {}", alltypesId);
            throw new EntityNotFoundException(String.valueOf(alltypesId));
        }
        return allTypes;
    }

    @Transactional(readOnly = true, value = "DB123TestingTransactionManager")
	@Override
	public AllTypes findById(Integer alltypesId) {
        LOGGER.debug("Finding AllTypes by id: {}", alltypesId);
        return this.wmGenericDao.findById(alltypesId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "DB123TestingTransactionManager")
	@Override
	public AllTypes update(AllTypes allTypes) throws EntityNotFoundException {
        LOGGER.debug("Updating AllTypes with information: {}", allTypes);
        this.wmGenericDao.update(allTypes);

        Integer alltypesId = allTypes.getId();

        return this.wmGenericDao.findById(alltypesId);
    }

    @Transactional(value = "DB123TestingTransactionManager")
	@Override
	public AllTypes delete(Integer alltypesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting AllTypes with id: {}", alltypesId);
        AllTypes deleted = this.wmGenericDao.findById(alltypesId);
        if (deleted == null) {
            LOGGER.debug("No AllTypes found with id: {}", alltypesId);
            throw new EntityNotFoundException(String.valueOf(alltypesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "DB123TestingTransactionManager")
	@Override
	public Page<AllTypes> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all AllTypes");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "DB123TestingTransactionManager")
    @Override
    public Page<AllTypes> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all AllTypes");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "DB123TestingTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service DB123Testing for table AllTypes to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "DB123TestingTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "DB123TestingTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

