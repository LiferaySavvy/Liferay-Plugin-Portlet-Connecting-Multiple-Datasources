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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.meera.multidatasource.service.TableFromDefaultDataSourceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author E5410
 */
public class TableFromDefaultDataSourceClp extends BaseModelImpl<TableFromDefaultDataSource>
	implements TableFromDefaultDataSource {
	public TableFromDefaultDataSourceClp() {
	}

	public Class<?> getModelClass() {
		return TableFromDefaultDataSource.class;
	}

	public String getModelClassName() {
		return TableFromDefaultDataSource.class.getName();
	}

	public long getPrimaryKey() {
		return _IFDDSId;
	}

	public void setPrimaryKey(long primaryKey) {
		setIFDDSId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_IFDDSId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("IFDDSId", getIFDDSId());
		attributes.put("Description", getDescription());

		return attributes;
	}

	@Override
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

	public long getIFDDSId() {
		return _IFDDSId;
	}

	public void setIFDDSId(long IFDDSId) {
		_IFDDSId = IFDDSId;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public BaseModel<?> getTableFromDefaultDataSourceRemoteModel() {
		return _tableFromDefaultDataSourceRemoteModel;
	}

	public void setTableFromDefaultDataSourceRemoteModel(
		BaseModel<?> tableFromDefaultDataSourceRemoteModel) {
		_tableFromDefaultDataSourceRemoteModel = tableFromDefaultDataSourceRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TableFromDefaultDataSourceLocalServiceUtil.addTableFromDefaultDataSource(this);
		}
		else {
			TableFromDefaultDataSourceLocalServiceUtil.updateTableFromDefaultDataSource(this);
		}
	}

	@Override
	public TableFromDefaultDataSource toEscapedModel() {
		return (TableFromDefaultDataSource)Proxy.newProxyInstance(TableFromDefaultDataSource.class.getClassLoader(),
			new Class[] { TableFromDefaultDataSource.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TableFromDefaultDataSourceClp clone = new TableFromDefaultDataSourceClp();

		clone.setIFDDSId(getIFDDSId());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(TableFromDefaultDataSource tableFromDefaultDataSource) {
		long primaryKey = tableFromDefaultDataSource.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TableFromDefaultDataSourceClp tableFromDefaultDataSource = null;

		try {
			tableFromDefaultDataSource = (TableFromDefaultDataSourceClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tableFromDefaultDataSource.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{IFDDSId=");
		sb.append(getIFDDSId());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.meera.multidatasource.model.TableFromDefaultDataSource");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>IFDDSId</column-name><column-value><![CDATA[");
		sb.append(getIFDDSId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _IFDDSId;
	private String _Description;
	private BaseModel<?> _tableFromDefaultDataSourceRemoteModel;
}