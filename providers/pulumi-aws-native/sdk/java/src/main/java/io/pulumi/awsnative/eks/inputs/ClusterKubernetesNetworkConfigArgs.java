// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.awsnative.eks.enums.ClusterKubernetesNetworkConfigIpFamily;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Kubernetes network configuration for the cluster.
 * 
 */
public final class ClusterKubernetesNetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterKubernetesNetworkConfigArgs Empty = new ClusterKubernetesNetworkConfigArgs();

    /**
     * Ipv4 or Ipv6. You can only specify ipv6 for 1.21 and later clusters that use version 1.10.1 or later of the Amazon VPC CNI add-on
     * 
     */
    @Import(name="ipFamily")
      private final @Nullable Output<ClusterKubernetesNetworkConfigIpFamily> ipFamily;

    public Output<ClusterKubernetesNetworkConfigIpFamily> ipFamily() {
        return this.ipFamily == null ? Codegen.empty() : this.ipFamily;
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC.
     * 
     */
    @Import(name="serviceIpv4Cidr")
      private final @Nullable Output<String> serviceIpv4Cidr;

    public Output<String> serviceIpv4Cidr() {
        return this.serviceIpv4Cidr == null ? Codegen.empty() : this.serviceIpv4Cidr;
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     * 
     */
    @Import(name="serviceIpv6Cidr")
      private final @Nullable Output<String> serviceIpv6Cidr;

    public Output<String> serviceIpv6Cidr() {
        return this.serviceIpv6Cidr == null ? Codegen.empty() : this.serviceIpv6Cidr;
    }

    public ClusterKubernetesNetworkConfigArgs(
        @Nullable Output<ClusterKubernetesNetworkConfigIpFamily> ipFamily,
        @Nullable Output<String> serviceIpv4Cidr,
        @Nullable Output<String> serviceIpv6Cidr) {
        this.ipFamily = ipFamily;
        this.serviceIpv4Cidr = serviceIpv4Cidr;
        this.serviceIpv6Cidr = serviceIpv6Cidr;
    }

    private ClusterKubernetesNetworkConfigArgs() {
        this.ipFamily = Codegen.empty();
        this.serviceIpv4Cidr = Codegen.empty();
        this.serviceIpv6Cidr = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKubernetesNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterKubernetesNetworkConfigIpFamily> ipFamily;
        private @Nullable Output<String> serviceIpv4Cidr;
        private @Nullable Output<String> serviceIpv6Cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKubernetesNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipFamily = defaults.ipFamily;
    	      this.serviceIpv4Cidr = defaults.serviceIpv4Cidr;
    	      this.serviceIpv6Cidr = defaults.serviceIpv6Cidr;
        }

        public Builder ipFamily(@Nullable Output<ClusterKubernetesNetworkConfigIpFamily> ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }
        public Builder ipFamily(@Nullable ClusterKubernetesNetworkConfigIpFamily ipFamily) {
            this.ipFamily = Codegen.ofNullable(ipFamily);
            return this;
        }
        public Builder serviceIpv4Cidr(@Nullable Output<String> serviceIpv4Cidr) {
            this.serviceIpv4Cidr = serviceIpv4Cidr;
            return this;
        }
        public Builder serviceIpv4Cidr(@Nullable String serviceIpv4Cidr) {
            this.serviceIpv4Cidr = Codegen.ofNullable(serviceIpv4Cidr);
            return this;
        }
        public Builder serviceIpv6Cidr(@Nullable Output<String> serviceIpv6Cidr) {
            this.serviceIpv6Cidr = serviceIpv6Cidr;
            return this;
        }
        public Builder serviceIpv6Cidr(@Nullable String serviceIpv6Cidr) {
            this.serviceIpv6Cidr = Codegen.ofNullable(serviceIpv6Cidr);
            return this;
        }        public ClusterKubernetesNetworkConfigArgs build() {
            return new ClusterKubernetesNetworkConfigArgs(ipFamily, serviceIpv4Cidr, serviceIpv6Cidr);
        }
    }
}
