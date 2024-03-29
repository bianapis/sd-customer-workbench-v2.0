package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSWUpdateRetrieveInputModelSWUpdateInstanceReport
 */
public class BQSWUpdateRetrieveInputModelSWUpdateInstanceReport   {
  private String sWUpdateInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return sWUpdateInstanceReportReference
  **/

  public String getSWUpdateInstanceReportReference() {
    return sWUpdateInstanceReportReference;
  }

  @JsonProperty("sWUpdateInstanceReportReference")
  public void setSWUpdateInstanceReportReference(String sWUpdateInstanceReportReference) {
    this.sWUpdateInstanceReportReference = sWUpdateInstanceReportReference;
  }


}

