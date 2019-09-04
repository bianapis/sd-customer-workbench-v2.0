package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSWUpdateExchangeOutputModel
 */
public class BQSWUpdateExchangeOutputModel   {
  private String sWUpdateExchangeActionTaskReference = null;

  private Object sWUpdateExchangeActionTaskRecord = null;

  private String sWUpdateExchangeActionResponse = null;

  private String sWUpdateInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a SW Update instance exchange service call 
   * @return sWUpdateExchangeActionTaskReference
  **/

  public String getSWUpdateExchangeActionTaskReference() {
    return sWUpdateExchangeActionTaskReference;
  }

  
  @JsonProperty("sWUpdateExchangeActionTaskReference")
  public void setSWUpdateExchangeActionTaskReference(String sWUpdateExchangeActionTaskReference) {
    this.sWUpdateExchangeActionTaskReference = sWUpdateExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return sWUpdateExchangeActionTaskRecord
  **/

  public Object getSWUpdateExchangeActionTaskRecord() {
    return sWUpdateExchangeActionTaskRecord;
  }

  @JsonProperty("sWUpdateExchangeActionTaskRecord")
  public void setSWUpdateExchangeActionTaskRecord(Object sWUpdateExchangeActionTaskRecord) {
    this.sWUpdateExchangeActionTaskRecord = sWUpdateExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return sWUpdateExchangeActionResponse
  **/

  public String getSWUpdateExchangeActionResponse() {
    return sWUpdateExchangeActionResponse;
  }

  @JsonProperty("sWUpdateExchangeActionResponse")
  public void setSWUpdateExchangeActionResponse(String sWUpdateExchangeActionResponse) {
    this.sWUpdateExchangeActionResponse = sWUpdateExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the SW Update instance (e.g. accepted, rejected, verified) 
   * @return sWUpdateInstanceStatus
  **/

  public String getSWUpdateInstanceStatus() {
    return sWUpdateInstanceStatus;
  }

  @JsonProperty("sWUpdateInstanceStatus")
  public void setSWUpdateInstanceStatus(String sWUpdateInstanceStatus) {
    this.sWUpdateInstanceStatus = sWUpdateInstanceStatus;
  }


}

