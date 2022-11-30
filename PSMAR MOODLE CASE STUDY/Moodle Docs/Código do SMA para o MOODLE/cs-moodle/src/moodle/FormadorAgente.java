package moodle;
import jamder.behavioural.*;
import jamder.Environment;
import jamder.roles.AgentRole;
import jamder.structural.*;
import java.util.List;
import jamder.agents.*;

public class FormadorAgente extends UtilityAgent {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//Constructor 
  public FormadorAgente (String name, Environment env, AgentRole agRole) {
    super(name, env, agRole);
    addBelief("crencasFormaGrupos.pl", new Belief("crencasFormaGrupos.pl", "String", ""));
   
    Goal formarGrupoPorAfinidadeG = new LeafGoal("formarGrupoPorAfinidadeG", "Boolean", "false");
    addGoal("formarGrupoPorAfinidadeG", formarGrupoPorAfinidadeG);
    Goal formarGrupoPorPerfisAprendizagemG = new LeafGoal("formarGrupoPorPerfisAprendizagemG", "Boolean", "");
    addGoal("formarGrupoPorPerfisAprendizagemG", formarGrupoPorPerfisAprendizagemG);
  
    Action exibirDicasDeFormacaoAc = new Action("exibirDicasDeFormacaoAc", null, null);
    addAction("exibirDicasDeFormacaoAc", exibirDicasDeFormacaoAc);
    Action criarGrupoPorPerfilAc = new Action("criarGrupoPorPerfilAc", null, null);
    addAction("criarGrupoPorPerfilAc", criarGrupoPorPerfilAc);
    Action criarGrupoPorAfinidadeAc = new Action("criarGrupoPorAfinidadeAc", null, null);
    addAction("criarGrupoPorAfinidadeAc", criarGrupoPorAfinidadeAc);
    Action integrarGrupoAfinidadeAc = new Action("integrarGrupoAfinidadeAc", null, null);
    addAction("integrarGrupoAfinidadeAc", integrarGrupoAfinidadeAc);
    Action requisitarCoordenadorAcaoAc = new Action("requisitarCoordenadorAcaoAc", null, null);
    addAction("requisitarCoordenadorAcaoAc", requisitarCoordenadorAcaoAc);
    Action integrarGrupoPerfilAc = new Action("integrarGrupoPerfilAc", null, null);
    addAction("integrarGrupoPerfilAc", integrarGrupoPerfilAc);
   
    addPerceive("perceberFormacaoDoGrupo", exibirDicasDeFormacaoAc);
    addPerceive("perceberTemas", exibirDicasDeFormacaoAc);
    addPerceive("perceberDisciplinaDosUsuarios", integrarGrupoAfinidadeAc);
    addPerceive("perceberCursoDosUsuarios", integrarGrupoAfinidadeAc);
    addPerceive("perceberPerfilDosUsuarios", integrarGrupoAfinidadeAc);
    addPerceive("mensagemApoio", requisitarCoordenadorAcaoAc);
    addPerceive("mensagensDicasCurso", requisitarCoordenadorAcaoAc);
    addPerceive("localizarDocumentosPessoas", integrarGrupoPerfilAc);
    addPerceive("dificuldadeFuncionalidades ", integrarGrupoAfinidadeAc);
   
    Plan ajudarNaCriacaoDegruposPlan = new Plan("ajudarNaCriacaoDegruposPlan", null);
    addPlan("ajudarNaCriacaoDegruposPlan", ajudarNaCriacaoDegruposPlan); 
  }
   
  protected Plan planning(List<Action> actions){
	return null;
  }
   
  protected Belief nextFunction(Belief belief, String perception) {
	return funcaoProximoGrupos(belief, perception);
  }
  private Belief funcaoProximoGrupos(Belief belief, String perception) {
	return null;
  }
  protected List<Action> formulateProblemFunction(Belief belief, Goal goal) {
	return probFuncPerceberGrupos(belief, goal);
  }
  private List<Action> probFuncPerceberGrupos(Belief belief, Goal goal) {
	return null;
  }
  protected Goal formulateGoalFunction(Belief belief) {
	return objCriarIntegrarGrupos(belief);
  }
  private Goal objCriarIntegrarGrupos(Belief belief) {
	return null;
  }
  protected Integer utilityFunction(Action action) {
	return utilCriarIntegrarGrupos(action);
  }
  private Integer utilCriarIntegrarGrupos(Action action) {
	return 0;
  }
  public void percept(String perception) { }
}
