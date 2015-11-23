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

import com.meera.multidatasource.service.TableFromAnotherDataSourceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author E5410
 */
public class TableFromAnotherDataSourceClp extends BaseModelImpl<TableFromAnotherDataSource>
	implements TableFromAnotherDataSource {
	public TableFromAnotherDataSourceClp() {
	}

	public Class<?> getModelClass() {
		return TableFromAnotherDataSource.class;
	}

	public String getModelClassName() {
		return TableFromAnotherDataSource.class.getName();
	}

	public long getPrimaryKey() {
		return _IFADSId;
	}

	public void setPrimaryKey(long primaryKey) {
		setIFADSId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_IFADSId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("IFADSId", getIFADSId());
		attributes.put("Description", getDescription());

		return attributes;
	}

	@Override
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

	public long getIFADSId() {
		return _IFADSId;
	}

	public void setIFADSId(long IFADSId) {
		_IFADSId = IFADSId;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public BaseModel<?> getTableFromAnotherDataSourceRemoteModel() {
		return _tableFromAnotherDataSourceRemoteModel;
	}

	public void setTableFromAnotherDataSourceRemoteModel(
		BaseModel<?> tableFromAnotherDataSourceRemoteModel) {
		_tableFromAnotherDataSourceRemoteModel = tableFromAnotherDataSourceRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TableFromAnotherDataSourceLocalServiceUtil.addTableFromAnotherDataSource(this);
		}
		else {
			TableFromAnotherDataSourceLocalServiceUtil.updateTableFromAnotherDataSource(this);
		}
	}

	@Override
	public TableFromAnotherDataSource toEscapedModel() {
		return (TableFromAnotherDataSource)Proxy.newProxyInstance(TableFromAnotherDataSource.class.getClassLoader(),
			new Class[] { TableFromAnotherDataSource.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TableFromAnotherDataSourceClp clone = new TableFromAnotherDataSourceClp();

		clone.setIFADSId(getIFADSId());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(TableFromAnotherDataSource tableFromAnotherDataSource) {
		long primaryKey = tableFromAnotherDataSource.getPrimaryKey();

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

		TableFromAnotherDataSourceClp tableFromAnotherDataSource = null;

		try {
			tableFromAnotherDataSource = (TableFromAnotherDataSourceClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tableFromAnotherDataSource.getPrimaryKey();

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

		sb.append("{IFADSId=");
		sb.append(getIFADSId());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.meera.multidatasource.model.TableFromAnotherDataSource");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>IFADSId</column-name><column-value><![CDATA[");
		sb.append(getIFADSId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _IFADSId;
	private String _Description;
	private BaseModel<?> _tableFromAnotherDataSourceRemoteModel;
}