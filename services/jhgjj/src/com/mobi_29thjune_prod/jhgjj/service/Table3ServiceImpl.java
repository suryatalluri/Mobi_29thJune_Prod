/*Generated by WaveMaker Studio*/
package com.mobi_29thjune_prod.jhgjj.service;

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

import com.mobi_29thjune_prod.jhgjj.Table3;


/**
 * ServiceImpl object for domain model class Table3.
 *
 * @see Table3
 */
@Service("jhgjj.Table3Service")
public class Table3ServiceImpl implements Table3Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(Table3ServiceImpl.class);


    @Autowired
    @Qualifier("jhgjj.Table3Dao")
    private WMGenericDao<Table3, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Table3, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "jhgjjTransactionManager")
    @Override
	public Table3 create(Table3 table3) {
        LOGGER.debug("Creating a new Table3 with information: {}", table3);
        Table3 table3Created = this.wmGenericDao.create(table3);
        return table3Created;
    }

	@Transactional(readOnly = true, value = "jhgjjTransactionManager")
	@Override
	public Table3 getById(Integer table3Id) throws EntityNotFoundException {
        LOGGER.debug("Finding Table3 by id: {}", table3Id);
        Table3 table3 = this.wmGenericDao.findById(table3Id);
        if (table3 == null){
            LOGGER.debug("No Table3 found with id: {}", table3Id);
            throw new EntityNotFoundException(String.valueOf(table3Id));
        }
        return table3;
    }

    @Transactional(readOnly = true, value = "jhgjjTransactionManager")
	@Override
	public Table3 findById(Integer table3Id) {
        LOGGER.debug("Finding Table3 by id: {}", table3Id);
        return this.wmGenericDao.findById(table3Id);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "jhgjjTransactionManager")
	@Override
	public Table3 update(Table3 table3) throws EntityNotFoundException {
        LOGGER.debug("Updating Table3 with information: {}", table3);
        this.wmGenericDao.update(table3);

        Integer table3Id = table3.getId();

        return this.wmGenericDao.findById(table3Id);
    }

    @Transactional(value = "jhgjjTransactionManager")
	@Override
	public Table3 delete(Integer table3Id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Table3 with id: {}", table3Id);
        Table3 deleted = this.wmGenericDao.findById(table3Id);
        if (deleted == null) {
            LOGGER.debug("No Table3 found with id: {}", table3Id);
            throw new EntityNotFoundException(String.valueOf(table3Id));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "jhgjjTransactionManager")
	@Override
	public Page<Table3> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Table3s");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "jhgjjTransactionManager")
    @Override
    public Page<Table3> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Table3s");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "jhgjjTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service jhgjj for table Table3 to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "jhgjjTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "jhgjjTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

