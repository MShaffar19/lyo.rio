/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution. 
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *    Jim Conallen - initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.rio.services;

import javax.servlet.ServletException;

import org.eclipse.lyo.rio.core.IConstants;




public class RioServiceException extends ServletException {

	private static final long serialVersionUID = -4695857098965707720L;
	private int status = IConstants.SC_INTERNAL_ERROR; 
	public int getStatus(){
		return status;
	}
	
	public RioServiceException(Exception e) {
		super(e);
	}

	public RioServiceException(int status) {
		super();
		this.status = status;
	}

	public RioServiceException(int status, String msg) {
		super(msg);
		this.status = status;
	}

	public RioServiceException(int status, Exception e) {
		super(e);
		this.status = status;
	}

	public RioServiceException(String msg) {
		super(msg);
	}

}
