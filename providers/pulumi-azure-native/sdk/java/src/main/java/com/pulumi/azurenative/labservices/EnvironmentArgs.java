// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices;

import com.pulumi.azurenative.labservices.inputs.ResourceSetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * The name of the environment.
     * 
     */
    @Import(name="environmentName")
    private @Nullable Output<String> environmentName;

    /**
     * @return The name of the environment.
     * 
     */
    public Optional<Output<String>> environmentName() {
        return Optional.ofNullable(this.environmentName);
    }

    /**
     * The name of the environment Setting.
     * 
     */
    @Import(name="environmentSettingName", required=true)
    private Output<String> environmentSettingName;

    /**
     * @return The name of the environment Setting.
     * 
     */
    public Output<String> environmentSettingName() {
        return this.environmentSettingName;
    }

    /**
     * The name of the lab Account.
     * 
     */
    @Import(name="labAccountName", required=true)
    private Output<String> labAccountName;

    /**
     * @return The name of the lab Account.
     * 
     */
    public Output<String> labAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
    private Output<String> labName;

    /**
     * @return The name of the lab.
     * 
     */
    public Output<String> labName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The provisioning status of the resource.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Optional<Output<String>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The set of a VM and the setting id it was created for
     * 
     */
    @Import(name="resourceSets")
    private @Nullable Output<ResourceSetArgs> resourceSets;

    /**
     * @return The set of a VM and the setting id it was created for
     * 
     */
    public Optional<Output<ResourceSetArgs>> resourceSets() {
        return Optional.ofNullable(this.resourceSets);
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @Import(name="uniqueIdentifier")
    private @Nullable Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Optional<Output<String>> uniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.environmentName = $.environmentName;
        this.environmentSettingName = $.environmentSettingName;
        this.labAccountName = $.labAccountName;
        this.labName = $.labName;
        this.location = $.location;
        this.provisioningState = $.provisioningState;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceSets = $.resourceSets;
        this.tags = $.tags;
        this.uniqueIdentifier = $.uniqueIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environmentName The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(@Nullable Output<String> environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param environmentName The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            return environmentName(Output.of(environmentName));
        }

        /**
         * @param environmentSettingName The name of the environment Setting.
         * 
         * @return builder
         * 
         */
        public Builder environmentSettingName(Output<String> environmentSettingName) {
            $.environmentSettingName = environmentSettingName;
            return this;
        }

        /**
         * @param environmentSettingName The name of the environment Setting.
         * 
         * @return builder
         * 
         */
        public Builder environmentSettingName(String environmentSettingName) {
            return environmentSettingName(Output.of(environmentSettingName));
        }

        /**
         * @param labAccountName The name of the lab Account.
         * 
         * @return builder
         * 
         */
        public Builder labAccountName(Output<String> labAccountName) {
            $.labAccountName = labAccountName;
            return this;
        }

        /**
         * @param labAccountName The name of the lab Account.
         * 
         * @return builder
         * 
         */
        public Builder labAccountName(String labAccountName) {
            return labAccountName(Output.of(labAccountName));
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(Output<String> labName) {
            $.labName = labName;
            return this;
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(String labName) {
            return labName(Output.of(labName));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param provisioningState The provisioning status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState The provisioning status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceSets The set of a VM and the setting id it was created for
         * 
         * @return builder
         * 
         */
        public Builder resourceSets(@Nullable Output<ResourceSetArgs> resourceSets) {
            $.resourceSets = resourceSets;
            return this;
        }

        /**
         * @param resourceSets The set of a VM and the setting id it was created for
         * 
         * @return builder
         * 
         */
        public Builder resourceSets(ResourceSetArgs resourceSets) {
            return resourceSets(Output.of(resourceSets));
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param uniqueIdentifier The unique immutable identifier of a resource (Guid).
         * 
         * @return builder
         * 
         */
        public Builder uniqueIdentifier(@Nullable Output<String> uniqueIdentifier) {
            $.uniqueIdentifier = uniqueIdentifier;
            return this;
        }

        /**
         * @param uniqueIdentifier The unique immutable identifier of a resource (Guid).
         * 
         * @return builder
         * 
         */
        public Builder uniqueIdentifier(String uniqueIdentifier) {
            return uniqueIdentifier(Output.of(uniqueIdentifier));
        }

        public EnvironmentArgs build() {
            $.environmentSettingName = Objects.requireNonNull($.environmentSettingName, "expected parameter 'environmentSettingName' to be non-null");
            $.labAccountName = Objects.requireNonNull($.labAccountName, "expected parameter 'labAccountName' to be non-null");
            $.labName = Objects.requireNonNull($.labName, "expected parameter 'labName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
