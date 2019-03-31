Feature: FileUpload automation practice

  @FileUpload
  Scenario: Upload a file and confirm it
    Given I am at Herokaupp / File Upload
    When I select a file using Browse / Upload
    Then I can assure file has been uploaded