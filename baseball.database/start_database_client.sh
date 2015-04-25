#-------------------------------------------------------------------
# Harded coded path to HSQLDB location.
#-------------------------------------------------------------------
java -cp /Users/dandaluga/.m2/repository/org/hsqldb/hsqldb/2.3.2/hsqldb-2.3.2.jar org.hsqldb.util.DatabaseManagerSwing --url jdbc:hsqldb:hsql://localhost/baseball

#-------------------------------------------------------------------
# Using HSQLDB_HOME environment variable.
#-------------------------------------------------------------------
#java -jar $HSQLDB_HOME/hsqldb-2.3.2.jar org.hsqldb.util.DatabaseManagerSwing --url jdbc:hsqldb:hsql://localhost/baseball
