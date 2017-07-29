#!/bin/bash
if [ $# != 1 ]
then
   echo "shell parameter should be 1--commit message"
   exit 1
fi
git add -A
git commit -m $1
git push origin master
