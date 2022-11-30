package moodle.papeis;

import jamder.Organization;
import jamder.agents.GenericAgent;
import jamder.behavioural.Right;
import jamder.roles.AgentRole;

public class AjudanteAgRole extends AgentRole {
	// Constructor
	public AjudanteAgRole(String name, Organization owner, GenericAgent player) {
		super(name, owner, player);

		addRight("exibirDicasForuns", new Right());
		addRight("exibirDicasParticipantes", new Right());
		addRight("exibirDicasCalendario", new Right());
		addRight("exibirDicasCalendarioNovoEvento", new Right());
		addRight("exibirDicasAtividadeRecenteTodosParticipantes", new Right());
		addRight("exibirDicasAtivarEdicao", new Right());
		addRight("exibirDicasConfiguracoes", new Right());
		addRight("exibirDicasDesignarFuncoes", new Right());
		addRight("exibirDicasRelatorioDeNotas", new Right());
		addRight("exibirDicasRelatorioGeral", new Right());
		addRight("exibirDicasRelatorioDoUsuario", new Right());
		addRight("exibirDicasCategoriasItensVisaoSimples", new Right());
		addRight("exibirDicasCategoriasItensVisaoCompleta", new Right());
		addRight("exibirDicasEscalasDoCurso", new Right());
		addRight("exibirDicasLetrasVer", new Right());
		addRight("exibirDicasLetrasEditar", new Right());
		addRight("exibirDicasImportarArquivoCSV", new Right());
		addRight("exibirDicasImportarArquivoXML", new Right());
		addRight("exibirDicasExportarPlanilhaODS", new Right());
		addRight("exibirDicasExportarArquivoDeTexto", new Right());
		addRight("exibirDicasExportarPlanilhaExcel", new Right());
		addRight("exibirDicasExportarArquivoXML", new Right());
		addRight("exibirDicasConfiguracoesCurso", new Right());
		addRight("exibirDicasPreferenciasRelatorioDeNotas", new Right());
		addRight("exibirDicasGrupos", new Right());
		addRight("exibirDicasBackupDoCurso", new Right());
		addRight("exibirDicasRestaurar", new Right());
		addRight("exibirDicasImportar", new Right());
		addRight("exibirDicasReconfigurarCurso", new Right());
		addRight("exibirDicasRelatorios", new Right());
		addRight("exibirDicasPerguntas", new Right());
		addRight("exibirDicasArquivos", new Right());
		addRight("exibirDicasPerfil", new Right());

		initialize();
	}
}
