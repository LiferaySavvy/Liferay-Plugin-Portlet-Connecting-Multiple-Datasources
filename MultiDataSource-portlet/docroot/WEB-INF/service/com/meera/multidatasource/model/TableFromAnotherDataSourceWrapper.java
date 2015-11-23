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

package com.meera.multidatasource.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TableFromAnotherDataSource}.
 * </p>
 *
 * @author    E5410
 * @see       TableFromAnotherDataSource
 * @generated
 */
public class TableFromAnotherDataSourceWrapper
	implements TableFromAnotherDataSource,
		ModelWrapper<TableFromAnotherDataSource> {
	public TableFromAnotherDataSourceWrapper(
		TableFromAnotherDataSource tableFromAnotherDataSource) {
		_tableFromAnotherDataSource = tableFromAnotherDataSource;
	}

	public Class<?> getModelClass() {
		return TableFromAnotherDataSource.class;
	}

	public String getModelClassName() {
		return TableFromAnotherDataSource.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("IFADSId", getIFADSId());
		attributes.put("Description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long IFADSId = (Long)attributes.get("IFADSId");

		if (IFADSId != null) {
			setIFADSId(IFADSId);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}
	}

	/**
	* Returns the primary key of this table from another data source.
	*
	* @return the primary key of this table from another data source
	*/
	public long getPrimaryKey() {
		return _tableFromAnotherDataSource.getPrimaryKey();
	}

	/**
	* Sets the primary key of this table from another data source.
	*
	* @param primaryKey the primary key of this table from another data source
	*/
	public void setPrimaryKey(long primaryKey) {
		_tableFromAnotherDataSource.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i f a d s ID of this table from another data source.
	*
	* @return the i f a d s ID of this table from another data source
	*/
	public long getIFADSId() {
		return _tableFromAnotherDataSource.getIFADSId();
	}

	/**
	* Sets the i f a d s ID of this table from another data source.
	*
	* @param IFADSId the i f a d s ID of this table from another data source
	*/
	public void setIFADSId(long IFADSId) {
		_tableFromAnotherDataSource.setIFADSId(IFADSId);
	}

	/**
	* Returns the description of this table from another data source.
	*
	* @return the description of this table from another data source
	*/
	public java.lang.String getDescription() {
		return _tableFromAnotherDataSource.getDescription();
	}

	/**
	* Sets the description of this table from another data source.
	*
	* @param Description the description of this table from another data source
	*/
	public void setDescription(java.lang.String Description) {
		_tableFromAnotherDataSource.setDescription(Description);
	}

	public boolean isNew() {
		return _tableFromAnotherDataSource.isNew();
	}

	public void setNew(boolean n) {
		_tableFromAnotherDataSource.setNew(n);
	}

	public boolean isCachedModel() {
		return _tableFromAnotherDataSource.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tableFromAnotherDataSource.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tableFromAnotherDataSource.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tableFromAnotherDataSource.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tableFromAnotherDataSource.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tableFromAnotherDataSource.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tableFromAnotherDataSource.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TableFromAnotherDataSourceWrapper((TableFromAnotherDataSource)_tableFromAnotherDataSource.clone());
	}

	public int compareTo(
		com.meera.multidatasource.model.TableFromAnotherDataSource tableFromAnotherDataSource) {
		return _tableFromAnotherDataSource.compareTo(tableFromAnotherDataSource);
	}

	@Override
	public int hashCode() {
		return _tableFromAnotherDataSource.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.meera.multidatasource.model.TableFromAnotherDataSource> toCacheModel() {
		return _tableFromAnotherDataSource.toCacheModel();
	}

	public com.meera.multidatasource.model.TableFromAnotherDataSource toEscapedModel() {
		return new TableFromAnotherDataSourceWrapper(_tableFromAnotherDataSource.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tableFromAnotherDataSource.toString();
	}

	public java.lang.String toXmlString() {
		return _tableFromAnotherDataSource.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tableFromAnotherDataSource.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TableFromAnotherDataSource getWrappedTableFromAnotherDataSource() {
		return _tableFromAnotherDataSource;
	}

	public TableFromAnotherDataSource getWrappedModel() {
		return _tableFromAnotherDataSource;
	}

	public void resetOriginalValues() {
		_tableFromAnotherDataSource.resetOriginalValues();
	}

	private TableFromAnotherDataSource _tableFromAnotherDataSource;
}