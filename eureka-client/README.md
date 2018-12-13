Microservice

1. Eureka Client - Auto Register in eureka server.
2. Config Client - Auto Externalize Centralized Configuration Loading with Discovery Mode Enabled.
3. Refresh Scope to refresh bean with updated configuration

Build/Run

Execute following with the required paramters.

    mvn spring-boot:run -Dserver.port=$((min + RANDOM%(1+max-min))) -Dspring-boot:run.profiles={{your profile}}

    where, 

    min & max - these are min and max port value within which the random ports will get generated
    profile - it would be your enviroment name, following are environemnt,
                A. dev
                B. prod
                C. preprod
                E. test
                F. stage
                G. local
    all the environement configuration are present in git repo and will be fetched accordingly except local.
    you must setup local folder and sub directory and keep you custom configuration as applicable.