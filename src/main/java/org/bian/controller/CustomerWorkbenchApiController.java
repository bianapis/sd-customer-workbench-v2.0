/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class CustomerWorkbenchApiController {

	@Autowired
	CustomerWorkbenchApiService service;
	
	@Operate.Activate
	public BianResponse<SDCustomerWorkbenchActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerWorkbenchActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDCustomerWorkbenchConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerWorkbenchConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CRCustomerWorkbenchOperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerWorkbenchOperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("swupdate")
	@Operate.Exchange
	public BianResponse<BQSWUpdateExchangeOutputModel> exchangeSwupdate(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSWUpdateExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeSwupdate(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("browsing")
	@Operate.Execute
	public BianResponse<BQBrowsingExecuteOutputModel> executeBrowsing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBrowsingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeBrowsing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Operate.Execute
	public BianResponse<BQContactExecuteOutputModel> executeContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContactExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeContact(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productserviceaccess")
	@Operate.Execute
	public BianResponse<BQProductServiceAccessExecuteOutputModel> executeProductserviceaccess(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductServiceAccessExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeProductserviceaccess(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDCustomerWorkbenchFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerWorkbenchFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Initiate
	public BianResponse<CRCustomerWorkbenchOperatingSessionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerWorkbenchOperatingSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("broadcast")
	@Operate.Initiate
	public BianResponse<BQBroadcastInitiateOutputModel> initiateBroadcast(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQBroadcastInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateBroadcast(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("browsing")
	@Operate.Initiate
	public BianResponse<BQBrowsingInitiateOutputModel> initiateBrowsing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQBrowsingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateBrowsing(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Operate.Initiate
	public BianResponse<BQContactInitiateOutputModel> initiateContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQContactInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateContact(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("productserviceaccess")
	@Operate.Initiate
	public BianResponse<BQProductServiceAccessInitiateOutputModel> initiateProductserviceaccess(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProductServiceAccessInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProductserviceaccess(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("swupdate")
	@Operate.Initiate
	public BianResponse<BQSWUpdateInitiateOutputModel> initiateSwupdate(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQSWUpdateInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateSwupdate(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Operate.Request
	public BianResponse<BQContactRequestOutputModel> requestContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContactRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestContact(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productserviceaccess")
	@Operate.Request
	public BianResponse<BQProductServiceAccessRequestOutputModel> requestProductserviceaccess(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductServiceAccessRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProductserviceaccess(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<CRCustomerWorkbenchOperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("broadcast")
	@Operate.Retrieve
	public BianResponse<BQBroadcastRetrieveOutputModel> retrieveBroadcast(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBroadcast(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("browsing")
	@Operate.Retrieve
	public BianResponse<BQBrowsingRetrieveOutputModel> retrieveBrowsing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBrowsing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("contact")
	@Operate.Retrieve
	public BianResponse<BQContactRetrieveOutputModel> retrieveContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveContact(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("productserviceaccess")
	@Operate.Retrieve
	public BianResponse<BQProductServiceAccessRetrieveOutputModel> retrieveProductserviceaccess(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductserviceaccess(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("swupdate")
	@Operate.Retrieve
	public BianResponse<BQSWUpdateRetrieveOutputModel> retrieveSwupdate(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSwupdate(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDCustomerWorkbenchRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Operate.Update
	public BianResponse<CRCustomerWorkbenchOperatingSessionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerWorkbenchOperatingSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Operate.Update
	public BianResponse<BQContactUpdateOutputModel> updateContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContactUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateContact(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productserviceaccess")
	@Operate.Update
	public BianResponse<BQProductServiceAccessUpdateOutputModel> updateProductserviceaccess(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductServiceAccessUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProductserviceaccess(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
