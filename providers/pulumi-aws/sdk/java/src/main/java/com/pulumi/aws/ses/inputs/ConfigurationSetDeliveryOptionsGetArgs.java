// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationSetDeliveryOptionsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationSetDeliveryOptionsGetArgs Empty = new ConfigurationSetDeliveryOptionsGetArgs();

    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can&#39;t be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
     * 
     */
    @Import(name="tlsPolicy")
    private @Nullable Output<String> tlsPolicy;

    /**
     * @return Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can&#39;t be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
     * 
     */
    public Optional<Output<String>> tlsPolicy() {
        return Optional.ofNullable(this.tlsPolicy);
    }

    private ConfigurationSetDeliveryOptionsGetArgs() {}

    private ConfigurationSetDeliveryOptionsGetArgs(ConfigurationSetDeliveryOptionsGetArgs $) {
        this.tlsPolicy = $.tlsPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationSetDeliveryOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationSetDeliveryOptionsGetArgs $;

        public Builder() {
            $ = new ConfigurationSetDeliveryOptionsGetArgs();
        }

        public Builder(ConfigurationSetDeliveryOptionsGetArgs defaults) {
            $ = new ConfigurationSetDeliveryOptionsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tlsPolicy Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can&#39;t be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
         * 
         * @return builder
         * 
         */
        public Builder tlsPolicy(@Nullable Output<String> tlsPolicy) {
            $.tlsPolicy = tlsPolicy;
            return this;
        }

        /**
         * @param tlsPolicy Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can&#39;t be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
         * 
         * @return builder
         * 
         */
        public Builder tlsPolicy(String tlsPolicy) {
            return tlsPolicy(Output.of(tlsPolicy));
        }

        public ConfigurationSetDeliveryOptionsGetArgs build() {
            return $;
        }
    }

}
