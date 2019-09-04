package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSWUpdateInitiateInputModelSWUpdateInstanceRecord
 */
public class BQSWUpdateInitiateInputModelSWUpdateInstanceRecord   {
  private String sWUpdateApplication = null;

  private String sWUpdateVersion = null;

  private String sWUpdateImage = null;

  private String date = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The name of the bank application that is downloaded 
   * @return sWUpdateApplication
  **/

  public String getSWUpdateApplication() {
    return sWUpdateApplication;
  }

  @JsonProperty("sWUpdateApplication")
  public void setSWUpdateApplication(String sWUpdateApplication) {
    this.sWUpdateApplication = sWUpdateApplication;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version number downloaded 
   * @return sWUpdateVersion
  **/

  public String getSWUpdateVersion() {
    return sWUpdateVersion;
  }
  
  @JsonProperty("sWUpdateVersion")
  public void setSWUpdateVersion(String sWUpdateVersion) {
    this.sWUpdateVersion = sWUpdateVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The downloaded executable image 
   * @return sWUpdateImage
  **/

  public String getSWUpdateImage() {
    return sWUpdateImage;
  }

  @JsonProperty("sWUpdateImage")
  public void setSWUpdateImage(String sWUpdateImage) {
    this.sWUpdateImage = sWUpdateImage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time of the download 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


}

