- Install SikuliX in a computer

- Install in pom repository - com.sikulix

        <repository>
            <id>com.sikulix</id>
            <name>com.sikulix</name>
            <url>https://oss.sonatype.org/content/groups/public</url>
            <layout>default</layout>
            <snapshots>
                <enabled>true</enabled>
                <updatePolicy>always</updatePolicy>
            </snapshots>
        </repository>

- Install dependence sikulixapi.java in pom

        <dependency>
            <groupId>com.sikulix</groupId>
            <artifactId>sikulixapi</artifactId>
            <version>1.1.0</version>
        </dependency>



- run test

clean integration-test  serenity:aggregate
