// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkEndpointState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointState Empty = new NetworkEndpointState();

    /**
     * The name for a specific VM instance that the IP address belongs to.
     * This is required for network endpoints of type GCE_VM_IP_PORT.
     * The instance must be in the same zone of network endpoint group.
     * 
     */
    @InputImport(name="instance")
    private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    /**
     * IPv4 address of network endpoint. The IP address must belong
     * to a VM in GCE (either the primary IP or as part of an aliased IP
     * range).
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * The network endpoint group this endpoint is part of.
     * 
     */
    @InputImport(name="networkEndpointGroup")
    private final @Nullable Input<String> networkEndpointGroup;

    public Input<String> getNetworkEndpointGroup() {
        return this.networkEndpointGroup == null ? Input.empty() : this.networkEndpointGroup;
    }

    /**
     * Port number of network endpoint.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Zone where the containing network endpoint group is located.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public NetworkEndpointState(
        @Nullable Input<String> instance,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> networkEndpointGroup,
        @Nullable Input<Integer> port,
        @Nullable Input<String> project,
        @Nullable Input<String> zone) {
        this.instance = instance;
        this.ipAddress = ipAddress;
        this.networkEndpointGroup = networkEndpointGroup;
        this.port = port;
        this.project = project;
        this.zone = zone;
    }

    private NetworkEndpointState() {
        this.instance = Input.empty();
        this.ipAddress = Input.empty();
        this.networkEndpointGroup = Input.empty();
        this.port = Input.empty();
        this.project = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instance;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> networkEndpointGroup;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> project;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.ipAddress = defaults.ipAddress;
    	      this.networkEndpointGroup = defaults.networkEndpointGroup;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder setInstance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setNetworkEndpointGroup(@Nullable Input<String> networkEndpointGroup) {
            this.networkEndpointGroup = networkEndpointGroup;
            return this;
        }

        public Builder setNetworkEndpointGroup(@Nullable String networkEndpointGroup) {
            this.networkEndpointGroup = Input.ofNullable(networkEndpointGroup);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public NetworkEndpointState build() {
            return new NetworkEndpointState(instance, ipAddress, networkEndpointGroup, port, project, zone);
        }
    }
}
