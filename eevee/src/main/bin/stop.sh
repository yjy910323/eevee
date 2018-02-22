#!/bin/bash

FEATURE="com.jd.mty.lugia.market.service.Bootstrap"

pidnum=`ps -ef|grep "$FEATURE" |wc -l`
if [ $pidnum -lt 1 ]
	then 
		echo 'no program killed'
	else
		for pid in `ps -ef|grep "$FEATURE"|grep -v grep|awk '{print $2}'`
		do
			kill -9 $pid
			echo "$pid killed"
		done
		sleep 1
		echo "program stoped"
fi