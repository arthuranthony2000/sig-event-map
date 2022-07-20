# Relatório de Testes de Módulo/Sistema
## Responsabilidade do Testador

**Teste:** Código ou identificação do Teste.

**Descrição:** Descrição dos passos e detalhes do teste a ser executado.

**Especificação:** Informações sobre a função testada e se ela de acordo com a especificação do caso de uso.

**Resultado:** Resultado do teste, modificações sugeridas ou resultados do teste. No caso de erro ou problema na execução do teste descrever o erro em detalhes e adicionar print's das telas.

### US001 – Manter Evento

| Teste  | Descrição | Especificação | Resultado |
| --------------- | ---------------------- | ---------------------- | :-----------: |
| Teste 01: Incluir Evento     | A1 - Incluir Evento <br/> A1.1. O ator acessa a pagina de cadastro e preenche os dados; <br/> A1.2. O ator seleciona a opção Confirmar; <br/> A1.3. O sistema salva os dados;  <br/> A1.4. O sistema exibe uma mensagem de sucesso ou fracasso; <br/> A1.5. Fim do fluxo. | Especificação OK.         |  OK.   |
| Teste 02: Alterar Evento     | A2 – Alterar Evento <br/> A2.1 - O ator acessa a pagina de edição de evento e preenche os dados; <br/> A2.2 – O ator clica no botão Confirmar; <br/> A2.3 - O sistema solicita confirmação para exclusão;  <br/> A2.4 - O ator confirma a exclusão; <br/> A2.5 - O sistema exclui o registro e exibe uma mensagem confirmando; <br/> A2.6 – Fim do fluxo. | Especificação OK.         |  OK.   |
| Teste 03: Exibir Evento     | A3 – Exibir Evento <br/> A3.1 - O ator seleciona a area de mapa ou card. <br/> A3.2.1 - O ator seleciona o menu Ver Cards, onde seleciona o evento por meio de cards na tela; <br/> A3.2.1.1 - O ator observa informações do evento em um modal;  <br/> A3.2.1.2 - O ator pode selecionar o botão Finalizar Compra; <br/> A3.2.1.3 - O ator é movido para a area de pagamento, onde preenche os dados de compra; <br/> A3.2.2 - O ator seleciona o menu Ver Mapa, onde seleciona o evento por meio do mapa iterativo. <br/> A3.2.2.1 - O ator seleciona o evento no mapa por meio do endereço ou localização geografica. <br/> A3.3.2.2 - O ator verifica as informações em um modal na tela; <br/> A3.3.2.3 - O seleciona o botão de finalizar compra, onde é redirecionado para tela de forma de pagamento, onde preenche os dados de compra. <br/> A3.4 - O sistema exibe uma mensagem de confirmação. <br/> A3.5 - Fim do fluxo.  | A função não implementa o passo A3.2.1.2, ou seja não é redirecionado para area de finalização de compra.    <br/> Na execução da função A3.3.2.3 não aparece o botão de finalizar compra, implicando no não acesso a area de pagamento. | Ao escolher o metodo de mapa o ator se torna impossibilitado de comprar o evento. |
| Teste 04: Excluir Eventos    | A4 – Excluir Evento <br/> A4.1 - O ator seleciona a area de mapa ou card. <br/> A4.2.1 - O ator seleciona o menu Ver Cards, onde seleciona o evento por meio de cards na tela; <br/> A4.2.1.1 - O ator observa informações do evento em um modal;  <br/> A4.2.1.2 - O ator pode selecionar o botão Excluir Evento; <br/> A4.2.1.3 - O ator verifica uma mensagem de confirmação; <br/> A4.2.2 - O ator seleciona o menu Ver Mapa, onde seleciona o evento por meio do mapa iterativo. <br/> A4.2.2.1 - O ator seleciona o evento no mapa por meio do endereço ou localização geografica. <br/> A4.3.2.1 - O ator verifica as informações em um modal na tela; <br/> A4.3.2.2 - O ator seleciona o botão de excluir evento, onde aparece uma mensagem de confirmação. <br/> A4.4 - O sistema exibe uma mensagem de confirmação. <br/> A4.5 - Fim do fluxo. | A função não implementa o passo A4.2.1.2 e A4.3.2.3, ou seja não aparece o botão excluir evento.         |  O evento não pode ser excluido de forma correta.  |

### US002 – Manter Usuário

| Teste  | Descrição | Especificação | Resultado |
| --------------- | ---------------------- | ---------------------- | :-----------: |
| Teste 01: Cadastrar Usuario     | A1 - Cadastrar Usuario	 <br/> A1.1. O ator acessa a landing page; <br/> A1.2. O ator seleciona a opção Cadastrar; <br/> A1.2.1 O ator preenche os dados;  <br/> A1.2.2 O ator clica em confirmar e uma mensagem de confirmação é exibida; <br/> A1.3 O sistema salva os dados; <br/> A1.4 O ator seleciona um dos botões github/google; <br/> A1.4.1 O sistema redireciona para area de login do github/google; <br/> A1.5 O ator é redirecionado para a landing page em caso de sucesso. <br/> A1.6. Fim do fluxo. | Especificação OK.         |  OK.   |
| Teste 02: Alterar Usuario    | A2 - Alterar Usuario	 <br/> A2.1. O ator acessa a landing page; <br/> A2.2. O ator seleciona a opção Entrar; <br/> A2.2.1 O ator seleciona a opção Ver perfil;  <br/> A2.2.2 O ator seleciona o botão editar perfil; <br/> A2.2.3 O ator preenche os dados; <br/> A2.2.4 O ator clica em confirmar e uma mensagem de confirmação é exibida; <br/> A2.3 O sistema salva os dados; <br/> A2.4. Fim do fluxo. <br/> A1.6. Fim do fluxo. | Especificação OK.         |  OK.   |
| Teste 03: Visualizar perfil Usuario    | A3 - Visualizar perfil Usuario <br/> A3.1. O ator acessa a landing page; <br/> A3.2. O ator seleciona a opção Entrar;  <br/> A3.2.1 O ator seleciona a opção Ver perfil; <br/> A3.3. Fim do fluxo. | A função A3.2.1 não foi implementada, não foi exibir o botão ver perfil.         |  Não é possivel ver um perfil de usuario no sistema.   |
| Teste 04: Excluir Usuario    | A4 - Excluir Usuario <br/> A4.1. O ator acessa a landing page; <br/> A4.2. O ator seleciona a opção Entrar;  <br/> A4.2.1 O ator seleciona a opção Ver perfil; <br/> A4.2.2 O ator seleciona o botão excluir perfil; <br/> A4.2.3 O ator visualizará uma mensagem de confirmação; <br/> A4.2.4 O ator clica em confirmar e uma mensagem de confirmação é exibida; <br/> A4.3 O sistema salva os dados; <br/> A4.4. Fim do fluxo. | A função A4.2.1 não foi implementada, não foi exibir o botão ver perfil.         |  Não é possivel ver um perfil de usuario no sistema.   |

### US004 – Manter Order

| Teste  | Descrição | Especificação | Resultado |
| --------------- | ---------------------- | ---------------------- | :-----------: |
| Teste 01: Cadastrar Order     | A1 - Cadastrar Order	 <br/> A1.1. O ator seleciona os eventos; <br/> A1.2. O ator clica em finalizar compra; <br/> A1.2.1 O ator preenche os dados de pagamento;  <br/> A1.2.2 O ator clica em confirmar e uma mensagem de confirmação é exibida; <br/> A1.3 O sistema salva os dados; <br/> A1.4. Fim do fluxo. | Especificação OK.         |  OK.   |
| Teste 02: Visualizar Order  | A2 - Visualizar Order	 <br/> A2.1. O ator seleciona Ver Perfil; <br/> A2.2. O ator clica em visualizar compras; <br/> A2.3. Fim do fluxo.  | Função A2.1 não implementada         |  Impossivel ver perfil de usuario   |

## Relatório de Bugs e Providências
### Responsabilidade do Gerente

| Teste  | Providência | Tarefas/Tipo | 
| --------------- | ---------------------- | :-----------: |
| US001 - Teste 03: Exibir Evento   | Corrigir a implementação do fluxo do user story. | Tarefa: Bug de Implementação.        |
| US001 - Teste 04: Excluir Eventos   | Corrigir a implementação do fluxo do user story. | Tarefa: Bug de Implementação.        |
| US002 - Teste 02: Alterar Usuario   | Corrigir a implementação do fluxo do user story. | Tarefa: Implementação de feature.        |
| US002 - Teste 03: Visualizar perfil Usuario  | Corrigir a implementação do fluxo do user story. | Tarefa: Implementação de feature.        |
| US002 - Teste 04: Excluir Usuario  | Corrigir a implementação do fluxo do user story. | Tarefa: Implementação de feature.        |
| US004 - Teste 02: Cadastrar Order  | Corrigir a implementação do fluxo do user story. | Tarefa: Implementação de feature.        |

