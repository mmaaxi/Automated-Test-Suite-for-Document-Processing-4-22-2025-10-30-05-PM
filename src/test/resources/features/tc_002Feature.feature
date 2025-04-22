Feature: File Upload and Preview
  As a user
  I want to upload a valid file and preview it
  So that I can verify the details before submission

  Scenario: Validate upload of a valid file format and preview
    Given I am on the file upload page
    When I select a file "example.pdf" within the limit of 50 MB
    Then the file should be uploaded and a preview should be displayed
    And the preview should show the file name, size, and type