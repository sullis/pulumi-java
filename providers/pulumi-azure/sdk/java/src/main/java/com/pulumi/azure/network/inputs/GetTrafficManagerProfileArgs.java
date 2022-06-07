// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTrafficManagerProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrafficManagerProfileArgs Empty = new GetTrafficManagerProfileArgs();

    /**
     * Specifies the name of the Traffic Manager Profile.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Traffic Manager Profile.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the name of the resource group the Traffic Manager Profile is located in.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the resource group the Traffic Manager Profile is located in.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Indicates whether Traffic View is enabled for the Traffic Manager profile.
     * 
     */
    @Import(name="trafficViewEnabled")
    private @Nullable Output<Boolean> trafficViewEnabled;

    /**
     * @return Indicates whether Traffic View is enabled for the Traffic Manager profile.
     * 
     */
    public Optional<Output<Boolean>> trafficViewEnabled() {
        return Optional.ofNullable(this.trafficViewEnabled);
    }

    private GetTrafficManagerProfileArgs() {}

    private GetTrafficManagerProfileArgs(GetTrafficManagerProfileArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.trafficViewEnabled = $.trafficViewEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrafficManagerProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrafficManagerProfileArgs $;

        public Builder() {
            $ = new GetTrafficManagerProfileArgs();
        }

        public Builder(GetTrafficManagerProfileArgs defaults) {
            $ = new GetTrafficManagerProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Traffic Manager Profile.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Traffic Manager Profile.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group the Traffic Manager Profile is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group the Traffic Manager Profile is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param trafficViewEnabled Indicates whether Traffic View is enabled for the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder trafficViewEnabled(@Nullable Output<Boolean> trafficViewEnabled) {
            $.trafficViewEnabled = trafficViewEnabled;
            return this;
        }

        /**
         * @param trafficViewEnabled Indicates whether Traffic View is enabled for the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder trafficViewEnabled(Boolean trafficViewEnabled) {
            return trafficViewEnabled(Output.of(trafficViewEnabled));
        }

        public GetTrafficManagerProfileArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
