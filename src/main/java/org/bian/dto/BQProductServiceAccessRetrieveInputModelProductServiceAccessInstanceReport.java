package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceAccessRetrieveInputModelProductServiceAccessInstanceReport
 */
public class BQProductServiceAccessRetrieveInputModelProductServiceAccessInstanceReport   {
  private String productServiceAccessInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productServiceAccessInstanceReportReference
  **/

  public String getProductServiceAccessInstanceReportReference() {
    return productServiceAccessInstanceReportReference;
  }

  public void setProductServiceAccessInstanceReportReference(String productServiceAccessInstanceReportReference) {
    this.productServiceAccessInstanceReportReference = productServiceAccessInstanceReportReference;
  }


}

