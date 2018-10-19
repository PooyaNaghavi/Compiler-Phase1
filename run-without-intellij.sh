export CLASSPATH=".:/Library/antlr-4.7.1-complete.jar:$CLASSPATH"
rm *.class
rm *.tokens
rm test*.java
java -jar /Library/antlr-4.7.1-complete.jar test.g4
javac *.java
java org.antlr.v4.gui.TestRig test program -gui < in.sml