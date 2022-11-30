package moodle;
import jamder.Environment;
import jamder.agents.MASMLAgent;
import jamder.behavioural.Action;
import jamder.behavioural.Plan;
import jamder.roles.AgentRole;
import jamder.structural.Belief;
import jamder.structural.Goal;
import jamder.structural.LeafGoal;

public class BuscadorAgente extends MASMLAgent {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//Constructor 
   public BuscadorAgente (String name, Environment env, AgentRole agRole) {
   super(name, env, agRole);
     addBelief("crencasBuscador.pl", new Belief("crencasBuscador.pl", "String", ""));
     
     Goal relacionarPessoasG = new LeafGoal("relacionarPessoasG", "Boolean", "false");
     addGoal("relacionarPessoasG", relacionarPessoasG);
     Goal relacionarDocumentosG = new LeafGoal("relacionarDocumentosG", "Boolean", "false");
     addGoal("relacionarDocumentosG", relacionarDocumentosG);
   
     Action localizarPessoasAc = new Action("localizarPessoasAc", null, null);
     addAction("localizarPessoasAc", localizarPessoasAc);
     Action exibirPessoasRelacionadasAc = new Action("exibirPessoasRelacionadasAc", null, null);
     addAction("exibirPessoasRelacionadasAc", exibirPessoasRelacionadasAc);
     Action buscarDocumentosAc = new Action("buscarDocumentosAc", null, null);
     addAction("buscarDocumentosAc", buscarDocumentosAc);
     Action exibirDocumentosRelacionadosAc = new Action("exibirDocumentosRelacionadosAc", null, null);
     addAction("exibirDocumentosRelacionadosAc", exibirDocumentosRelacionadosAc);
   
     Plan buscarInformacoesPessoasPlan = new Plan("buscarInformacoesPessoasPlan", relacionarDocumentosG);
     addPlan("buscarInformacoesPessoasPlan", buscarInformacoesPessoasPlan); 
     Plan buscarInformacoesDocumentosPlan = new Plan("buscarInformacoesDocumentosPlan", relacionarPessoasG);
     addPlan("buscarInformacoesDocumentosPlan", buscarInformacoesDocumentosPlan); 
   }
   
}
