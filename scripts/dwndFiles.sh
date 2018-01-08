export dir_libs=~/java_libs/
export url

echo 'Enter url: '
read url
echo 'Entered url: '
echo $url

echo
wget --no-check-certificate $url
echo

cp *.jar $dir_libs
rm *.jar
