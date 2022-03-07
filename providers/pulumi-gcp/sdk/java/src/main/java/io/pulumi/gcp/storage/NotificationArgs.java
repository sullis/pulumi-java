// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationArgs Empty = new NotificationArgs();

    /**
     * The name of the bucket.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * A set of key/value attribute pairs to attach to each Cloud PubSub message published for this notification subscription
     * 
     */
    @InputImport(name="customAttributes")
      private final @Nullable Input<Map<String,String>> customAttributes;

    public Input<Map<String,String>> getCustomAttributes() {
        return this.customAttributes == null ? Input.empty() : this.customAttributes;
    }

    /**
     * List of event type filters for this notification config. If not specified, Cloud Storage will send notifications for all event types. The valid types are: `"OBJECT_FINALIZE"`, `"OBJECT_METADATA_UPDATE"`, `"OBJECT_DELETE"`, `"OBJECT_ARCHIVE"`
     * 
     */
    @InputImport(name="eventTypes")
      private final @Nullable Input<List<String>> eventTypes;

    public Input<List<String>> getEventTypes() {
        return this.eventTypes == null ? Input.empty() : this.eventTypes;
    }

    /**
     * Specifies a prefix path filter for this notification config. Cloud Storage will only send notifications for objects in this bucket whose names begin with the specified prefix.
     * 
     */
    @InputImport(name="objectNamePrefix")
      private final @Nullable Input<String> objectNamePrefix;

    public Input<String> getObjectNamePrefix() {
        return this.objectNamePrefix == null ? Input.empty() : this.objectNamePrefix;
    }

    /**
     * The desired content of the Payload. One of `"JSON_API_V1"` or `"NONE"`.
     * 
     */
    @InputImport(name="payloadFormat", required=true)
      private final Input<String> payloadFormat;

    public Input<String> getPayloadFormat() {
        return this.payloadFormat;
    }

    /**
     * The Cloud PubSub topic to which this subscription publishes. Expects either the
     * topic name, assumed to belong to the default GCP provider project, or the project-level name,
     * i.e. `projects/my-gcp-project/topics/my-topic` or `my-topic`. If the project is not set in the provider,
     * you will need to use the project-level name.
     * 
     */
    @InputImport(name="topic", required=true)
      private final Input<String> topic;

    public Input<String> getTopic() {
        return this.topic;
    }

    public NotificationArgs(
        Input<String> bucket,
        @Nullable Input<Map<String,String>> customAttributes,
        @Nullable Input<List<String>> eventTypes,
        @Nullable Input<String> objectNamePrefix,
        Input<String> payloadFormat,
        Input<String> topic) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.customAttributes = customAttributes;
        this.eventTypes = eventTypes;
        this.objectNamePrefix = objectNamePrefix;
        this.payloadFormat = Objects.requireNonNull(payloadFormat, "expected parameter 'payloadFormat' to be non-null");
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private NotificationArgs() {
        this.bucket = Input.empty();
        this.customAttributes = Input.empty();
        this.eventTypes = Input.empty();
        this.objectNamePrefix = Input.empty();
        this.payloadFormat = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<Map<String,String>> customAttributes;
        private @Nullable Input<List<String>> eventTypes;
        private @Nullable Input<String> objectNamePrefix;
        private Input<String> payloadFormat;
        private Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.customAttributes = defaults.customAttributes;
    	      this.eventTypes = defaults.eventTypes;
    	      this.objectNamePrefix = defaults.objectNamePrefix;
    	      this.payloadFormat = defaults.payloadFormat;
    	      this.topic = defaults.topic;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setCustomAttributes(@Nullable Input<Map<String,String>> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }

        public Builder setCustomAttributes(@Nullable Map<String,String> customAttributes) {
            this.customAttributes = Input.ofNullable(customAttributes);
            return this;
        }

        public Builder setEventTypes(@Nullable Input<List<String>> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        public Builder setEventTypes(@Nullable List<String> eventTypes) {
            this.eventTypes = Input.ofNullable(eventTypes);
            return this;
        }

        public Builder setObjectNamePrefix(@Nullable Input<String> objectNamePrefix) {
            this.objectNamePrefix = objectNamePrefix;
            return this;
        }

        public Builder setObjectNamePrefix(@Nullable String objectNamePrefix) {
            this.objectNamePrefix = Input.ofNullable(objectNamePrefix);
            return this;
        }

        public Builder setPayloadFormat(Input<String> payloadFormat) {
            this.payloadFormat = Objects.requireNonNull(payloadFormat);
            return this;
        }

        public Builder setPayloadFormat(String payloadFormat) {
            this.payloadFormat = Input.of(Objects.requireNonNull(payloadFormat));
            return this;
        }

        public Builder setTopic(Input<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Input.of(Objects.requireNonNull(topic));
            return this;
        }
        public NotificationArgs build() {
            return new NotificationArgs(bucket, customAttributes, eventTypes, objectNamePrefix, payloadFormat, topic);
        }
    }
}