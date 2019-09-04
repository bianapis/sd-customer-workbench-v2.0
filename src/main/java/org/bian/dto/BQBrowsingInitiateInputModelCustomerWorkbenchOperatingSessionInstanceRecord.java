package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBrowsingInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord
 */
public class BQBrowsingInitiateInputModelCustomerWorkbenchOperatingSessionInstanceRecord   {
  private String customerReference = null;

  private String customerWorkbenchDeviceType = null;

  private String customerWorkbenchDeviceRegistration = null;

  private String customerWorkbenchDeviceManufacturer = null;

  private String customerWorkbenchDeviceOperatingSystemVersionNumber = null;

  private String customerWorkbenchDeviceAccessPermissions = null;

  private String installedBankApplicationType = null;

  private String installedBankApplicationVersionNumber = null;

  private String lastUpdateDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The customer running the workbench device 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of user device (e.g. mobile, laptop, workstation ) 
   * @return customerWorkbenchDeviceType
  **/

  public String getCustomerWorkbenchDeviceType() {
    return customerWorkbenchDeviceType;
  }

  public void setCustomerWorkbenchDeviceType(String customerWorkbenchDeviceType) {
    this.customerWorkbenchDeviceType = customerWorkbenchDeviceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to device properties used to identify the device (e.g. URL, ANI, serial number) 
   * @return customerWorkbenchDeviceRegistration
  **/

  public String getCustomerWorkbenchDeviceRegistration() {
    return customerWorkbenchDeviceRegistration;
  }

  public void setCustomerWorkbenchDeviceRegistration(String customerWorkbenchDeviceRegistration) {
    this.customerWorkbenchDeviceRegistration = customerWorkbenchDeviceRegistration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The make of the device if known 
   * @return customerWorkbenchDeviceManufacturer
  **/

  public String getCustomerWorkbenchDeviceManufacturer() {
    return customerWorkbenchDeviceManufacturer;
  }

  public void setCustomerWorkbenchDeviceManufacturer(String customerWorkbenchDeviceManufacturer) {
    this.customerWorkbenchDeviceManufacturer = customerWorkbenchDeviceManufacturer;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The operating system type and version (use to match downloaded software) 
   * @return customerWorkbenchDeviceOperatingSystemVersionNumber
  **/

  public String getCustomerWorkbenchDeviceOperatingSystemVersionNumber() {
    return customerWorkbenchDeviceOperatingSystemVersionNumber;
  }

  public void setCustomerWorkbenchDeviceOperatingSystemVersionNumber(String customerWorkbenchDeviceOperatingSystemVersionNumber) {
    this.customerWorkbenchDeviceOperatingSystemVersionNumber = customerWorkbenchDeviceOperatingSystemVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The bank's access permissions (e.g. local storage access, administrator permissions, system download permission) 
   * @return customerWorkbenchDeviceAccessPermissions
  **/

  public String getCustomerWorkbenchDeviceAccessPermissions() {
    return customerWorkbenchDeviceAccessPermissions;
  }

  public void setCustomerWorkbenchDeviceAccessPermissions(String customerWorkbenchDeviceAccessPermissions) {
    this.customerWorkbenchDeviceAccessPermissions = customerWorkbenchDeviceAccessPermissions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the local bank applications  
   * @return installedBankApplicationType
  **/

  public String getInstalledBankApplicationType() {
    return installedBankApplicationType;
  }

  public void setInstalledBankApplicationType(String installedBankApplicationType) {
    this.installedBankApplicationType = installedBankApplicationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version number(s) of device resident bank software 
   * @return installedBankApplicationVersionNumber
  **/

  public String getInstalledBankApplicationVersionNumber() {
    return installedBankApplicationVersionNumber;
  }

  public void setInstalledBankApplicationVersionNumber(String installedBankApplicationVersionNumber) {
    this.installedBankApplicationVersionNumber = installedBankApplicationVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The last update date time stamp for local bank software 
   * @return lastUpdateDateTime
  **/

  public String getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  public void setLastUpdateDateTime(String lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }


}

