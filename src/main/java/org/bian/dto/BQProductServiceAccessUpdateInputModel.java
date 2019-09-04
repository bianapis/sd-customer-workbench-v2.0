package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessUpdateInputModel
 */
public class BQProductServiceAccessUpdateInputModel   {
  private String customerWorkbenchOperatingSessionInstanceReference = null;

  private String productServiceAccessInstanceReference = null;

  private Object productServiceAccessUpdateActionTaskRecord = null;

  private String productServiceAccessUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Workbench Operating Session instance 
   * @return customerWorkbenchOperatingSessionInstanceReference
  **/

  public String getCustomerWorkbenchOperatingSessionInstanceReference() {
    return customerWorkbenchOperatingSessionInstanceReference;
  }

  public void setCustomerWorkbenchOperatingSessionInstanceReference(String customerWorkbenchOperatingSessionInstanceReference) {
    this.customerWorkbenchOperatingSessionInstanceReference = customerWorkbenchOperatingSessionInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productServiceAccessUpdateActionTaskRecord
  **/

  public Object getProductServiceAccessUpdateActionTaskRecord() {
    return productServiceAccessUpdateActionTaskRecord;
  }

  public void setProductServiceAccessUpdateActionTaskRecord(Object productServiceAccessUpdateActionTaskRecord) {
    this.productServiceAccessUpdateActionTaskRecord = productServiceAccessUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return productServiceAccessUpdateActionRequest
  **/

  public String getProductServiceAccessUpdateActionRequest() {
    return productServiceAccessUpdateActionRequest;
  }

  public void setProductServiceAccessUpdateActionRequest(String productServiceAccessUpdateActionRequest) {
    this.productServiceAccessUpdateActionRequest = productServiceAccessUpdateActionRequest;
  }


}

