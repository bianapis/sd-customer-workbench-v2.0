package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactInitiateInputModelContactInstanceRecord;
import org.bian.dto.BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessRequestOutputModel
 */
public class BQProductServiceAccessRequestOutputModel   {
  private BQContactInitiateInputModelContactInstanceRecord contactInstanceRecord = null;

  private BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord productServiceAccessInstanceRecord = null;

  private String productServiceAccessRequestActionTaskReference = null;

  private Object productServiceAccessRequestActionTaskRecord = null;

  private String productServiceAccessRequestRecordReference = null;

  private Object requestResponseRecord = null;


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

  public BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord getProductServiceAccessInstanceRecord() {
    return productServiceAccessInstanceRecord;
  }

  public void setProductServiceAccessInstanceRecord(BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord productServiceAccessInstanceRecord) {
    this.productServiceAccessInstanceRecord = productServiceAccessInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Service Access instance request service call 
   * @return productServiceAccessRequestActionTaskReference
  **/

  public String getProductServiceAccessRequestActionTaskReference() {
    return productServiceAccessRequestActionTaskReference;
  }

  public void setProductServiceAccessRequestActionTaskReference(String productServiceAccessRequestActionTaskReference) {
    this.productServiceAccessRequestActionTaskReference = productServiceAccessRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productServiceAccessRequestActionTaskRecord
  **/

  public Object getProductServiceAccessRequestActionTaskRecord() {
    return productServiceAccessRequestActionTaskRecord;
  }

  public void setProductServiceAccessRequestActionTaskRecord(Object productServiceAccessRequestActionTaskRecord) {
    this.productServiceAccessRequestActionTaskRecord = productServiceAccessRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Service Access service request record 
   * @return productServiceAccessRequestRecordReference
  **/

  public String getProductServiceAccessRequestRecordReference() {
    return productServiceAccessRequestRecordReference;
  }

  public void setProductServiceAccessRequestRecordReference(String productServiceAccessRequestRecordReference) {
    this.productServiceAccessRequestRecordReference = productServiceAccessRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

