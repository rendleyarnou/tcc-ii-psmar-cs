package moodle;
import jamder.Environment;
import jamder.agents.MASMLAgent;
import jamder.behavioural.Action;
import jamder.behavioural.Plan;
import jamder.roles.AgentRole;
import jamder.structural.Belief;
import jamder.structural.Goal;
import jamder.structural.LeafGoal;

public class CoordenadorAgente extends MASMLAgent {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//Constructor 
   public CoordenadorAgente (String name, Environment env, AgentRole agRole) {
     super(name, env, agRole);
     addBelief("crencasCoordenador.pl", new Belief("crencasCoordenador.pl", "String", ""));
     Goal requisitarAcoesDosAgentesG = new LeafGoal("requisitarAcoesDosAgentesG", "Boolean", "false");
     addGoal("requisitarAcoesDosAgentesG", requisitarAcoesDosAgentesG);
   
     Action verificaAcaoDoAgenteAc = new Action("verificaAcaoDoAgenteAc", null, null);
     addAction("verificaAcaoDoAgenteAc", verificaAcaoDoAgenteAc);
     Action requisitaAcaoAc = new Action("requisitaAcaoAc", null, null);
     addAction("requisitaAcaoAc", requisitaAcaoAc);
   
     Plan requisitarAcaoPlan = new Plan("requisitarAcaoPlan", requisitarAcoesDosAgentesG);
     addPlan("requisitarAcaoPlan", requisitarAcaoPlan); 

     requisitarAcaoPlan.addAction("verificaAcaoDoAgenteAc", verificaAcaoDoAgenteAc);
     requisitarAcaoPlan.addAction("requisitaAcaoAc", requisitaAcaoAc);
   }


}

