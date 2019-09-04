package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactInitiateInputModelContactInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQContactExecuteOutputModel
 */
public class BQContactExecuteOutputModel   {
  private BQContactInitiateInputModelContactInstanceRecord contactInstanceRecord = null;

  private String contactExecuteActionTaskReference = null;

  private Object contactExecuteActionTaskRecord = null;

  private String contactExecuteRecordReference = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Contact instance execute service call 
   * @return contactExecuteActionTaskReference
  **/

  public String getContactExecuteActionTaskReference() {
    return contactExecuteActionTaskReference;
  }

  public void setContactExecuteActionTaskReference(String contactExecuteActionTaskReference) {
    this.contactExecuteActionTaskReference = contactExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return contactExecuteActionTaskRecord
  **/

  public Object getContactExecuteActionTaskRecord() {
    return contactExecuteActionTaskRecord;
  }

  public void setContactExecuteActionTaskRecord(Object contactExecuteActionTaskRecord) {
    this.contactExecuteActionTaskRecord = contactExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Contact execute transaction/record 
   * @return contactExecuteRecordReference
  **/

  public String getContactExecuteRecordReference() {
    return contactExecuteRecordReference;
  }

  public void setContactExecuteRecordReference(String contactExecuteRecordReference) {
    this.contactExecuteRecordReference = contactExecuteRecordReference;
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

