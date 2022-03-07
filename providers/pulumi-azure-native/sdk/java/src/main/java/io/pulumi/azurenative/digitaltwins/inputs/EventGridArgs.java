// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.azurenative.digitaltwins.enums.AuthenticationType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties related to EventGrid.
 * 
 */
public final class EventGridArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventGridArgs Empty = new EventGridArgs();

    /**
     * EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    @InputImport(name="accessKey1", required=true)
      private final Input<String> accessKey1;

    public Input<String> getAccessKey1() {
        return this.accessKey1;
    }

    /**
     * EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    @InputImport(name="accessKey2")
      private final @Nullable Input<String> accessKey2;

    public Input<String> getAccessKey2() {
        return this.accessKey2 == null ? Input.empty() : this.accessKey2;
    }

    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    @InputImport(name="authenticationType")
      private final @Nullable Input<Either<String,AuthenticationType>> authenticationType;

    public Input<Either<String,AuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    @InputImport(name="deadLetterSecret")
      private final @Nullable Input<String> deadLetterSecret;

    public Input<String> getDeadLetterSecret() {
        return this.deadLetterSecret == null ? Input.empty() : this.deadLetterSecret;
    }

    /**
     * Dead letter storage URL for identity-based authentication.
     * 
     */
    @InputImport(name="deadLetterUri")
      private final @Nullable Input<String> deadLetterUri;

    public Input<String> getDeadLetterUri() {
        return this.deadLetterUri == null ? Input.empty() : this.deadLetterUri;
    }

    /**
     * The type of Digital Twins endpoint
     * Expected value is 'EventGrid'.
     * 
     */
    @InputImport(name="endpointType", required=true)
      private final Input<String> endpointType;

    public Input<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * EventGrid Topic Endpoint
     * 
     */
    @InputImport(name="topicEndpoint", required=true)
      private final Input<String> topicEndpoint;

    public Input<String> getTopicEndpoint() {
        return this.topicEndpoint;
    }

    public EventGridArgs(
        Input<String> accessKey1,
        @Nullable Input<String> accessKey2,
        @Nullable Input<Either<String,AuthenticationType>> authenticationType,
        @Nullable Input<String> deadLetterSecret,
        @Nullable Input<String> deadLetterUri,
        Input<String> endpointType,
        Input<String> topicEndpoint) {
        this.accessKey1 = Objects.requireNonNull(accessKey1, "expected parameter 'accessKey1' to be non-null");
        this.accessKey2 = accessKey2;
        this.authenticationType = authenticationType;
        this.deadLetterSecret = deadLetterSecret;
        this.deadLetterUri = deadLetterUri;
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.topicEndpoint = Objects.requireNonNull(topicEndpoint, "expected parameter 'topicEndpoint' to be non-null");
    }

    private EventGridArgs() {
        this.accessKey1 = Input.empty();
        this.accessKey2 = Input.empty();
        this.authenticationType = Input.empty();
        this.deadLetterSecret = Input.empty();
        this.deadLetterUri = Input.empty();
        this.endpointType = Input.empty();
        this.topicEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventGridArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accessKey1;
        private @Nullable Input<String> accessKey2;
        private @Nullable Input<Either<String,AuthenticationType>> authenticationType;
        private @Nullable Input<String> deadLetterSecret;
        private @Nullable Input<String> deadLetterUri;
        private Input<String> endpointType;
        private Input<String> topicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(EventGridArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey1 = defaults.accessKey1;
    	      this.accessKey2 = defaults.accessKey2;
    	      this.authenticationType = defaults.authenticationType;
    	      this.deadLetterSecret = defaults.deadLetterSecret;
    	      this.deadLetterUri = defaults.deadLetterUri;
    	      this.endpointType = defaults.endpointType;
    	      this.topicEndpoint = defaults.topicEndpoint;
        }

        public Builder setAccessKey1(Input<String> accessKey1) {
            this.accessKey1 = Objects.requireNonNull(accessKey1);
            return this;
        }

        public Builder setAccessKey1(String accessKey1) {
            this.accessKey1 = Input.of(Objects.requireNonNull(accessKey1));
            return this;
        }

        public Builder setAccessKey2(@Nullable Input<String> accessKey2) {
            this.accessKey2 = accessKey2;
            return this;
        }

        public Builder setAccessKey2(@Nullable String accessKey2) {
            this.accessKey2 = Input.ofNullable(accessKey2);
            return this;
        }

        public Builder setAuthenticationType(@Nullable Input<Either<String,AuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable Either<String,AuthenticationType> authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setDeadLetterSecret(@Nullable Input<String> deadLetterSecret) {
            this.deadLetterSecret = deadLetterSecret;
            return this;
        }

        public Builder setDeadLetterSecret(@Nullable String deadLetterSecret) {
            this.deadLetterSecret = Input.ofNullable(deadLetterSecret);
            return this;
        }

        public Builder setDeadLetterUri(@Nullable Input<String> deadLetterUri) {
            this.deadLetterUri = deadLetterUri;
            return this;
        }

        public Builder setDeadLetterUri(@Nullable String deadLetterUri) {
            this.deadLetterUri = Input.ofNullable(deadLetterUri);
            return this;
        }

        public Builder setEndpointType(Input<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Input.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder setTopicEndpoint(Input<String> topicEndpoint) {
            this.topicEndpoint = Objects.requireNonNull(topicEndpoint);
            return this;
        }

        public Builder setTopicEndpoint(String topicEndpoint) {
            this.topicEndpoint = Input.of(Objects.requireNonNull(topicEndpoint));
            return this;
        }
        public EventGridArgs build() {
            return new EventGridArgs(accessKey1, accessKey2, authenticationType, deadLetterSecret, deadLetterUri, endpointType, topicEndpoint);
        }
    }
}