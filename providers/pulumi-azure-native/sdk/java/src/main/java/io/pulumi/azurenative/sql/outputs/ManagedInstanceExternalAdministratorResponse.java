// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedInstanceExternalAdministratorResponse {
    /**
     * Type of the sever administrator.
     * 
     */
    private final @Nullable String administratorType;
    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    private final @Nullable Boolean azureADOnlyAuthentication;
    /**
     * Login name of the server administrator.
     * 
     */
    private final @Nullable String login;
    /**
     * Principal Type of the sever administrator.
     * 
     */
    private final @Nullable String principalType;
    /**
     * SID (object ID) of the server administrator.
     * 
     */
    private final @Nullable String sid;
    /**
     * Tenant ID of the administrator.
     * 
     */
    private final @Nullable String tenantId;

    @OutputCustomType.Constructor({"administratorType","azureADOnlyAuthentication","login","principalType","sid","tenantId"})
    private ManagedInstanceExternalAdministratorResponse(
        @Nullable String administratorType,
        @Nullable Boolean azureADOnlyAuthentication,
        @Nullable String login,
        @Nullable String principalType,
        @Nullable String sid,
        @Nullable String tenantId) {
        this.administratorType = administratorType;
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        this.login = login;
        this.principalType = principalType;
        this.sid = sid;
        this.tenantId = tenantId;
    }

    /**
     * Type of the sever administrator.
     * 
     */
    public Optional<String> getAdministratorType() {
        return Optional.ofNullable(this.administratorType);
    }
    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    public Optional<Boolean> getAzureADOnlyAuthentication() {
        return Optional.ofNullable(this.azureADOnlyAuthentication);
    }
    /**
     * Login name of the server administrator.
     * 
     */
    public Optional<String> getLogin() {
        return Optional.ofNullable(this.login);
    }
    /**
     * Principal Type of the sever administrator.
     * 
     */
    public Optional<String> getPrincipalType() {
        return Optional.ofNullable(this.principalType);
    }
    /**
     * SID (object ID) of the server administrator.
     * 
     */
    public Optional<String> getSid() {
        return Optional.ofNullable(this.sid);
    }
    /**
     * Tenant ID of the administrator.
     * 
     */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceExternalAdministratorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String administratorType;
        private @Nullable Boolean azureADOnlyAuthentication;
        private @Nullable String login;
        private @Nullable String principalType;
        private @Nullable String sid;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstanceExternalAdministratorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.azureADOnlyAuthentication = defaults.azureADOnlyAuthentication;
    	      this.login = defaults.login;
    	      this.principalType = defaults.principalType;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setAdministratorType(@Nullable String administratorType) {
            this.administratorType = administratorType;
            return this;
        }

        public Builder setAzureADOnlyAuthentication(@Nullable Boolean azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = azureADOnlyAuthentication;
            return this;
        }

        public Builder setLogin(@Nullable String login) {
            this.login = login;
            return this;
        }

        public Builder setPrincipalType(@Nullable String principalType) {
            this.principalType = principalType;
            return this;
        }

        public Builder setSid(@Nullable String sid) {
            this.sid = sid;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public ManagedInstanceExternalAdministratorResponse build() {
            return new ManagedInstanceExternalAdministratorResponse(administratorType, azureADOnlyAuthentication, login, principalType, sid, tenantId);
        }
    }
}
