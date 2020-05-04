
#Description  : All Scenarios has been written into the feature file(cucumber) 
#Author				: Sheetal Chaudhari
#Created date : 20/07/2019

#Feature : List of scenarios.
@tag
Feature: Login To Facebook with valid credentials

#Scenario 1 : Business rule through list of steps with arguments.
Scenario: To check whether user is able to login to Facebook using valid Credentials

When Successfully Loggedin to Facebook using Valid mail id "Enter your Email here" and Password "Enter your password here"
Then Facebook Welcome page is successfully displayed	

#Scenario 2 : Business rule through list of steps with arguments.
Scenario: Successful Login to Facebook Page with default credentials

When Successfully Logged in to Facebook with default Credentials
Then Facebook Welcome page is successfully displayed




   
