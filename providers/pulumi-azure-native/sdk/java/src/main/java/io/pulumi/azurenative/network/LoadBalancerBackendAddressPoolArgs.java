// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.LoadBalancerBackendAddressArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerBackendAddressPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerBackendAddressPoolArgs Empty = new LoadBalancerBackendAddressPoolArgs();

    /**
     * The name of the backend address pool.
     * 
     */
    @InputImport(name="backendAddressPoolName")
    private final @Nullable Input<String> backendAddressPoolName;

    public Input<String> getBackendAddressPoolName() {
        return this.backendAddressPoolName == null ? Input.empty() : this.backendAddressPoolName;
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
     * An array of backend addresses.
     * 
     */
    @InputImport(name="loadBalancerBackendAddresses")
    private final @Nullable Input<List<LoadBalancerBackendAddressArgs>> loadBalancerBackendAddresses;

    public Input<List<LoadBalancerBackendAddressArgs>> getLoadBalancerBackendAddresses() {
        return this.loadBalancerBackendAddresses == null ? Input.empty() : this.loadBalancerBackendAddresses;
    }

    /**
     * The name of the load balancer.
     * 
     */
    @InputImport(name="loadBalancerName", required=true)
    private final Input<String> loadBalancerName;

    public Input<String> getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * The location of the backend address pool.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource that is unique within the set of backend address pools used by the load balancer. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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

    public LoadBalancerBackendAddressPoolArgs(
        @Nullable Input<String> backendAddressPoolName,
        @Nullable Input<String> id,
        @Nullable Input<List<LoadBalancerBackendAddressArgs>> loadBalancerBackendAddresses,
        Input<String> loadBalancerName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> resourceGroupName) {
        this.backendAddressPoolName = backendAddressPoolName;
        this.id = id;
        this.loadBalancerBackendAddresses = loadBalancerBackendAddresses;
        this.loadBalancerName = Objects.requireNonNull(loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
        this.location = location;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private LoadBalancerBackendAddressPoolArgs() {
        this.backendAddressPoolName = Input.empty();
        this.id = Input.empty();
        this.loadBalancerBackendAddresses = Input.empty();
        this.loadBalancerName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerBackendAddressPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backendAddressPoolName;
        private @Nullable Input<String> id;
        private @Nullable Input<List<LoadBalancerBackendAddressArgs>> loadBalancerBackendAddresses;
        private Input<String> loadBalancerName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerBackendAddressPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPoolName = defaults.backendAddressPoolName;
    	      this.id = defaults.id;
    	      this.loadBalancerBackendAddresses = defaults.loadBalancerBackendAddresses;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setBackendAddressPoolName(@Nullable Input<String> backendAddressPoolName) {
            this.backendAddressPoolName = backendAddressPoolName;
            return this;
        }

        public Builder setBackendAddressPoolName(@Nullable String backendAddressPoolName) {
            this.backendAddressPoolName = Input.ofNullable(backendAddressPoolName);
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

        public Builder setLoadBalancerBackendAddresses(@Nullable Input<List<LoadBalancerBackendAddressArgs>> loadBalancerBackendAddresses) {
            this.loadBalancerBackendAddresses = loadBalancerBackendAddresses;
            return this;
        }

        public Builder setLoadBalancerBackendAddresses(@Nullable List<LoadBalancerBackendAddressArgs> loadBalancerBackendAddresses) {
            this.loadBalancerBackendAddresses = Input.ofNullable(loadBalancerBackendAddresses);
            return this;
        }

        public Builder setLoadBalancerName(Input<String> loadBalancerName) {
            this.loadBalancerName = Objects.requireNonNull(loadBalancerName);
            return this;
        }

        public Builder setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = Input.of(Objects.requireNonNull(loadBalancerName));
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public LoadBalancerBackendAddressPoolArgs build() {
            return new LoadBalancerBackendAddressPoolArgs(backendAddressPoolName, id, loadBalancerBackendAddresses, loadBalancerName, location, name, resourceGroupName);
        }
    }
}
