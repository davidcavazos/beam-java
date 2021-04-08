# Apache Beam starter for Java

## Before you begin

We are using [`sbt`](https://www.scala-sbt.org) to build and run this application.
It's easiest to install with [`sdkman`](https://sdkman.io).

You can easily install any Java version with `sdkman` as well.

```sh
# Make sure you have sdkman installed.
curl -s "https://get.sdkman.io" | bash

# (Optional) Install the Java version of your choice
sdk list java
sdk install java 16.0.0.j9-adpt

# Make sure you have sbt installed.
sdk install sbt
```

## Running the pipeline

To build and run the pipeline, simply run the following command:

```sh
sbt run
```
