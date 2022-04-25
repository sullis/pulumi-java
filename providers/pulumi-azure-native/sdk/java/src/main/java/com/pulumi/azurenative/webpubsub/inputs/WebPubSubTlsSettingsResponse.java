// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TLS settings for the resource
 * 
 */
public final class WebPubSubTlsSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final WebPubSubTlsSettingsResponse Empty = new WebPubSubTlsSettingsResponse();

    /**
     * Request client certificate during TLS handshake if enabled
     * 
     */
    @Import(name="clientCertEnabled")
    private @Nullable Boolean clientCertEnabled;

    /**
     * @return Request client certificate during TLS handshake if enabled
     * 
     */
    public Optional<Boolean> clientCertEnabled() {
        return Optional.ofNullable(this.clientCertEnabled);
    }

    private WebPubSubTlsSettingsResponse() {}

    private WebPubSubTlsSettingsResponse(WebPubSubTlsSettingsResponse $) {
        this.clientCertEnabled = $.clientCertEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebPubSubTlsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebPubSubTlsSettingsResponse $;

        public Builder() {
            $ = new WebPubSubTlsSettingsResponse();
        }

        public Builder(WebPubSubTlsSettingsResponse defaults) {
            $ = new WebPubSubTlsSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientCertEnabled Request client certificate during TLS handshake if enabled
         * 
         * @return builder
         * 
         */
        public Builder clientCertEnabled(@Nullable Boolean clientCertEnabled) {
            $.clientCertEnabled = clientCertEnabled;
            return this;
        }

        public WebPubSubTlsSettingsResponse build() {
            $.clientCertEnabled = Codegen.booleanProp("clientCertEnabled").arg($.clientCertEnabled).def(true).getNullable();
            return $;
        }
    }

}
