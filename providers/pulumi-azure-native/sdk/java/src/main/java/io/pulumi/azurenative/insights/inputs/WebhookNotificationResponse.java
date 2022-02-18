// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Webhook notification of an autoscale event.
 * 
 */
public final class WebhookNotificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebhookNotificationResponse Empty = new WebhookNotificationResponse();

    /**
     * a property bag of settings. This value can be empty.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * the service address to receive the notification.
     * 
     */
    @InputImport(name="serviceUri")
    private final @Nullable String serviceUri;

    public Optional<String> getServiceUri() {
        return this.serviceUri == null ? Optional.empty() : Optional.ofNullable(this.serviceUri);
    }

    public WebhookNotificationResponse(
        @Nullable Map<String,String> properties,
        @Nullable String serviceUri) {
        this.properties = properties;
        this.serviceUri = serviceUri;
    }

    private WebhookNotificationResponse() {
        this.properties = Map.of();
        this.serviceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookNotificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> properties;
        private @Nullable String serviceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookNotificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.serviceUri = defaults.serviceUri;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setServiceUri(@Nullable String serviceUri) {
            this.serviceUri = serviceUri;
            return this;
        }

        public WebhookNotificationResponse build() {
            return new WebhookNotificationResponse(properties, serviceUri);
        }
    }
}
