# meds-server-java

##to generate archetype
1. mvn archetype:create-from-project
2. cd target\generated-sources\archetype
3. add property to archetype-metadata.xml
4. add '${groupId}' to all local dependancies in all poms
5. change to `<display-name>${project-name}</display-name>` to web.xml
3. mvn clean install
4. 

add
```
<archetype-descriptor name="basic">
  <requiredProperties>
    <requiredProperty key="${project-name}"/>
  </requiredProperties>
...
</archetype-descriptor>
```

##to generate project
1. mvn archetype:generate -DarchetypeCatalog=local -DarchetypeGroupId=za.co.rettakid.template -DarchetypeArtifactId=archetype-template-archetype -DarchetypeVersion=1.0-SNAPSHOT
