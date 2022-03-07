// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagedInstanceAdministratorResult {
    /**
     * Type of the managed instance administrator.
     * 
     */
    private final String administratorType;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Login name of the managed instance administrator.
     * 
     */
    private final String login;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * SID (object ID) of the managed instance administrator.
     * 
     */
    private final String sid;
    /**
     * Tenant ID of the managed instance administrator.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"administratorType","id","login","name","sid","tenantId","type"})
    private GetManagedInstanceAdministratorResult(
        String administratorType,
        String id,
        String login,
        String name,
        String sid,
        @Nullable String tenantId,
        String type) {
        this.administratorType = Objects.requireNonNull(administratorType);
        this.id = Objects.requireNonNull(id);
        this.login = Objects.requireNonNull(login);
        this.name = Objects.requireNonNull(name);
        this.sid = Objects.requireNonNull(sid);
        this.tenantId = tenantId;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Type of the managed instance administrator.
     * 
    */
    public String getAdministratorType() {
        return this.administratorType;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Login name of the managed instance administrator.
     * 
    */
    public String getLogin() {
        return this.login;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * SID (object ID) of the managed instance administrator.
     * 
    */
    public String getSid() {
        return this.sid;
    }
    /**
     * Tenant ID of the managed instance administrator.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedInstanceAdministratorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorType;
        private String id;
        private String login;
        private String name;
        private String sid;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedInstanceAdministratorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.id = defaults.id;
    	      this.login = defaults.login;
    	      this.name = defaults.name;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setAdministratorType(String administratorType) {
            this.administratorType = Objects.requireNonNull(administratorType);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLogin(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSid(String sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetManagedInstanceAdministratorResult build() {
            return new GetManagedInstanceAdministratorResult(administratorType, id, login, name, sid, tenantId, type);
        }
    }
}