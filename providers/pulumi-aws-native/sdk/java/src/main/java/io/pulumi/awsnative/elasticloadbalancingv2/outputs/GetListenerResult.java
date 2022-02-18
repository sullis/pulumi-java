// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerAction;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerCertificate;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetListenerResult {
    private final @Nullable List<String> alpnPolicy;
    private final @Nullable List<ListenerCertificate> certificates;
    private final @Nullable List<ListenerAction> defaultActions;
    private final @Nullable String listenerArn;
    private final @Nullable Integer port;
    private final @Nullable String protocol;
    private final @Nullable String sslPolicy;

    @OutputCustomType.Constructor({"alpnPolicy","certificates","defaultActions","listenerArn","port","protocol","sslPolicy"})
    private GetListenerResult(
        @Nullable List<String> alpnPolicy,
        @Nullable List<ListenerCertificate> certificates,
        @Nullable List<ListenerAction> defaultActions,
        @Nullable String listenerArn,
        @Nullable Integer port,
        @Nullable String protocol,
        @Nullable String sslPolicy) {
        this.alpnPolicy = alpnPolicy;
        this.certificates = certificates;
        this.defaultActions = defaultActions;
        this.listenerArn = listenerArn;
        this.port = port;
        this.protocol = protocol;
        this.sslPolicy = sslPolicy;
    }

    public List<String> getAlpnPolicy() {
        return this.alpnPolicy == null ? List.of() : this.alpnPolicy;
    }
    public List<ListenerCertificate> getCertificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }
    public List<ListenerAction> getDefaultActions() {
        return this.defaultActions == null ? List.of() : this.defaultActions;
    }
    public Optional<String> getListenerArn() {
        return Optional.ofNullable(this.listenerArn);
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    public Optional<String> getSslPolicy() {
        return Optional.ofNullable(this.sslPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> alpnPolicy;
        private @Nullable List<ListenerCertificate> certificates;
        private @Nullable List<ListenerAction> defaultActions;
        private @Nullable String listenerArn;
        private @Nullable Integer port;
        private @Nullable String protocol;
        private @Nullable String sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alpnPolicy = defaults.alpnPolicy;
    	      this.certificates = defaults.certificates;
    	      this.defaultActions = defaults.defaultActions;
    	      this.listenerArn = defaults.listenerArn;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sslPolicy = defaults.sslPolicy;
        }

        public Builder setAlpnPolicy(@Nullable List<String> alpnPolicy) {
            this.alpnPolicy = alpnPolicy;
            return this;
        }

        public Builder setCertificates(@Nullable List<ListenerCertificate> certificates) {
            this.certificates = certificates;
            return this;
        }

        public Builder setDefaultActions(@Nullable List<ListenerAction> defaultActions) {
            this.defaultActions = defaultActions;
            return this;
        }

        public Builder setListenerArn(@Nullable String listenerArn) {
            this.listenerArn = listenerArn;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setSslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public GetListenerResult build() {
            return new GetListenerResult(alpnPolicy, certificates, defaultActions, listenerArn, port, protocol, sslPolicy);
        }
    }
}
