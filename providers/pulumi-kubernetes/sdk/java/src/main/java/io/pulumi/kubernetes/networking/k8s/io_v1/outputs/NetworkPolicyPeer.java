// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.IPBlock;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkPolicyPeer {
    /**
     * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
     * 
     */
    private final @Nullable IPBlock ipBlock;
    /**
     * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
     * 
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * 
     */
    private final @Nullable LabelSelector namespaceSelector;
    /**
     * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
     * 
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     * 
     */
    private final @Nullable LabelSelector podSelector;

    @OutputCustomType.Constructor
    private NetworkPolicyPeer(
        @OutputCustomType.Parameter("ipBlock") @Nullable IPBlock ipBlock,
        @OutputCustomType.Parameter("namespaceSelector") @Nullable LabelSelector namespaceSelector,
        @OutputCustomType.Parameter("podSelector") @Nullable LabelSelector podSelector) {
        this.ipBlock = ipBlock;
        this.namespaceSelector = namespaceSelector;
        this.podSelector = podSelector;
    }

    /**
     * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
     * 
    */
    public Optional<IPBlock> getIpBlock() {
        return Optional.ofNullable(this.ipBlock);
    }
    /**
     * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
     * 
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * 
    */
    public Optional<LabelSelector> getNamespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }
    /**
     * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
     * 
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     * 
    */
    public Optional<LabelSelector> getPodSelector() {
        return Optional.ofNullable(this.podSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPeer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IPBlock ipBlock;
        private @Nullable LabelSelector namespaceSelector;
        private @Nullable LabelSelector podSelector;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPeer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipBlock = defaults.ipBlock;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.podSelector = defaults.podSelector;
        }

        public Builder setIpBlock(@Nullable IPBlock ipBlock) {
            this.ipBlock = ipBlock;
            return this;
        }

        public Builder setNamespaceSelector(@Nullable LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        public Builder setPodSelector(@Nullable LabelSelector podSelector) {
            this.podSelector = podSelector;
            return this;
        }
        public NetworkPolicyPeer build() {
            return new NetworkPolicyPeer(ipBlock, namespaceSelector, podSelector);
        }
    }
}
