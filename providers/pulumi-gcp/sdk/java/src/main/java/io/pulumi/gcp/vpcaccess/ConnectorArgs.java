// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vpcaccess;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.vpcaccess.inputs.ConnectorSubnetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorArgs Empty = new ConnectorArgs();

    /**
     * The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    @InputImport(name="ipCidrRange")
      private final @Nullable Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Input.empty() : this.ipCidrRange;
    }

    /**
     * Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    @InputImport(name="machineType")
      private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    @InputImport(name="maxInstances")
      private final @Nullable Input<Integer> maxInstances;

    public Input<Integer> getMaxInstances() {
        return this.maxInstances == null ? Input.empty() : this.maxInstances;
    }

    /**
     * Maximum throughput of the connector in Mbps, must be greater than `min_throughput`. Default is 300.
     * 
     */
    @InputImport(name="maxThroughput")
      private final @Nullable Input<Integer> maxThroughput;

    public Input<Integer> getMaxThroughput() {
        return this.maxThroughput == null ? Input.empty() : this.maxThroughput;
    }

    /**
     * Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    @InputImport(name="minInstances")
      private final @Nullable Input<Integer> minInstances;

    public Input<Integer> getMinInstances() {
        return this.minInstances == null ? Input.empty() : this.minInstances;
    }

    /**
     * Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    @InputImport(name="minThroughput")
      private final @Nullable Input<Integer> minThroughput;

    public Input<Integer> getMinThroughput() {
        return this.minThroughput == null ? Input.empty() : this.minThroughput;
    }

    /**
     * Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
     * https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Name or self_link of the VPC network. Required if `ip_cidr_range` is set.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
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
     * Region where the VPC Access connector resides. If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The subnet in which to house the connector
     * Structure is documented below.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable Input<ConnectorSubnetArgs> subnet;

    public Input<ConnectorSubnetArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    public ConnectorArgs(
        @Nullable Input<String> ipCidrRange,
        @Nullable Input<String> machineType,
        @Nullable Input<Integer> maxInstances,
        @Nullable Input<Integer> maxThroughput,
        @Nullable Input<Integer> minInstances,
        @Nullable Input<Integer> minThroughput,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<ConnectorSubnetArgs> subnet) {
        this.ipCidrRange = ipCidrRange;
        this.machineType = machineType;
        this.maxInstances = maxInstances;
        this.maxThroughput = maxThroughput;
        this.minInstances = minInstances;
        this.minThroughput = minThroughput;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = region;
        this.subnet = subnet;
    }

    private ConnectorArgs() {
        this.ipCidrRange = Input.empty();
        this.machineType = Input.empty();
        this.maxInstances = Input.empty();
        this.maxThroughput = Input.empty();
        this.minInstances = Input.empty();
        this.minThroughput = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.subnet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipCidrRange;
        private @Nullable Input<String> machineType;
        private @Nullable Input<Integer> maxInstances;
        private @Nullable Input<Integer> maxThroughput;
        private @Nullable Input<Integer> minInstances;
        private @Nullable Input<Integer> minThroughput;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<ConnectorSubnetArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.machineType = defaults.machineType;
    	      this.maxInstances = defaults.maxInstances;
    	      this.maxThroughput = defaults.maxThroughput;
    	      this.minInstances = defaults.minInstances;
    	      this.minThroughput = defaults.minThroughput;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.subnet = defaults.subnet;
        }

        public Builder setIpCidrRange(@Nullable Input<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder setIpCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Input.ofNullable(ipCidrRange);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setMaxInstances(@Nullable Input<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder setMaxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Input.ofNullable(maxInstances);
            return this;
        }

        public Builder setMaxThroughput(@Nullable Input<Integer> maxThroughput) {
            this.maxThroughput = maxThroughput;
            return this;
        }

        public Builder setMaxThroughput(@Nullable Integer maxThroughput) {
            this.maxThroughput = Input.ofNullable(maxThroughput);
            return this;
        }

        public Builder setMinInstances(@Nullable Input<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder setMinInstances(@Nullable Integer minInstances) {
            this.minInstances = Input.ofNullable(minInstances);
            return this;
        }

        public Builder setMinThroughput(@Nullable Input<Integer> minThroughput) {
            this.minThroughput = minThroughput;
            return this;
        }

        public Builder setMinThroughput(@Nullable Integer minThroughput) {
            this.minThroughput = Input.ofNullable(minThroughput);
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

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setSubnet(@Nullable Input<ConnectorSubnetArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnet(@Nullable ConnectorSubnetArgs subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }
        public ConnectorArgs build() {
            return new ConnectorArgs(ipCidrRange, machineType, maxInstances, maxThroughput, minInstances, minThroughput, name, network, project, region, subnet);
        }
    }
}