import getpass
import urllib2

name = getpass.getuser()
user = '~/' + str(name + '/') + 'java_libs/'
print user

url = input('Enter jar''s url: ')
print ('url: ' + url)

fileName=url.split('/')[-1]
print 'File name: ' + fileName

u = urllib2.urlopen(url)
f = open(fileName, 'wb')

meta = u.info()
file_size = int(meta.getheaders("Content-Length")[0])
print "Downloading: %s Bytes: %s" % (fileName, file_size)

file_size_dl = 0
block_sz = 8192
while True:
    buffer = u.read(block_sz)
    if not buffer:
        break

    file_size_dl += len(buffer)
    f.write(buffer)
    status = r"%10d  [%3.2f%%]" % (file_size_dl, file_size_dl * 100. / file_size)
    status = status + chr(8)*(len(status)+1)
    print status,

f.close()
