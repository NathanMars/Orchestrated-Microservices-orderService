# Orchestrated-Microservices-orderService
Parte de uma demonstração de arquitetura de microserviços em uma solução web ultilizando Spring Boot, Angular, Docker e Kubernetes. Este repositório especifico contem um microserviço responsavel pelo gerencimaneto dos pedidos dos clientes.  

Caracteristicas do Projeto:  
- Microserviço de pedidos foi desenvolvido em Spring Boot, se comunica com o banco de dados através de APIs REST
- Roda em um ambiente conteinerizado com Docker
- Ultilizando banco de dados MySQL
- Migrações realizadas através de Flyway
- Comunicação entre este serviços realizada através de Interface REST Calls com Spring REST Client (este serviço se comunica com o serviço de inventário)
- Testes unitários de integração ultilizam JUnit, Stub Runner e Testcontainers
- Documentação automatizada das APIs com OpenAPI

## Projeto Orchestrated-Containerized-Microservices
Este microserviço faz parte de um projeto maior. A interação entre o cliente e os serviços, medidas de segurança e monitoramento são feitos por intermédio de um API Gateway. Todos os serviços rodam em conteiners orquestrados pelo Kubernetes.
  
O projeto completo está distribuido entre diferentes repositórios neste perfil, seu diagrama completo pode ser analisado na imagem abaixo:

![Diagrama completo de Orchestrated-Containerized-Microservices](/assets/diagram.jpeg)  

Desenvolvido buscando seguir as melhores praticas de desenvolvimento de software. Os commits seguem os padrões de [Conventional Commits](https://gist.github.com/qoomon/5dfcdf8eec66a051ecd85625518cfd13).

