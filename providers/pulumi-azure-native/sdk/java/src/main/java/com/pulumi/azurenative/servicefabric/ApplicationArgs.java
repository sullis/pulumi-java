// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric;

import com.pulumi.azurenative.servicefabric.inputs.ApplicationMetricDescriptionArgs;
import com.pulumi.azurenative.servicefabric.inputs.ApplicationUpgradePolicyArgs;
import com.pulumi.azurenative.servicefabric.inputs.ApplicationUserAssignedIdentityArgs;
import com.pulumi.azurenative.servicefabric.inputs.ManagedIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The name of the application resource.
     * 
     */
    @Import(name="applicationName")
      private final @Nullable Output<String> applicationName;

    public Output<String> applicationName() {
        return this.applicationName == null ? Codegen.empty() : this.applicationName;
    }

    /**
     * The name of the cluster resource.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Describes the managed identities for an Azure resource.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedIdentityArgs> identity;

    public Output<ManagedIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * It will be deprecated in New API, resource location depends on the parent resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * List of user assigned identities for the application, each mapped to a friendly name.
     * 
     */
    @Import(name="managedIdentities")
      private final @Nullable Output<List<ApplicationUserAssignedIdentityArgs>> managedIdentities;

    public Output<List<ApplicationUserAssignedIdentityArgs>> managedIdentities() {
        return this.managedIdentities == null ? Codegen.empty() : this.managedIdentities;
    }

    /**
     * The maximum number of nodes where Service Fabric will reserve capacity for this application. Note that this does not mean that the services of this application will be placed on all of those nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     * 
     */
    @Import(name="maximumNodes")
      private final @Nullable Output<Double> maximumNodes;

    public Output<Double> maximumNodes() {
        return this.maximumNodes == null ? Codegen.empty() : this.maximumNodes;
    }

    /**
     * List of application capacity metric description.
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<List<ApplicationMetricDescriptionArgs>> metrics;

    public Output<List<ApplicationMetricDescriptionArgs>> metrics() {
        return this.metrics == null ? Codegen.empty() : this.metrics;
    }

    /**
     * The minimum number of nodes where Service Fabric will reserve capacity for this application. Note that this does not mean that the services of this application will be placed on all of those nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more than the value of the MaximumNodes property.
     * 
     */
    @Import(name="minimumNodes")
      private final @Nullable Output<Double> minimumNodes;

    public Output<Double> minimumNodes() {
        return this.minimumNodes == null ? Codegen.empty() : this.minimumNodes;
    }

    /**
     * List of application parameters with overridden values from their default values specified in the application manifest.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,String>> parameters;

    public Output<Map<String,String>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Remove the current application capacity settings.
     * 
     */
    @Import(name="removeApplicationCapacity")
      private final @Nullable Output<Boolean> removeApplicationCapacity;

    public Output<Boolean> removeApplicationCapacity() {
        return this.removeApplicationCapacity == null ? Codegen.empty() : this.removeApplicationCapacity;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Azure resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The application type name as defined in the application manifest.
     * 
     */
    @Import(name="typeName")
      private final @Nullable Output<String> typeName;

    public Output<String> typeName() {
        return this.typeName == null ? Codegen.empty() : this.typeName;
    }

    /**
     * The version of the application type as defined in the application manifest.
     * 
     */
    @Import(name="typeVersion")
      private final @Nullable Output<String> typeVersion;

    public Output<String> typeVersion() {
        return this.typeVersion == null ? Codegen.empty() : this.typeVersion;
    }

    /**
     * Describes the policy for a monitored application upgrade.
     * 
     */
    @Import(name="upgradePolicy")
      private final @Nullable Output<ApplicationUpgradePolicyArgs> upgradePolicy;

    public Output<ApplicationUpgradePolicyArgs> upgradePolicy() {
        return this.upgradePolicy == null ? Codegen.empty() : this.upgradePolicy;
    }

    public ApplicationArgs(
        @Nullable Output<String> applicationName,
        Output<String> clusterName,
        @Nullable Output<ManagedIdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<List<ApplicationUserAssignedIdentityArgs>> managedIdentities,
        @Nullable Output<Double> maximumNodes,
        @Nullable Output<List<ApplicationMetricDescriptionArgs>> metrics,
        @Nullable Output<Double> minimumNodes,
        @Nullable Output<Map<String,String>> parameters,
        @Nullable Output<Boolean> removeApplicationCapacity,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> typeName,
        @Nullable Output<String> typeVersion,
        @Nullable Output<ApplicationUpgradePolicyArgs> upgradePolicy) {
        this.applicationName = applicationName;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.identity = identity;
        this.location = location;
        this.managedIdentities = managedIdentities;
        this.maximumNodes = Codegen.doubleProp("maximumNodes").output().arg(maximumNodes).def(0e+00).getNullable();
        this.metrics = metrics;
        this.minimumNodes = minimumNodes;
        this.parameters = parameters;
        this.removeApplicationCapacity = removeApplicationCapacity;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.typeName = typeName;
        this.typeVersion = typeVersion;
        this.upgradePolicy = upgradePolicy;
    }

    private ApplicationArgs() {
        this.applicationName = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.managedIdentities = Codegen.empty();
        this.maximumNodes = Codegen.empty();
        this.metrics = Codegen.empty();
        this.minimumNodes = Codegen.empty();
        this.parameters = Codegen.empty();
        this.removeApplicationCapacity = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.typeName = Codegen.empty();
        this.typeVersion = Codegen.empty();
        this.upgradePolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationName;
        private Output<String> clusterName;
        private @Nullable Output<ManagedIdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<List<ApplicationUserAssignedIdentityArgs>> managedIdentities;
        private @Nullable Output<Double> maximumNodes;
        private @Nullable Output<List<ApplicationMetricDescriptionArgs>> metrics;
        private @Nullable Output<Double> minimumNodes;
        private @Nullable Output<Map<String,String>> parameters;
        private @Nullable Output<Boolean> removeApplicationCapacity;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> typeName;
        private @Nullable Output<String> typeVersion;
        private @Nullable Output<ApplicationUpgradePolicyArgs> upgradePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.clusterName = defaults.clusterName;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.managedIdentities = defaults.managedIdentities;
    	      this.maximumNodes = defaults.maximumNodes;
    	      this.metrics = defaults.metrics;
    	      this.minimumNodes = defaults.minimumNodes;
    	      this.parameters = defaults.parameters;
    	      this.removeApplicationCapacity = defaults.removeApplicationCapacity;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.typeName = defaults.typeName;
    	      this.typeVersion = defaults.typeVersion;
    	      this.upgradePolicy = defaults.upgradePolicy;
        }

        public Builder applicationName(@Nullable Output<String> applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public Builder applicationName(@Nullable String applicationName) {
            this.applicationName = Codegen.ofNullable(applicationName);
            return this;
        }
        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder identity(@Nullable Output<ManagedIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder managedIdentities(@Nullable Output<List<ApplicationUserAssignedIdentityArgs>> managedIdentities) {
            this.managedIdentities = managedIdentities;
            return this;
        }
        public Builder managedIdentities(@Nullable List<ApplicationUserAssignedIdentityArgs> managedIdentities) {
            this.managedIdentities = Codegen.ofNullable(managedIdentities);
            return this;
        }
        public Builder managedIdentities(ApplicationUserAssignedIdentityArgs... managedIdentities) {
            return managedIdentities(List.of(managedIdentities));
        }
        public Builder maximumNodes(@Nullable Output<Double> maximumNodes) {
            this.maximumNodes = maximumNodes;
            return this;
        }
        public Builder maximumNodes(@Nullable Double maximumNodes) {
            this.maximumNodes = Codegen.ofNullable(maximumNodes);
            return this;
        }
        public Builder metrics(@Nullable Output<List<ApplicationMetricDescriptionArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable List<ApplicationMetricDescriptionArgs> metrics) {
            this.metrics = Codegen.ofNullable(metrics);
            return this;
        }
        public Builder metrics(ApplicationMetricDescriptionArgs... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder minimumNodes(@Nullable Output<Double> minimumNodes) {
            this.minimumNodes = minimumNodes;
            return this;
        }
        public Builder minimumNodes(@Nullable Double minimumNodes) {
            this.minimumNodes = Codegen.ofNullable(minimumNodes);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder removeApplicationCapacity(@Nullable Output<Boolean> removeApplicationCapacity) {
            this.removeApplicationCapacity = removeApplicationCapacity;
            return this;
        }
        public Builder removeApplicationCapacity(@Nullable Boolean removeApplicationCapacity) {
            this.removeApplicationCapacity = Codegen.ofNullable(removeApplicationCapacity);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder typeName(@Nullable Output<String> typeName) {
            this.typeName = typeName;
            return this;
        }
        public Builder typeName(@Nullable String typeName) {
            this.typeName = Codegen.ofNullable(typeName);
            return this;
        }
        public Builder typeVersion(@Nullable Output<String> typeVersion) {
            this.typeVersion = typeVersion;
            return this;
        }
        public Builder typeVersion(@Nullable String typeVersion) {
            this.typeVersion = Codegen.ofNullable(typeVersion);
            return this;
        }
        public Builder upgradePolicy(@Nullable Output<ApplicationUpgradePolicyArgs> upgradePolicy) {
            this.upgradePolicy = upgradePolicy;
            return this;
        }
        public Builder upgradePolicy(@Nullable ApplicationUpgradePolicyArgs upgradePolicy) {
            this.upgradePolicy = Codegen.ofNullable(upgradePolicy);
            return this;
        }        public ApplicationArgs build() {
            return new ApplicationArgs(applicationName, clusterName, identity, location, managedIdentities, maximumNodes, metrics, minimumNodes, parameters, removeApplicationCapacity, resourceGroupName, tags, typeName, typeVersion, upgradePolicy);
        }
    }
}
