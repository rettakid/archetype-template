# meds-server-java

#to generate archetype
mvn archetype:create-from-project
mvn clean install

#to generate project
mvn archetype:generate -DarchetypeCatalog=local -DarchetypeGroupId=za.co.rettakid -DarchetypeArtifactId=archetype-template-archetype -DarchetypeVersion=1.0-SNAPSHOT
