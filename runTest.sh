#! /usr/bin/zsh

javac -cp .:junit.jar test/*.java
cp test/*.class .

java -cp .:junit.jar:hamcrest-core.jar org.junit.runner.JUnitCore ItemTest

rm *.class test/*.class
