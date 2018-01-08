export CLASSPATH=~/Desktop/Java/builds/classes/
export port=6000

# start the server in another command prompt 
java -cp $CLASSPATH demo_rmi.MyServer $port
