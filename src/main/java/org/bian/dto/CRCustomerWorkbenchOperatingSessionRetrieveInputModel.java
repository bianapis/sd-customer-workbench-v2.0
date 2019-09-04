package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceAnalysis;
import org.bian.dto.CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerWorkbenchOperatingSessionRetrieveInputModel
 */
public class CRCustomerWorkbenchOperatingSessionRetrieveInputModel   {
  private Object customerWorkbenchOperatingSessionRetrieveActionTaskRecord = null;

  private String customerWorkbenchOperatingSessionRetrieveActionRequest = null;

  private CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceReportRecord customerWorkbenchOperatingSessionInstanceReportRecord = null;

  private CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceAnalysis customerWorkbenchOperatingSessionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerWorkbenchOperatingSessionRetrieveActionRequest
  **/

  public String getCustomerWorkbenchOperatingSessionRetrieveActionRequest() {
    return customerWorkbenchOperatingSessionRetrieveActionRequest;
  }

  public void setCustomerWorkbenchOperatingSessionRetrieveActionRequest(String customerWorkbenchOperatingSessionRetrieveActionRequest) {
    this.customerWorkbenchOperatingSessionRetrieveActionRequest = customerWorkbenchOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get customerWorkbenchOperatingSessionInstanceReportRecord
   * @return customerWorkbenchOperatingSessionInstanceReportRecord
  **/

  public CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceReportRecord getCustomerWorkbenchOperatingSessionInstanceReportRecord() {
    return customerWorkbenchOperatingSessionInstanceReportRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReportRecord(CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceReportRecord customerWorkbenchOperatingSessionInstanceReportRecord) {
    this.customerWorkbenchOperatingSessionInstanceReportRecord = customerWorkbenchOperatingSessionInstanceReportRecord;
  }


  /**
   * Get customerWorkbenchOperatingSessionInstanceAnalysis
   * @return customerWorkbenchOperatingSessionInstanceAnalysis
  **/

  public CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceAnalysis getCustomerWorkbenchOperatingSessionInstanceAnalysis() {
    return customerWorkbenchOperatingSessionInstanceAnalysis;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceAnalysis(CRCustomerWorkbenchOperatingSessionRetrieveInputModelCustomerWorkbenchOperatingSessionInstanceAnalysis customerWorkbenchOperatingSessionInstanceAnalysis) {
    this.customerWorkbenchOperatingSessionInstanceAnalysis = customerWorkbenchOperatingSessionInstanceAnalysis;
  }


}

