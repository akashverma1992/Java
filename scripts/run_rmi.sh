export user=~/Desktop
export buildPath=$user/Java/builds/classes/
export CLASSPATH=~/Desktop/Java/builds/classes/
export port=6000

# create stub and skeleton object by rmic tool
rmic -d $buildPath demo_rmi.AdderRemote

# start rmi registry in one command prompt
rmiregistry $port
