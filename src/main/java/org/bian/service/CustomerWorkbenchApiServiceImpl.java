/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerWorkbenchApiServiceImpl implements CustomerWorkbenchApiService {

	public SDCustomerWorkbenchActivateOutputModel activate(SDCustomerWorkbenchActivateInputModel request){
		return JsonReader.read("activate-SDCustomerWorkbenchActivateOutputModel.json",new TypeReference<SDCustomerWorkbenchActivateOutputModel>(){});
	}
	
	public SDCustomerWorkbenchConfigureOutputModel configure(String sdReferenceId, SDCustomerWorkbenchConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerWorkbenchConfigureOutputModel.json",new TypeReference<SDCustomerWorkbenchConfigureOutputModel>(){});
	}
	
	public CRCustomerWorkbenchOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerWorkbenchOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRCustomerWorkbenchOperatingSessionControlOutputModel.json",new TypeReference<CRCustomerWorkbenchOperatingSessionControlOutputModel>(){});
	}
	
	public BQSWUpdateExchangeOutputModel exchangeSwupdate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSWUpdateExchangeInputModel request){
		return JsonReader.read("exchange-BQSWUpdateExchangeOutputModel.json",new TypeReference<BQSWUpdateExchangeOutputModel>(){});
	}
	
	public BQBrowsingExecuteOutputModel executeBrowsing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBrowsingExecuteInputModel request){
		return JsonReader.read("execute-BQBrowsingExecuteOutputModel.json",new TypeReference<BQBrowsingExecuteOutputModel>(){});
	}
	
	public BQContactExecuteOutputModel executeContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactExecuteInputModel request){
		return JsonReader.read("execute-BQContactExecuteOutputModel.json",new TypeReference<BQContactExecuteOutputModel>(){});
	}
	
	public BQProductServiceAccessExecuteOutputModel executeProductserviceaccess(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductServiceAccessExecuteInputModel request){
		return JsonReader.read("execute-BQProductServiceAccessExecuteOutputModel.json",new TypeReference<BQProductServiceAccessExecuteOutputModel>(){});
	}
	
	public SDCustomerWorkbenchFeedbackOutputModel feedback(String sdReferenceId, SDCustomerWorkbenchFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerWorkbenchFeedbackOutputModel.json",new TypeReference<SDCustomerWorkbenchFeedbackOutputModel>(){});
	}
	
	public CRCustomerWorkbenchOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRCustomerWorkbenchOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerWorkbenchOperatingSessionInitiateOutputModel.json",new TypeReference<CRCustomerWorkbenchOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQBroadcastInitiateOutputModel initiateBroadcast(String sdReferenceId, String crReferenceId, BQBroadcastInitiateInputModel request){
		return JsonReader.read("initiate-BQBroadcastInitiateOutputModel.json",new TypeReference<BQBroadcastInitiateOutputModel>(){});
	}
	
	public BQBrowsingInitiateOutputModel initiateBrowsing(String sdReferenceId, String crReferenceId, BQBrowsingInitiateInputModel request){
		return JsonReader.read("initiate-BQBrowsingInitiateOutputModel.json",new TypeReference<BQBrowsingInitiateOutputModel>(){});
	}
	
	public BQContactInitiateOutputModel initiateContact(String sdReferenceId, String crReferenceId, BQContactInitiateInputModel request){
		return JsonReader.read("initiate-BQContactInitiateOutputModel.json",new TypeReference<BQContactInitiateOutputModel>(){});
	}
	
	public BQProductServiceAccessInitiateOutputModel initiateProductserviceaccess(String sdReferenceId, String crReferenceId, BQProductServiceAccessInitiateInputModel request){
		return JsonReader.read("initiate-BQProductServiceAccessInitiateOutputModel.json",new TypeReference<BQProductServiceAccessInitiateOutputModel>(){});
	}
	
	public BQSWUpdateInitiateOutputModel initiateSwupdate(String sdReferenceId, String crReferenceId, BQSWUpdateInitiateInputModel request){
		return JsonReader.read("initiate-BQSWUpdateInitiateOutputModel.json",new TypeReference<BQSWUpdateInitiateOutputModel>(){});
	}
	
	public BQContactRequestOutputModel requestContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactRequestInputModel request){
		return JsonReader.read("request-BQContactRequestOutputModel.json",new TypeReference<BQContactRequestOutputModel>(){});
	}
	
	public BQProductServiceAccessRequestOutputModel requestProductserviceaccess(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductServiceAccessRequestInputModel request){
		return JsonReader.read("request-BQProductServiceAccessRequestOutputModel.json",new TypeReference<BQProductServiceAccessRequestOutputModel>(){});
	}
	
	public CRCustomerWorkbenchOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerWorkbenchOperatingSessionRetrieveOutputModel.json",new TypeReference<CRCustomerWorkbenchOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQBroadcastRetrieveOutputModel retrieveBroadcast(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBroadcastRetrieveOutputModel.json",new TypeReference<BQBroadcastRetrieveOutputModel>(){});
	}
	
	public BQBrowsingRetrieveOutputModel retrieveBrowsing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBrowsingRetrieveOutputModel.json",new TypeReference<BQBrowsingRetrieveOutputModel>(){});
	}
	
	public BQContactRetrieveOutputModel retrieveContact(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQContactRetrieveOutputModel.json",new TypeReference<BQContactRetrieveOutputModel>(){});
	}
	
	public BQProductServiceAccessRetrieveOutputModel retrieveProductserviceaccess(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductServiceAccessRetrieveOutputModel.json",new TypeReference<BQProductServiceAccessRetrieveOutputModel>(){});
	}
	
	public BQSWUpdateRetrieveOutputModel retrieveSwupdate(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSWUpdateRetrieveOutputModel.json",new TypeReference<BQSWUpdateRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerWorkbenchRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerWorkbenchRetrieveOutputModel.json",new TypeReference<SDCustomerWorkbenchRetrieveOutputModel>(){});
	}
	
	public CRCustomerWorkbenchOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerWorkbenchOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRCustomerWorkbenchOperatingSessionUpdateOutputModel.json",new TypeReference<CRCustomerWorkbenchOperatingSessionUpdateOutputModel>(){});
	}
	
	public BQContactUpdateOutputModel updateContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactUpdateInputModel request){
		return JsonReader.read("update-BQContactUpdateOutputModel.json",new TypeReference<BQContactUpdateOutputModel>(){});
	}
	
	public BQProductServiceAccessUpdateOutputModel updateProductserviceaccess(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductServiceAccessUpdateInputModel request){
		return JsonReader.read("update-BQProductServiceAccessUpdateOutputModel.json",new TypeReference<BQProductServiceAccessUpdateOutputModel>(){});
	}
	
}
