/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerWorkbenchApiService {

	SDCustomerWorkbenchActivateOutputModel activate(SDCustomerWorkbenchActivateInputModel request);
	
	SDCustomerWorkbenchConfigureOutputModel configure(String sdReferenceId, SDCustomerWorkbenchConfigureInputModel request);
	
	CRCustomerWorkbenchOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerWorkbenchOperatingSessionControlInputModel request);
	
	BQSWUpdateExchangeOutputModel exchangeSwupdate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSWUpdateExchangeInputModel request);
	
	BQBrowsingExecuteOutputModel executeBrowsing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBrowsingExecuteInputModel request);
	
	BQContactExecuteOutputModel executeContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactExecuteInputModel request);
	
	BQProductServiceAccessExecuteOutputModel executeProductserviceaccess(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductServiceAccessExecuteInputModel request);
	
	SDCustomerWorkbenchFeedbackOutputModel feedback(String sdReferenceId, SDCustomerWorkbenchFeedbackInputModel request);
	
	CRCustomerWorkbenchOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRCustomerWorkbenchOperatingSessionInitiateInputModel request);
	
	BQBroadcastInitiateOutputModel initiateBroadcast(String sdReferenceId, String crReferenceId, BQBroadcastInitiateInputModel request);
	
	BQBrowsingInitiateOutputModel initiateBrowsing(String sdReferenceId, String crReferenceId, BQBrowsingInitiateInputModel request);
	
	BQContactInitiateOutputModel initiateContact(String sdReferenceId, String crReferenceId, BQContactInitiateInputModel request);
	
	BQProductServiceAccessInitiateOutputModel initiateProductserviceaccess(String sdReferenceId, String crReferenceId, BQProductServiceAccessInitiateInputModel request);
	
	BQSWUpdateInitiateOutputModel initiateSwupdate(String sdReferenceId, String crReferenceId, BQSWUpdateInitiateInputModel request);
	
	BQContactRequestOutputModel requestContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactRequestInputModel request);
	
	BQProductServiceAccessRequestOutputModel requestProductserviceaccess(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductServiceAccessRequestInputModel request);
	
	CRCustomerWorkbenchOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQBroadcastRetrieveOutputModel retrieveBroadcast(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQBrowsingRetrieveOutputModel retrieveBrowsing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQContactRetrieveOutputModel retrieveContact(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductServiceAccessRetrieveOutputModel retrieveProductserviceaccess(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSWUpdateRetrieveOutputModel retrieveSwupdate(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerWorkbenchRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerWorkbenchOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerWorkbenchOperatingSessionUpdateInputModel request);
	
	BQContactUpdateOutputModel updateContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactUpdateInputModel request);
	
	BQProductServiceAccessUpdateOutputModel updateProductserviceaccess(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductServiceAccessUpdateInputModel request);
	
}
