msbase.scala
=======

Install at local maven repo:

    sbt publishM2

Maven (`pom.xml`):

    <dependency>
        <groupId>io.github.izgzhen</groupId>
        <artifactId>msbase_2.13</artifactId>
        <version>0.1</version>
    </dependency>

Gradle (`build.gradle`):

    repositories {
        mavenLocal()
    }

    dependencies {
        compile group: 'io.github.izgzhen', name: 'msbase_2.13', version: '0.1'
    }

SBT (`build.sbt`):

    resolvers += Resolver.mavenLocal
    libraryDependencies += "io.github.izgzhen" %% "msbase" % "0.1"

Github Actions:

    - name: Install msbase.scala
      run: |
        git clone https://github.com/izgzhen/msbase.scala ../msbase.scala
        cd ../msbase.scala
        sbt publishM2
