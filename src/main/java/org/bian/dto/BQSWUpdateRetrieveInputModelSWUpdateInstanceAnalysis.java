package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSWUpdateRetrieveInputModelSWUpdateInstanceAnalysis
 */
public class BQSWUpdateRetrieveInputModelSWUpdateInstanceAnalysis   {
  private String sWUpdateInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return sWUpdateInstanceAnalysisReference
  **/

  public String getSWUpdateInstanceAnalysisReference() {
    return sWUpdateInstanceAnalysisReference;
  }

  public void setSWUpdateInstanceAnalysisReference(String sWUpdateInstanceAnalysisReference) {
    this.sWUpdateInstanceAnalysisReference = sWUpdateInstanceAnalysisReference;
  }


}

