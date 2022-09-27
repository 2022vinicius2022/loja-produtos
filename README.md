
# Loja Produtos Envixo
Apis para produtos

### Para rodar a aplicação

Na pasta docker rodar o comando:
    docker-compose up -d

Em seguida executar a classe LojaProdutosApplication 

### Apis

1.Cadastrar Produtos

http://localhost:8080/api/product

{
"title": "Camiseta Masculina Casual",
"description": "Camisa Times",
"midia": pathS3,
"status": "Ativo",
"tags": tags,
"price": 30.00,
"comparationPrice": 20.00
"productCategory":
{
"category": "Camisas"
}
}

2.Listar Produtos Por Status

http://localhost:8080/api/product/status

3.Listar Produto por titulo

http://localhost:8080/api/product/titulo

