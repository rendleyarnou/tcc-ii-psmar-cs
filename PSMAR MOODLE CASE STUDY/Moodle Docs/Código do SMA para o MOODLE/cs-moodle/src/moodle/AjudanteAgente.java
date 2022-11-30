package moodle;
import jamder.Environment;
import jamder.agents.ReflexAgent;
import jamder.behavioural.Action;
import jamder.behavioural.Condition;
import jamder.roles.AgentRole;

public class AjudanteAgente extends ReflexAgent {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//Constructor 
   public AjudanteAgente (String name, Environment env, AgentRole agRole) {
   super(name, env, agRole);
   
   Action exibirDicasForuns = new Action("exibirDicasForuns", null, null);
   Action exibirDicasParticipantes = new Action("exibirDicasParticipantes", null, null);
   Action exibirDicasCalendario = new Action("exibirDicasCalendario", null, null);
   Action exibirDicasCalendarioNovoEvento = new Action("exibirDicasCalendarioNovoEvento", null, null);
   Action exibirDicasAtividadeRecenteTodosParticipantes = new Action("exibirDicasAtividadeRecenteTodosParticipantes", null, null);
   Action exibirDicasAtivarEdicao = new Action("exibirDicasAtivarEdicao", null, null);
   Action exibirDicasConfiguracoes = new Action("exibirDicasConfiguracoes", null, null);
   Action exibirDicasDesignarFuncoes = new Action("exibirDicasDesignarFuncoes", null, null);
   Action exibirDicasRelatorioDeNotas = new Action("exibirDicasRelatorioDeNotas", null, null);
   Action requisitaCoordenadorAcao = new Action("requisitaCoordenadorAcao", null, null);

   // Adding preconditions
   requisitaCoordenadorAcao.addPreCondition("mensagemApoio", new Condition());
   requisitaCoordenadorAcao.addPreCondition("mensagensDicasCurso", new Condition());
   requisitaCoordenadorAcao.addPreCondition("localizarDocumentosPessoas", new Condition());
   requisitaCoordenadorAcao.addPreCondition("dificuldadeFuncionalidades", new Condition());
   requisitaCoordenadorAcao.addPreCondition("criacaoDeGrupo", new Condition());

   addAction("exibirDicasForuns", exibirDicasForuns);
   addAction("exibirDicasParticipantes", exibirDicasParticipantes);
   addAction("exibirDicasCalendario", exibirDicasCalendario);
   addAction("exibirDicasCalendarioNovoEvento", exibirDicasCalendarioNovoEvento);
   addAction("exibirDicasAtividadeRecenteTodosParticipantes", exibirDicasAtividadeRecenteTodosParticipantes);
   addAction("exibirDicasAtivarEdicao", exibirDicasAtivarEdicao);
   addAction("exibirDicasConfiguracoes", exibirDicasConfiguracoes);
   addAction("exibirDicasDesignarFuncoes", exibirDicasDesignarFuncoes);
   addAction("exibirDicasRelatorioDeNotas", exibirDicasRelatorioDeNotas);
   
   addPerceive("exibirDicasForuns", exibirDicasForuns);
   addPerceive("exibirDicasParticipantes", exibirDicasParticipantes);
   addPerceive("exibirDicasCalendario", exibirDicasCalendario);
   addPerceive("exibirDicasCalendarioNovoEvento", exibirDicasCalendarioNovoEvento);
   addPerceive("exibirDicasAtividadeRecenteTodosParticipantes", exibirDicasAtividadeRecenteTodosParticipantes);
   addPerceive("exibirDicasAtivarEdicao", exibirDicasAtivarEdicao);
   addPerceive("exibirDicasConfiguracoes", exibirDicasConfiguracoes);
   addPerceive("exibirDicasDesignarFuncoes", exibirDicasDesignarFuncoes);
   addPerceive("exibirDicasRelatorioDeNotas", exibirDicasRelatorioDeNotas);
   
   }
}
