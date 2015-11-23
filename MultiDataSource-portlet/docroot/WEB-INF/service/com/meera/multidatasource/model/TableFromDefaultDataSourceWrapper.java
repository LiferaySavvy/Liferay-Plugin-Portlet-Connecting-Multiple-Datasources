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
 * This class is a wrapper for {@link TableFromDefaultDataSource}.
 * </p>
 *
 * @author    E5410
 * @see       TableFromDefaultDataSource
 * @generated
 */
public class TableFromDefaultDataSourceWrapper
	implements TableFromDefaultDataSource,
		ModelWrapper<TableFromDefaultDataSource> {
	public TableFromDefaultDataSourceWrapper(
		TableFromDefaultDataSource tableFromDefaultDataSource) {
		_tableFromDefaultDataSource = tableFromDefaultDataSource;
	}

	public Class<?> getModelClass() {
		return TableFromDefaultDataSource.class;
	}

	public String getModelClassName() {
		return TableFromDefaultDataSource.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("IFDDSId", getIFDDSId());
		attributes.put("Description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long IFDDSId = (Long)attributes.get("IFDDSId");

		if (IFDDSId != null) {
			setIFDDSId(IFDDSId);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}
	}

	/**
	* Returns the primary key of this table from default data source.
	*
	* @return the primary key of this table from default data source
	*/
	public long getPrimaryKey() {
		return _tableFromDefaultDataSource.getPrimaryKey();
	}

	/**
	* Sets the primary key of this table from default data source.
	*
	* @param primaryKey the primary key of this table from default data source
	*/
	public void setPrimaryKey(long primaryKey) {
		_tableFromDefaultDataSource.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the i f d d s ID of this table from default data source.
	*
	* @return the i f d d s ID of this table from default data source
	*/
	public long getIFDDSId() {
		return _tableFromDefaultDataSource.getIFDDSId();
	}

	/**
	* Sets the i f d d s ID of this table from default data source.
	*
	* @param IFDDSId the i f d d s ID of this table from default data source
	*/
	public void setIFDDSId(long IFDDSId) {
		_tableFromDefaultDataSource.setIFDDSId(IFDDSId);
	}

	/**
	* Returns the description of this table from default data source.
	*
	* @return the description of this table from default data source
	*/
	public java.lang.String getDescription() {
		return _tableFromDefaultDataSource.getDescription();
	}

	/**
	* Sets the description of this table from default data source.
	*
	* @param Description the description of this table from default data source
	*/
	public void setDescription(java.lang.String Description) {
		_tableFromDefaultDataSource.setDescription(Description);
	}

	public boolean isNew() {
		return _tableFromDefaultDataSource.isNew();
	}

	public void setNew(boolean n) {
		_tableFromDefaultDataSource.setNew(n);
	}

	public boolean isCachedModel() {
		return _tableFromDefaultDataSource.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tableFromDefaultDataSource.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tableFromDefaultDataSource.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tableFromDefaultDataSource.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tableFromDefaultDataSource.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tableFromDefaultDataSource.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tableFromDefaultDataSource.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TableFromDefaultDataSourceWrapper((TableFromDefaultDataSource)_tableFromDefaultDataSource.clone());
	}

	public int compareTo(
		com.meera.multidatasource.model.TableFromDefaultDataSource tableFromDefaultDataSource) {
		return _tableFromDefaultDataSource.compareTo(tableFromDefaultDataSource);
	}

	@Override
	public int hashCode() {
		return _tableFromDefaultDataSource.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.meera.multidatasource.model.TableFromDefaultDataSource> toCacheModel() {
		return _tableFromDefaultDataSource.toCacheModel();
	}

	public com.meera.multidatasource.model.TableFromDefaultDataSource toEscapedModel() {
		return new TableFromDefaultDataSourceWrapper(_tableFromDefaultDataSource.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tableFromDefaultDataSource.toString();
	}

	public java.lang.String toXmlString() {
		return _tableFromDefaultDataSource.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tableFromDefaultDataSource.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TableFromDefaultDataSource getWrappedTableFromDefaultDataSource() {
		return _tableFromDefaultDataSource;
	}

	public TableFromDefaultDataSource getWrappedModel() {
		return _tableFromDefaultDataSource;
	}

	public void resetOriginalValues() {
		_tableFromDefaultDataSource.resetOriginalValues();
	}

	private TableFromDefaultDataSource _tableFromDefaultDataSource;
}