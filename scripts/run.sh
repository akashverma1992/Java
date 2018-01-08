# clear

export mysqlj=~/java_libs/mysql-connector-java-8.0.8-dmr.jar
export libs=$mysqlj
export CLASSPATH=$libs:~/Desktop/Java/builds/classes/

echo $CLASSPATH;

# echo
# java -cp $CLASSPATH democce.DemoCCE
# echo 
# java -cp $CLASSPATH demo_collections.DemoArrayList
# echo
# java -cp $CLASSPATH demo_sql.SQLConnection
# echo
# java -cp $CLASSPATH demo_this.DemoThis
echo
# java -cp $CLASSPATH demo_nested_classes.OuterClass
# java -cp $CLASSPATH demo_nested_classes.Person
# java -cp $CLASSPATH demo_nested_classes.Person2
# java -cp $CLASSPATH demo_nested_classes.Person3
java -cp $CLASSPATH demo_nested_classes.Person4