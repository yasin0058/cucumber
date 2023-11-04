@excel
Feature: user creation with excel
  Scenario: user_creation_with_excel
#    Given user navigates to "https://editor.datatables.net/", and user enters "user_data" from "data_sheet.xlsx" and verify user is created
    Given user navigates to "https://editor.datatables.net/"
    And user enters "user_data" from "data_sheet.xlsx" and verify user is created
    And close the applicatione application