# Desafio iPhone UML

```mermaid
classDiagram
direction BT
class AparelhoTelefonico {
<<Interface>>
  + ligar(String) void
  + atender() void
  + iniciarCorreioVoz() void
}
class Iphone {
  - String paginaWeb
  - String musica
  + ligar(String) void
  + atender() void
  + iniciarCorreioVoz() void
  + adicionarNovaAba() void
  + exibirPagina(String) void
  + atualizarPagina() void
  + selecionarMusica(String) void
  + tocar() void
  + pausar() void
}
class NavegadorInternet {
<<Interface>>
  + adicionarNovaAba() void
  + exibirPagina(String) void
  + atualizarPagina() void
}
class ReprodutorMusical {
<<Interface>>
  + selecionarMusica(String) void
  + tocar() void
  + pausar() void
}

Iphone  ..>  AparelhoTelefonico 
Iphone  ..>  NavegadorInternet 
Iphone  ..>  ReprodutorMusical 
```