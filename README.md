##bootstart
========================
Maven archetype to create a new Spring Boot project.
Based on, and creates the dame folder structure as, [maven-archetype-quickweb](https://github.com/sabram/maven-archetype-quickweb/).

To use:

####1. Clone from git

`$ git clone git://github.com/sabram/bootstart.git`

####2. Install to your local repo

`$ mvn install archetype:update-local-catalog`

Notes:

* Do this from the bootstart directory
* You should now see the project in your local maven repo. For example:
    * Mac: ~/.m2/repository/com/shaunabram/bootstart`
    * Windows: ${user.home}\.m2\repository\com\shaunabram\bootstart`

####3. Run to generate your own project:

```
$ mvn archetype:generate
-DarchetypeGroupId=com.shaunabram
-DarchetypeArtifactId=bootstart
-DarchetypeVersion=1.0-SNAPSHOT
-DgroupId=<my.groupid>
-DartifactId=<my-artifactId>
```
Replacing &lt;my.groupid&gt;  and &lt;my-artifactId&gt; as appropriate.
For example:

```mvn archetype:generate -DarchetypeGroupId=com.shaunabram -DarchetypeArtifactId=bootstart -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.yourcompany -DartifactId=yourProjectName```



