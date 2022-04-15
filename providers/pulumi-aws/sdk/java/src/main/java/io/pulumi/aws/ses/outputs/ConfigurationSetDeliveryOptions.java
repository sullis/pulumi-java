// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationSetDeliveryOptions {
    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can't be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
     * 
     */
    private final @Nullable String tlsPolicy;

    @CustomType.Constructor
    private ConfigurationSetDeliveryOptions(@CustomType.Parameter("tlsPolicy") @Nullable String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
    }

    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can't be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
     * 
    */
    public Optional<String> tlsPolicy() {
        return Optional.ofNullable(this.tlsPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationSetDeliveryOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String tlsPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationSetDeliveryOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tlsPolicy = defaults.tlsPolicy;
        }

        public Builder tlsPolicy(@Nullable String tlsPolicy) {
            this.tlsPolicy = tlsPolicy;
            return this;
        }        public ConfigurationSetDeliveryOptions build() {
            return new ConfigurationSetDeliveryOptions(tlsPolicy);
        }
    }
}
