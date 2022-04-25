// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DdosProtectionPlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final DdosProtectionPlanArgs Empty = new DdosProtectionPlanArgs();

    /**
     * The name of the DDoS protection plan.
     * 
     */
    @Import(name="ddosProtectionPlanName")
    private @Nullable Output<String> ddosProtectionPlanName;

    /**
     * @return The name of the DDoS protection plan.
     * 
     */
    public Optional<Output<String>> ddosProtectionPlanName() {
        return Optional.ofNullable(this.ddosProtectionPlanName);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DdosProtectionPlanArgs() {}

    private DdosProtectionPlanArgs(DdosProtectionPlanArgs $) {
        this.ddosProtectionPlanName = $.ddosProtectionPlanName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DdosProtectionPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DdosProtectionPlanArgs $;

        public Builder() {
            $ = new DdosProtectionPlanArgs();
        }

        public Builder(DdosProtectionPlanArgs defaults) {
            $ = new DdosProtectionPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ddosProtectionPlanName The name of the DDoS protection plan.
         * 
         * @return builder
         * 
         */
        public Builder ddosProtectionPlanName(@Nullable Output<String> ddosProtectionPlanName) {
            $.ddosProtectionPlanName = ddosProtectionPlanName;
            return this;
        }

        /**
         * @param ddosProtectionPlanName The name of the DDoS protection plan.
         * 
         * @return builder
         * 
         */
        public Builder ddosProtectionPlanName(String ddosProtectionPlanName) {
            return ddosProtectionPlanName(Output.of(ddosProtectionPlanName));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
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
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DdosProtectionPlanArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
