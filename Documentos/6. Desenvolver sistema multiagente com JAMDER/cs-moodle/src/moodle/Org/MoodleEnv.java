package moodle.Org;

import jamder.Environment;
import jamder.Organization;
import jamder.agents.GenericAgent;
import jamder.roles.AgentRole;
import jamder.roles.ModelAgentRole;
import jamder.roles.ProactiveAgentRole;
import moodle.AjudanteAgente;
import moodle.BuscadorAgente;
import moodle.CompanheiroAgente;
import moodle.CoordenadorAgente;
import moodle.FormadorAgente;
import moodle.PedagogicoAgente;

public class MoodleEnv extends Environment {
	public MoodleEnv(String name, String host, String port) {
		super(name, host, port);
		Organization MoodleOrg = new Organization("MoodleOrg", this, null);
		addOrganization("MoodleOrg", MoodleOrg);

		GenericAgent AjudanteAg = new AjudanteAgente("AjudanteAg", this, null);
		AgentRole AjudanteAgRole = new AgentRole("AjudanteAgRole", MoodleOrg, AjudanteAg);
		addAgent("AjudanteAg", AjudanteAg);

		GenericAgent BuscadorAg = new BuscadorAgente("BuscadorAg", this, null);
		AgentRole BuscadorAgRole = new ProactiveAgentRole("BuscadorAgRole", MoodleOrg, BuscadorAg);
		addAgent("BuscadorAg", BuscadorAg);

		GenericAgent CompanheiroAg = new CompanheiroAgente("CompanheiroAg", this, null);
		AgentRole CompanheiroAgRole = new ModelAgentRole("CompanheiroAgRole", MoodleOrg, CompanheiroAg);
		addAgent("CompanheiroAg", CompanheiroAg);

		GenericAgent CoordenadorAg = new CoordenadorAgente("CoordenadorAg", this, null);
		AgentRole CoordenadorAgRole = new ProactiveAgentRole("CoordenadorAg", MoodleOrg, CoordenadorAg);
		addAgent("CoordenadorAg", CoordenadorAg);

		GenericAgent FormadorAg = new FormadorAgente("FormadorAg", this, null);
		AgentRole FormadorAgRole = new ProactiveAgentRole("FormadorAgRole", MoodleOrg, FormadorAg);
		addAgent("FormadorAg", FormadorAg);

		GenericAgent PedagogicoAg = new PedagogicoAgente("PedagogicoAg", this, null);
		AgentRole PedagogicoAgRole = new ProactiveAgentRole("PedagogicoAgRole", MoodleOrg, PedagogicoAg);
		addAgent("PedagogicoAg", PedagogicoAg);
	}

	public static void main(String args[]) {
		MoodleEnv env = new MoodleEnv("MoodleEnv", "localhost", "8888");
		System.out.println("Executou");
	}
	// Additional attributes

	// Additional methods
}
