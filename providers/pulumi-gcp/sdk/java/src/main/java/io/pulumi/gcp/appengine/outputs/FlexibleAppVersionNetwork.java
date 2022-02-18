// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlexibleAppVersionNetwork {
    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container.
     * 
     */
    private final @Nullable List<String> forwardedPorts;
    /**
     * Tag to apply to the instance during creation.
     * 
     */
    private final @Nullable String instanceTag;
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    private final String name;
    /**
     * Enable session affinity.
     * 
     */
    private final @Nullable Boolean sessionAffinity;
    /**
     * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.
     * If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range.
     * If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetworkName) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network.
     * If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetworkName must be specified and the IP address is created from the IPCidrRange of the subnetwork.
     * If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
     * 
     */
    private final @Nullable String subnetwork;

    @OutputCustomType.Constructor({"forwardedPorts","instanceTag","name","sessionAffinity","subnetwork"})
    private FlexibleAppVersionNetwork(
        @Nullable List<String> forwardedPorts,
        @Nullable String instanceTag,
        String name,
        @Nullable Boolean sessionAffinity,
        @Nullable String subnetwork) {
        this.forwardedPorts = forwardedPorts;
        this.instanceTag = instanceTag;
        this.name = Objects.requireNonNull(name);
        this.sessionAffinity = sessionAffinity;
        this.subnetwork = subnetwork;
    }

    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container.
     * 
     */
    public List<String> getForwardedPorts() {
        return this.forwardedPorts == null ? List.of() : this.forwardedPorts;
    }
    /**
     * Tag to apply to the instance during creation.
     * 
     */
    public Optional<String> getInstanceTag() {
        return Optional.ofNullable(this.instanceTag);
    }
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Enable session affinity.
     * 
     */
    public Optional<Boolean> getSessionAffinity() {
        return Optional.ofNullable(this.sessionAffinity);
    }
    /**
     * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.
     * If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range.
     * If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetworkName) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network.
     * If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetworkName must be specified and the IP address is created from the IPCidrRange of the subnetwork.
     * If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
     * 
     */
    public Optional<String> getSubnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> forwardedPorts;
        private @Nullable String instanceTag;
        private String name;
        private @Nullable Boolean sessionAffinity;
        private @Nullable String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardedPorts = defaults.forwardedPorts;
    	      this.instanceTag = defaults.instanceTag;
    	      this.name = defaults.name;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setForwardedPorts(@Nullable List<String> forwardedPorts) {
            this.forwardedPorts = forwardedPorts;
            return this;
        }

        public Builder setInstanceTag(@Nullable String instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSessionAffinity(@Nullable Boolean sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public FlexibleAppVersionNetwork build() {
            return new FlexibleAppVersionNetwork(forwardedPorts, instanceTag, name, sessionAffinity, subnetwork);
        }
    }
}
