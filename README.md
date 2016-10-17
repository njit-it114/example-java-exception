# example-java-exception
Example Java project created via STS as Java Project, showing how to;
- create Checked Exceptions (MyException1, MyException2, MyException1Child), 
- create Checked Exceptions that are child of other Checked Exception (MyException1Child),
- throw ing checked Exceptions (Main.method1), 
- handle checked Exceptions thrown by called methods via either via try/catch or throws (MyMain.useMethod1,2,3,4,5), 
- how checked Exception inheritance can be used in overwriting methods in Child classes that throws these Exceptions,

## Setup dependencies
Make sure on your machine, you have;
- git installed
- a working unix shell (like git bash. If not there install git and use its "git bash")
- working JDK installed (with JAVA_HOME env variable added, and PATH env variable prefixed with %JAVA_HOME%/bin)

## How to use it  (NOTE in below the directory structure and names are suggested)
### Make sure you created the directory structure you want to store example projects in
As example, at bash command line issue;<br>
mkdir -p /c/it114/exampleProjects

### get(clone) the project from github
cd to where you put your example projects.<br>
As example, at bash command line issue;<br>
cd /c/it114/exampleProjects ) <br>
git clone https://github.com/njit-it114/example-java-exception.git <br>
or<br>
git clone https://github.com/njit-it114/example-java-exception.git  whateverDirectoryNameYouWantStuffToBeClonedInto