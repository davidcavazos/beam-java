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

Optionally, configure your IDE to support `sbt`.

For example, [Cloud Shell](https://cloud.google.com/shell) uses [Theia](https://theia-ide.org)
for its IDE, which is compatible with most VS Code extensions.
You can look at the available VSIX extensions at [open-vsx.org](https://open-vsx.org).

> ⚠️ The terms and conditions in the Visual Studio Marketplace do not allow to
> install their extensions in other IDEs.
> Please use [open-vsx.org](https://open-vsx.org) instead.

For `sbt` and Scala support, we need the
[Scala Lang](https://open-vsx.org/extension/scala-lang/scala) and the
[Scala (Metals)](https://open-vsx.org/extension/scalameta/metals) extensions.

```sh
# Make sure the theia extensions directory exists.
mkdir -p ~/.theia/extensions

# Check out the extension pages to install the latest versions.
SCALA_LANG_VERSION=0.5.0
SCALA_METALS_VERSION=1.10.2

wget -O /tmp/scala-lang.vsix https://open-vsx.org/api/scala-lang/scala/$SCALA_LANG_VERSION/file/scala-lang.scala-$SCALA_LANG_VERSION.vsix
wget -O /tmp/scala-metals.vsix https://open-vsx.org/api/scalameta/metals/$SCALA_METALS_VERSION/file/scalameta.metals-$SCALA_METALS_VERSION.vsix
unzip /tmp/scala-lang.vsix -d ~/.theia/extensions/scala-lang
unzip /tmp/scala-metals.vsix -d ~/.theia/extensions/scala-metals
```

Then restart Cloud Shell to load the extension.

In the IDE settings, you might need to set the "Java Home" in the Metals extension.

```sh
# Set this in the "Metals" -> "Java Home" settings of your IDE.
echo $JAVA_HOME
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
