// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointCustomHeaderArgs;
import com.pulumi.azure.network.inputs.TrafficManagerExternalEndpointSubnetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficManagerExternalEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficManagerExternalEndpointArgs Empty = new TrafficManagerExternalEndpointArgs();

    /**
     * One or more `custom_header` blocks as defined below.
     * 
     */
    @Import(name="customHeaders")
    private @Nullable Output<List<TrafficManagerExternalEndpointCustomHeaderArgs>> customHeaders;

    /**
     * @return One or more `custom_header` blocks as defined below.
     * 
     */
    public Optional<Output<List<TrafficManagerExternalEndpointCustomHeaderArgs>>> customHeaders() {
        return Optional.ofNullable(this.customHeaders);
    }

    /**
     * Is the endpoint enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the endpoint enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the Azure location of the Endpoint,
     * this must be specified for Profiles using the `Performance` routing method.
     * 
     */
    @Import(name="endpointLocation")
    private @Nullable Output<String> endpointLocation;

    /**
     * @return Specifies the Azure location of the Endpoint,
     * this must be specified for Profiles using the `Performance` routing method.
     * 
     */
    public Optional<Output<String>> endpointLocation() {
        return Optional.ofNullable(this.endpointLocation);
    }

    /**
     * A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can&#39;t be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/en-us/rest/api/trafficmanager/geographichierarchies/getdefault).
     * 
     */
    @Import(name="geoMappings")
    private @Nullable Output<List<String>> geoMappings;

    /**
     * @return A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can&#39;t be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/en-us/rest/api/trafficmanager/geographichierarchies/getdefault).
     * 
     */
    public Optional<Output<List<String>>> geoMappings() {
        return Optional.ofNullable(this.geoMappings);
    }

    /**
     * The name of the External Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the External Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the priority of this Endpoint, this must be
     * specified for Profiles using the `Priority` traffic routing method. Supports
     * values between 1 and 1000, with no Endpoints sharing the same value. If
     * omitted the value will be computed in order of creation.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Specifies the priority of this Endpoint, this must be
     * specified for Profiles using the `Priority` traffic routing method. Supports
     * values between 1 and 1000, with no Endpoints sharing the same value. If
     * omitted the value will be computed in order of creation.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="profileId", required=true)
    private Output<String> profileId;

    /**
     * @return The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> profileId() {
        return this.profileId;
    }

    /**
     * One or more `subnet` blocks as defined below
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<TrafficManagerExternalEndpointSubnetArgs>> subnets;

    /**
     * @return One or more `subnet` blocks as defined below
     * 
     */
    public Optional<Output<List<TrafficManagerExternalEndpointSubnetArgs>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * The FQDN DNS name of the target.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return The FQDN DNS name of the target.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     * Specifies how much traffic should be distributed to this
     * endpoint. Valid values are between `1` and `1000`.
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    /**
     * @return Specifies how much traffic should be distributed to this
     * endpoint. Valid values are between `1` and `1000`.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    private TrafficManagerExternalEndpointArgs() {}

    private TrafficManagerExternalEndpointArgs(TrafficManagerExternalEndpointArgs $) {
        this.customHeaders = $.customHeaders;
        this.enabled = $.enabled;
        this.endpointLocation = $.endpointLocation;
        this.geoMappings = $.geoMappings;
        this.name = $.name;
        this.priority = $.priority;
        this.profileId = $.profileId;
        this.subnets = $.subnets;
        this.target = $.target;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficManagerExternalEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficManagerExternalEndpointArgs $;

        public Builder() {
            $ = new TrafficManagerExternalEndpointArgs();
        }

        public Builder(TrafficManagerExternalEndpointArgs defaults) {
            $ = new TrafficManagerExternalEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customHeaders One or more `custom_header` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(@Nullable Output<List<TrafficManagerExternalEndpointCustomHeaderArgs>> customHeaders) {
            $.customHeaders = customHeaders;
            return this;
        }

        /**
         * @param customHeaders One or more `custom_header` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(List<TrafficManagerExternalEndpointCustomHeaderArgs> customHeaders) {
            return customHeaders(Output.of(customHeaders));
        }

        /**
         * @param customHeaders One or more `custom_header` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(TrafficManagerExternalEndpointCustomHeaderArgs... customHeaders) {
            return customHeaders(List.of(customHeaders));
        }

        /**
         * @param enabled Is the endpoint enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the endpoint enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param endpointLocation Specifies the Azure location of the Endpoint,
         * this must be specified for Profiles using the `Performance` routing method.
         * 
         * @return builder
         * 
         */
        public Builder endpointLocation(@Nullable Output<String> endpointLocation) {
            $.endpointLocation = endpointLocation;
            return this;
        }

        /**
         * @param endpointLocation Specifies the Azure location of the Endpoint,
         * this must be specified for Profiles using the `Performance` routing method.
         * 
         * @return builder
         * 
         */
        public Builder endpointLocation(String endpointLocation) {
            return endpointLocation(Output.of(endpointLocation));
        }

        /**
         * @param geoMappings A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can&#39;t be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/en-us/rest/api/trafficmanager/geographichierarchies/getdefault).
         * 
         * @return builder
         * 
         */
        public Builder geoMappings(@Nullable Output<List<String>> geoMappings) {
            $.geoMappings = geoMappings;
            return this;
        }

        /**
         * @param geoMappings A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can&#39;t be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/en-us/rest/api/trafficmanager/geographichierarchies/getdefault).
         * 
         * @return builder
         * 
         */
        public Builder geoMappings(List<String> geoMappings) {
            return geoMappings(Output.of(geoMappings));
        }

        /**
         * @param geoMappings A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can&#39;t be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/en-us/rest/api/trafficmanager/geographichierarchies/getdefault).
         * 
         * @return builder
         * 
         */
        public Builder geoMappings(String... geoMappings) {
            return geoMappings(List.of(geoMappings));
        }

        /**
         * @param name The name of the External Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the External Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority Specifies the priority of this Endpoint, this must be
         * specified for Profiles using the `Priority` traffic routing method. Supports
         * values between 1 and 1000, with no Endpoints sharing the same value. If
         * omitted the value will be computed in order of creation.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Specifies the priority of this Endpoint, this must be
         * specified for Profiles using the `Priority` traffic routing method. Supports
         * values between 1 and 1000, with no Endpoints sharing the same value. If
         * omitted the value will be computed in order of creation.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param profileId The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder profileId(Output<String> profileId) {
            $.profileId = profileId;
            return this;
        }

        /**
         * @param profileId The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder profileId(String profileId) {
            return profileId(Output.of(profileId));
        }

        /**
         * @param subnets One or more `subnet` blocks as defined below
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<TrafficManagerExternalEndpointSubnetArgs>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets One or more `subnet` blocks as defined below
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<TrafficManagerExternalEndpointSubnetArgs> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets One or more `subnet` blocks as defined below
         * 
         * @return builder
         * 
         */
        public Builder subnets(TrafficManagerExternalEndpointSubnetArgs... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param target The FQDN DNS name of the target.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The FQDN DNS name of the target.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param weight Specifies how much traffic should be distributed to this
         * endpoint. Valid values are between `1` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Specifies how much traffic should be distributed to this
         * endpoint. Valid values are between `1` and `1000`.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public TrafficManagerExternalEndpointArgs build() {
            $.profileId = Objects.requireNonNull($.profileId, "expected parameter 'profileId' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            $.weight = Objects.requireNonNull($.weight, "expected parameter 'weight' to be non-null");
            return $;
        }
    }

}
