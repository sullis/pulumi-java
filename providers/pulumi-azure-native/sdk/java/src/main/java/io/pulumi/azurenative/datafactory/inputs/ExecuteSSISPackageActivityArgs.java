// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.SSISExecutionCredentialArgs;
import io.pulumi.azurenative.datafactory.inputs.SSISExecutionParameterArgs;
import io.pulumi.azurenative.datafactory.inputs.SSISLogLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.SSISPackageLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.SSISPropertyOverrideArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Execute SSIS package activity.
 * 
 */
public final class ExecuteSSISPackageActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecuteSSISPackageActivityArgs Empty = new ExecuteSSISPackageActivityArgs();

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia", required=true)
      private final Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
      private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The environment path to execute the SSIS package. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="environmentPath")
      private final @Nullable Input<Object> environmentPath;

    public Input<Object> getEnvironmentPath() {
        return this.environmentPath == null ? Input.empty() : this.environmentPath;
    }

    /**
     * The package execution credential.
     * 
     */
    @InputImport(name="executionCredential")
      private final @Nullable Input<SSISExecutionCredentialArgs> executionCredential;

    public Input<SSISExecutionCredentialArgs> getExecutionCredential() {
        return this.executionCredential == null ? Input.empty() : this.executionCredential;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
      private final @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
    }

    /**
     * SSIS package execution log location.
     * 
     */
    @InputImport(name="logLocation")
      private final @Nullable Input<SSISLogLocationArgs> logLocation;

    public Input<SSISLogLocationArgs> getLogLocation() {
        return this.logLocation == null ? Input.empty() : this.logLocation;
    }

    /**
     * The logging level of SSIS package execution. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="loggingLevel")
      private final @Nullable Input<Object> loggingLevel;

    public Input<Object> getLoggingLevel() {
        return this.loggingLevel == null ? Input.empty() : this.loggingLevel;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The package level connection managers to execute the SSIS package.
     * 
     */
    @InputImport(name="packageConnectionManagers")
      private final @Nullable Input<Map<String,Map<String,SSISExecutionParameterArgs>>> packageConnectionManagers;

    public Input<Map<String,Map<String,SSISExecutionParameterArgs>>> getPackageConnectionManagers() {
        return this.packageConnectionManagers == null ? Input.empty() : this.packageConnectionManagers;
    }

    /**
     * SSIS package location.
     * 
     */
    @InputImport(name="packageLocation", required=true)
      private final Input<SSISPackageLocationArgs> packageLocation;

    public Input<SSISPackageLocationArgs> getPackageLocation() {
        return this.packageLocation;
    }

    /**
     * The package level parameters to execute the SSIS package.
     * 
     */
    @InputImport(name="packageParameters")
      private final @Nullable Input<Map<String,SSISExecutionParameterArgs>> packageParameters;

    public Input<Map<String,SSISExecutionParameterArgs>> getPackageParameters() {
        return this.packageParameters == null ? Input.empty() : this.packageParameters;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<ActivityPolicyArgs> policy;

    public Input<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * The project level connection managers to execute the SSIS package.
     * 
     */
    @InputImport(name="projectConnectionManagers")
      private final @Nullable Input<Map<String,Map<String,SSISExecutionParameterArgs>>> projectConnectionManagers;

    public Input<Map<String,Map<String,SSISExecutionParameterArgs>>> getProjectConnectionManagers() {
        return this.projectConnectionManagers == null ? Input.empty() : this.projectConnectionManagers;
    }

    /**
     * The project level parameters to execute the SSIS package.
     * 
     */
    @InputImport(name="projectParameters")
      private final @Nullable Input<Map<String,SSISExecutionParameterArgs>> projectParameters;

    public Input<Map<String,SSISExecutionParameterArgs>> getProjectParameters() {
        return this.projectParameters == null ? Input.empty() : this.projectParameters;
    }

    /**
     * The property overrides to execute the SSIS package.
     * 
     */
    @InputImport(name="propertyOverrides")
      private final @Nullable Input<Map<String,SSISPropertyOverrideArgs>> propertyOverrides;

    public Input<Map<String,SSISPropertyOverrideArgs>> getPropertyOverrides() {
        return this.propertyOverrides == null ? Input.empty() : this.propertyOverrides;
    }

    /**
     * Specifies the runtime to execute SSIS package. The value should be "x86" or "x64". Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="runtime")
      private final @Nullable Input<Object> runtime;

    public Input<Object> getRuntime() {
        return this.runtime == null ? Input.empty() : this.runtime;
    }

    /**
     * Type of activity.
     * Expected value is 'ExecuteSSISPackage'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
      private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    public ExecuteSSISPackageActivityArgs(
        Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<Object> environmentPath,
        @Nullable Input<SSISExecutionCredentialArgs> executionCredential,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<SSISLogLocationArgs> logLocation,
        @Nullable Input<Object> loggingLevel,
        Input<String> name,
        @Nullable Input<Map<String,Map<String,SSISExecutionParameterArgs>>> packageConnectionManagers,
        Input<SSISPackageLocationArgs> packageLocation,
        @Nullable Input<Map<String,SSISExecutionParameterArgs>> packageParameters,
        @Nullable Input<ActivityPolicyArgs> policy,
        @Nullable Input<Map<String,Map<String,SSISExecutionParameterArgs>>> projectConnectionManagers,
        @Nullable Input<Map<String,SSISExecutionParameterArgs>> projectParameters,
        @Nullable Input<Map<String,SSISPropertyOverrideArgs>> propertyOverrides,
        @Nullable Input<Object> runtime,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.connectVia = Objects.requireNonNull(connectVia, "expected parameter 'connectVia' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.environmentPath = environmentPath;
        this.executionCredential = executionCredential;
        this.linkedServiceName = linkedServiceName;
        this.logLocation = logLocation;
        this.loggingLevel = loggingLevel;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.packageConnectionManagers = packageConnectionManagers;
        this.packageLocation = Objects.requireNonNull(packageLocation, "expected parameter 'packageLocation' to be non-null");
        this.packageParameters = packageParameters;
        this.policy = policy;
        this.projectConnectionManagers = projectConnectionManagers;
        this.projectParameters = projectParameters;
        this.propertyOverrides = propertyOverrides;
        this.runtime = runtime;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private ExecuteSSISPackageActivityArgs() {
        this.connectVia = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.environmentPath = Input.empty();
        this.executionCredential = Input.empty();
        this.linkedServiceName = Input.empty();
        this.logLocation = Input.empty();
        this.loggingLevel = Input.empty();
        this.name = Input.empty();
        this.packageConnectionManagers = Input.empty();
        this.packageLocation = Input.empty();
        this.packageParameters = Input.empty();
        this.policy = Input.empty();
        this.projectConnectionManagers = Input.empty();
        this.projectParameters = Input.empty();
        this.propertyOverrides = Input.empty();
        this.runtime = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecuteSSISPackageActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> environmentPath;
        private @Nullable Input<SSISExecutionCredentialArgs> executionCredential;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<SSISLogLocationArgs> logLocation;
        private @Nullable Input<Object> loggingLevel;
        private Input<String> name;
        private @Nullable Input<Map<String,Map<String,SSISExecutionParameterArgs>>> packageConnectionManagers;
        private Input<SSISPackageLocationArgs> packageLocation;
        private @Nullable Input<Map<String,SSISExecutionParameterArgs>> packageParameters;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private @Nullable Input<Map<String,Map<String,SSISExecutionParameterArgs>>> projectConnectionManagers;
        private @Nullable Input<Map<String,SSISExecutionParameterArgs>> projectParameters;
        private @Nullable Input<Map<String,SSISPropertyOverrideArgs>> propertyOverrides;
        private @Nullable Input<Object> runtime;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecuteSSISPackageActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVia = defaults.connectVia;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.environmentPath = defaults.environmentPath;
    	      this.executionCredential = defaults.executionCredential;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.logLocation = defaults.logLocation;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.name = defaults.name;
    	      this.packageConnectionManagers = defaults.packageConnectionManagers;
    	      this.packageLocation = defaults.packageLocation;
    	      this.packageParameters = defaults.packageParameters;
    	      this.policy = defaults.policy;
    	      this.projectConnectionManagers = defaults.projectConnectionManagers;
    	      this.projectParameters = defaults.projectParameters;
    	      this.propertyOverrides = defaults.propertyOverrides;
    	      this.runtime = defaults.runtime;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setConnectVia(Input<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = Objects.requireNonNull(connectVia);
            return this;
        }

        public Builder setConnectVia(IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Input.of(Objects.requireNonNull(connectVia));
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnvironmentPath(@Nullable Input<Object> environmentPath) {
            this.environmentPath = environmentPath;
            return this;
        }

        public Builder setEnvironmentPath(@Nullable Object environmentPath) {
            this.environmentPath = Input.ofNullable(environmentPath);
            return this;
        }

        public Builder setExecutionCredential(@Nullable Input<SSISExecutionCredentialArgs> executionCredential) {
            this.executionCredential = executionCredential;
            return this;
        }

        public Builder setExecutionCredential(@Nullable SSISExecutionCredentialArgs executionCredential) {
            this.executionCredential = Input.ofNullable(executionCredential);
            return this;
        }

        public Builder setLinkedServiceName(@Nullable Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
            return this;
        }

        public Builder setLogLocation(@Nullable Input<SSISLogLocationArgs> logLocation) {
            this.logLocation = logLocation;
            return this;
        }

        public Builder setLogLocation(@Nullable SSISLogLocationArgs logLocation) {
            this.logLocation = Input.ofNullable(logLocation);
            return this;
        }

        public Builder setLoggingLevel(@Nullable Input<Object> loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        public Builder setLoggingLevel(@Nullable Object loggingLevel) {
            this.loggingLevel = Input.ofNullable(loggingLevel);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPackageConnectionManagers(@Nullable Input<Map<String,Map<String,SSISExecutionParameterArgs>>> packageConnectionManagers) {
            this.packageConnectionManagers = packageConnectionManagers;
            return this;
        }

        public Builder setPackageConnectionManagers(@Nullable Map<String,Map<String,SSISExecutionParameterArgs>> packageConnectionManagers) {
            this.packageConnectionManagers = Input.ofNullable(packageConnectionManagers);
            return this;
        }

        public Builder setPackageLocation(Input<SSISPackageLocationArgs> packageLocation) {
            this.packageLocation = Objects.requireNonNull(packageLocation);
            return this;
        }

        public Builder setPackageLocation(SSISPackageLocationArgs packageLocation) {
            this.packageLocation = Input.of(Objects.requireNonNull(packageLocation));
            return this;
        }

        public Builder setPackageParameters(@Nullable Input<Map<String,SSISExecutionParameterArgs>> packageParameters) {
            this.packageParameters = packageParameters;
            return this;
        }

        public Builder setPackageParameters(@Nullable Map<String,SSISExecutionParameterArgs> packageParameters) {
            this.packageParameters = Input.ofNullable(packageParameters);
            return this;
        }

        public Builder setPolicy(@Nullable Input<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setProjectConnectionManagers(@Nullable Input<Map<String,Map<String,SSISExecutionParameterArgs>>> projectConnectionManagers) {
            this.projectConnectionManagers = projectConnectionManagers;
            return this;
        }

        public Builder setProjectConnectionManagers(@Nullable Map<String,Map<String,SSISExecutionParameterArgs>> projectConnectionManagers) {
            this.projectConnectionManagers = Input.ofNullable(projectConnectionManagers);
            return this;
        }

        public Builder setProjectParameters(@Nullable Input<Map<String,SSISExecutionParameterArgs>> projectParameters) {
            this.projectParameters = projectParameters;
            return this;
        }

        public Builder setProjectParameters(@Nullable Map<String,SSISExecutionParameterArgs> projectParameters) {
            this.projectParameters = Input.ofNullable(projectParameters);
            return this;
        }

        public Builder setPropertyOverrides(@Nullable Input<Map<String,SSISPropertyOverrideArgs>> propertyOverrides) {
            this.propertyOverrides = propertyOverrides;
            return this;
        }

        public Builder setPropertyOverrides(@Nullable Map<String,SSISPropertyOverrideArgs> propertyOverrides) {
            this.propertyOverrides = Input.ofNullable(propertyOverrides);
            return this;
        }

        public Builder setRuntime(@Nullable Input<Object> runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder setRuntime(@Nullable Object runtime) {
            this.runtime = Input.ofNullable(runtime);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }
        public ExecuteSSISPackageActivityArgs build() {
            return new ExecuteSSISPackageActivityArgs(connectVia, dependsOn, description, environmentPath, executionCredential, linkedServiceName, logLocation, loggingLevel, name, packageConnectionManagers, packageLocation, packageParameters, policy, projectConnectionManagers, projectParameters, propertyOverrides, runtime, type, userProperties);
        }
    }
}