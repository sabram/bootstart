#!/bin/bash

# Optional convenience script that generates a new project from this archetype and starts it up.
# Run from within the bootstart folder itself.
# Will create a new project called $artifactId at the same folder level as bootstart.
# Note that if a project called $artifactId already exists, it will be deleted!

groupId=com.shaunabram
artifactId=zboot

printf "\nUpdate the local maven catalog to make sure we are using the latest version of bootstart\n\n"
mvn install archetype:update-local-catalog

printf "\nGenerating new project called $artifactId\n\n"
cd ../..
rm -rf $artifactId
mvn archetype:generate -DarchetypeGroupId=com.shaunabram -DarchetypeArtifactId=bootstart -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=$groupId -DartifactId=$artifactId -DinteractiveMode=false

printf "\nStarting new project $artifactId\n\n"
cd $artifactId
mvn spring-boot:run

