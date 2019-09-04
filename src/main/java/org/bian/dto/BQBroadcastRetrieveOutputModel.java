package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBroadcastInitiateInputModelBroadcastInstanceRecord;
import org.bian.dto.BQBroadcastRetrieveOutputModelBroadcastInstanceAnalysis;
import org.bian.dto.BQBroadcastRetrieveOutputModelBroadcastInstanceReport;
import org.bian.dto.BQBroadcastRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBroadcastRetrieveOutputModel
 */
public class BQBroadcastRetrieveOutputModel   {
  private BQBroadcastRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private BQBroadcastInitiateInputModelBroadcastInstanceRecord broadcastInstanceRecord = null;

  private String broadcastRetrieveActionTaskReference = null;

  private Object broadcastRetrieveActionTaskRecord = null;

  private String broadcastRetrieveActionResponse = null;

  private BQBroadcastRetrieveOutputModelBroadcastInstanceReport broadcastInstanceReport = null;

  private BQBroadcastRetrieveOutputModelBroadcastInstanceAnalysis broadcastInstanceAnalysis = null;


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public BQBroadcastRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(BQBroadcastRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


  /**
   * Get broadcastInstanceRecord
   * @return broadcastInstanceRecord
  **/

  public BQBroadcastInitiateInputModelBroadcastInstanceRecord getBroadcastInstanceRecord() {
    return broadcastInstanceRecord;
  }

  public void setBroadcastInstanceRecord(BQBroadcastInitiateInputModelBroadcastInstanceRecord broadcastInstanceRecord) {
    this.broadcastInstanceRecord = broadcastInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Broadcast instance retrieve service call 
   * @return broadcastRetrieveActionTaskReference
  **/

  public String getBroadcastRetrieveActionTaskReference() {
    return broadcastRetrieveActionTaskReference;
  }

  public void setBroadcastRetrieveActionTaskReference(String broadcastRetrieveActionTaskReference) {
    this.broadcastRetrieveActionTaskReference = broadcastRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return broadcastRetrieveActionTaskRecord
  **/

  public Object getBroadcastRetrieveActionTaskRecord() {
    return broadcastRetrieveActionTaskRecord;
  }

  public void setBroadcastRetrieveActionTaskRecord(Object broadcastRetrieveActionTaskRecord) {
    this.broadcastRetrieveActionTaskRecord = broadcastRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return broadcastRetrieveActionResponse
  **/

  public String getBroadcastRetrieveActionResponse() {
    return broadcastRetrieveActionResponse;
  }

  public void setBroadcastRetrieveActionResponse(String broadcastRetrieveActionResponse) {
    this.broadcastRetrieveActionResponse = broadcastRetrieveActionResponse;
  }


  /**
   * Get broadcastInstanceReport
   * @return broadcastInstanceReport
  **/

  public BQBroadcastRetrieveOutputModelBroadcastInstanceReport getBroadcastInstanceReport() {
    return broadcastInstanceReport;
  }

  public void setBroadcastInstanceReport(BQBroadcastRetrieveOutputModelBroadcastInstanceReport broadcastInstanceReport) {
    this.broadcastInstanceReport = broadcastInstanceReport;
  }


  /**
   * Get broadcastInstanceAnalysis
   * @return broadcastInstanceAnalysis
  **/

  public BQBroadcastRetrieveOutputModelBroadcastInstanceAnalysis getBroadcastInstanceAnalysis() {
    return broadcastInstanceAnalysis;
  }

  public void setBroadcastInstanceAnalysis(BQBroadcastRetrieveOutputModelBroadcastInstanceAnalysis broadcastInstanceAnalysis) {
    this.broadcastInstanceAnalysis = broadcastInstanceAnalysis;
  }


}

