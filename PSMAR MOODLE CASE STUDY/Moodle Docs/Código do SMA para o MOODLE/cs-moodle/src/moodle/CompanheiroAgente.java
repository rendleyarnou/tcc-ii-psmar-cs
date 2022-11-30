package moodle;
import jamder.Environment;
import jamder.agents.ModelAgent;
import jamder.behavioural.Action;
import jamder.roles.AgentRole;
import jamder.structural.Belief;

public class CompanheiroAgente extends ModelAgent {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//Constructor 
   public CompanheiroAgente (String name, Environment env, AgentRole agRole) {
     super(name, env, agRole);
     addBelief("crencasAprendizagem.pl", new Belief("crencasAprendizagem.pl", "String", ""));
   
     Action compararTurmaAc = new Action("compararTurmaAc", null, null);
     addAction("compararTurmaAc", compararTurmaAc);
     Action exibirMensagemApoioAc = new Action("exibirMensagemApoioAc", null, null);
     addAction("exibirMensagemApoioAc", exibirMensagemApoioAc);
     Action exibirMensagemReforcoAc = new Action("exibirMensagemReforcoAc", null, null);
     addAction("exibirMensagemReforcoAc", exibirMensagemReforcoAc);
     Action requisitaCoordenadorAcaoAc = new Action("requisitaCoordenadorAcaoAc", null, null);
     addAction("requisitaCoordenadorAcaoAc", requisitaCoordenadorAcaoAc);
   
     addPerceive("dificuldadeDiscussoes", exibirMensagemReforcoAc);
     addPerceive("acessoConteudoAluno", exibirMensagemApoioAc);
   }
   
   protected Belief nextFunction(Belief belief, String perception) {
	return funcaoProximoAprendizagem(belief, perception);
   }
   private Belief funcaoProximoAprendizagem(Belief belief, String perception) {
	return null;
   }

}

