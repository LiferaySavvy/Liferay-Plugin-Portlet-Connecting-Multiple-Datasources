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
 * This class is used by SOAP remote services, specifically {@link com.meera.multidatasource.service.http.TableFromAnotherDataSourceServiceSoap}.
 *
 * @author    E5410
 * @see       com.meera.multidatasource.service.http.TableFromAnotherDataSourceServiceSoap
 * @generated
 */
public class TableFromAnotherDataSourceSoap implements Serializable {
	public static TableFromAnotherDataSourceSoap toSoapModel(
		TableFromAnotherDataSource model) {
		TableFromAnotherDataSourceSoap soapModel = new TableFromAnotherDataSourceSoap();

		soapModel.setIFADSId(model.getIFADSId());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static TableFromAnotherDataSourceSoap[] toSoapModels(
		TableFromAnotherDataSource[] models) {
		TableFromAnotherDataSourceSoap[] soapModels = new TableFromAnotherDataSourceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TableFromAnotherDataSourceSoap[][] toSoapModels(
		TableFromAnotherDataSource[][] models) {
		TableFromAnotherDataSourceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TableFromAnotherDataSourceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TableFromAnotherDataSourceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TableFromAnotherDataSourceSoap[] toSoapModels(
		List<TableFromAnotherDataSource> models) {
		List<TableFromAnotherDataSourceSoap> soapModels = new ArrayList<TableFromAnotherDataSourceSoap>(models.size());

		for (TableFromAnotherDataSource model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TableFromAnotherDataSourceSoap[soapModels.size()]);
	}

	public TableFromAnotherDataSourceSoap() {
	}

	public long getPrimaryKey() {
		return _IFADSId;
	}

	public void setPrimaryKey(long pk) {
		setIFADSId(pk);
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

	private long _IFADSId;
	private String _Description;
}