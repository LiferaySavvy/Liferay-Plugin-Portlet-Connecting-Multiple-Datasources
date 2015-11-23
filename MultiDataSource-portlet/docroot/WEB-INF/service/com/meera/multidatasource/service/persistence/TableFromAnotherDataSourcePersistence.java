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

import com.liferay.portal.service.persistence.BasePersistence;

import com.meera.multidatasource.model.TableFromAnotherDataSource;

/**
 * The persistence interface for the table from another data source service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see TableFromAnotherDataSourcePersistenceImpl
 * @see TableFromAnotherDataSourceUtil
 * @generated
 */
public interface TableFromAnotherDataSourcePersistence extends BasePersistence<TableFromAnotherDataSource> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TableFromAnotherDataSourceUtil} to access the table from another data source persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the table from another data source in the entity cache if it is enabled.
	*
	* @param tableFromAnotherDataSource the table from another data source
	*/
	public void cacheResult(
		com.meera.multidatasource.model.TableFromAnotherDataSource tableFromAnotherDataSource);

	/**
	* Caches the table from another data sources in the entity cache if it is enabled.
	*
	* @param tableFromAnotherDataSources the table from another data sources
	*/
	public void cacheResult(
		java.util.List<com.meera.multidatasource.model.TableFromAnotherDataSource> tableFromAnotherDataSources);

	/**
	* Creates a new table from another data source with the primary key. Does not add the table from another data source to the database.
	*
	* @param IFADSId the primary key for the new table from another data source
	* @return the new table from another data source
	*/
	public com.meera.multidatasource.model.TableFromAnotherDataSource create(
		long IFADSId);

	/**
	* Removes the table from another data source with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param IFADSId the primary key of the table from another data source
	* @return the table from another data source that was removed
	* @throws com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException if a table from another data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromAnotherDataSource remove(
		long IFADSId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException;

	public com.meera.multidatasource.model.TableFromAnotherDataSource updateImpl(
		com.meera.multidatasource.model.TableFromAnotherDataSource tableFromAnotherDataSource,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the table from another data source with the primary key or throws a {@link com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException} if it could not be found.
	*
	* @param IFADSId the primary key of the table from another data source
	* @return the table from another data source
	* @throws com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException if a table from another data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromAnotherDataSource findByPrimaryKey(
		long IFADSId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.multidatasource.NoSuchTableFromAnotherDataSourceException;

	/**
	* Returns the table from another data source with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param IFADSId the primary key of the table from another data source
	* @return the table from another data source, or <code>null</code> if a table from another data source with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.multidatasource.model.TableFromAnotherDataSource fetchByPrimaryKey(
		long IFADSId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the table from another data sources.
	*
	* @return the table from another data sources
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.multidatasource.model.TableFromAnotherDataSource> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.multidatasource.model.TableFromAnotherDataSource> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.multidatasource.model.TableFromAnotherDataSource> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the table from another data sources from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of table from another data sources.
	*
	* @return the number of table from another data sources
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}