/*Generated by WaveMaker Studio*/
package com.mobi_29thjune_prod.test_notables.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.mobi_29thjune_prod.test_notables.Table2;
import com.mobi_29thjune_prod.test_notables.service.Table2Service;


/**
 * Controller object for domain model class Table2.
 * @see Table2
 */
@RestController("test_notables.Table2Controller")
@Api(value = "Table2Controller", description = "Exposes APIs to work with Table2 resource.")
@RequestMapping("/test_notables/Table2")
public class Table2Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Table2Controller.class);

    @Autowired
	@Qualifier("test_notables.Table2Service")
	private Table2Service table2Service;

	@ApiOperation(value = "Creates a new Table2 instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Table2 createTable2(@RequestBody Table2 table2) {
		LOGGER.debug("Create Table2 with information: {}" , table2);

		table2 = table2Service.create(table2);
		LOGGER.debug("Created Table2 with information: {}" , table2);

	    return table2;
	}


    @ApiOperation(value = "Returns the Table2 instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Table2 getTable2(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Table2 with id: {}" , id);

        Table2 foundTable2 = table2Service.getById(id);
        LOGGER.debug("Table2 details with id: {}" , foundTable2);

        return foundTable2;
    }

    @ApiOperation(value = "Updates the Table2 instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Table2 editTable2(@PathVariable("id") Integer id, @RequestBody Table2 table2) throws EntityNotFoundException {
        LOGGER.debug("Editing Table2 with id: {}" , table2.getId());

        table2.setId(id);
        table2 = table2Service.update(table2);
        LOGGER.debug("Table2 details with id: {}" , table2);

        return table2;
    }

    @ApiOperation(value = "Deletes the Table2 instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteTable2(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Table2 with id: {}" , id);

        Table2 deletedTable2 = table2Service.delete(id);

        return deletedTable2 != null;
    }

    /**
     * @deprecated Use {@link #findTable2s(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Table2 instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Table2> searchTable2sByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Table2s list");
        return table2Service.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Table2 instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Table2> findTable2s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Table2s list");
        return table2Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Table2 instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Table2> filterTable2s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Table2s list");
        return table2Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportTable2s(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return table2Service.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of Table2 instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countTable2s( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Table2s");
		return table2Service.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getTable2AggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return table2Service.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service Table2Service instance
	 */
	protected void setTable2Service(Table2Service service) {
		this.table2Service = service;
	}

}

