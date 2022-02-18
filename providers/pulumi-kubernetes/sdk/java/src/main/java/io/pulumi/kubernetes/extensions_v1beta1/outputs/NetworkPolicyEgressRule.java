// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.NetworkPolicyPeer;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.NetworkPolicyPort;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkPolicyEgressRule {
    /**
     * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    private final @Nullable List<NetworkPolicyPort> ports;
    /**
     * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
     * 
     */
    private final @Nullable List<NetworkPolicyPeer> to;

    @OutputCustomType.Constructor({"ports","to"})
    private NetworkPolicyEgressRule(
        @Nullable List<NetworkPolicyPort> ports,
        @Nullable List<NetworkPolicyPeer> to) {
        this.ports = ports;
        this.to = to;
    }

    /**
     * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    public List<NetworkPolicyPort> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
     * 
     */
    public List<NetworkPolicyPeer> getTo() {
        return this.to == null ? List.of() : this.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyEgressRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NetworkPolicyPort> ports;
        private @Nullable List<NetworkPolicyPeer> to;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyEgressRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ports = defaults.ports;
    	      this.to = defaults.to;
        }

        public Builder setPorts(@Nullable List<NetworkPolicyPort> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setTo(@Nullable List<NetworkPolicyPeer> to) {
            this.to = to;
            return this;
        }

        public NetworkPolicyEgressRule build() {
            return new NetworkPolicyEgressRule(ports, to);
        }
    }
}
