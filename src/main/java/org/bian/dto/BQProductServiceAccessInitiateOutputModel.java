package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactInitiateInputModelContactInstanceRecord;
import org.bian.dto.BQProductServiceAccessInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord;
import org.bian.dto.BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessInitiateOutputModel
 */
public class BQProductServiceAccessInitiateOutputModel   {
  private BQProductServiceAccessInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord = null;

  private BQContactInitiateInputModelContactInstanceRecord contactInstanceRecord = null;

  private String productServiceAccessInstanceReference = null;

  private String productServiceAccessInitiateActionReference = null;

  private Object productServiceAccessInitiateActionRecord = null;

  private String productServiceAccessInstanceStatus = null;

  private BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord productServiceAccessInstanceRecord = null;


  /**
   * Get customerWorkbenchOperatingSessionInstanceRecord
   * @return customerWorkbenchOperatingSessionInstanceRecord
  **/

  public BQProductServiceAccessInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord getCustomerWorkbenchOperatingSessionInstanceRecord() {
    return customerWorkbenchOperatingSessionInstanceRecord;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceRecord(BQProductServiceAccessInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord customerWorkbenchOperatingSessionInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Service Access instance 
   * @return productServiceAccessInstanceReference
  **/

  public String getProductServiceAccessInstanceReference() {
    return productServiceAccessInstanceReference;
  }

  public void setProductServiceAccessInstanceReference(String productServiceAccessInstanceReference) {
    this.productServiceAccessInstanceReference = productServiceAccessInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return productServiceAccessInitiateActionReference
  **/

  public String getProductServiceAccessInitiateActionReference() {
    return productServiceAccessInitiateActionReference;
  }

  public void setProductServiceAccessInitiateActionReference(String productServiceAccessInitiateActionReference) {
    this.productServiceAccessInitiateActionReference = productServiceAccessInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return productServiceAccessInitiateActionRecord
  **/

  public Object getProductServiceAccessInitiateActionRecord() {
    return productServiceAccessInitiateActionRecord;
  }

  public void setProductServiceAccessInitiateActionRecord(Object productServiceAccessInitiateActionRecord) {
    this.productServiceAccessInitiateActionRecord = productServiceAccessInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product Service Access instance (e.g. initialised, pending, active) 
   * @return productServiceAccessInstanceStatus
  **/

  public String getProductServiceAccessInstanceStatus() {
    return productServiceAccessInstanceStatus;
  }

  public void setProductServiceAccessInstanceStatus(String productServiceAccessInstanceStatus) {
    this.productServiceAccessInstanceStatus = productServiceAccessInstanceStatus;
  }


  /**
   * Get productServiceAccessInstanceRecord
   * @return productServiceAccessInstanceRecord
  **/

  public BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord getProductServiceAccessInstanceRecord() {
    return productServiceAccessInstanceRecord;
  }

  public void setProductServiceAccessInstanceRecord(BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord productServiceAccessInstanceRecord) {
    this.productServiceAccessInstanceRecord = productServiceAccessInstanceRecord;
  }


}

