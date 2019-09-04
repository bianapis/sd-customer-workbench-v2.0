package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactInitiateInputModelContactInstanceRecord;
import org.bian.dto.BQProductServiceAccessInitiateInputModelProductServiceAccessInstanceRecord;
import org.bian.dto.BQProductServiceAccessRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord;
import org.bian.dto.BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceAnalysis;
import org.bian.dto.BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessRetrieveOutputModel
 */
public class BQProductServiceAccessRetrieveOutputModel   {
  private BQProductServiceAccessRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private BQContactInitiateInputModelContactInstanceRecord contactInstanceRecord = null;

  private BQProductServiceAccessInitiateInputModelProductServiceAccessInstanceRecord productServiceAccessInstanceRecord = null;

  private String productServiceAccessRetrieveActionTaskReference = null;

  private Object productServiceAccessRetrieveActionTaskRecord = null;

  private String productServiceAccessRetrieveActionResponse = null;

  private BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceReport productServiceAccessInstanceReport = null;

  private BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceAnalysis productServiceAccessInstanceAnalysis = null;


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public BQProductServiceAccessRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(BQProductServiceAccessRetrieveOutputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
    this.customerWorkbenchOperatingSessionInstanceRecord = customerWorkbenchOperatingSessionInstanceRecord;
  }


  /**
   * Get contactInstanceRecord
   * @return contactInstanceRecord
  **/

  public BQContactInitiateInputModelContactInstanceRecord getContactInstanceRecord() {
    return contactInstanceRecord;
  }

  public void setContactInstanceRecord(BQContactInitiateInputModelContactInstanceRecord contactInstanceRecord) {
    this.contactInstanceRecord = contactInstanceRecord;
  }


  /**
   * Get productServiceAccessInstanceRecord
   * @return productServiceAccessInstanceRecord
  **/

  public BQProductServiceAccessInitiateInputModelProductServiceAccessInstanceRecord getProductServiceAccessInstanceRecord() {
    return productServiceAccessInstanceRecord;
  }

  public void setProductServiceAccessInstanceRecord(BQProductServiceAccessInitiateInputModelProductServiceAccessInstanceRecord productServiceAccessInstanceRecord) {
    this.productServiceAccessInstanceRecord = productServiceAccessInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Service Access instance retrieve service call 
   * @return productServiceAccessRetrieveActionTaskReference
  **/

  public String getProductServiceAccessRetrieveActionTaskReference() {
    return productServiceAccessRetrieveActionTaskReference;
  }

  public void setProductServiceAccessRetrieveActionTaskReference(String productServiceAccessRetrieveActionTaskReference) {
    this.productServiceAccessRetrieveActionTaskReference = productServiceAccessRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productServiceAccessRetrieveActionTaskRecord
  **/

  public Object getProductServiceAccessRetrieveActionTaskRecord() {
    return productServiceAccessRetrieveActionTaskRecord;
  }

  public void setProductServiceAccessRetrieveActionTaskRecord(Object productServiceAccessRetrieveActionTaskRecord) {
    this.productServiceAccessRetrieveActionTaskRecord = productServiceAccessRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productServiceAccessRetrieveActionResponse
  **/

  public String getProductServiceAccessRetrieveActionResponse() {
    return productServiceAccessRetrieveActionResponse;
  }

  public void setProductServiceAccessRetrieveActionResponse(String productServiceAccessRetrieveActionResponse) {
    this.productServiceAccessRetrieveActionResponse = productServiceAccessRetrieveActionResponse;
  }


  /**
   * Get productServiceAccessInstanceReport
   * @return productServiceAccessInstanceReport
  **/

  public BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceReport getProductServiceAccessInstanceReport() {
    return productServiceAccessInstanceReport;
  }

  public void setProductServiceAccessInstanceReport(BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceReport productServiceAccessInstanceReport) {
    this.productServiceAccessInstanceReport = productServiceAccessInstanceReport;
  }


  /**
   * Get productServiceAccessInstanceAnalysis
   * @return productServiceAccessInstanceAnalysis
  **/

  public BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceAnalysis getProductServiceAccessInstanceAnalysis() {
    return productServiceAccessInstanceAnalysis;
  }

  public void setProductServiceAccessInstanceAnalysis(BQProductServiceAccessRetrieveOutputModelProductServiceAccessInstanceAnalysis productServiceAccessInstanceAnalysis) {
    this.productServiceAccessInstanceAnalysis = productServiceAccessInstanceAnalysis;
  }


}

