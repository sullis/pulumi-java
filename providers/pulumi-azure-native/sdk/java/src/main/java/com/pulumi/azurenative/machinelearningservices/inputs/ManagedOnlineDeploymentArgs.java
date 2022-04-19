// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.AutoScaleSettingsArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.CodeConfigurationArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.DataPathAssetReferenceArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.IdAssetReferenceArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ManualScaleSettingsArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.OnlineRequestSettingsArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.OutputPathAssetReferenceArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ProbeSettingsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedOnlineDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedOnlineDeploymentArgs Empty = new ManagedOnlineDeploymentArgs();

    /**
     * If true, enables Application Insights logging.
     * 
     */
    @Import(name="appInsightsEnabled")
      private final @Nullable Output<Boolean> appInsightsEnabled;

    public Output<Boolean> appInsightsEnabled() {
        return this.appInsightsEnabled == null ? Codegen.empty() : this.appInsightsEnabled;
    }

    /**
     * Code configuration for the endpoint deployment.
     * 
     */
    @Import(name="codeConfiguration")
      private final @Nullable Output<CodeConfigurationArgs> codeConfiguration;

    public Output<CodeConfigurationArgs> codeConfiguration() {
        return this.codeConfiguration == null ? Codegen.empty() : this.codeConfiguration;
    }

    /**
     * Description of the endpoint deployment.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Enum to determine endpoint compute type.
     * Expected value is 'Managed'.
     * 
     */
    @Import(name="endpointComputeType", required=true)
      private final Output<String> endpointComputeType;

    public Output<String> endpointComputeType() {
        return this.endpointComputeType;
    }

    /**
     * ARM resource ID of the environment specification for the endpoint deployment.
     * 
     */
    @Import(name="environmentId")
      private final @Nullable Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId == null ? Codegen.empty() : this.environmentId;
    }

    /**
     * Environment variables configuration for the deployment.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<Map<String,String>> environmentVariables;

    public Output<Map<String,String>> environmentVariables() {
        return this.environmentVariables == null ? Codegen.empty() : this.environmentVariables;
    }

    /**
     * Compute instance type.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * Deployment container liveness/readiness probe configuration.
     * 
     */
    @Import(name="livenessProbe")
      private final @Nullable Output<ProbeSettingsArgs> livenessProbe;

    public Output<ProbeSettingsArgs> livenessProbe() {
        return this.livenessProbe == null ? Codegen.empty() : this.livenessProbe;
    }

    /**
     * Reference to the model asset for the endpoint deployment.
     * 
     */
    @Import(name="model")
      private final @Nullable Output<Object> model;

    public Output<Object> model() {
        return this.model == null ? Codegen.empty() : this.model;
    }

    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Deployment container liveness/readiness probe configuration.
     * 
     */
    @Import(name="readinessProbe")
      private final @Nullable Output<ProbeSettingsArgs> readinessProbe;

    public Output<ProbeSettingsArgs> readinessProbe() {
        return this.readinessProbe == null ? Codegen.empty() : this.readinessProbe;
    }

    /**
     * Online deployment scoring requests configuration.
     * 
     */
    @Import(name="requestSettings")
      private final @Nullable Output<OnlineRequestSettingsArgs> requestSettings;

    public Output<OnlineRequestSettingsArgs> requestSettings() {
        return this.requestSettings == null ? Codegen.empty() : this.requestSettings;
    }

    /**
     * Online deployment scaling configuration.
     * 
     */
    @Import(name="scaleSettings")
      private final @Nullable Output<Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs>> scaleSettings;

    public Output<Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs>> scaleSettings() {
        return this.scaleSettings == null ? Codegen.empty() : this.scaleSettings;
    }

    public ManagedOnlineDeploymentArgs(
        @Nullable Output<Boolean> appInsightsEnabled,
        @Nullable Output<CodeConfigurationArgs> codeConfiguration,
        @Nullable Output<String> description,
        Output<String> endpointComputeType,
        @Nullable Output<String> environmentId,
        @Nullable Output<Map<String,String>> environmentVariables,
        @Nullable Output<String> instanceType,
        @Nullable Output<ProbeSettingsArgs> livenessProbe,
        @Nullable Output<Object> model,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<ProbeSettingsArgs> readinessProbe,
        @Nullable Output<OnlineRequestSettingsArgs> requestSettings,
        @Nullable Output<Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs>> scaleSettings) {
        this.appInsightsEnabled = appInsightsEnabled;
        this.codeConfiguration = codeConfiguration;
        this.description = description;
        this.endpointComputeType = Codegen.stringProp("endpointComputeType").output().arg(endpointComputeType).require();
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.instanceType = instanceType;
        this.livenessProbe = livenessProbe;
        this.model = model;
        this.properties = properties;
        this.readinessProbe = readinessProbe;
        this.requestSettings = requestSettings;
        this.scaleSettings = scaleSettings;
    }

    private ManagedOnlineDeploymentArgs() {
        this.appInsightsEnabled = Codegen.empty();
        this.codeConfiguration = Codegen.empty();
        this.description = Codegen.empty();
        this.endpointComputeType = Codegen.empty();
        this.environmentId = Codegen.empty();
        this.environmentVariables = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.livenessProbe = Codegen.empty();
        this.model = Codegen.empty();
        this.properties = Codegen.empty();
        this.readinessProbe = Codegen.empty();
        this.requestSettings = Codegen.empty();
        this.scaleSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedOnlineDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> appInsightsEnabled;
        private @Nullable Output<CodeConfigurationArgs> codeConfiguration;
        private @Nullable Output<String> description;
        private Output<String> endpointComputeType;
        private @Nullable Output<String> environmentId;
        private @Nullable Output<Map<String,String>> environmentVariables;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<ProbeSettingsArgs> livenessProbe;
        private @Nullable Output<Object> model;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<ProbeSettingsArgs> readinessProbe;
        private @Nullable Output<OnlineRequestSettingsArgs> requestSettings;
        private @Nullable Output<Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs>> scaleSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedOnlineDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInsightsEnabled = defaults.appInsightsEnabled;
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.description = defaults.description;
    	      this.endpointComputeType = defaults.endpointComputeType;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.instanceType = defaults.instanceType;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.model = defaults.model;
    	      this.properties = defaults.properties;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.requestSettings = defaults.requestSettings;
    	      this.scaleSettings = defaults.scaleSettings;
        }

        public Builder appInsightsEnabled(@Nullable Output<Boolean> appInsightsEnabled) {
            this.appInsightsEnabled = appInsightsEnabled;
            return this;
        }
        public Builder appInsightsEnabled(@Nullable Boolean appInsightsEnabled) {
            this.appInsightsEnabled = Codegen.ofNullable(appInsightsEnabled);
            return this;
        }
        public Builder codeConfiguration(@Nullable Output<CodeConfigurationArgs> codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public Builder codeConfiguration(@Nullable CodeConfigurationArgs codeConfiguration) {
            this.codeConfiguration = Codegen.ofNullable(codeConfiguration);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder endpointComputeType(Output<String> endpointComputeType) {
            this.endpointComputeType = Objects.requireNonNull(endpointComputeType);
            return this;
        }
        public Builder endpointComputeType(String endpointComputeType) {
            this.endpointComputeType = Output.of(Objects.requireNonNull(endpointComputeType));
            return this;
        }
        public Builder environmentId(@Nullable Output<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = Codegen.ofNullable(environmentId);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Codegen.ofNullable(environmentVariables);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder livenessProbe(@Nullable Output<ProbeSettingsArgs> livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public Builder livenessProbe(@Nullable ProbeSettingsArgs livenessProbe) {
            this.livenessProbe = Codegen.ofNullable(livenessProbe);
            return this;
        }
        public Builder model(@Nullable Output<Object> model) {
            this.model = model;
            return this;
        }
        public Builder model(@Nullable Object model) {
            this.model = Codegen.ofNullable(model);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder readinessProbe(@Nullable Output<ProbeSettingsArgs> readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public Builder readinessProbe(@Nullable ProbeSettingsArgs readinessProbe) {
            this.readinessProbe = Codegen.ofNullable(readinessProbe);
            return this;
        }
        public Builder requestSettings(@Nullable Output<OnlineRequestSettingsArgs> requestSettings) {
            this.requestSettings = requestSettings;
            return this;
        }
        public Builder requestSettings(@Nullable OnlineRequestSettingsArgs requestSettings) {
            this.requestSettings = Codegen.ofNullable(requestSettings);
            return this;
        }
        public Builder scaleSettings(@Nullable Output<Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs>> scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }
        public Builder scaleSettings(@Nullable Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs> scaleSettings) {
            this.scaleSettings = Codegen.ofNullable(scaleSettings);
            return this;
        }        public ManagedOnlineDeploymentArgs build() {
            return new ManagedOnlineDeploymentArgs(appInsightsEnabled, codeConfiguration, description, endpointComputeType, environmentId, environmentVariables, instanceType, livenessProbe, model, properties, readinessProbe, requestSettings, scaleSettings);
        }
    }
}
