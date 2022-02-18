// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DedicatedCloudServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DedicatedCloudServiceArgs Empty = new DedicatedCloudServiceArgs();

    /**
     * dedicated cloud Service name
     * 
     */
    @InputImport(name="dedicatedCloudServiceName")
    private final @Nullable Input<String> dedicatedCloudServiceName;

    public Input<String> getDedicatedCloudServiceName() {
        return this.dedicatedCloudServiceName == null ? Input.empty() : this.dedicatedCloudServiceName;
    }

    /**
     * gateway Subnet for the account. It will collect the subnet address and always treat it as /28
     * 
     */
    @InputImport(name="gatewaySubnet", required=true)
    private final Input<String> gatewaySubnet;

    public Input<String> getGatewaySubnet() {
        return this.gatewaySubnet;
    }

    /**
     * Azure region
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The list of tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DedicatedCloudServiceArgs(
        @Nullable Input<String> dedicatedCloudServiceName,
        Input<String> gatewaySubnet,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.dedicatedCloudServiceName = dedicatedCloudServiceName;
        this.gatewaySubnet = Objects.requireNonNull(gatewaySubnet, "expected parameter 'gatewaySubnet' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private DedicatedCloudServiceArgs() {
        this.dedicatedCloudServiceName = Input.empty();
        this.gatewaySubnet = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedCloudServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dedicatedCloudServiceName;
        private Input<String> gatewaySubnet;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedCloudServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedCloudServiceName = defaults.dedicatedCloudServiceName;
    	      this.gatewaySubnet = defaults.gatewaySubnet;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setDedicatedCloudServiceName(@Nullable Input<String> dedicatedCloudServiceName) {
            this.dedicatedCloudServiceName = dedicatedCloudServiceName;
            return this;
        }

        public Builder setDedicatedCloudServiceName(@Nullable String dedicatedCloudServiceName) {
            this.dedicatedCloudServiceName = Input.ofNullable(dedicatedCloudServiceName);
            return this;
        }

        public Builder setGatewaySubnet(Input<String> gatewaySubnet) {
            this.gatewaySubnet = Objects.requireNonNull(gatewaySubnet);
            return this;
        }

        public Builder setGatewaySubnet(String gatewaySubnet) {
            this.gatewaySubnet = Input.of(Objects.requireNonNull(gatewaySubnet));
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
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

        public DedicatedCloudServiceArgs build() {
            return new DedicatedCloudServiceArgs(dedicatedCloudServiceName, gatewaySubnet, location, resourceGroupName, tags);
        }
    }
}
