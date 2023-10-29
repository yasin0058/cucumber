Feature: google_search_feature

  Background:
    Given user is on the google home page

  @iPhone
  Scenario: TC01_iPhone_search
  And search for iPhone
  Then verify the result contains iPhone



    @teapot
    Scenario: TC02_tea_pot_search
    And search for tea pot
    Then verify the result contains tea pot





  # All feature file should have .feature extension
  # All feature file start with start Feature key word
  # Scenario is another keyword that we use to create test(just like Test method in normal classes in TestNG)
  # We use Gherkin language to write to test steps
  # Keywords for Gherkin language: Given, When, And, Then, But,*
  # Feature keyword can be use ONLY ONCE in one file.
  # But Scenario keyword can be used multiple times (depends on how many test cases you want to create
#Background is used for the repeated Pre-conditions.
  #it is used @BeforeEach scenario

  #StepDefs
