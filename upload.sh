#!/bin/bash

curl -F SourceFile=@Problem$1.java -F JudgeID=`cat judge.id` -F Language=7 -F ProblemNum=$1 -F SpaceID=1 -F Source= -F Action=submit http://acm.timus.ru/submit.aspx

