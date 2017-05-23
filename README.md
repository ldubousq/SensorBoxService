# [SensorBoxService](https://github.com/ldubousq/SensorBoxService)
## Introduction
##### This is api who implements Phidget library and resolve communication between phidget widget and web application [SensorBoxClient](https://github.com/ldubousq/SensorBoxClient). All values are available with one route : http://129.88.49.247:8080/axis2/services/SensorBoxService/getAllValues

##### An another project exists to publish subscribe with some sensors [SmartHVACSService](https://github.com/muretti0114/smart-hvac).

## Installation 
* Set up All Global variables to environnement and download all binary packages like :
    * Apache Ant 
    * Apache Maven
    * Apache Tomcat
    * Java
    * JRE
    * JDK
* Open project with Eclipse (Maven Project)
* Add Axis2 plugin on Eclipse 
    * Download Axis2 lib for eclipse [Axis2 Download Link](https://axis.apache.org/axis2/java/core/download.html)
        * Copy lib into your eclipse plugin location
    * Setup Axis2 in  `Preferences / Web Service / Axis2 Preferences `
* Follow tutorial for eclipse to settings up new java bottom up web services [Nice Tuto](http://www.objis.com/formation-java/Tutoriel-Web-services-avec-Axis-2.html)

## Ant Build 
###### Easy step
* `Alt+Shift+X` to `Run As / Ant Build...` on build.xml project and it generates new `SensorBoxService.aar`

## Maven Build
##### Todo

## Deploy 
##### Todo

> Written with [Romain Marecat](https://github.com/RomainMarecat).