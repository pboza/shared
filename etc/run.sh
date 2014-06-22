#!/bin/bash
#
# The applciation uses 4 parameters
#   Origen Airport
#   Destination AirPort
#   Days to Departure from today
#   Days to return from today
#
#   ex. From Paris to Santiago - Departure in 60 days returning 1 week later:
#       java -jar travelport-java-test CDG SCL 60 67

java -jar travelport-java-test.jar $1 $2 $3 $4