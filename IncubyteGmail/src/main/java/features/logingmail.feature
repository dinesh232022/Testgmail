Feature: Signin functionality of Gmail application


Background:
Given Open the Chrome Browser
And Load the application Url 'https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin'

@smoke @regression
Scenario Outline: TC002_Signin  with positive data

Given Enter username as <username>
When Click next 
Given Enter password as <password>
When Click Next Button1 to sigin 
Then  Homepage should be displayed 
When Click on Compose button 
Given Enter To send gmail name as 'dineshkumasa2@gmail.com'
And Enter Subject name as 'Incubyte'
And Enter body as 'Automation QA test for Incubyte'
When Click on Send button 
Then message Sent verification

Examples: 
|username||password|
|'dinesh232022@gmail.com'||'RamyaGomez3!'|
|'dinesh@gmail.com'||'gomez'|

@functional
Scenario: TC002_Signin  with Negative data

Given Enter username as 'dinesh@gmail.com'
When Click next 
Given Enter password as 'Ramya'
When Click Next Button1 to sigin 
Then  Homepage should be displayed 
When Click on Compose button 
Given Enter To send gmail name as 'dineshkumasa2@gmail.com'
And Enter Subject name as 'Incubyte'
And Enter body as 'Automation QA test for Incubyte'
When Click on Send button 
But Error message should be display  


