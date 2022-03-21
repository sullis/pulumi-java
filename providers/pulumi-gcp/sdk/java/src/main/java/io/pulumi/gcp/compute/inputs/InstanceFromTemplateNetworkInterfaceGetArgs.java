// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceAliasIpRangeGetArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceIpv6AccessConfigGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateNetworkInterfaceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateNetworkInterfaceGetArgs Empty = new InstanceFromTemplateNetworkInterfaceGetArgs();

    @Import(name="accessConfigs")
      private final @Nullable Output<List<InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs>> accessConfigs;

    public Output<List<InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs>> getAccessConfigs() {
        return this.accessConfigs == null ? Output.empty() : this.accessConfigs;
    }

    @Import(name="aliasIpRanges")
      private final @Nullable Output<List<InstanceFromTemplateNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges;

    public Output<List<InstanceFromTemplateNetworkInterfaceAliasIpRangeGetArgs>> getAliasIpRanges() {
        return this.aliasIpRanges == null ? Output.empty() : this.aliasIpRanges;
    }

    @Import(name="ipv6AccessConfigs")
      private final @Nullable Output<List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs;

    public Output<List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfigGetArgs>> getIpv6AccessConfigs() {
        return this.ipv6AccessConfigs == null ? Output.empty() : this.ipv6AccessConfigs;
    }

    @Import(name="ipv6AccessType")
      private final @Nullable Output<String> ipv6AccessType;

    public Output<String> getIpv6AccessType() {
        return this.ipv6AccessType == null ? Output.empty() : this.ipv6AccessType;
    }

    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    @Import(name="networkIp")
      private final @Nullable Output<String> networkIp;

    public Output<String> getNetworkIp() {
        return this.networkIp == null ? Output.empty() : this.networkIp;
    }

    @Import(name="nicType")
      private final @Nullable Output<String> nicType;

    public Output<String> getNicType() {
        return this.nicType == null ? Output.empty() : this.nicType;
    }

    @Import(name="queueCount")
      private final @Nullable Output<Integer> queueCount;

    public Output<Integer> getQueueCount() {
        return this.queueCount == null ? Output.empty() : this.queueCount;
    }

    @Import(name="stackType")
      private final @Nullable Output<String> stackType;

    public Output<String> getStackType() {
        return this.stackType == null ? Output.empty() : this.stackType;
    }

    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Output.empty() : this.subnetwork;
    }

    @Import(name="subnetworkProject")
      private final @Nullable Output<String> subnetworkProject;

    public Output<String> getSubnetworkProject() {
        return this.subnetworkProject == null ? Output.empty() : this.subnetworkProject;
    }

    public InstanceFromTemplateNetworkInterfaceGetArgs(
        @Nullable Output<List<InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs>> accessConfigs,
        @Nullable Output<List<InstanceFromTemplateNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges,
        @Nullable Output<List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs,
        @Nullable Output<String> ipv6AccessType,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> networkIp,
        @Nullable Output<String> nicType,
        @Nullable Output<Integer> queueCount,
        @Nullable Output<String> stackType,
        @Nullable Output<String> subnetwork,
        @Nullable Output<String> subnetworkProject) {
        this.accessConfigs = accessConfigs;
        this.aliasIpRanges = aliasIpRanges;
        this.ipv6AccessConfigs = ipv6AccessConfigs;
        this.ipv6AccessType = ipv6AccessType;
        this.name = name;
        this.network = network;
        this.networkIp = networkIp;
        this.nicType = nicType;
        this.queueCount = queueCount;
        this.stackType = stackType;
        this.subnetwork = subnetwork;
        this.subnetworkProject = subnetworkProject;
    }

    private InstanceFromTemplateNetworkInterfaceGetArgs() {
        this.accessConfigs = Output.empty();
        this.aliasIpRanges = Output.empty();
        this.ipv6AccessConfigs = Output.empty();
        this.ipv6AccessType = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.networkIp = Output.empty();
        this.nicType = Output.empty();
        this.queueCount = Output.empty();
        this.stackType = Output.empty();
        this.subnetwork = Output.empty();
        this.subnetworkProject = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateNetworkInterfaceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs>> accessConfigs;
        private @Nullable Output<List<InstanceFromTemplateNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges;
        private @Nullable Output<List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs;
        private @Nullable Output<String> ipv6AccessType;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> networkIp;
        private @Nullable Output<String> nicType;
        private @Nullable Output<Integer> queueCount;
        private @Nullable Output<String> stackType;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<String> subnetworkProject;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateNetworkInterfaceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkIp = defaults.networkIp;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subnetwork = defaults.subnetwork;
    	      this.subnetworkProject = defaults.subnetworkProject;
        }

        public Builder accessConfigs(@Nullable Output<List<InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs>> accessConfigs) {
            this.accessConfigs = accessConfigs;
            return this;
        }
        public Builder accessConfigs(@Nullable List<InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs> accessConfigs) {
            this.accessConfigs = Output.ofNullable(accessConfigs);
            return this;
        }
        public Builder accessConfigs(InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }
        public Builder aliasIpRanges(@Nullable Output<List<InstanceFromTemplateNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges) {
            this.aliasIpRanges = aliasIpRanges;
            return this;
        }
        public Builder aliasIpRanges(@Nullable List<InstanceFromTemplateNetworkInterfaceAliasIpRangeGetArgs> aliasIpRanges) {
            this.aliasIpRanges = Output.ofNullable(aliasIpRanges);
            return this;
        }
        public Builder aliasIpRanges(InstanceFromTemplateNetworkInterfaceAliasIpRangeGetArgs... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }
        public Builder ipv6AccessConfigs(@Nullable Output<List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }
        public Builder ipv6AccessConfigs(@Nullable List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfigGetArgs> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Output.ofNullable(ipv6AccessConfigs);
            return this;
        }
        public Builder ipv6AccessConfigs(InstanceFromTemplateNetworkInterfaceIpv6AccessConfigGetArgs... ipv6AccessConfigs) {
            return ipv6AccessConfigs(List.of(ipv6AccessConfigs));
        }
        public Builder ipv6AccessType(@Nullable Output<String> ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }
        public Builder ipv6AccessType(@Nullable String ipv6AccessType) {
            this.ipv6AccessType = Output.ofNullable(ipv6AccessType);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }
        public Builder networkIp(@Nullable Output<String> networkIp) {
            this.networkIp = networkIp;
            return this;
        }
        public Builder networkIp(@Nullable String networkIp) {
            this.networkIp = Output.ofNullable(networkIp);
            return this;
        }
        public Builder nicType(@Nullable Output<String> nicType) {
            this.nicType = nicType;
            return this;
        }
        public Builder nicType(@Nullable String nicType) {
            this.nicType = Output.ofNullable(nicType);
            return this;
        }
        public Builder queueCount(@Nullable Output<Integer> queueCount) {
            this.queueCount = queueCount;
            return this;
        }
        public Builder queueCount(@Nullable Integer queueCount) {
            this.queueCount = Output.ofNullable(queueCount);
            return this;
        }
        public Builder stackType(@Nullable Output<String> stackType) {
            this.stackType = stackType;
            return this;
        }
        public Builder stackType(@Nullable String stackType) {
            this.stackType = Output.ofNullable(stackType);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Output.ofNullable(subnetwork);
            return this;
        }
        public Builder subnetworkProject(@Nullable Output<String> subnetworkProject) {
            this.subnetworkProject = subnetworkProject;
            return this;
        }
        public Builder subnetworkProject(@Nullable String subnetworkProject) {
            this.subnetworkProject = Output.ofNullable(subnetworkProject);
            return this;
        }        public InstanceFromTemplateNetworkInterfaceGetArgs build() {
            return new InstanceFromTemplateNetworkInterfaceGetArgs(accessConfigs, aliasIpRanges, ipv6AccessConfigs, ipv6AccessType, name, network, networkIp, nicType, queueCount, stackType, subnetwork, subnetworkProject);
        }
    }
}
