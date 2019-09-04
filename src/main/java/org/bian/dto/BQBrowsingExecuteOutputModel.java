package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBrowsingInitiateInputModelBrowsingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBrowsingExecuteOutputModel
 */
public class BQBrowsingExecuteOutputModel   {
  private BQBrowsingInitiateInputModelBrowsingInstanceRecord browsingInstanceRecord = null;

  private String browsingExecuteActionTaskReference = null;

  private Object browsingExecuteActionTaskRecord = null;

  private String browsingExecuteRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Browsing instance execute service call 
   * @return browsingExecuteActionTaskReference
  **/

  public String getBrowsingExecuteActionTaskReference() {
    return browsingExecuteActionTaskReference;
  }

  public void setBrowsingExecuteActionTaskReference(String browsingExecuteActionTaskReference) {
    this.browsingExecuteActionTaskReference = browsingExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return browsingExecuteActionTaskRecord
  **/

  public Object getBrowsingExecuteActionTaskRecord() {
    return browsingExecuteActionTaskRecord;
  }

  public void setBrowsingExecuteActionTaskRecord(Object browsingExecuteActionTaskRecord) {
    this.browsingExecuteActionTaskRecord = browsingExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Browsing execute transaction/record 
   * @return browsingExecuteRecordReference
  **/

  public String getBrowsingExecuteRecordReference() {
    return browsingExecuteRecordReference;
  }

  public void setBrowsingExecuteRecordReference(String browsingExecuteRecordReference) {
    this.browsingExecuteRecordReference = browsingExecuteRecordReference;
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

