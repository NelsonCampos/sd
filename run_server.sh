cd bin
java -Djava.rmi.server.codebase=file:`pwd`/ \
-Djava.rmi.server.hostname=`cat /etc/hostname` \
-Djava.security.policy=../server.policy \
Server

