// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkPolicyPort {
    /**
     * If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port. This feature is in Beta state and is enabled by default. It can be disabled using the Feature Gate "NetworkPolicyEndPort".
     * 
     */
    private final @Nullable Integer endPort;
    /**
     * The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    private final @Nullable Either<Integer,String> port;
    /**
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    private final @Nullable String protocol;

    @OutputCustomType.Constructor({"endPort","port","protocol"})
    private NetworkPolicyPort(
        @Nullable Integer endPort,
        @Nullable Either<Integer,String> port,
        @Nullable String protocol) {
        this.endPort = endPort;
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port. This feature is in Beta state and is enabled by default. It can be disabled using the Feature Gate "NetworkPolicyEndPort".
     * 
     */
    public Optional<Integer> getEndPort() {
        return Optional.ofNullable(this.endPort);
    }
    /**
     * The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    public Optional<Either<Integer,String>> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer endPort;
        private @Nullable Either<Integer,String> port;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPort = defaults.endPort;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder setEndPort(@Nullable Integer endPort) {
            this.endPort = endPort;
            return this;
        }

        public Builder setPort(@Nullable Either<Integer,String> port) {
            this.port = port;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public NetworkPolicyPort build() {
            return new NetworkPolicyPort(endPort, port, protocol);
        }
    }
}
