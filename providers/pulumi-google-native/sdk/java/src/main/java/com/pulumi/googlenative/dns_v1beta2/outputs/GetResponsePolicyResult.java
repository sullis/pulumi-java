// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dns_v1beta2.outputs.ResponsePolicyGKEClusterResponse;
import com.pulumi.googlenative.dns_v1beta2.outputs.ResponsePolicyNetworkResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResponsePolicyResult {
    /**
     * @return User-provided description for this Response Policy.
     * 
     */
    private final String description;
    /**
     * @return The list of Google Kubernetes Engine clusters to which this response policy is applied.
     * 
     */
    private final List<ResponsePolicyGKEClusterResponse> gkeClusters;
    private final String kind;
    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    private final List<ResponsePolicyNetworkResponse> networks;
    /**
     * @return User assigned name for this Response Policy.
     * 
     */
    private final String responsePolicyName;

    @CustomType.Constructor
    private GetResponsePolicyResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("gkeClusters") List<ResponsePolicyGKEClusterResponse> gkeClusters,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("networks") List<ResponsePolicyNetworkResponse> networks,
        @CustomType.Parameter("responsePolicyName") String responsePolicyName) {
        this.description = description;
        this.gkeClusters = gkeClusters;
        this.kind = kind;
        this.networks = networks;
        this.responsePolicyName = responsePolicyName;
    }

    /**
     * @return User-provided description for this Response Policy.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The list of Google Kubernetes Engine clusters to which this response policy is applied.
     * 
     */
    public List<ResponsePolicyGKEClusterResponse> gkeClusters() {
        return this.gkeClusters;
    }
    public String kind() {
        return this.kind;
    }
    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    public List<ResponsePolicyNetworkResponse> networks() {
        return this.networks;
    }
    /**
     * @return User assigned name for this Response Policy.
     * 
     */
    public String responsePolicyName() {
        return this.responsePolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponsePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private List<ResponsePolicyGKEClusterResponse> gkeClusters;
        private String kind;
        private List<ResponsePolicyNetworkResponse> networks;
        private String responsePolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponsePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.gkeClusters = defaults.gkeClusters;
    	      this.kind = defaults.kind;
    	      this.networks = defaults.networks;
    	      this.responsePolicyName = defaults.responsePolicyName;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder gkeClusters(List<ResponsePolicyGKEClusterResponse> gkeClusters) {
            this.gkeClusters = Objects.requireNonNull(gkeClusters);
            return this;
        }
        public Builder gkeClusters(ResponsePolicyGKEClusterResponse... gkeClusters) {
            return gkeClusters(List.of(gkeClusters));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder networks(List<ResponsePolicyNetworkResponse> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(ResponsePolicyNetworkResponse... networks) {
            return networks(List.of(networks));
        }
        public Builder responsePolicyName(String responsePolicyName) {
            this.responsePolicyName = Objects.requireNonNull(responsePolicyName);
            return this;
        }        public GetResponsePolicyResult build() {
            return new GetResponsePolicyResult(description, gkeClusters, kind, networks, responsePolicyName);
        }
    }
}
