package com.Test1;

public class Notes {

    /*
     * MAVEN BUILD LIFECYCLE:
     * The Maven build lifecycle is a sequence of phases that define the order in which tasks are executed during the build process of a Maven project. Maven has 3 built-in build lifecycles:
     *
     *
     *
     * CLEAN LIFECYCLE
     * This lifecycle is used to clean up artifacts created by the previous build. It consists of three phases:
     * 1.pre-clean: Executes processes needed before the actual project cleaning.
     * 2.clean: Removes files generated during the previous build.
     * 3.post-clean: Executes processes needed after the project cleaning.
     * COMMANDS: mvn clean execute all phases
     *
     *
     *
     * DEFAULT LIFECYCLE (BUILD)
     * This is the main lifecycle that handles project deployment. It consists of 23 phases, the most important of which are:
     * 1.validate: Validates the project is correct and all necessary information is available.
     * 2.compile: Compiles the source code of the project.
     * 3.test: Runs the tests using a suitable unit testing framework (like JUnit).
     * 4.package: Packages the compiled code into a distributable format, such as a JAR or WAR file.
     * 5.verify: Runs any checks to verify the package is valid and meets quality criteria.
     * 6.install: Installs the package into the local repository, for use as a dependency in other projects locally.
     * 7.deploy: Copies the final package to the remote repository for sharing with other developers and projects.
     * COMMANDS: mvn validate, mvn compile, mvn test, ....
     *
     *
     * SITE LIFECYCLE
     * This lifecycle is used to create the project's site documentation. It consists of four phases:
     * 1.pre-site: Executes processes needed before the actual project site generation.
     * 2.site: Generates the project's site documentation.
     * 3.post-site: Executes processes needed after the site generation, preparing for site deployment.
     * 4.site-deploy: Deploys the generated site to a web server.
     * COMMANDS: mvn site

     * */
}
