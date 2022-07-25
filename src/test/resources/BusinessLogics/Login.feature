Feature: Login functionanality 

Background: Launch Browser and Open application
Given enter key as "webdriver.chrome.driver" and value as "D:\\ALLSOFTWARES\\Automation support\\selenium_and _drivers\\chromedriver103.0.5060.24\\chromedriver.exe"
Given enter url as "http://www.Facebook.com"

@SmokeTest
Scenario: Login Functionality with valid Credentials
When user enter username As "sachinrohokale0607@gmail.com"
When user enter password as "Pu!W9Ur5fr1Z5@E"
When user click on login button
When user click on popup
Then Application Shows Name of The User As "Sachin Rohokale"