/**
 * 
 */
package org.commcare.cases.util;

import org.commcare.cases.model.Case;
import org.javarosa.core.model.utils.IInstanceProcessor;

/**
 * @author ctsims
 *
 */
public interface ICaseModelProcessor extends IInstanceProcessor {
	
	/**
	 * This call is not guaranteed to be valid until the model
	 * is processed.
	 * 
	 * @return The case associated with the processed model.
	 */
	public Case getCase();
}
