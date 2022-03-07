// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.outputs;

import io.pulumi.awsnative.globalaccelerator.enums.ListenerClientAffinity;
import io.pulumi.awsnative.globalaccelerator.enums.ListenerProtocol;
import io.pulumi.awsnative.globalaccelerator.outputs.ListenerPortRange;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetListenerResult {
    /**
     * Client affinity lets you direct all requests from a user to the same endpoint.
     * 
     */
    private final @Nullable ListenerClientAffinity clientAffinity;
    /**
     * The Amazon Resource Name (ARN) of the listener.
     * 
     */
    private final @Nullable String listenerArn;
    private final @Nullable List<ListenerPortRange> portRanges;
    /**
     * The protocol for the listener.
     * 
     */
    private final @Nullable ListenerProtocol protocol;

    @OutputCustomType.Constructor({"clientAffinity","listenerArn","portRanges","protocol"})
    private GetListenerResult(
        @Nullable ListenerClientAffinity clientAffinity,
        @Nullable String listenerArn,
        @Nullable List<ListenerPortRange> portRanges,
        @Nullable ListenerProtocol protocol) {
        this.clientAffinity = clientAffinity;
        this.listenerArn = listenerArn;
        this.portRanges = portRanges;
        this.protocol = protocol;
    }

    /**
     * Client affinity lets you direct all requests from a user to the same endpoint.
     * 
    */
    public Optional<ListenerClientAffinity> getClientAffinity() {
        return Optional.ofNullable(this.clientAffinity);
    }
    /**
     * The Amazon Resource Name (ARN) of the listener.
     * 
    */
    public Optional<String> getListenerArn() {
        return Optional.ofNullable(this.listenerArn);
    }
    public List<ListenerPortRange> getPortRanges() {
        return this.portRanges == null ? List.of() : this.portRanges;
    }
    /**
     * The protocol for the listener.
     * 
    */
    public Optional<ListenerProtocol> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerClientAffinity clientAffinity;
        private @Nullable String listenerArn;
        private @Nullable List<ListenerPortRange> portRanges;
        private @Nullable ListenerProtocol protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAffinity = defaults.clientAffinity;
    	      this.listenerArn = defaults.listenerArn;
    	      this.portRanges = defaults.portRanges;
    	      this.protocol = defaults.protocol;
        }

        public Builder setClientAffinity(@Nullable ListenerClientAffinity clientAffinity) {
            this.clientAffinity = clientAffinity;
            return this;
        }

        public Builder setListenerArn(@Nullable String listenerArn) {
            this.listenerArn = listenerArn;
            return this;
        }

        public Builder setPortRanges(@Nullable List<ListenerPortRange> portRanges) {
            this.portRanges = portRanges;
            return this;
        }

        public Builder setProtocol(@Nullable ListenerProtocol protocol) {
            this.protocol = protocol;
            return this;
        }
        public GetListenerResult build() {
            return new GetListenerResult(clientAffinity, listenerArn, portRanges, protocol);
        }
    }
}