# Test Virtualmind - Damian Lisas

Testeado en Linux Ubuntu 16.04

Requisitos:
  - Java 8
  - Maven 3.x
  - MySQL (Usuario: 'root', Password: 'root')
  - Python3
    -MySQL module
    
Ante la falta de cualquiera de estos ejectura el script correspondiente en la carpeta 'scripts' para realizar su instalacion.
    
Instalacion mediante linea de comandos:
  1. Ingresar en 'scripts'
  2. Ejecutar "crearBBDD.py"
  3. Ejecutar "poblarBBDD.py"
  4. Entrar en "restful" y ejecutar: 'mvn clean package'
  5. Ejecutar: 'java -jar target/restful-1.0.0-SNAPSHOT.jar'. Opcional: se puede modificar el puerto mediante el flag --server.port='numero del puerto'
