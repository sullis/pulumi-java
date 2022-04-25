// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dynamics365fraudprotection;

import com.pulumi.azurenative.dynamics365fraudprotection.inputs.DFPInstanceAdministratorsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceDetailsArgs Empty = new InstanceDetailsArgs();

    /**
     * A collection of DFP instance administrators
     * 
     */
    @Import(name="administration")
    private @Nullable Output<DFPInstanceAdministratorsArgs> administration;

    /**
     * @return A collection of DFP instance administrators
     * 
     */
    public Optional<Output<DFPInstanceAdministratorsArgs>> administration() {
        return Optional.ofNullable(this.administration);
    }

    /**
     * The name of the DFP instances. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The name of the DFP instances. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * Location of the DFP resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the DFP resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Azure Resource group of which a given DFP instance is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Azure Resource group of which a given DFP instance is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value pairs of additional resource provisioning properties.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private InstanceDetailsArgs() {}

    private InstanceDetailsArgs(InstanceDetailsArgs $) {
        this.administration = $.administration;
        this.instanceName = $.instanceName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceDetailsArgs $;

        public Builder() {
            $ = new InstanceDetailsArgs();
        }

        public Builder(InstanceDetailsArgs defaults) {
            $ = new InstanceDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administration A collection of DFP instance administrators
         * 
         * @return builder
         * 
         */
        public Builder administration(@Nullable Output<DFPInstanceAdministratorsArgs> administration) {
            $.administration = administration;
            return this;
        }

        /**
         * @param administration A collection of DFP instance administrators
         * 
         * @return builder
         * 
         */
        public Builder administration(DFPInstanceAdministratorsArgs administration) {
            return administration(Output.of(administration));
        }

        /**
         * @param instanceName The name of the DFP instances. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The name of the DFP instances. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param location Location of the DFP resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the DFP resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the Azure Resource group of which a given DFP instance is part. This name must be at least 1 character in length, and no more than 90.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure Resource group of which a given DFP instance is part. This name must be at least 1 character in length, and no more than 90.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Key-value pairs of additional resource provisioning properties.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value pairs of additional resource provisioning properties.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public InstanceDetailsArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
