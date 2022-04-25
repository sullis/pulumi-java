// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MiSqlConnectionInfoResponse {
    /**
     * @return Resource id for Azure SQL database Managed instance
     * 
     */
    private final String managedInstanceResourceId;
    /**
     * @return Password credential.
     * 
     */
    private final @Nullable String password;
    /**
     * @return Type of connection info
     * Expected value is &#39;MiSqlConnectionInfo&#39;.
     * 
     */
    private final String type;
    /**
     * @return User name
     * 
     */
    private final @Nullable String userName;

    @CustomType.Constructor
    private MiSqlConnectionInfoResponse(
        @CustomType.Parameter("managedInstanceResourceId") String managedInstanceResourceId,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userName") @Nullable String userName) {
        this.managedInstanceResourceId = managedInstanceResourceId;
        this.password = password;
        this.type = type;
        this.userName = userName;
    }

    /**
     * @return Resource id for Azure SQL database Managed instance
     * 
     */
    public String managedInstanceResourceId() {
        return this.managedInstanceResourceId;
    }
    /**
     * @return Password credential.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Type of connection info
     * Expected value is &#39;MiSqlConnectionInfo&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return User name
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MiSqlConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managedInstanceResourceId;
        private @Nullable String password;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(MiSqlConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedInstanceResourceId = defaults.managedInstanceResourceId;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder managedInstanceResourceId(String managedInstanceResourceId) {
            this.managedInstanceResourceId = Objects.requireNonNull(managedInstanceResourceId);
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }        public MiSqlConnectionInfoResponse build() {
            return new MiSqlConnectionInfoResponse(managedInstanceResourceId, password, type, userName);
        }
    }
}
