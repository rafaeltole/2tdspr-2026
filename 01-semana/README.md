# Semana 1 — Do problema à primeira aplicação Java

Nesta primeira semana, começaremos a acompanhar a evolução de uma aplicação Java conforme surgirem novas necessidades.

Antes de escrever código, vamos compreender o problema, identificar o domínio e decidir quais elementos da realidade precisam ser representados na primeira versão da aplicação.

## Objetivos da semana

- compreender o conceito de domínio;
- identificar os elementos relevantes de um problema;
- entender o modelo de domínio como uma simplificação da realidade;
- representar parte do domínio utilizando classes Java;
- perceber como uma aplicação evolui conforme surgem novas necessidades.
- criar uma aplicação Web utilizando o SpringWeb e conceitos Restful


## Começando pelo problema

Imaginem que alguém peça a vocês para desenvolver uma aplicação para registrar as partidas, os placares e a classificação do Campeonato Brasileiro.

![Representação do domínio de uma partida de futebol](assets/dominio-partida-futebol.png)

O que precisamos conhecer antes de começar a programar?

- Time
- Partida
- Estádio
- Jogador
- Técnico

Percebam que, antes de escrever qualquer código, começamos a conversar sobre o problema.

Estamos tentando entender o **domínio**.

## Domínio

Domínio é a área de negócio, conhecimento ou problema que queremos representar por meio de software.

No nosso exemplo, o domínio é o **Campeonato Brasileiro**.

Dentro desse domínio, queremos resolver o seguinte problema:

- registrar as partidas, os times e a quantidade de gols de cada time;
- calcular a classificação dos times no campeonato _(Nesta primeira versão, implementaremos apenas o registro do resultado de uma partida)_.

## Modelo de domínio

Quais elementos da realidade são relevantes para resolver o nosso problema?

Inicialmente, podemos identificar:

- Partida
- Time
- Gol
- Competição
- Estádio

Um modelo de domínio é uma **simplificação da realidade**. Escolhemos aquilo que é relevante para o problema que queremos resolver.

O Campeonato Brasileiro possui partidas, times, jogadores, técnicos, estádios e muitos outros elementos. Entretanto, nem todos precisam fazer parte da primeira versão da aplicação.

## Escopo da primeira versão

Embora o objetivo completo inclua o cálculo da classificação, começaremos com uma versão menor.

Na primeira aula, desenvolveremos uma aplicação Java standalone responsável por registrar o resultado de uma partida em um arquivo de texto. Inicialmente, os times serão representados como atributos da própria partida.

O modelo será evoluído nas próximas aulas conforme surgirem novas necessidades.

## Ferramentas utilizadas

- Java
- IntelliJ IDEA
- Git e GitHub

## Aulas da semana

- [Aula 01 — Primeira versão da aplicação](01-aula/)

## Próxima etapa

Agora que entendemos o problema e delimitamos o domínio, podemos criar a primeira versão da aplicação.

➡️ [Acessar a Aula 01](01-aula/)
