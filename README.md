
# 💳 Caixa Eletrônico em Java

Este projeto é uma simulação simples de um caixa eletrônico (ATM) desenvolvido em Java. O usuário pode realizar diversas operações bancárias básicas por meio de um menu interativo no terminal.

## 📋 Funcionalidades

- Registro de cliente com nome, CPF, data de nascimento e senha
- Depósito inicial obrigatório ao registrar
- Consulta de saldo (com verificação de senha)
- Saque (com validação de saldo disponível)
- Interface de menu simples com navegação por números

> ⚠️ **Atenção:** Este sistema não armazena os dados permanentemente. Toda informação é perdida ao encerrar a execução.

## 📦 Estrutura do Projeto

- `Main.java`: contém toda a lógica do programa, desde a criação do menu até as funcionalidades de registro, saldo e saque.

## 🧪 Exemplos de Uso

### Menu Principal

```
+========================================+
|         BEM-VINDO AO CAIXA 24H         |
+========================================+
|  [1] Registro                          |
|  [2] Ver Saldo                         |
|  [3] Sacar                             |
|  [4] Depositar                         |
|  [5] Transferir                        |
|  [6] Extrato                           |
|  [7] Sair                              |
+========================================+
```

### Registro de Cliente

```
+========================================+
|       REGISTRO DE NOVO CLIENTE         |
+========================================+
|  Nome completo: João Silva             |
|  CPF: 123.456.789-00                   |
|  Data de nascimento: 01/01/1990        |
|  Senha: 1234                           |
|  Valor inicial: R$ 500.00              |
+========================================+
```

### Consulta de Saldo

```
+========================================+
|           SALDO DISPONÍVEL             |
+========================================+
|  O saldo da sua conta é: R$ 500.00     |
+========================================+
```

## 🛠️ Tecnologias Utilizadas

- Java 17+
- IDEs recomendadas: IntelliJ IDEA, Eclipse, VS Code
- Scanner para entrada de dados no terminal

## 📚 Futuras Implementações

- Armazenamento em arquivos ou banco de dados
- Criptografia de senha
- Interface gráfica (GUI)

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/caixa-eletronico-java.git
   ```
2. Navegue até o diretório:
   ```bash
   cd caixa-eletronico-java
   ```
3. Compile e execute:
   ```bash
   javac Main.java
   java Main
   ```

## 🧑‍💻 Autor

- **Breno Ruggeri**  
  Estudante de Ciência da Computação  
  [LinkedIn](https://www.linkedin.com/in/brenoruggeri/)

---
