package moodle.papeis;

import jamder.Organization;
import jamder.agents.GenericAgent;
import jamder.behavioural.Right;
import jamder.roles.ProactiveAgentRole;
import jamder.structural.Belief;
import jamder.structural.LeafGoal;

public class CoordenadorAgRole extends ProactiveAgentRole {
	// Constructor
	public CoordenadorAgRole(String name, Organization owner, GenericAgent player) {
		super(name, owner, player);
		addBelief("crencasCoordenador.pl", new Belief("crencasCoordenador.pl", "String", ""));

		addGoal("requisitarAcaoAgente", new LeafGoal("requisitarAcaoAgente", "String", ""));

		addRight("verificaAcaoDoAgente", new Right());
		addRight("requisitaAcao", new Right());

		initialize();
	}
}
