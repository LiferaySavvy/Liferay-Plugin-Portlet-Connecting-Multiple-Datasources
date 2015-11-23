/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.meera.multidatasource.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TableFromDefaultDataSourceLocalService}.
 * </p>
 *
 * @author    E5410
 * @see       TableFromDefaultDataSourceLocalService
 * @generated
 */
public class TableFromDefaultDataSourceLocalServiceWrapper
	implements TableFromDefaultDataSourceLocalService,
		ServiceWrapper<TableFromDefaultDataSourceLocalService> {
	public TableFromDefaultDataSourceLocalServiceWrapper(
		TableFromDefaultDataSourceLocalService tableFromDefaultDataSourceLocalService) {
		_tableFromDefaultDataSourceLocalService = tableFromDefaultDataSourceLocalService;
	}

	/**
	* Adds the table from default data source to the database. Also notifies the appropriate model listeners.
	*
	* @param tableFromDefaultDataSource the table from default data source
	* @return the table from default data source that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource addTableFromDefaultDataSource(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.addTableFromDefaultDataSource(tableFromDefaultDataSource);
	}

	/**
	* Creates a new table from default data source with the primary key. Does not add the table from default data source to the database.
	*
	* @param IFDDSId the primary key for the new table from default data source
	* @return the new table from default data source
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource createTableFromDefaultDataSource(
		long IFDDSId) {
		return _tableFromDefaultDataSourceLocalService.createTableFromDefaultDataSource(IFDDSId);
	}

	/**
	* Deletes the table from default data source with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param IFDDSId the primary key of the table from default data source
	* @return the table from default data source that was removed
	* @throws PortalException if a table from default data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource deleteTableFromDefaultDataSource(
		long IFDDSId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.deleteTableFromDefaultDataSource(IFDDSId);
	}

	/**
	* Deletes the table from default data source from the database. Also notifies the appropriate model listeners.
	*
	* @param tableFromDefaultDataSource the table from default data source
	* @return the table from default data source that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource deleteTableFromDefaultDataSource(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.deleteTableFromDefaultDataSource(tableFromDefaultDataSource);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tableFromDefaultDataSourceLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.meera.multidatasource.model.TableFromDefaultDataSource fetchTableFromDefaultDataSource(
		long IFDDSId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.fetchTableFromDefaultDataSource(IFDDSId);
	}

	/**
	* Returns the table from default data source with the primary key.
	*
	* @param IFDDSId the primary key of the table from default data source
	* @return the table from default data source
	* @throws PortalException if a table from default data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource getTableFromDefaultDataSource(
		long IFDDSId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.getTableFromDefaultDataSource(IFDDSId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the table from default data sources.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of table from default data sources
	* @param end the upper bound of the range of table from default data sources (not inclusive)
	* @return the range of table from default data sources
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.multidatasource.model.TableFromDefaultDataSource> getTableFromDefaultDataSources(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.getTableFromDefaultDataSources(start,
			end);
	}

	/**
	* Returns the number of table from default data sources.
	*
	* @return the number of table from default data sources
	* @throws SystemException if a system exception occurred
	*/
	public int getTableFromDefaultDataSourcesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.getTableFromDefaultDataSourcesCount();
	}

	/**
	* Updates the table from default data source in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tableFromDefaultDataSource the table from default data source
	* @return the table from default data source that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource updateTableFromDefaultDataSource(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.updateTableFromDefaultDataSource(tableFromDefaultDataSource);
	}

	/**
	* Updates the table from default data source in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tableFromDefaultDataSource the table from default data source
	* @param merge whether to merge the table from default data source with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the table from default data source that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource updateTableFromDefaultDataSource(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tableFromDefaultDataSourceLocalService.updateTableFromDefaultDataSource(tableFromDefaultDataSource,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tableFromDefaultDataSourceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tableFromDefaultDataSourceLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tableFromDefaultDataSourceLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TableFromDefaultDataSourceLocalService getWrappedTableFromDefaultDataSourceLocalService() {
		return _tableFromDefaultDataSourceLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTableFromDefaultDataSourceLocalService(
		TableFromDefaultDataSourceLocalService tableFromDefaultDataSourceLocalService) {
		_tableFromDefaultDataSourceLocalService = tableFromDefaultDataSourceLocalService;
	}

	public TableFromDefaultDataSourceLocalService getWrappedService() {
		return _tableFromDefaultDataSourceLocalService;
	}

	public void setWrappedService(
		TableFromDefaultDataSourceLocalService tableFromDefaultDataSourceLocalService) {
		_tableFromDefaultDataSourceLocalService = tableFromDefaultDataSourceLocalService;
	}

	private TableFromDefaultDataSourceLocalService _tableFromDefaultDataSourceLocalService;
}