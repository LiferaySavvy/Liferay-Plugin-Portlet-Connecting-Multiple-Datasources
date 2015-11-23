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

import com.meera.multidatasource.model.TableFromDefaultDataSource;

import java.util.List;

/**
 * The persistence utility for the table from default data source service. This utility wraps {@link TableFromDefaultDataSourcePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see TableFromDefaultDataSourcePersistence
 * @see TableFromDefaultDataSourcePersistenceImpl
 * @generated
 */
public class TableFromDefaultDataSourceUtil {
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
		TableFromDefaultDataSource tableFromDefaultDataSource) {
		getPersistence().clearCache(tableFromDefaultDataSource);
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
	public static List<TableFromDefaultDataSource> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TableFromDefaultDataSource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TableFromDefaultDataSource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TableFromDefaultDataSource update(
		TableFromDefaultDataSource tableFromDefaultDataSource, boolean merge)
		throws SystemException {
		return getPersistence().update(tableFromDefaultDataSource, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TableFromDefaultDataSource update(
		TableFromDefaultDataSource tableFromDefaultDataSource, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(tableFromDefaultDataSource, merge, serviceContext);
	}

	/**
	* Caches the table from default data source in the entity cache if it is enabled.
	*
	* @param tableFromDefaultDataSource the table from default data source
	*/
	public static void cacheResult(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource) {
		getPersistence().cacheResult(tableFromDefaultDataSource);
	}

	/**
	* Caches the table from default data sources in the entity cache if it is enabled.
	*
	* @param tableFromDefaultDataSources the table from default data sources
	*/
	public static void cacheResult(
		java.util.List<com.meera.multidatasource.model.TableFromDefaultDataSource> tableFromDefaultDataSources) {
		getPersistence().cacheResult(tableFromDefaultDataSources);
	}

	/**
	* Creates a new table from default data source with the primary key. Does not add the table from default data source to the database.
	*
	* @param IFDDSId the primary key for the new table from default data source
	* @return the new table from default data source
	*/
	public static com.meera.multidatasource.model.TableFromDefaultDataSource create(
		long IFDDSId) {
		return getPersistence().create(IFDDSId);
	}

	/**
	* Removes the table from default data source with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param IFDDSId the primary key of the table from default data source
	* @return the table from default data source that was removed
	* @throws com.meera.multidatasource.NoSuchTableFromDefaultDataSourceException if a table from default data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.multidatasource.model.TableFromDefaultDataSource remove(
		long IFDDSId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.multidatasource.NoSuchTableFromDefaultDataSourceException {
		return getPersistence().remove(IFDDSId);
	}

	public static com.meera.multidatasource.model.TableFromDefaultDataSource updateImpl(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tableFromDefaultDataSource, merge);
	}

	/**
	* Returns the table from default data source with the primary key or throws a {@link com.meera.multidatasource.NoSuchTableFromDefaultDataSourceException} if it could not be found.
	*
	* @param IFDDSId the primary key of the table from default data source
	* @return the table from default data source
	* @throws com.meera.multidatasource.NoSuchTableFromDefaultDataSourceException if a table from default data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.multidatasource.model.TableFromDefaultDataSource findByPrimaryKey(
		long IFDDSId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.multidatasource.NoSuchTableFromDefaultDataSourceException {
		return getPersistence().findByPrimaryKey(IFDDSId);
	}

	/**
	* Returns the table from default data source with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param IFDDSId the primary key of the table from default data source
	* @return the table from default data source, or <code>null</code> if a table from default data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.multidatasource.model.TableFromDefaultDataSource fetchByPrimaryKey(
		long IFDDSId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(IFDDSId);
	}

	/**
	* Returns all the table from default data sources.
	*
	* @return the table from default data sources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.multidatasource.model.TableFromDefaultDataSource> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.meera.multidatasource.model.TableFromDefaultDataSource> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the table from default data sources.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of table from default data sources
	* @param end the upper bound of the range of table from default data sources (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of table from default data sources
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.multidatasource.model.TableFromDefaultDataSource> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the table from default data sources from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of table from default data sources.
	*
	* @return the number of table from default data sources
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TableFromDefaultDataSourcePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TableFromDefaultDataSourcePersistence)PortletBeanLocatorUtil.locate(com.meera.multidatasource.service.ClpSerializer.getServletContextName(),
					TableFromDefaultDataSourcePersistence.class.getName());

			ReferenceRegistry.registerReference(TableFromDefaultDataSourceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		TableFromDefaultDataSourcePersistence persistence) {
	}

	private static TableFromDefaultDataSourcePersistence _persistence;
}