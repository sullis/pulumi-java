// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebhookCallbackConfigResult {
    /**
     * Custom headers that will be added to the webhook notifications.
     * 
     */
    private final @Nullable Map<String,String> customHeaders;
    /**
     * The service URI for the webhook to post notifications.
     * 
     */
    private final String serviceUri;

    @OutputCustomType.Constructor({"customHeaders","serviceUri"})
    private GetWebhookCallbackConfigResult(
        @Nullable Map<String,String> customHeaders,
        String serviceUri) {
        this.customHeaders = customHeaders;
        this.serviceUri = Objects.requireNonNull(serviceUri);
    }

    /**
     * Custom headers that will be added to the webhook notifications.
     * 
     */
    public Map<String,String> getCustomHeaders() {
        return this.customHeaders == null ? Map.of() : this.customHeaders;
    }
    /**
     * The service URI for the webhook to post notifications.
     * 
     */
    public String getServiceUri() {
        return this.serviceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhookCallbackConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> customHeaders;
        private String serviceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebhookCallbackConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHeaders = defaults.customHeaders;
    	      this.serviceUri = defaults.serviceUri;
        }

        public Builder setCustomHeaders(@Nullable Map<String,String> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }

        public Builder setServiceUri(String serviceUri) {
            this.serviceUri = Objects.requireNonNull(serviceUri);
            return this;
        }

        public GetWebhookCallbackConfigResult build() {
            return new GetWebhookCallbackConfigResult(customHeaders, serviceUri);
        }
    }
}
