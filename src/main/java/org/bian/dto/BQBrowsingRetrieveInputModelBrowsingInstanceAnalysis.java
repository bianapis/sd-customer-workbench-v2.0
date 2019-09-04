package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrowsingRetrieveInputModelBrowsingInstanceAnalysis
 */
public class BQBrowsingRetrieveInputModelBrowsingInstanceAnalysis   {
  private String browsingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return browsingInstanceAnalysisReference
  **/

  public String getBrowsingInstanceAnalysisReference() {
    return browsingInstanceAnalysisReference;
  }

  public void setBrowsingInstanceAnalysisReference(String browsingInstanceAnalysisReference) {
    this.browsingInstanceAnalysisReference = browsingInstanceAnalysisReference;
  }


}

