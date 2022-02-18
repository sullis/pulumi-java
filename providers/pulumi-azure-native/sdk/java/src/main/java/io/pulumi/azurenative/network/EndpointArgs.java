// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.EndpointMonitorStatus;
import io.pulumi.azurenative.network.enums.EndpointStatus;
import io.pulumi.azurenative.network.inputs.EndpointPropertiesCustomHeadersArgs;
import io.pulumi.azurenative.network.inputs.EndpointPropertiesSubnetsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * List of custom headers.
     * 
     */
    @InputImport(name="customHeaders")
    private final @Nullable Input<List<EndpointPropertiesCustomHeadersArgs>> customHeaders;

    public Input<List<EndpointPropertiesCustomHeadersArgs>> getCustomHeaders() {
        return this.customHeaders == null ? Input.empty() : this.customHeaders;
    }

    /**
     * Specifies the location of the external or nested endpoints when using the 'Performance' traffic routing method.
     * 
     */
    @InputImport(name="endpointLocation")
    private final @Nullable Input<String> endpointLocation;

    public Input<String> getEndpointLocation() {
        return this.endpointLocation == null ? Input.empty() : this.endpointLocation;
    }

    /**
     * The monitoring status of the endpoint.
     * 
     */
    @InputImport(name="endpointMonitorStatus")
    private final @Nullable Input<Either<String,EndpointMonitorStatus>> endpointMonitorStatus;

    public Input<Either<String,EndpointMonitorStatus>> getEndpointMonitorStatus() {
        return this.endpointMonitorStatus == null ? Input.empty() : this.endpointMonitorStatus;
    }

    /**
     * The name of the Traffic Manager endpoint to be created or updated.
     * 
     */
    @InputImport(name="endpointName")
    private final @Nullable Input<String> endpointName;

    public Input<String> getEndpointName() {
        return this.endpointName == null ? Input.empty() : this.endpointName;
    }

    /**
     * The status of the endpoint. If the endpoint is Enabled, it is probed for endpoint health and is included in the traffic routing method.
     * 
     */
    @InputImport(name="endpointStatus")
    private final @Nullable Input<Either<String,EndpointStatus>> endpointStatus;

    public Input<Either<String,EndpointStatus>> getEndpointStatus() {
        return this.endpointStatus == null ? Input.empty() : this.endpointStatus;
    }

    /**
     * The type of the Traffic Manager endpoint to be created or updated.
     * 
     */
    @InputImport(name="endpointType", required=true)
    private final Input<String> endpointType;

    public Input<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * The list of countries/regions mapped to this endpoint when using the 'Geographic' traffic routing method. Please consult Traffic Manager Geographic documentation for a full list of accepted values.
     * 
     */
    @InputImport(name="geoMapping")
    private final @Nullable Input<List<String>> geoMapping;

    public Input<List<String>> getGeoMapping() {
        return this.geoMapping == null ? Input.empty() : this.geoMapping;
    }

    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The minimum number of endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    @InputImport(name="minChildEndpoints")
    private final @Nullable Input<Double> minChildEndpoints;

    public Input<Double> getMinChildEndpoints() {
        return this.minChildEndpoints == null ? Input.empty() : this.minChildEndpoints;
    }

    /**
     * The minimum number of IPv4 (DNS record type A) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    @InputImport(name="minChildEndpointsIPv4")
    private final @Nullable Input<Double> minChildEndpointsIPv4;

    public Input<Double> getMinChildEndpointsIPv4() {
        return this.minChildEndpointsIPv4 == null ? Input.empty() : this.minChildEndpointsIPv4;
    }

    /**
     * The minimum number of IPv6 (DNS record type AAAA) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    @InputImport(name="minChildEndpointsIPv6")
    private final @Nullable Input<Double> minChildEndpointsIPv6;

    public Input<Double> getMinChildEndpointsIPv6() {
        return this.minChildEndpointsIPv6 == null ? Input.empty() : this.minChildEndpointsIPv6;
    }

    /**
     * The name of the resource
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The priority of this endpoint when using the 'Priority' traffic routing method. Possible values are from 1 to 1000, lower values represent higher priority. This is an optional parameter.  If specified, it must be specified on all endpoints, and no two endpoints can share the same priority value.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Double> priority;

    public Input<Double> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The name of the Traffic Manager profile.
     * 
     */
    @InputImport(name="profileName", required=true)
    private final Input<String> profileName;

    public Input<String> getProfileName() {
        return this.profileName;
    }

    /**
     * The name of the resource group containing the Traffic Manager endpoint to be created or updated.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The list of subnets, IP addresses, and/or address ranges mapped to this endpoint when using the 'Subnet' traffic routing method. An empty list will match all ranges not covered by other endpoints.
     * 
     */
    @InputImport(name="subnets")
    private final @Nullable Input<List<EndpointPropertiesSubnetsArgs>> subnets;

    public Input<List<EndpointPropertiesSubnetsArgs>> getSubnets() {
        return this.subnets == null ? Input.empty() : this.subnets;
    }

    /**
     * The fully-qualified DNS name or IP address of the endpoint. Traffic Manager returns this value in DNS responses to direct traffic to this endpoint.
     * 
     */
    @InputImport(name="target")
    private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    /**
     * The Azure Resource URI of the of the endpoint. Not applicable to endpoints of type 'ExternalEndpoints'.
     * 
     */
    @InputImport(name="targetResourceId")
    private final @Nullable Input<String> targetResourceId;

    public Input<String> getTargetResourceId() {
        return this.targetResourceId == null ? Input.empty() : this.targetResourceId;
    }

    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The weight of this endpoint when using the 'Weighted' traffic routing method. Possible values are from 1 to 1000.
     * 
     */
    @InputImport(name="weight")
    private final @Nullable Input<Double> weight;

    public Input<Double> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public EndpointArgs(
        @Nullable Input<List<EndpointPropertiesCustomHeadersArgs>> customHeaders,
        @Nullable Input<String> endpointLocation,
        @Nullable Input<Either<String,EndpointMonitorStatus>> endpointMonitorStatus,
        @Nullable Input<String> endpointName,
        @Nullable Input<Either<String,EndpointStatus>> endpointStatus,
        Input<String> endpointType,
        @Nullable Input<List<String>> geoMapping,
        @Nullable Input<String> id,
        @Nullable Input<Double> minChildEndpoints,
        @Nullable Input<Double> minChildEndpointsIPv4,
        @Nullable Input<Double> minChildEndpointsIPv6,
        @Nullable Input<String> name,
        @Nullable Input<Double> priority,
        Input<String> profileName,
        Input<String> resourceGroupName,
        @Nullable Input<List<EndpointPropertiesSubnetsArgs>> subnets,
        @Nullable Input<String> target,
        @Nullable Input<String> targetResourceId,
        @Nullable Input<String> type,
        @Nullable Input<Double> weight) {
        this.customHeaders = customHeaders;
        this.endpointLocation = endpointLocation;
        this.endpointMonitorStatus = endpointMonitorStatus;
        this.endpointName = endpointName;
        this.endpointStatus = endpointStatus;
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.geoMapping = geoMapping;
        this.id = id;
        this.minChildEndpoints = minChildEndpoints;
        this.minChildEndpointsIPv4 = minChildEndpointsIPv4;
        this.minChildEndpointsIPv6 = minChildEndpointsIPv6;
        this.name = name;
        this.priority = priority;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnets = subnets;
        this.target = target;
        this.targetResourceId = targetResourceId;
        this.type = type;
        this.weight = weight;
    }

    private EndpointArgs() {
        this.customHeaders = Input.empty();
        this.endpointLocation = Input.empty();
        this.endpointMonitorStatus = Input.empty();
        this.endpointName = Input.empty();
        this.endpointStatus = Input.empty();
        this.endpointType = Input.empty();
        this.geoMapping = Input.empty();
        this.id = Input.empty();
        this.minChildEndpoints = Input.empty();
        this.minChildEndpointsIPv4 = Input.empty();
        this.minChildEndpointsIPv6 = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.profileName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.subnets = Input.empty();
        this.target = Input.empty();
        this.targetResourceId = Input.empty();
        this.type = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EndpointPropertiesCustomHeadersArgs>> customHeaders;
        private @Nullable Input<String> endpointLocation;
        private @Nullable Input<Either<String,EndpointMonitorStatus>> endpointMonitorStatus;
        private @Nullable Input<String> endpointName;
        private @Nullable Input<Either<String,EndpointStatus>> endpointStatus;
        private Input<String> endpointType;
        private @Nullable Input<List<String>> geoMapping;
        private @Nullable Input<String> id;
        private @Nullable Input<Double> minChildEndpoints;
        private @Nullable Input<Double> minChildEndpointsIPv4;
        private @Nullable Input<Double> minChildEndpointsIPv6;
        private @Nullable Input<String> name;
        private @Nullable Input<Double> priority;
        private Input<String> profileName;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<EndpointPropertiesSubnetsArgs>> subnets;
        private @Nullable Input<String> target;
        private @Nullable Input<String> targetResourceId;
        private @Nullable Input<String> type;
        private @Nullable Input<Double> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHeaders = defaults.customHeaders;
    	      this.endpointLocation = defaults.endpointLocation;
    	      this.endpointMonitorStatus = defaults.endpointMonitorStatus;
    	      this.endpointName = defaults.endpointName;
    	      this.endpointStatus = defaults.endpointStatus;
    	      this.endpointType = defaults.endpointType;
    	      this.geoMapping = defaults.geoMapping;
    	      this.id = defaults.id;
    	      this.minChildEndpoints = defaults.minChildEndpoints;
    	      this.minChildEndpointsIPv4 = defaults.minChildEndpointsIPv4;
    	      this.minChildEndpointsIPv6 = defaults.minChildEndpointsIPv6;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnets = defaults.subnets;
    	      this.target = defaults.target;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        public Builder setCustomHeaders(@Nullable Input<List<EndpointPropertiesCustomHeadersArgs>> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }

        public Builder setCustomHeaders(@Nullable List<EndpointPropertiesCustomHeadersArgs> customHeaders) {
            this.customHeaders = Input.ofNullable(customHeaders);
            return this;
        }

        public Builder setEndpointLocation(@Nullable Input<String> endpointLocation) {
            this.endpointLocation = endpointLocation;
            return this;
        }

        public Builder setEndpointLocation(@Nullable String endpointLocation) {
            this.endpointLocation = Input.ofNullable(endpointLocation);
            return this;
        }

        public Builder setEndpointMonitorStatus(@Nullable Input<Either<String,EndpointMonitorStatus>> endpointMonitorStatus) {
            this.endpointMonitorStatus = endpointMonitorStatus;
            return this;
        }

        public Builder setEndpointMonitorStatus(@Nullable Either<String,EndpointMonitorStatus> endpointMonitorStatus) {
            this.endpointMonitorStatus = Input.ofNullable(endpointMonitorStatus);
            return this;
        }

        public Builder setEndpointName(@Nullable Input<String> endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        public Builder setEndpointName(@Nullable String endpointName) {
            this.endpointName = Input.ofNullable(endpointName);
            return this;
        }

        public Builder setEndpointStatus(@Nullable Input<Either<String,EndpointStatus>> endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }

        public Builder setEndpointStatus(@Nullable Either<String,EndpointStatus> endpointStatus) {
            this.endpointStatus = Input.ofNullable(endpointStatus);
            return this;
        }

        public Builder setEndpointType(Input<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Input.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder setGeoMapping(@Nullable Input<List<String>> geoMapping) {
            this.geoMapping = geoMapping;
            return this;
        }

        public Builder setGeoMapping(@Nullable List<String> geoMapping) {
            this.geoMapping = Input.ofNullable(geoMapping);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setMinChildEndpoints(@Nullable Input<Double> minChildEndpoints) {
            this.minChildEndpoints = minChildEndpoints;
            return this;
        }

        public Builder setMinChildEndpoints(@Nullable Double minChildEndpoints) {
            this.minChildEndpoints = Input.ofNullable(minChildEndpoints);
            return this;
        }

        public Builder setMinChildEndpointsIPv4(@Nullable Input<Double> minChildEndpointsIPv4) {
            this.minChildEndpointsIPv4 = minChildEndpointsIPv4;
            return this;
        }

        public Builder setMinChildEndpointsIPv4(@Nullable Double minChildEndpointsIPv4) {
            this.minChildEndpointsIPv4 = Input.ofNullable(minChildEndpointsIPv4);
            return this;
        }

        public Builder setMinChildEndpointsIPv6(@Nullable Input<Double> minChildEndpointsIPv6) {
            this.minChildEndpointsIPv6 = minChildEndpointsIPv6;
            return this;
        }

        public Builder setMinChildEndpointsIPv6(@Nullable Double minChildEndpointsIPv6) {
            this.minChildEndpointsIPv6 = Input.ofNullable(minChildEndpointsIPv6);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPriority(@Nullable Input<Double> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Double priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setProfileName(Input<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Input.of(Objects.requireNonNull(profileName));
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

        public Builder setSubnets(@Nullable Input<List<EndpointPropertiesSubnetsArgs>> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setSubnets(@Nullable List<EndpointPropertiesSubnetsArgs> subnets) {
            this.subnets = Input.ofNullable(subnets);
            return this;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder setTargetResourceId(@Nullable Input<String> targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }

        public Builder setTargetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = Input.ofNullable(targetResourceId);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setWeight(@Nullable Input<Double> weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeight(@Nullable Double weight) {
            this.weight = Input.ofNullable(weight);
            return this;
        }

        public EndpointArgs build() {
            return new EndpointArgs(customHeaders, endpointLocation, endpointMonitorStatus, endpointName, endpointStatus, endpointType, geoMapping, id, minChildEndpoints, minChildEndpointsIPv4, minChildEndpointsIPv6, name, priority, profileName, resourceGroupName, subnets, target, targetResourceId, type, weight);
        }
    }
}
