// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.pubsub.outputs.SubscriptionPushConfigOidcToken;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubscriptionPushConfig {
    /**
     * Endpoint configuration attributes.
     * Every endpoint has a set of API supported attributes that can
     * be used to control different aspects of the message delivery.
     * The currently supported attribute is x-goog-version, which you
     * can use to change the format of the pushed message. This
     * attribute indicates the version of the data expected by
     * the endpoint. This controls the shape of the pushed message
     * (i.e., its fields and metadata). The endpoint version is
     * based on the version of the Pub/Sub API.
     * If not present during the subscriptions.create call,
     * it will default to the version of the API used to make
     * such call. If not present during a subscriptions.modifyPushConfig
     * call, its value will not be changed. subscriptions.get
     * calls will always return a valid version, even if the
     * subscription was created without this attribute.
     * The possible values for this attribute are:
     * - v1beta1: uses the push format defined in the v1beta1 Pub/Sub API.
     * - v1 or v1beta2: uses the push format defined in the v1 Pub/Sub API.
     * 
     */
    private final @Nullable Map<String,String> attributes;
    /**
     * If specified, Pub/Sub will generate and attach an OIDC JWT token as
     * an Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * 
     */
    private final @Nullable SubscriptionPushConfigOidcToken oidcToken;
    /**
     * A URL locating the endpoint to which messages should be pushed.
     * For example, a Webhook endpoint might use
     * "https://example.com/push".
     * 
     */
    private final String pushEndpoint;

    @OutputCustomType.Constructor({"attributes","oidcToken","pushEndpoint"})
    private SubscriptionPushConfig(
        @Nullable Map<String,String> attributes,
        @Nullable SubscriptionPushConfigOidcToken oidcToken,
        String pushEndpoint) {
        this.attributes = attributes;
        this.oidcToken = oidcToken;
        this.pushEndpoint = Objects.requireNonNull(pushEndpoint);
    }

    /**
     * Endpoint configuration attributes.
     * Every endpoint has a set of API supported attributes that can
     * be used to control different aspects of the message delivery.
     * The currently supported attribute is x-goog-version, which you
     * can use to change the format of the pushed message. This
     * attribute indicates the version of the data expected by
     * the endpoint. This controls the shape of the pushed message
     * (i.e., its fields and metadata). The endpoint version is
     * based on the version of the Pub/Sub API.
     * If not present during the subscriptions.create call,
     * it will default to the version of the API used to make
     * such call. If not present during a subscriptions.modifyPushConfig
     * call, its value will not be changed. subscriptions.get
     * calls will always return a valid version, even if the
     * subscription was created without this attribute.
     * The possible values for this attribute are:
     * - v1beta1: uses the push format defined in the v1beta1 Pub/Sub API.
     * - v1 or v1beta2: uses the push format defined in the v1 Pub/Sub API.
     * 
     */
    public Map<String,String> getAttributes() {
        return this.attributes == null ? Map.of() : this.attributes;
    }
    /**
     * If specified, Pub/Sub will generate and attach an OIDC JWT token as
     * an Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * 
     */
    public Optional<SubscriptionPushConfigOidcToken> getOidcToken() {
        return Optional.ofNullable(this.oidcToken);
    }
    /**
     * A URL locating the endpoint to which messages should be pushed.
     * For example, a Webhook endpoint might use
     * "https://example.com/push".
     * 
     */
    public String getPushEndpoint() {
        return this.pushEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionPushConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> attributes;
        private @Nullable SubscriptionPushConfigOidcToken oidcToken;
        private String pushEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionPushConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.oidcToken = defaults.oidcToken;
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        public Builder setAttributes(@Nullable Map<String,String> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setOidcToken(@Nullable SubscriptionPushConfigOidcToken oidcToken) {
            this.oidcToken = oidcToken;
            return this;
        }

        public Builder setPushEndpoint(String pushEndpoint) {
            this.pushEndpoint = Objects.requireNonNull(pushEndpoint);
            return this;
        }

        public SubscriptionPushConfig build() {
            return new SubscriptionPushConfig(attributes, oidcToken, pushEndpoint);
        }
    }
}
