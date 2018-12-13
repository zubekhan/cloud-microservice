mvn spring-boot:run -Dserver.port=$((min + RANDOM%(1+max-min))) -Dspring-boot:run.profiles={{your profile}}

// For Example: mvn spring-boot:run -Dserver.port=$((8090 + RANDOM%(1+9999-8090))) -Dspring-boot.run.profiles=local