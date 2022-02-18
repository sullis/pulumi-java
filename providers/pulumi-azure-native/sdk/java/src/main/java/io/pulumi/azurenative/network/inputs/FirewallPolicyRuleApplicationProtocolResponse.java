// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the application rule protocol.
 * 
 */
public final class FirewallPolicyRuleApplicationProtocolResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyRuleApplicationProtocolResponse Empty = new FirewallPolicyRuleApplicationProtocolResponse();

    /**
     * Port number for the protocol, cannot be greater than 64000.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Integer port;

    public Optional<Integer> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    /**
     * Protocol type.
     * 
     */
    @InputImport(name="protocolType")
    private final @Nullable String protocolType;

    public Optional<String> getProtocolType() {
        return this.protocolType == null ? Optional.empty() : Optional.ofNullable(this.protocolType);
    }

    public FirewallPolicyRuleApplicationProtocolResponse(
        @Nullable Integer port,
        @Nullable String protocolType) {
        this.port = port;
        this.protocolType = protocolType;
    }

    private FirewallPolicyRuleApplicationProtocolResponse() {
        this.port = null;
        this.protocolType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleApplicationProtocolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer port;
        private @Nullable String protocolType;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleApplicationProtocolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocolType = defaults.protocolType;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setProtocolType(@Nullable String protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        public FirewallPolicyRuleApplicationProtocolResponse build() {
            return new FirewallPolicyRuleApplicationProtocolResponse(port, protocolType);
        }
    }
}
