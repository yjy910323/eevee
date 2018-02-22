#!/bin/bash

BASEDIR=`dirname $0`/..
BASEDIR=`(cd "$BASEDIR"; pwd)`
FEATURE="com.jd.mty.lugia.market.service.Bootstrap"
JAVA_OPTS="-Xms3048m -Xmx3048m -XX:MaxPermSize=256m -XX:+UseConcMarkSweepGC"

RUNJAR=.
for f in `find ${BASEDIR}/resources -name "*.*"`
do
	RUNJAR=$RUNJAR:$f
done
for f in `find ${BASEDIR}/lib -name "*.*"`
do
	RUNJAR=$RUNJAR:$f
done

cd ${BASEDIR}/resources

export RUNJAR
echo $RUNJAR

setsid java $JAVA_OPTS -DBASEDIR=${BASEDIR} -Dhome=${BASEDIR}/resources -classpath $RUNJAR $FEATURE &
