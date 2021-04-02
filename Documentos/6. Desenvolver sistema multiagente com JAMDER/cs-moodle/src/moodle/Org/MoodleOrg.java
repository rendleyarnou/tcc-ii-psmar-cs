package moodle.Org;

import jamder.Environment;
import jamder.Organization;
import jamder.roles.ProactiveAgentRole;

public class MoodleOrg extends Organization {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Constructor
	public MoodleOrg(String name, Environment env, ProactiveAgentRole agRole) {
		super(name, env, agRole);
	}
}
