package moodle;
import jamder.behavioural.*;
import jamder.Environment;
import jamder.roles.AgentRole;
import jamder.structural.*;
import java.util.List;
import jamder.agents.*;

public class PedagogicoAgente extends GoalAgent {	

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//Constructor 
   public PedagogicoAgente (String name, Environment env, AgentRole agRole) {
   super(name, env, agRole);
   
     addBelief("crencasPedagogico.pl", new Belief("crencasPedagogico.pl", "String", ""));
  
     Goal acompanharInterdisciplinaridadeAlunoG = new LeafGoal("acompanharInterdisciplinaridadeAlunoG", "Boolean", "");
     addGoal("acompanharInterdisciplinaridadeAlunoG", acompanharInterdisciplinaridadeAlunoG);
   
     Action relacionarCursosAc = new Action("relacionarCursosAc", null, null);
     addAction("relacionarCursosAc", relacionarCursosAc);
     Action relacionarDisciplinasAc = new Action("relacionarDisciplinasAc", null, null);
     addAction("relacionarDisciplinasAc", relacionarDisciplinasAc);
     Action sugerirDisciplinasRelacionadasAc = new Action("sugerirDisciplinasRelacionadasAc", null, null);
     addAction("sugerirDisciplinasRelacionadasAc", sugerirDisciplinasRelacionadasAc);
     Action sugerirCursosRelacionadosAc = new Action("sugerirCursosRelacionadosAc", null, null);
     addAction("sugerirCursosRelacionadosAc", sugerirCursosRelacionadosAc);
     Action informarAlunoDescricaoCursosAc = new Action("informarAlunoDescricaoCursos Ac", null, null);
     addAction("informarAlunoDescricaoCursosAc", informarAlunoDescricaoCursosAc);
     Action informarAlunoDescricaoDisciplinasAc = new Action("informarAlunoDescricaoDisciplinas Ac", null, null);
     addAction("informarAlunoDescricaoDisciplinas Ac", informarAlunoDescricaoDisciplinasAc);
     Action requisitaCoordenadorAcaoAc = new Action("requisitaCoordenadorAcaoAc", null, null);
     addAction("requisitaCoordenadorAcaoAc", requisitaCoordenadorAcaoAc);
   
     addPerceive("cursosExistentes", relacionarCursosAc);
     addPerceive("disciplinasCurso", relacionarDisciplinasAc);
     addPerceive("cursosAluno", sugerirCursosRelacionadosAc);
     addPerceive("tematicaCursosAluno", sugerirDisciplinasRelacionadasAc);
     addPerceive("disciplinasAluno", sugerirDisciplinasRelacionadasAc);
     addPerceive("tematicaDisciplinasAluno", sugerirDisciplinasRelacionadasAc);
     addPerceive("mensagemApoio", requisitaCoordenadorAcaoAc);
     addPerceive("localizarDocumentosPessoas", informarAlunoDescricaoCursosAc);
     addPerceive("dificuldadeFuncionalidades", informarAlunoDescricaoDisciplinasAc);
     addPerceive("criacaoDeGrupo ", sugerirCursosRelacionadosAc);
   
     Plan acompanharAlunoPlan = new Plan("acompanharAluno Plan", null);
     addPlan("acompanharAluno Plan", acompanharAlunoPlan); 
   }
   
   protected Plan planning(List<Action> actions){
      return null;
   }
      
   protected Goal formulateGoalFunction(Belief belief) {
      return goalFuncPedagogico(belief);
   }
   private Goal goalFuncPedagogico(Belief belief) {
      return null;
   }
   protected List<Action> formulateProblemFunction(Belief belief, Goal goal) {
      return probFuncPedagogico(belief, goal);
   }
   private List<Action> probFuncPedagogico(Belief belief, Goal goal) {
      return null;
   }
   protected Belief nextFunction(Belief belief, String perception) {
      return proximoPedagogico(belief, perception);
   }
   private Belief proximoPedagogico(Belief belief, String perception) {
      return null;
   }

   public void percept(String perception) { }
}

