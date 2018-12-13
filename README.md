keytool -genkeypair -alias <keyname> -keyalg RSA -keysize 4096 -sigalg SHA512withRSA \
  -dname "CN=<firstname&lastname>,OU=<organizational_unit>,O=<organization name>,L=<city/locality>,S=<state/province>,C=<country>" \
  -keypass <secret> -keystore config-server.jks -storepass <password>



Example: 

keytool -genkeypair -alias secure@cloudtut -keyalg RSA -keysize 4096 -sigalg SHA512withRSA \
  -dname "CN=Config Server,OU=CloudTut,O=Zovi Tech,L=Gurgaon,S=Haryana,C=India" \
  -keypass <secret> -keystore config-server.jks -storepass <password>