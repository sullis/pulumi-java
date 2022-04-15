// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterKubernetesNetworkConfig {
    private final String ipFamily;
    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     * 
     */
    private final String serviceIpv4Cidr;

    @CustomType.Constructor
    private GetClusterKubernetesNetworkConfig(
        @CustomType.Parameter("ipFamily") String ipFamily,
        @CustomType.Parameter("serviceIpv4Cidr") String serviceIpv4Cidr) {
        this.ipFamily = ipFamily;
        this.serviceIpv4Cidr = serviceIpv4Cidr;
    }

    public String ipFamily() {
        return this.ipFamily;
    }
    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     * 
    */
    public String serviceIpv4Cidr() {
        return this.serviceIpv4Cidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterKubernetesNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipFamily;
        private String serviceIpv4Cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterKubernetesNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipFamily = defaults.ipFamily;
    	      this.serviceIpv4Cidr = defaults.serviceIpv4Cidr;
        }

        public Builder ipFamily(String ipFamily) {
            this.ipFamily = Objects.requireNonNull(ipFamily);
            return this;
        }
        public Builder serviceIpv4Cidr(String serviceIpv4Cidr) {
            this.serviceIpv4Cidr = Objects.requireNonNull(serviceIpv4Cidr);
            return this;
        }        public GetClusterKubernetesNetworkConfig build() {
            return new GetClusterKubernetesNetworkConfig(ipFamily, serviceIpv4Cidr);
        }
    }
}
