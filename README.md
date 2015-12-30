# meds-server-java
<styling>https://help.github.com/articles/markdown-basics/</styling>

##to generate archetype
1. mvn archetype:create-from-project
2. cd target\generated-sources\archetype
3. add property to archetype-metadata.xml
4. add custom property to archetype.properties (in test)
4. add '${groupId}' to all local dependancies in all poms
5. change to `<display-name>${project-name}</display-name>` in web.xml
6. mvn clean install
7. 

add
```
<archetype-descriptor name="basic">
  <requiredProperties>
    <requiredProperty key="project-name"/>
  </requiredProperties>
...
</archetype-descriptor>
```

files to replace
- base-layout
- log4j*

##to generate project
1. mvn archetype:generate -DarchetypeCatalog=local -DarchetypeGroupId=za.co.rettakid.template -DarchetypeArtifactId=archetype-template-archetype -DarchetypeVersion=1.0-SNAPSHOT
