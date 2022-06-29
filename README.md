INTRODUÇÃO:

Aplicação WEB, utilizando tecnologias: 
1. Linguagem Java
2. Framework: SpringBoot, Spring WebFlux, Spring DataJPA

OBJETIVOS:
1. Construir API usando padrões REST.
2. Consumir API externa
3. Programação reativa (WebFlux)
4. De brinde, aprender a fazer deploy no Heroku

DETALHES IMPORTANTES DE CONFIGURAÇÃO PARA DEPLOY NO HEROKU:
1. Criar um arquivo chamado "system.properties" para definir as versôes de JAVA e MAVEN utilizadas no projeto. Logo que, o Heroku estabelece versões default (JAVA: 8 ; MAVEN: 3.6.2) para estes recursos - gerando conflito com as versões utilizadas no seu projeto, no momento do deploy. Isso é evitado explicitando as versões dos recursos JAVA e MAVEN no arquivo "system.properties". -> LER MAIS: https://devcenter.heroku.com/articles/java-support#specifying-a-maven-version
