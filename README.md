# Apache Beam starter for Java

## Before you begin

We are using [`sbt`](https://www.scala-sbt.org) to build and run this application.
It's easiest to install with [`sdkman`](https://sdkman.io).

You can easily install any Java version with `sdkman` as well.

```sh
# Make sure you have sdkman installed.
curl -s "https://get.sdkman.io" | bash

# Make sure you have Java installed.
sdk install java

# Make sure you have sbt installed.
sdk install sbt
```

## Running the pipeline

You can run the project by simply running:

```sh
sbt run
```

You can also pass command line arguments to your pipeline.
Note that you need quotes for the run command, otherwise they are interpreted as another `sbt` command.

```sh
sbt "run
    --project=my-project-id
    --inputText=MyCustomText
"
```

To speed up subsequent builds, you can also run `sbt` in an
[interactive shell](https://www.scala-sbt.org/1.x/docs/sbt-by-example.html),
that way it only loads once.
