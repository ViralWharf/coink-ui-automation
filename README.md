# Coink-ui-automation
***
## Description:
#### Initial automation focused on login failure with validation of labels. Dessign pattner in POM.
#### Technical test for coink.
***
## Automated Services
### TestCases
1. Login three times failed and wait 15 minutes. [loginThreeFailed()](#Test.java)
2. Locates the coordinates of an element without a selector. [coordinatesBottom()](#Coordinates.java)
3. Implicit waits with time in seconds. [Waits.waits()](#Waits.java)
4. Run tests with label validation. [MainClass](#Test.java)

***
### Things to keep in mind
* The button to accept access to the location of the device is not yet automated, it is necessary to select it manually.
* Everything shown in Installation is needed.
***
### Installation
1. Java v8 or highter.
2. Node v18.
3. Npm v8.
4. Appium 1.22.3.
5. Executed with Appium Doctor.
6. Setting the capabilities depending on the device.