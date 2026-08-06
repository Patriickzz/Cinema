# 🎬 Cinema Session

Sistema de venda de ingressos de cinema via terminal, feito em Java para praticar Programação Orientada a Objetos.

## Sobre

O usuário escolhe um filme, escolhe uma sala, visualiza o mapa de assentos, reserva um assento e recebe seu ingresso. O sistema roda em loop, permitindo múltiplas compras até o usuário sair.

## Funcionalidades

- Escolha de filme e sala
- Visualização do mapa de assentos (livres `[ ]` / ocupados `[X]`)
- Reserva de assento com validação
- Emissão de ingresso
- Menu com opção de repetir ou sair

## Estrutura

| Classe | Responsabilidade |
|---|---|
| `Main` | Fluxo do programa e menu |
| `Filme` | Título e duração |
| `Sala` | Matriz de assentos, exibição e reserva |
| `Cliente` | Nome do cliente |
| `Ingresso` | Reúne filme, sala, cliente e assento; imprime o ingresso |

## Tecnologias

Java puro, sem dependências externas.
