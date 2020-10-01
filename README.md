msbase.scala
=======

## Use with Jitpack Repo

[![](https://jitpack.io/v/izgzhen/msbase.scala.svg)](https://jitpack.io/#izgzhen/msbase.scala)

See https://jitpack.io/#izgzhen/msbase.scala for instructions.

## Use locally

Install at local maven repo:

    sbt publishM2

Maven (`pom.xml`):

    <dependency>
        <groupId>io.github.izgzhen</groupId>
        <artifactId>msbase_2.13</artifactId>
        <version>0.1</version>
    </dependency>
    
or
    
    <dependency>
      <groupId>com.github.izgzhen</groupId>
      <artifactId>msbase.scala</artifactId>
      <version>master-SNAPSHOT</version>
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
