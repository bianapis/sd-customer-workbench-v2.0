package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactInitiateInputModelContactInstanceRecord;
import org.bian.dto.BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessExecuteOutputModel
 */
public class BQProductServiceAccessExecuteOutputModel   {
  private BQContactInitiateInputModelContactInstanceRecord contactInstanceRecord = null;

  private BQProductServiceAccessInitiateOutputModelProductServiceAccessInstanceRecord productServiceAccessInstanceRecord = null;

  private String productServiceAccessExecuteActionTaskReference = null;

  private Object productServiceAccessExecuteActionTaskRecord = null;

  private String productServiceAccessExecuteRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Service Access instance execute service call 
   * @return productServiceAccessExecuteActionTaskReference
  **/

  public String getProductServiceAccessExecuteActionTaskReference() {
    return productServiceAccessExecuteActionTaskReference;
  }

  public void setProductServiceAccessExecuteActionTaskReference(String productServiceAccessExecuteActionTaskReference) {
    this.productServiceAccessExecuteActionTaskReference = productServiceAccessExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return productServiceAccessExecuteActionTaskRecord
  **/

  public Object getProductServiceAccessExecuteActionTaskRecord() {
    return productServiceAccessExecuteActionTaskRecord;
  }

  public void setProductServiceAccessExecuteActionTaskRecord(Object productServiceAccessExecuteActionTaskRecord) {
    this.productServiceAccessExecuteActionTaskRecord = productServiceAccessExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Service Access execute transaction/record 
   * @return productServiceAccessExecuteRecordReference
  **/

  public String getProductServiceAccessExecuteRecordReference() {
    return productServiceAccessExecuteRecordReference;
  }

  public void setProductServiceAccessExecuteRecordReference(String productServiceAccessExecuteRecordReference) {
    this.productServiceAccessExecuteRecordReference = productServiceAccessExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

