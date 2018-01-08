echo 'Compiling....'

export user=~/Desktop
export buildPath=$user/Java/builds/classes/
# export libs=~/java_libs/
export CLASSPATH=$libs:~/Desktop/Java/builds/classes/

# javac -d $buildPath $user/Java/src/democce/*.java
# javac -d $buildPath $user/Java/src/demo_collections/*.java
# javac -d $buildPath $user/Java/src/demo_sql/*.java
# javac -d $buildPath $user/Java/src/demo_this/*.java

# # RMI
# javac -d $buildPath $user/Java/src/demo_rmi/*.java

# NestedClasses
javac -d $buildPath $user/Java/src/demo_nested_classes/*.java