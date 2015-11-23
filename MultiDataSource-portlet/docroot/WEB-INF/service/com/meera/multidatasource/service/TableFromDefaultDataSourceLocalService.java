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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the table from default data source local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author E5410
 * @see TableFromDefaultDataSourceLocalServiceUtil
 * @see com.meera.multidatasource.service.base.TableFromDefaultDataSourceLocalServiceBaseImpl
 * @see com.meera.multidatasource.service.impl.TableFromDefaultDataSourceLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TableFromDefaultDataSourceLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TableFromDefaultDataSourceLocalServiceUtil} to access the table from default data source local service. Add custom service methods to {@link com.meera.multidatasource.service.impl.TableFromDefaultDataSourceLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the table from default data source to the database. Also notifies the appropriate model listeners.
	*
	* @param tableFromDefaultDataSource the table from default data source
	* @return the table from default data source that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource addTableFromDefaultDataSource(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new table from default data source with the primary key. Does not add the table from default data source to the database.
	*
	* @param IFDDSId the primary key for the new table from default data source
	* @return the new table from default data source
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource createTableFromDefaultDataSource(
		long IFDDSId);

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
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the table from default data source from the database. Also notifies the appropriate model listeners.
	*
	* @param tableFromDefaultDataSource the table from default data source
	* @return the table from default data source that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource deleteTableFromDefaultDataSource(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.meera.multidatasource.model.TableFromDefaultDataSource fetchTableFromDefaultDataSource(
		long IFDDSId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the table from default data source with the primary key.
	*
	* @param IFDDSId the primary key of the table from default data source
	* @return the table from default data source
	* @throws PortalException if a table from default data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.meera.multidatasource.model.TableFromDefaultDataSource getTableFromDefaultDataSource(
		long IFDDSId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.meera.multidatasource.model.TableFromDefaultDataSource> getTableFromDefaultDataSources(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of table from default data sources.
	*
	* @return the number of table from default data sources
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTableFromDefaultDataSourcesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the table from default data source in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tableFromDefaultDataSource the table from default data source
	* @return the table from default data source that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromDefaultDataSource updateTableFromDefaultDataSource(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;
}