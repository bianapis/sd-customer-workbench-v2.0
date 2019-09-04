package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrowsingInitiateInputModelBrowsingInstanceRecord;
import org.bian.dto.BQBrowsingRetrieveOutputModelBrowsingInstanceAnalysis;
import org.bian.dto.BQBrowsingRetrieveOutputModelBrowsingInstanceReport;
import org.bian.dto.BQBrowsingRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBrowsingRetrieveOutputModel
 */
public class BQBrowsingRetrieveOutputModel   {
  private BQBrowsingRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private BQBrowsingInitiateInputModelBrowsingInstanceRecord browsingInstanceRecord = null;

  private String browsingRetrieveActionTaskReference = null;

  private Object browsingRetrieveActionTaskRecord = null;

  private String browsingRetrieveActionResponse = null;

  private BQBrowsingRetrieveOutputModelBrowsingInstanceReport browsingInstanceReport = null;

  private BQBrowsingRetrieveOutputModelBrowsingInstanceAnalysis browsingInstanceAnalysis = null;


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public BQBrowsingRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(BQBrowsingRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


  /**
   * Get browsingInstanceRecord
   * @return browsingInstanceRecord
  **/

  public BQBrowsingInitiateInputModelBrowsingInstanceRecord getBrowsingInstanceRecord() {
    return browsingInstanceRecord;
  }

  public void setBrowsingInstanceRecord(BQBrowsingInitiateInputModelBrowsingInstanceRecord browsingInstanceRecord) {
    this.browsingInstanceRecord = browsingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Browsing instance retrieve service call 
   * @return browsingRetrieveActionTaskReference
  **/

  public String getBrowsingRetrieveActionTaskReference() {
    return browsingRetrieveActionTaskReference;
  }

  public void setBrowsingRetrieveActionTaskReference(String browsingRetrieveActionTaskReference) {
    this.browsingRetrieveActionTaskReference = browsingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return browsingRetrieveActionTaskRecord
  **/

  public Object getBrowsingRetrieveActionTaskRecord() {
    return browsingRetrieveActionTaskRecord;
  }

  public void setBrowsingRetrieveActionTaskRecord(Object browsingRetrieveActionTaskRecord) {
    this.browsingRetrieveActionTaskRecord = browsingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return browsingRetrieveActionResponse
  **/

  public String getBrowsingRetrieveActionResponse() {
    return browsingRetrieveActionResponse;
  }

  public void setBrowsingRetrieveActionResponse(String browsingRetrieveActionResponse) {
    this.browsingRetrieveActionResponse = browsingRetrieveActionResponse;
  }


  /**
   * Get browsingInstanceReport
   * @return browsingInstanceReport
  **/

  public BQBrowsingRetrieveOutputModelBrowsingInstanceReport getBrowsingInstanceReport() {
    return browsingInstanceReport;
  }

  public void setBrowsingInstanceReport(BQBrowsingRetrieveOutputModelBrowsingInstanceReport browsingInstanceReport) {
    this.browsingInstanceReport = browsingInstanceReport;
  }


  /**
   * Get browsingInstanceAnalysis
   * @return browsingInstanceAnalysis
  **/

  public BQBrowsingRetrieveOutputModelBrowsingInstanceAnalysis getBrowsingInstanceAnalysis() {
    return browsingInstanceAnalysis;
  }

  public void setBrowsingInstanceAnalysis(BQBrowsingRetrieveOutputModelBrowsingInstanceAnalysis browsingInstanceAnalysis) {
    this.browsingInstanceAnalysis = browsingInstanceAnalysis;
  }


}

