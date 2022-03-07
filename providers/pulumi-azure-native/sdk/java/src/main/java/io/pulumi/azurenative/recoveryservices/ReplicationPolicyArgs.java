// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.CreatePolicyInputPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationPolicyArgs Empty = new ReplicationPolicyArgs();

    /**
     * Replication policy name
     * 
     */
    @InputImport(name="policyName")
      private final @Nullable Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName == null ? Input.empty() : this.policyName;
    }

    /**
     * Policy creation properties.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<CreatePolicyInputPropertiesArgs> properties;

    public Input<CreatePolicyInputPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @InputImport(name="resourceName", required=true)
      private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    public ReplicationPolicyArgs(
        @Nullable Input<String> policyName,
        @Nullable Input<CreatePolicyInputPropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> resourceName) {
        this.policyName = policyName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ReplicationPolicyArgs() {
        this.policyName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> policyName;
        private @Nullable Input<CreatePolicyInputPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyName = defaults.policyName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setPolicyName(@Nullable Input<String> policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setPolicyName(@Nullable String policyName) {
            this.policyName = Input.ofNullable(policyName);
            return this;
        }

        public Builder setProperties(@Nullable Input<CreatePolicyInputPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable CreatePolicyInputPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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

        public Builder setResourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public ReplicationPolicyArgs build() {
            return new ReplicationPolicyArgs(policyName, properties, resourceGroupName, resourceName);
        }
    }
}