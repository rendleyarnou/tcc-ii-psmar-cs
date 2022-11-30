package moodle.papeis;

import jamder.Organization;
import jamder.agents.GenericAgent;
import jamder.behavioural.Duty;
import jamder.behavioural.Right;
import jamder.roles.ProactiveAgentRole;
import jamder.structural.Belief;
import jamder.structural.LeafGoal;

public class BuscadorAgRole extends ProactiveAgentRole {
	// Constructor
	public BuscadorAgRole(String name, Organization owner, GenericAgent player) {
		super(name, owner, player);
		addBelief("crencasBuscador.pl", new Belief("crencasBuscador.pl", "String", ""));

		addGoal("relacionarPessoas", new LeafGoal("relacionarPessoas", "String", ""));
		addGoal("relacionarDocumentos", new LeafGoal("relacionarDocumentos", "String", ""));

		addRight("exibirDocumentosRelacionados", new Right());
		addRight("exibirPessoasRelacionadas", new Right());

		addDuty("localizarPessoas", new Duty());
		addDuty("buscarDocumentos", new Duty());

		initialize();
	}
}
