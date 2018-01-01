# Java8

## Objetivo 
  Estudar o método de Expressão Lambda e API de Data e Hora do java8.<br>
  Poriço foi desenvolvido um projeto simples de Locação de filmes,a onde é possivel <br>
  listar os filmes cadastrados e fazer a locações de filmes existentes usando as funcionalidades novas do java8.

## API de datas (JSR 310)
   São várias classes e interfaces:
   - java.time.LocalDateTime	
   - java.time.LocalDate
   - java.time.LocalTime

## Sintaxe Lambda
  Exemplo:
	
  	List<fatura> faturaVencidas = new FaturaDao().buscarFaturasVencidas();	

  1. O “f”, em Fatura f, recebe cada elemento da lista. Entre as chaves é onde vou colocar o código que quero executar,<br>
  no nosso caso utilizar o objeto para enviar o e-mail. Ficando assim:<br>

	faturasVencidas.forEach((Fatura f) -> {
	  enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
        });

  2. Mas o compilador já sabe que sua lista é de Fatura.<br>
     Então você pode omitir o tipo, deixando simplesmente assim:

	faturasVencidas.forEach(f -> {
	  enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
	});

  3. E para melhorar ainda mais, como só temos uma linha de código para executar,<br>
      podemos retirar as chaves e o ponto-e-vírgula de dentro do bloco. Veja:

	faturasVencidas.forEach(f -> enviadorEmail.enviar(f.getEmailDevedor(), f.resumo()));

  4. Se você tivesse que executar algum outro código e não somente uma linha.
      Poderia deixar o código como abaixo:
      
       	faturasVencidas.forEach(f -> {
          enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
          f.setNotificacaoEnviada(true);
	});

## Como testar ?
  1. Clone o repositório.
  2. Importe para o eclipse.
  3. Execute "ApplicationMovies".

