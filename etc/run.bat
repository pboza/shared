rem The applciation uses 4 parameters
rem   Origen Airport
rem   Destination AirPort
rem  Days to Departure from today
rem   Days to return from today
rem
rem   ex. From Paris to Santiago - Departure in 60 days returning 1 week later:
rem       java -jar travelport-java-test CDG SCL 60 67

java -jar travelport-java-test.jar %1 %2 %3 %4