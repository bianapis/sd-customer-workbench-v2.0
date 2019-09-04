package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrowsingRetrieveInputModelBrowsingInstanceReport
 */
public class BQBrowsingRetrieveInputModelBrowsingInstanceReport   {
  private String browsingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return browsingInstanceReportReference
  **/

  public String getBrowsingInstanceReportReference() {
    return browsingInstanceReportReference;
  }

  public void setBrowsingInstanceReportReference(String browsingInstanceReportReference) {
    this.browsingInstanceReportReference = browsingInstanceReportReference;
  }


}

