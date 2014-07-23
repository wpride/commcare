/*
 * Copyright (C) 2009 JavaRosa
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

/**
 * 
 */
package org.commcare.cases;

import org.commcare.cases.ledger.Ledger;
import org.commcare.cases.model.Case;
import org.javarosa.core.api.IModule;
import org.javarosa.core.services.storage.StorageManager;

/**
 * @author Clayton Sims
 * @date Mar 19, 2009 
 *
 */
public class CaseManagementModule implements IModule {

	/* (non-Javadoc)
	 * @see org.javarosa.core.api.IModule#registerModule(org.javarosa.core.Context)
	 */
	public void registerModule() {
		StorageManager.registerStorage(Case.STORAGE_KEY, Case.class);
		StorageManager.registerStorage(Ledger.STORAGE_KEY, Ledger.class);
	}

}