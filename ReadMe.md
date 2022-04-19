POM Cucumber BDD framework

The Framework was built on Maven by using Java programing language.
In POM.xml file I stored all dependencies.
For assertions, I am using jUnit. I have a separate directory for my features and I am writing all my scenarios in Gherking language.
I implement the actual coding logic inside of my step_definitions.
My framework is based of POM. Inside my pages package I have page classes which represents each page of my application. It allows me to locate the web elements only once, in their respective classes. 
In Utils, I have ConfigurationReader and Driver classes. Configuration reader class reads from my configuration property file and converts the data stored in configuration property file to the object.
I trigger my framework from my runner class and report can be generated in the target folder.


