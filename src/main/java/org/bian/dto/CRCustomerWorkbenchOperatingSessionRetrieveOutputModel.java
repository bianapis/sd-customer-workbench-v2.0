package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceAnalysis;
import org.bian.dto.CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord;
import org.bian.dto.CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionRetrieveOutputModel
 */
public class CRCustomerWorkbenchOperatingSessionRetrieveOutputModel   {
  private CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private String customerWorkbenchOperatingSessionRetrieveActionTaskReference = null;

  private Object customerWorkbenchOperatingSessionRetrieveActionTaskRecord = null;

  private String customerWorkbenchOperatingSessionRetrieveActionResponse = null;

  private CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceReportRecord customerWorkbenchOperatingSessionInstanceReportRecord = null;

  private CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceAnalysis customerWorkbenchOperatingSessionInstanceAnalysis = null;


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Workbench Operating Session instance retrieve service call 
   * @return customerWorkbenchOperatingSessionRetrieveActionTaskReference
  **/

  public String getCustomerWorkbenchOperatingSessionRetrieveActionTaskReference() {
    return customerWorkbenchOperatingSessionRetrieveActionTaskReference;
  }

  public void setCustomerWorkbenchOperatingSessionRetrieveActionTaskReference(String customerWorkbenchOperatingSessionRetrieveActionTaskReference) {
    this.customerWorkbenchOperatingSessionRetrieveActionTaskReference = customerWorkbenchOperatingSessionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerWorkbenchOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getCustomerWorkbenchOperatingSessionRetrieveActionTaskRecord() {
    return customerWorkbenchOperatingSessionRetrieveActionTaskRecord;
  }

  public void setCustomerWorkbenchOperatingSessionRetrieveActionTaskRecord(Object customerWorkbenchOperatingSessionRetrieveActionTaskRecord) {
    this.customerWorkbenchOperatingSessionRetrieveActionTaskRecord = customerWorkbenchOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerWorkbenchOperatingSessionRetrieveActionResponse
  **/

  public String getCustomerWorkbenchOperatingSessionRetrieveActionResponse() {
    return customerWorkbenchOperatingSessionRetrieveActionResponse;
  }

  public void setCustomerWorkbenchOperatingSessionRetrieveActionResponse(String customerWorkbenchOperatingSessionRetrieveActionResponse) {
    this.customerWorkbenchOperatingSessionRetrieveActionResponse = customerWorkbenchOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get customerWorkbenchOperatingSessionInstanceReportRecord
   * @return customerWorkbenchOperatingSessionInstanceReportRecord
  **/

  public CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceReportRecord getCustomerWorkbenchOperatingSessionInstanceReportRecord() {
    return customerWorkbenchOperatingSessionInstanceReportRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReportRecord(CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceReportRecord customerWorkbenchOperatingSessionInstanceReportRecord) {
    this.customerWorkbenchOperatingSessionInstanceReportRecord = customerWorkbenchOperatingSessionInstanceReportRecord;
  }


  /**
   * Get customerWorkbenchOperatingSessionInstanceAnalysis
   * @return customerWorkbenchOperatingSessionInstanceAnalysis
  **/

  public CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceAnalysis getCustomerWorkbenchOperatingSessionInstanceAnalysis() {
    return customerWorkbenchOperatingSessionInstanceAnalysis;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceAnalysis(CRCustomerWorkbenchOperatingSessionRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceAnalysis customerWorkbenchOperatingSessionInstanceAnalysis) {
    this.customerWorkbenchOperatingSessionInstanceAnalysis = customerWorkbenchOperatingSessionInstanceAnalysis;
  }


}

