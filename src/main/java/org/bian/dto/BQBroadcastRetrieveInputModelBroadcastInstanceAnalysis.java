package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBroadcastRetrieveInputModelBroadcastInstanceAnalysis
 */
public class BQBroadcastRetrieveInputModelBroadcastInstanceAnalysis   {
  private String broadcastInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return broadcastInstanceAnalysisReference
  **/

  public String getBroadcastInstanceAnalysisReference() {
    return broadcastInstanceAnalysisReference;
  }

  public void setBroadcastInstanceAnalysisReference(String broadcastInstanceAnalysisReference) {
    this.broadcastInstanceAnalysisReference = broadcastInstanceAnalysisReference;
  }


}

