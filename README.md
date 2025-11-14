![Badge Conversor](./assets/Badge-Conversor.png)

# Currency Converter | Conversor de Moedas 
![Java](https://img.shields.io/badge/Java-17+-orange)
![Gson](https://img.shields.io/badge/Gson-2.10.1-4caf50)
![API](https://img.shields.io/badge/ExchangeRate-API-yellow)
![Status](https://img.shields.io/badge/status-Em%20desenvolvimento-yellow)

Um conversor de moedas desenvolvido em **Java**, como parte do programa **Oracle Next Education (ONE)** da formação Back-End em parceria com a **Alura**.  
O projeto permite converter valores entre diferentes moedas utilizando uma API de taxas de câmbio em tempo real.

---

## 🚀 Tecnologias utilizadas

- **Java 17+**
- **HttpClient (Java)** para requisições HTTP
- **Gson** para manipulação de JSON
- **API de conversão de moedas**
- **IntelliJ IDEA**

---

## 📌 Funcionalidades

- Conversão entre múltiplas moedas (USD, BRL, EUR, ARS)
- Requisições à API com taxa de câmbio atualizada
- Interface simples via console
- Tratamento de erros para:
  - moedas inexistentes
  - valores inválidos
  - falhas na API

---

## 📂 Estrutura do projeto

```
src/
├── app/
│   └── Main.java                # Classe principal com o loop do menu
│
├── models/
│   └── Currency.java            # Estrutura de dados para representar conversões
│
├── services/
│   ├── CurrencyConverter.java   # Conexão com a API e cálculo da conversão
│   └── HistoryService.java      # Registro e exportação do histórico
│
└── ui/
    └── Menu.java                # Interface textual (menu e mensagens)
```

---

## 🧠 Como o projeto funciona

1. O usuário escolhe a moeda de origem e destino  
2. O programa consulta a API para obter a taxa de câmbio  
3. O valor informado é convertido  
4. O resultado é retornado de forma clara no console

## 🎥 Demonstração do Projeto

Confira abaixo uma visualização rápida de como o programa funciona na prática.  
A demonstração mostra o fluxo completo: escolha das moedas, consulta à API, conversão em tempo real e exibição do resultado no terminal.

![Demonstração](https://i.imgur.com/wsTeG5k.gif)

---

## Licença  
Este projeto é de uso educacional e foi desenvolvido como parte do programa de formação **Oracle Next Education (ONE)**.  
Sinta-se à vontade para estudar, aprimorar e reutilizar o código para fins de aprendizado.

## Autor  
Desenvolvido por **Anthony (Hossomi) da Silveira Bugs**
