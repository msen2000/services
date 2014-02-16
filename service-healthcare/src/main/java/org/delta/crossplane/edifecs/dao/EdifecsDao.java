package org.delta.crossplane.edifecs.dao;

import org.delta.crossplane.domain.EdifecsRequestResponse;

public interface EdifecsDao {
//	public String validateAndTransform(String ediRequest);
	public void validateAndTransform(EdifecsRequestResponse edifecsRequestResponse);
}
