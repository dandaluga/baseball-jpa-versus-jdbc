#-------------------------------------------------------------------
# Harded coded path to HSQLDB location.
#-------------------------------------------------------------------
java -cp /Users/dandaluga/.m2/repository/org/hsqldb/hsqldb/2.6.1/hsqldb-2.6.1.jar org.hsqldb.Server -database.0 file:baseball -dbname.0 baseball 

#-------------------------------------------------------------------
# Using HSQLDB_HOME environment variable.
#-------------------------------------------------------------------
#java -cp $HSQLDB_HOME/hsqldb-2.6.1.jar org.hsqldb.Server -database.0 file:baseball -dbname.0 baseball 
