# Configurando Ambiente de Desenvolvimento Java no Linux

- INSTALANDO E EXECUTANDO JAVA
    
    [Aula 1 - Instalando e executando Java.pptx](https://docs.google.com/presentation/d/1JW1Sn4b8Vyac2ZvytYTnqu7aKbPWb2DI/edit?usp=drivesdk&ouid=101758177796448418508&rtpof=true&sd=true)
    
- UTILIZANDO JAVA 11
    - RECURSOS PRESENTES NO JAVA 11
        - Default methods
        - Lambdas
        - Method references
        - Streams
        - Datas
        
    - NOVIDADES DO JAVA 11
        
        [Aula 2 - Utilizando Java 11.pptx](https://docs.google.com/presentation/d/1pCS5WvR93Q27MaVArzJoTqjbfohwXzcm/edit?usp=drivesdk&ouid=101758177796448418508&rtpof=true&sd=true)
        
        - Manipulação de Strings
        - Variáveis por inferência
        - Mnipulação de arquivos
        - Novidades no Garbage Collector (GC)
            - Z Garbage Collector (ZGC)
                
                ```bash
                java -XX:+UnlockExperimentalVMOptions -XX:+UseZGC -Xlog:gc* com.dio.BankApi
                ```
                
            - Epsiolon Garbage Collector (No-Op GC)
                
                ```bash
                java -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC -Xlog:gc* com.dio.BankApi
                ```
                
        - Http Cliente padronizado
- USANDO INTELLIJ PARA DESENVOLVIMENTO JAVA
    
    [Aula 3 - Usando Intellij para desenvolvimento Java.pptx](https://docs.google.com/presentation/d/1eBpo5jphQpHXDpIe-mzcTIrpUdxSUGXm/edit?usp=drivesdk&ouid=101758177796448418508&rtpof=true&sd=true)
    
- EMPACOTANDO APLICAÇÕES
    
    [Aula 4 - Empacotando aplicações Java.pptx](https://docs.google.com/presentation/d/1jPlfu1oGsNAg91RuNMylXREtyNfp4toj/edit?usp=drivesdk&ouid=101758177796448418508&rtpof=true&sd=true)
    
    [dio-development-environment-master.zip](https://drive.google.com/file/d/1U6Bj0mv8X8EbE6WrquK75tFgmB22LpRy/view?usp=drivesdk)
    
    Jar (Java Archive) é um arquivo compactado que reúne todas as classes compiladas (Bytecodes) e metadados necessários para execução de um programa.
    
    Composição básica de um arquivo JAR:
    
    - Classes compiladas (.class)
    - Arquivo /META-INF/MANIFEST.MF que contém os metadados necessários para execução do programa. Ex:
        - "Main-Class: com.dio.BankApi" - definição da classe que contém o método "main".
        
        ```bash
        jabba use openjdk@1.11
        java -d target/ -sourcepath src/main/java src/main/java/com/dio/BankApi.java
        
        cd target/
        
        jar cfmv BankApi.jar ../manifest.mf . #criar o arquivo jar
        
        jva -jar BankApi.jar #executar o arquivo jar
        ```
