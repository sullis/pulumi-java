// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.globalaccelerator.outputs;

import com.pulumi.awsnative.globalaccelerator.enums.ListenerClientAffinity;
import com.pulumi.awsnative.globalaccelerator.enums.ListenerProtocol;
import com.pulumi.awsnative.globalaccelerator.outputs.ListenerPortRange;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetListenerResult {
    /**
     * @return Client affinity lets you direct all requests from a user to the same endpoint.
     * 
     */
    private final @Nullable ListenerClientAffinity clientAffinity;
    /**
     * @return The Amazon Resource Name (ARN) of the listener.
     * 
     */
    private final @Nullable String listenerArn;
    private final @Nullable List<ListenerPortRange> portRanges;
    /**
     * @return The protocol for the listener.
     * 
     */
    private final @Nullable ListenerProtocol protocol;

    @CustomType.Constructor
    private GetListenerResult(
        @CustomType.Parameter("clientAffinity") @Nullable ListenerClientAffinity clientAffinity,
        @CustomType.Parameter("listenerArn") @Nullable String listenerArn,
        @CustomType.Parameter("portRanges") @Nullable List<ListenerPortRange> portRanges,
        @CustomType.Parameter("protocol") @Nullable ListenerProtocol protocol) {
        this.clientAffinity = clientAffinity;
        this.listenerArn = listenerArn;
        this.portRanges = portRanges;
        this.protocol = protocol;
    }

    /**
     * @return Client affinity lets you direct all requests from a user to the same endpoint.
     * 
     */
    public Optional<ListenerClientAffinity> clientAffinity() {
        return Optional.ofNullable(this.clientAffinity);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the listener.
     * 
     */
    public Optional<String> listenerArn() {
        return Optional.ofNullable(this.listenerArn);
    }
    public List<ListenerPortRange> portRanges() {
        return this.portRanges == null ? List.of() : this.portRanges;
    }
    /**
     * @return The protocol for the listener.
     * 
     */
    public Optional<ListenerProtocol> protocol() {
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

        public Builder clientAffinity(@Nullable ListenerClientAffinity clientAffinity) {
            this.clientAffinity = clientAffinity;
            return this;
        }
        public Builder listenerArn(@Nullable String listenerArn) {
            this.listenerArn = listenerArn;
            return this;
        }
        public Builder portRanges(@Nullable List<ListenerPortRange> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public Builder portRanges(ListenerPortRange... portRanges) {
            return portRanges(List.of(portRanges));
        }
        public Builder protocol(@Nullable ListenerProtocol protocol) {
            this.protocol = protocol;
            return this;
        }        public GetListenerResult build() {
            return new GetListenerResult(clientAffinity, listenerArn, portRanges, protocol);
        }
    }
}
