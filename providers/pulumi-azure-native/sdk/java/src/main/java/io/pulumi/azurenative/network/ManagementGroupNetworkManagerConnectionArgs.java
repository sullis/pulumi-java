// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementGroupNetworkManagerConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementGroupNetworkManagerConnectionArgs Empty = new ManagementGroupNetworkManagerConnectionArgs();

    /**
     * A description of the scope connection.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The management group Id which uniquely identify the Microsoft Azure management group.
     * 
     */
    @InputImport(name="managementGroupId", required=true)
    private final Input<String> managementGroupId;

    public Input<String> getManagementGroupId() {
        return this.managementGroupId;
    }

    /**
     * Name for the network manager connection.
     * 
     */
    @InputImport(name="networkManagerConnectionName")
    private final @Nullable Input<String> networkManagerConnectionName;

    public Input<String> getNetworkManagerConnectionName() {
        return this.networkManagerConnectionName == null ? Input.empty() : this.networkManagerConnectionName;
    }

    /**
     * Network Manager Id.
     * 
     */
    @InputImport(name="networkManagerId")
    private final @Nullable Input<String> networkManagerId;

    public Input<String> getNetworkManagerId() {
        return this.networkManagerId == null ? Input.empty() : this.networkManagerId;
    }

    public ManagementGroupNetworkManagerConnectionArgs(
        @Nullable Input<String> description,
        Input<String> managementGroupId,
        @Nullable Input<String> networkManagerConnectionName,
        @Nullable Input<String> networkManagerId) {
        this.description = description;
        this.managementGroupId = Objects.requireNonNull(managementGroupId, "expected parameter 'managementGroupId' to be non-null");
        this.networkManagerConnectionName = networkManagerConnectionName;
        this.networkManagerId = networkManagerId;
    }

    private ManagementGroupNetworkManagerConnectionArgs() {
        this.description = Input.empty();
        this.managementGroupId = Input.empty();
        this.networkManagerConnectionName = Input.empty();
        this.networkManagerId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupNetworkManagerConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> managementGroupId;
        private @Nullable Input<String> networkManagerConnectionName;
        private @Nullable Input<String> networkManagerId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupNetworkManagerConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.managementGroupId = defaults.managementGroupId;
    	      this.networkManagerConnectionName = defaults.networkManagerConnectionName;
    	      this.networkManagerId = defaults.networkManagerId;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setManagementGroupId(Input<String> managementGroupId) {
            this.managementGroupId = Objects.requireNonNull(managementGroupId);
            return this;
        }

        public Builder setManagementGroupId(String managementGroupId) {
            this.managementGroupId = Input.of(Objects.requireNonNull(managementGroupId));
            return this;
        }

        public Builder setNetworkManagerConnectionName(@Nullable Input<String> networkManagerConnectionName) {
            this.networkManagerConnectionName = networkManagerConnectionName;
            return this;
        }

        public Builder setNetworkManagerConnectionName(@Nullable String networkManagerConnectionName) {
            this.networkManagerConnectionName = Input.ofNullable(networkManagerConnectionName);
            return this;
        }

        public Builder setNetworkManagerId(@Nullable Input<String> networkManagerId) {
            this.networkManagerId = networkManagerId;
            return this;
        }

        public Builder setNetworkManagerId(@Nullable String networkManagerId) {
            this.networkManagerId = Input.ofNullable(networkManagerId);
            return this;
        }

        public ManagementGroupNetworkManagerConnectionArgs build() {
            return new ManagementGroupNetworkManagerConnectionArgs(description, managementGroupId, networkManagerConnectionName, networkManagerId);
        }
    }
}
