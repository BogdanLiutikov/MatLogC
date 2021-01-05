all:
	javac -cp "antlr-4.9-complete.jar" src/*.java gen/*.java

run:
	java -Xmx256m -cp "antlr-4.9-complete.jar;gen;src" Main