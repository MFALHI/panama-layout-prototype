/*******************************************************************************
 *  Copyright (c) 2015 IBM Corporation.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.user.examples.myline;

import com.ibm.layout.Layout;
import com.ibm.layout.LayoutDesc;

/**
 * Generated interface class
 */
@LayoutDesc({"x:jint:4","y:jint:4"})
public interface Point extends Layout {
	public long sizeof();

	public abstract int x();

	public abstract int y();

	public abstract void x(int val);

	public abstract void y(int val);

	@Override
	public String toString();

}
