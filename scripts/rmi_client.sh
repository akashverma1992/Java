export CLASSPATH=~/Desktop/Java/builds/classes/
export port=6000

# start the client application in another command prompt
java -cp $CLASSPATH demo_rmi.MyClient $port