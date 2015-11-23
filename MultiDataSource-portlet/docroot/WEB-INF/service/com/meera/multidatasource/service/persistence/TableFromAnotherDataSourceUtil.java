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

package com.meera.multidatasource.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.meera.multidatasource.model.TableFromAnotherDataSource;

import java.util.List;

/**
 * The persistence utility for the table from another data source service. This utility wraps {@link TableFromAnotherDataSourcePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see TableFromAnotherDataSourcePersistence
 * @see TableFromAnotherDataSourcePersistenceImpl
 * @generated
 */
public class TableFromAnotherDataSourceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		TableFromAnotherDataSource tableFromAnotherDataSource) {
		getPersistence().clearCache(tableFromAnotherDataSource);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TableFromAnotherDataSource> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TableFromAnotherDataSource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TableFromAnotherDataSource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TableFromAnotherDataSource update(
		TableFromAnotherDataSource tableFromAnotherDataSource, boolean merge)
		throws SystemException {
		return getPersistence().update(tableFromAnotherDataSource, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TableFromAnotherDataSource update(
		TableFromAnotherDataSource tableFromAnotherDataSource, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(tableFromAnotherDataSource, merge, serviceContext);
	}

	/**
	* Caches the table from another data source in the entity cache if it is enabled.
	*
	* @param tableFromAnotherDataSource the table from another data source
	*/
	public static void cacheResult(
		com.meera.multidatasource.model.TableFromAnotherDataSource tableFromAnotherDataSource) {
		getPersistence().cacheResult(tableFromAnotherDataSource);
	}

	/**
	* Caches the table from another data sources in the entity cache if it is enabled.
	*
	* @param tableFromAnotherDataSources the table from another data sources
	*/
	public static void cacheResult(
		java.util.List<com.meera.multidatasource.model.TableFromAnotherDataSource> tableFromAnotherDataSources) {
		getPersistence().cacheResult(tableFromAnotherDataSources);
	}

	/**
	* Creates a new table from another data source with the primary key. Does not add the table from another data source to the database.
	*
	* @param IFADSId the primary key for the new table from another data source
	* @return the new table from another data source
	*/
	public static com.meera.multidatasource.model.TableFromAnotherDataSource create(
		long IFADSId) {
		return getPersistence().create(IFADSId);
	}

	/**
	* Removes the table from another data source with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param IFADSId the primary key of the table from another data source
	* @return the table from another data source that was removed
	* @throws com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException if a table from another data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.multidatasource.model.TableFromAnotherDataSource remove(
		long IFADSId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException {
		return getPersistence().remove(IFADSId);
	}

	public static com.meera.multidatasource.model.TableFromAnotherDataSource updateImpl(
		com.meera.multidatasource.model.TableFromAnotherDataSource tableFromAnotherDataSource,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tableFromAnotherDataSource, merge);
	}

	/**
	* Returns the table from another data source with the primary key or throws a {@link com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException} if it could not be found.
	*
	* @param IFADSId the primary key of the table from another data source
	* @return the table from another data source
	* @throws com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException if a table from another data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.multidatasource.model.TableFromAnotherDataSource findByPrimaryKey(
		long IFADSId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException {
		return getPersistence().findByPrimaryKey(IFADSId);
	}

	/**
	* Returns the table from another data source with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param IFADSId the primary key of the table from another data source
	* @return the table from another data source, or <code>null</code> if a table from another data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.multidatasource.model.TableFromAnotherDataSource fetchByPrimaryKey(
		long IFADSId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(IFADSId);
	}

	/**
	* Returns all the table from another data sources.
	*
	* @return the table from another data sources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.multidatasource.model.TableFromAnotherDataSource> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the table from another data sources.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of table from another data sources
	* @param end the upper bound of the range of table from another data sources (not inclusive)
	* @return the range of table from another data sources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.multidatasource.model.TableFromAnotherDataSource> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the table from another data sources.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of table from another data sources
	* @param end the upper bound of the range of table from another data sources (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of table from another data sources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.multidatasource.model.TableFromAnotherDataSource> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the table from another data sources from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of table from another data sources.
	*
	* @return the number of table from another data sources
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TableFromAnotherDataSourcePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TableFromAnotherDataSourcePersistence)PortletBeanLocatorUtil.locate(com.meera.multidatasource.service.ClpSerializer.getServletContextName(),
					TableFromAnotherDataSourcePersistence.class.getName());

			ReferenceRegistry.registerReference(TableFromAnotherDataSourceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		TableFromAnotherDataSourcePersistence persistence) {
	}

	private static TableFromAnotherDataSourcePersistence _persistence;
}