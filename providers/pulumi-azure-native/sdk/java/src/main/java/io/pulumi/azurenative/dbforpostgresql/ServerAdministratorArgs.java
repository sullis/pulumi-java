// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.dbforpostgresql.enums.AdministratorType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServerAdministratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerAdministratorArgs Empty = new ServerAdministratorArgs();

    /**
     * The type of administrator.
     * 
     */
    @InputImport(name="administratorType", required=true)
    private final Input<Either<String,AdministratorType>> administratorType;

    public Input<Either<String,AdministratorType>> getAdministratorType() {
        return this.administratorType;
    }

    /**
     * The server administrator login account name.
     * 
     */
    @InputImport(name="login", required=true)
    private final Input<String> login;

    public Input<String> getLogin() {
        return this.login;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
    private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    /**
     * The server administrator Sid (Secure ID).
     * 
     */
    @InputImport(name="sid", required=true)
    private final Input<String> sid;

    public Input<String> getSid() {
        return this.sid;
    }

    /**
     * The server Active Directory Administrator tenant id.
     * 
     */
    @InputImport(name="tenantId", required=true)
    private final Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId;
    }

    public ServerAdministratorArgs(
        Input<Either<String,AdministratorType>> administratorType,
        Input<String> login,
        Input<String> resourceGroupName,
        Input<String> serverName,
        Input<String> sid,
        Input<String> tenantId) {
        this.administratorType = Objects.requireNonNull(administratorType, "expected parameter 'administratorType' to be non-null");
        this.login = Objects.requireNonNull(login, "expected parameter 'login' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.sid = Objects.requireNonNull(sid, "expected parameter 'sid' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private ServerAdministratorArgs() {
        this.administratorType = Input.empty();
        this.login = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
        this.sid = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerAdministratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,AdministratorType>> administratorType;
        private Input<String> login;
        private Input<String> resourceGroupName;
        private Input<String> serverName;
        private Input<String> sid;
        private Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerAdministratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.login = defaults.login;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setAdministratorType(Input<Either<String,AdministratorType>> administratorType) {
            this.administratorType = Objects.requireNonNull(administratorType);
            return this;
        }

        public Builder setAdministratorType(Either<String,AdministratorType> administratorType) {
            this.administratorType = Input.of(Objects.requireNonNull(administratorType));
            return this;
        }

        public Builder setLogin(Input<String> login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }

        public Builder setLogin(String login) {
            this.login = Input.of(Objects.requireNonNull(login));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setSid(Input<String> sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }

        public Builder setSid(String sid) {
            this.sid = Input.of(Objects.requireNonNull(sid));
            return this;
        }

        public Builder setTenantId(Input<String> tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Input.of(Objects.requireNonNull(tenantId));
            return this;
        }

        public ServerAdministratorArgs build() {
            return new ServerAdministratorArgs(administratorType, login, resourceGroupName, serverName, sid, tenantId);
        }
    }
}
