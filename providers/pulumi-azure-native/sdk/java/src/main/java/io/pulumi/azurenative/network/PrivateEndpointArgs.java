// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.CustomDnsConfigPropertiesFormatArgs;
import io.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.network.inputs.PrivateLinkServiceConnectionArgs;
import io.pulumi.azurenative.network.inputs.SubnetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointArgs Empty = new PrivateEndpointArgs();

    /**
     * An array of custom dns configurations.
     * 
     */
    @InputImport(name="customDnsConfigs")
      private final @Nullable Input<List<CustomDnsConfigPropertiesFormatArgs>> customDnsConfigs;

    public Input<List<CustomDnsConfigPropertiesFormatArgs>> getCustomDnsConfigs() {
        return this.customDnsConfigs == null ? Input.empty() : this.customDnsConfigs;
    }

    /**
     * The extended location of the load balancer.
     * 
     */
    @InputImport(name="extendedLocation")
      private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     * 
     */
    @InputImport(name="manualPrivateLinkServiceConnections")
      private final @Nullable Input<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections;

    public Input<List<PrivateLinkServiceConnectionArgs>> getManualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections == null ? Input.empty() : this.manualPrivateLinkServiceConnections;
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @InputImport(name="privateEndpointName")
      private final @Nullable Input<String> privateEndpointName;

    public Input<String> getPrivateEndpointName() {
        return this.privateEndpointName == null ? Input.empty() : this.privateEndpointName;
    }

    /**
     * A grouping of information about the connection to the remote resource.
     * 
     */
    @InputImport(name="privateLinkServiceConnections")
      private final @Nullable Input<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections;

    public Input<List<PrivateLinkServiceConnectionArgs>> getPrivateLinkServiceConnections() {
        return this.privateLinkServiceConnections == null ? Input.empty() : this.privateLinkServiceConnections;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The ID of the subnet from which the private IP will be allocated.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable Input<SubnetArgs> subnet;

    public Input<SubnetArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PrivateEndpointArgs(
        @Nullable Input<List<CustomDnsConfigPropertiesFormatArgs>> customDnsConfigs,
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        @Nullable Input<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections,
        @Nullable Input<String> privateEndpointName,
        @Nullable Input<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections,
        Input<String> resourceGroupName,
        @Nullable Input<SubnetArgs> subnet,
        @Nullable Input<Map<String,String>> tags) {
        this.customDnsConfigs = customDnsConfigs;
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.location = location;
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
        this.privateEndpointName = privateEndpointName;
        this.privateLinkServiceConnections = privateLinkServiceConnections;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnet = subnet;
        this.tags = tags;
    }

    private PrivateEndpointArgs() {
        this.customDnsConfigs = Input.empty();
        this.extendedLocation = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.manualPrivateLinkServiceConnections = Input.empty();
        this.privateEndpointName = Input.empty();
        this.privateLinkServiceConnections = Input.empty();
        this.resourceGroupName = Input.empty();
        this.subnet = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CustomDnsConfigPropertiesFormatArgs>> customDnsConfigs;
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private @Nullable Input<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections;
        private @Nullable Input<String> privateEndpointName;
        private @Nullable Input<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections;
        private Input<String> resourceGroupName;
        private @Nullable Input<SubnetArgs> subnet;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDnsConfigs = defaults.customDnsConfigs;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.manualPrivateLinkServiceConnections = defaults.manualPrivateLinkServiceConnections;
    	      this.privateEndpointName = defaults.privateEndpointName;
    	      this.privateLinkServiceConnections = defaults.privateLinkServiceConnections;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
        }

        public Builder setCustomDnsConfigs(@Nullable Input<List<CustomDnsConfigPropertiesFormatArgs>> customDnsConfigs) {
            this.customDnsConfigs = customDnsConfigs;
            return this;
        }

        public Builder setCustomDnsConfigs(@Nullable List<CustomDnsConfigPropertiesFormatArgs> customDnsConfigs) {
            this.customDnsConfigs = Input.ofNullable(customDnsConfigs);
            return this;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManualPrivateLinkServiceConnections(@Nullable Input<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }

        public Builder setManualPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionArgs> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = Input.ofNullable(manualPrivateLinkServiceConnections);
            return this;
        }

        public Builder setPrivateEndpointName(@Nullable Input<String> privateEndpointName) {
            this.privateEndpointName = privateEndpointName;
            return this;
        }

        public Builder setPrivateEndpointName(@Nullable String privateEndpointName) {
            this.privateEndpointName = Input.ofNullable(privateEndpointName);
            return this;
        }

        public Builder setPrivateLinkServiceConnections(@Nullable Input<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections) {
            this.privateLinkServiceConnections = privateLinkServiceConnections;
            return this;
        }

        public Builder setPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionArgs> privateLinkServiceConnections) {
            this.privateLinkServiceConnections = Input.ofNullable(privateLinkServiceConnections);
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

        public Builder setSubnet(@Nullable Input<SubnetArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetArgs subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public PrivateEndpointArgs build() {
            return new PrivateEndpointArgs(customDnsConfigs, extendedLocation, id, location, manualPrivateLinkServiceConnections, privateEndpointName, privateLinkServiceConnections, resourceGroupName, subnet, tags);
        }
    }
}