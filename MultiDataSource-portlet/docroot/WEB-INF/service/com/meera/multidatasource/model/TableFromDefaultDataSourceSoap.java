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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.meera.multidatasource.service.http.TableFromDefaultDataSourceServiceSoap}.
 *
 * @author    E5410
 * @see       com.meera.multidatasource.service.http.TableFromDefaultDataSourceServiceSoap
 * @generated
 */
public class TableFromDefaultDataSourceSoap implements Serializable {
	public static TableFromDefaultDataSourceSoap toSoapModel(
		TableFromDefaultDataSource model) {
		TableFromDefaultDataSourceSoap soapModel = new TableFromDefaultDataSourceSoap();

		soapModel.setIFDDSId(model.getIFDDSId());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static TableFromDefaultDataSourceSoap[] toSoapModels(
		TableFromDefaultDataSource[] models) {
		TableFromDefaultDataSourceSoap[] soapModels = new TableFromDefaultDataSourceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TableFromDefaultDataSourceSoap[][] toSoapModels(
		TableFromDefaultDataSource[][] models) {
		TableFromDefaultDataSourceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TableFromDefaultDataSourceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TableFromDefaultDataSourceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TableFromDefaultDataSourceSoap[] toSoapModels(
		List<TableFromDefaultDataSource> models) {
		List<TableFromDefaultDataSourceSoap> soapModels = new ArrayList<TableFromDefaultDataSourceSoap>(models.size());

		for (TableFromDefaultDataSource model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TableFromDefaultDataSourceSoap[soapModels.size()]);
	}

	public TableFromDefaultDataSourceSoap() {
	}

	public long getPrimaryKey() {
		return _IFDDSId;
	}

	public void setPrimaryKey(long pk) {
		setIFDDSId(pk);
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

	private long _IFDDSId;
	private String _Description;
}