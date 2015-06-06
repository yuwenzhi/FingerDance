package fingerdance.backend.securityguard;

import fingerdance.backend.core.UserData;

public abstract class SecurityGuard {
	public abstract void init();
	public abstract void record(UserData strangerData);
	public abstract void tearDown();
}
