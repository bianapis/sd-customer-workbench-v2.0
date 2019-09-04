package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessUpdateOutputModel
 */
public class BQProductServiceAccessUpdateOutputModel   {
  private String productServiceAccessUpdateActionTaskReference = null;

  private Object productServiceAccessUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productServiceAccessUpdateActionTaskReference
  **/

  public String getProductServiceAccessUpdateActionTaskReference() {
    return productServiceAccessUpdateActionTaskReference;
  }

  public void setProductServiceAccessUpdateActionTaskReference(String productServiceAccessUpdateActionTaskReference) {
    this.productServiceAccessUpdateActionTaskReference = productServiceAccessUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

