/*
 * Copyright (c) 2009-2012. Created by serso aka se.solovyev.
 * For more information, please, contact se.solovyev@gmail.com
 * or visit http://se.solovyev.org
 */

package org.solovyev.android.calculator;

import org.jetbrains.annotations.NotNull;

/**
 * User: serso
 * Date: 1/2/12
 * Time: 9:33 PM
 */
public class CalculatorActivity extends AbstractCalculatorActivity {

	public CalculatorActivity() {
		super(createApplicationData());
	}

	@NotNull
	private static ApplicationData createApplicationData() {
		return new ApplicationDataImpl(false, R.string.c_app_name, ApplicationData.Type.pro);
	}
}
