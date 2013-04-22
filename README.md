Energy2People
=============

This project is solving the Renewable Energy Explorer challenge for the 2013 NASA International Space Apps Challenge.

Interactive Data visualization client for the selection of wealthy renewable resources areas. The application allows to the user the estimation of potential amount of energy in a specific location.


Renewable Energy FAQ
--------------------
### What is the purpose of Energy2People?
The aim of this website is to visualize several geophysical parameters collected by NASA that have a direct impact on renewable energies, and to explore suitable areas for the installation of power generation facilities.

### Which locations are available?
The data is limited to the Iberian Peninsula and have a spatial resolution of 1 degree (approximately 110 km). The data source has a worldwide coverage and additional countries may be added upon request.

### Which source data is available?
The collected data to be displayed on the map are: horizontal solar radiation, dew frost, relative humidity, wind speed, precipitation and temperature. The unitary temporal resolution is 1 day and you can aggregate data to produce monthly and yearly series as well using the input form.

### Why can´t I see data in some cases?
Not all the data are available for the complete temporal range. The following table shows the range for each geophysical parameter.
 * Horizontal solar radiation: Jul 1983 - present
 * Dew frost: Jan 1983 - present
 * Wind speed: Jan 1983 - present
 * Precipitation: Jan 1997 - Aug 2009
 * Relative humidity: Jan 1983 - present
 * Temperature: Jan 1983 - present

### Why can´t I see data in some cases?
Based on the source data a simple calculation is done to estimate the solar and wind energy at a given location proposed by the user. To achieve this the user gives the total surface of solar panels, the number of wind turbines and the type of facility to be installed. With these inputs the application calculates the energy generated per day, the number of homes that can be powered with this energy, the monetary value, the facilities cost and the time to recover the investment.


Dependencies
------------

### Production environment
 * [Apache Tomcat 1.6](http://tomcat.apache.org/)
 * [PostgreSQL 9.1](http://www.postgresql.org/)

### FrontEnd dependencies
 * [JQuery 1.7.1](http://jquery.com/)
 * [Bootstrap 2.3.1](http://twitter.github.io/bootstrap/)
 * [Amcharts 2.10.0](http://www.amcharts.com/)

### BackEnd dependencies
 * [Apache Maven 3.0.5](http://maven.apache.org/)
 * [JUnit 4.11](http://junit.org/)
 * [Apache Java Servlet 2.4](http://tomcat.apache.org/)
 * [JavaAPIforKml 2.2.0](https://code.google.com/p/javaapiforkml/)
 * [Apache log4j 1.2.17](http://logging.apache.org/log4j/1.2/)
 * [olap4j 1.0.1.539](http://www.olap4j.org/)
 * [mondrian 3.3.0.14701](http://mondrian.pentaho.com/)
 * [eigenbase 1.1.0.10924](http://www.eigenbase.org/)
 * [Json-simple 1.1](https://code.google.com/p/json-simple/)
 * [htmlunit 2.12](http://htmlunit.sourceforge.net/)
 * ch.hsr.geohash


Resources
---------
 * [Github MAIN Repo](https://github.com/borja3790/SpaceAppMadrid)
 * [GitHub Repo FrontEnd Code](https://github.com/rafinskipg/Energy2PeopleFront)
 * [FrontEnd Test Page](http://appsets.com/index.html)


Project Information
-------------------

### License
[Creative Commons BY-NC 3.0](http://creativecommons.org/licenses/by-nc/3.0/)


### Team
 * [Alberto Alcolea Ursua](https://github.com/albertoalcolea)
 * [Borja Espejo Garcia](https://github.com/borja3790)
 * [Rafael Pedrola](https://github.com/rafinskipg)
 * Albert Zurita
 * Fernando Martin
 * Enrique Perez Alonso
 * Pau Contreras de Luna
 * [Daniel Sanchez Seijo](https://github.com/Daniseijo)
 * [David Portilla Abellan](https://github.com/davidportilla)