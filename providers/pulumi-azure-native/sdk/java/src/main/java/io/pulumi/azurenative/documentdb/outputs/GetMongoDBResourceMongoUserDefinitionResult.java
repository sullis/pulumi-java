// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.RoleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMongoDBResourceMongoUserDefinitionResult {
    /**
     * A custom definition for the USer Definition.
     * 
     */
    private final @Nullable String customData;
    /**
     * The database name for which access is being granted for this User Definition.
     * 
     */
    private final @Nullable String databaseName;
    /**
     * The unique resource identifier of the database account.
     * 
     */
    private final String id;
    /**
     * The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     * 
     */
    private final @Nullable String mechanisms;
    /**
     * The name of the database account.
     * 
     */
    private final String name;
    /**
     * The password for User Definition. Response does not contain user password.
     * 
     */
    private final @Nullable String password;
    /**
     * The set of roles inherited by the User Definition.
     * 
     */
    private final @Nullable List<RoleResponse> roles;
    /**
     * The type of Azure resource.
     * 
     */
    private final String type;
    /**
     * The user name for User Definition.
     * 
     */
    private final @Nullable String userName;

    @OutputCustomType.Constructor({"customData","databaseName","id","mechanisms","name","password","roles","type","userName"})
    private GetMongoDBResourceMongoUserDefinitionResult(
        @Nullable String customData,
        @Nullable String databaseName,
        String id,
        @Nullable String mechanisms,
        String name,
        @Nullable String password,
        @Nullable List<RoleResponse> roles,
        String type,
        @Nullable String userName) {
        this.customData = customData;
        this.databaseName = databaseName;
        this.id = Objects.requireNonNull(id);
        this.mechanisms = mechanisms;
        this.name = Objects.requireNonNull(name);
        this.password = password;
        this.roles = roles;
        this.type = Objects.requireNonNull(type);
        this.userName = userName;
    }

    /**
     * A custom definition for the USer Definition.
     * 
    */
    public Optional<String> getCustomData() {
        return Optional.ofNullable(this.customData);
    }
    /**
     * The database name for which access is being granted for this User Definition.
     * 
    */
    public Optional<String> getDatabaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * The unique resource identifier of the database account.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     * 
    */
    public Optional<String> getMechanisms() {
        return Optional.ofNullable(this.mechanisms);
    }
    /**
     * The name of the database account.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The password for User Definition. Response does not contain user password.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The set of roles inherited by the User Definition.
     * 
    */
    public List<RoleResponse> getRoles() {
        return this.roles == null ? List.of() : this.roles;
    }
    /**
     * The type of Azure resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The user name for User Definition.
     * 
    */
    public Optional<String> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMongoDBResourceMongoUserDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customData;
        private @Nullable String databaseName;
        private String id;
        private @Nullable String mechanisms;
        private String name;
        private @Nullable String password;
        private @Nullable List<RoleResponse> roles;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMongoDBResourceMongoUserDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customData = defaults.customData;
    	      this.databaseName = defaults.databaseName;
    	      this.id = defaults.id;
    	      this.mechanisms = defaults.mechanisms;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.roles = defaults.roles;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setCustomData(@Nullable String customData) {
            this.customData = customData;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMechanisms(@Nullable String mechanisms) {
            this.mechanisms = mechanisms;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setRoles(@Nullable List<RoleResponse> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public GetMongoDBResourceMongoUserDefinitionResult build() {
            return new GetMongoDBResourceMongoUserDefinitionResult(customData, databaseName, id, mechanisms, name, password, roles, type, userName);
        }
    }
}