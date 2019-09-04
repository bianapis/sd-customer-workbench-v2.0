package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSWUpdateInitiateInputModelSWUpdateInstanceRecord;
import org.bian.dto.BQSWUpdateRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord;
import org.bian.dto.BQSWUpdateRetrieveOutputModelSWUpdateInstanceAnalysis;
import org.bian.dto.BQSWUpdateRetrieveOutputModelSWUpdateInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSWUpdateRetrieveOutputModel
 */
public class BQSWUpdateRetrieveOutputModel   {
  private BQSWUpdateRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private BQSWUpdateInitiateInputModelSWUpdateInstanceRecord sWUpdateInstanceRecord = null;

  private String sWUpdateRetrieveActionTaskReference = null;

  private Object sWUpdateRetrieveActionTaskRecord = null;

  private String sWUpdateRetrieveActionResponse = null;

  private BQSWUpdateRetrieveOutputModelSWUpdateInstanceReport sWUpdateInstanceReport = null;

  private BQSWUpdateRetrieveOutputModelSWUpdateInstanceAnalysis sWUpdateInstanceAnalysis = null;


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public BQSWUpdateRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(BQSWUpdateRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


  /**
   * Get sWUpdateInstanceRecord
   * @return sWUpdateInstanceRecord
  **/

  public BQSWUpdateInitiateInputModelSWUpdateInstanceRecord getSWUpdateInstanceRecord() {
    return sWUpdateInstanceRecord;
  }

  @JsonProperty("sWUpdateInstanceRecord")
  public void setSWUpdateInstanceRecord(BQSWUpdateInitiateInputModelSWUpdateInstanceRecord sWUpdateInstanceRecord) {
    this.sWUpdateInstanceRecord = sWUpdateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a SW Update instance retrieve service call 
   * @return sWUpdateRetrieveActionTaskReference
  **/

  public String getSWUpdateRetrieveActionTaskReference() {
    return sWUpdateRetrieveActionTaskReference;
  }
  
  @JsonProperty("sWUpdateRetrieveActionTaskReference")
  public void setSWUpdateRetrieveActionTaskReference(String sWUpdateRetrieveActionTaskReference) {
    this.sWUpdateRetrieveActionTaskReference = sWUpdateRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return sWUpdateRetrieveActionTaskRecord
  **/

  public Object getSWUpdateRetrieveActionTaskRecord() {
    return sWUpdateRetrieveActionTaskRecord;
  }

  @JsonProperty("sWUpdateRetrieveActionTaskRecord")
  public void setSWUpdateRetrieveActionTaskRecord(Object sWUpdateRetrieveActionTaskRecord) {
    this.sWUpdateRetrieveActionTaskRecord = sWUpdateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return sWUpdateRetrieveActionResponse
  **/

  public String getSWUpdateRetrieveActionResponse() {
    return sWUpdateRetrieveActionResponse;
  }

  @JsonProperty("sWUpdateRetrieveActionResponse")
  public void setSWUpdateRetrieveActionResponse(String sWUpdateRetrieveActionResponse) {
    this.sWUpdateRetrieveActionResponse = sWUpdateRetrieveActionResponse;
  }


  /**
   * Get sWUpdateInstanceReport
   * @return sWUpdateInstanceReport
  **/

  public BQSWUpdateRetrieveOutputModelSWUpdateInstanceReport getSWUpdateInstanceReport() {
    return sWUpdateInstanceReport;
  }

  @JsonProperty("sWUpdateInstanceReport")
  public void setSWUpdateInstanceReport(BQSWUpdateRetrieveOutputModelSWUpdateInstanceReport sWUpdateInstanceReport) {
    this.sWUpdateInstanceReport = sWUpdateInstanceReport;
  }


  /**
   * Get sWUpdateInstanceAnalysis
   * @return sWUpdateInstanceAnalysis
  **/

  public BQSWUpdateRetrieveOutputModelSWUpdateInstanceAnalysis getSWUpdateInstanceAnalysis() {
    return sWUpdateInstanceAnalysis;
  }

  @JsonProperty("sWUpdateInstanceAnalysis")
  public void setSWUpdateInstanceAnalysis(BQSWUpdateRetrieveOutputModelSWUpdateInstanceAnalysis sWUpdateInstanceAnalysis) {
    this.sWUpdateInstanceAnalysis = sWUpdateInstanceAnalysis;
  }


}

