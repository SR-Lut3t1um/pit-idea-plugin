
PIT Idea Plugin
===============

IntelliJ IDEA plugin for PIT mutation testing (http://pitest.org).

JUnit / TestNG tests are supported.
Dependency to PIT must be added to the tested project, e.g.: org.pitest:pitest:0.30


Build Requirements
==================
Requires IntelliJ IDEA installation for building.
- edit build.gradle and change values of 'ideaInstallationPath' and 'ideaJdk' to be in sync with your environment
- invoke 'gradle build' from command line to build
- invoke 'gradle idea' from command line to generate IDEA specific files - provides possibility to be opened as IDEA project.