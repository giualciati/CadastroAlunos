# Cadastro de Alunos
Este é um projeto em Java que permite gerenciar o cadastro de alunos, registrando suas matrículas, notas e calculando sua média final para determinar se foram aprovados ou reprovados com base em uma média mínima definida.
#
### Funcionalidades
 - Cadastro de alunos com número de matrícula.
 - Registro de múltiplas notas por aluno.
 - Cálculo da média individual de cada aluno.
 - Verificação automática de aprovação com base na média mínima configurada.
#
### Como usar
Clone o repositório ou copie o código para sua IDE:
```
git clone https://github.com/seu-usuario/repositorio.git
```
Compile e execute o programa em sua IDE ou pelo terminal:
```
javac CadastroAlunos.java
java CadastroAlunos
```

Siga as instruções exibidas no terminal para:
 - Informar o número de alunos a serem registrados.
 - Inserir a quantidade de notas por aluno.
 - Definir a média mínima para aprovação.
 - Cadastrar matrículas e notas de cada aluno.
 - Visualize o boletim com os resultados de aprovação/reprovação.
#

### Exemplo de funcionamento
#### Entrada
```java
Quantos alunos deseja cadastrar? 2
Quantas notas deseja registrar para cada aluno? 3
Qual é a média mínima para aprovação? 7

Número de matrícula do aluno 1: 101
Aluno 101 - Nota 1: 8
Aluno 101 - Nota 2: 7
Aluno 101 - Nota 3: 9

Número de matrícula do aluno 2: 102
Aluno 102 - Nota 1: 5
Aluno 102 - Nota 2: 6
Aluno 102 - Nota 3: 4
```
#### Saída
```
--- Resultados ---
Aluno 1 (Matrícula 101): Média = 8.00 - Aprovado
Aluno 2 (Matrícula 102): Média = 5.00 - Reprovado
```
#
# Contribuições
Sinta-se à vontade para abrir uma issue ou enviar um pull request se desejar contribuir com melhorias para este projeto.


