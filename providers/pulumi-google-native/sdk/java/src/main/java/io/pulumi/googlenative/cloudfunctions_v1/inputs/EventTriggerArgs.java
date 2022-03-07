// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.FailurePolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes EventTrigger, used to request events be sent from another service.
 * 
 */
public final class EventTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTriggerArgs Empty = new EventTriggerArgs();

    /**
     * The type of event to observe. For example: `providers/cloud.storage/eventTypes/object.change` and `providers/cloud.pubsub/eventTypes/topic.publish`. Event types match pattern `providers/*{@literal /}eventTypes/*.*`. The pattern contains: 1. namespace: For example, `cloud.storage` and `google.firebase.analytics`. 2. resource type: The type of resource on which event occurs. For example, the Google Cloud Storage API includes the type `object`. 3. action: The action that generates the event. For example, action for a Google Cloud Storage Object is 'change'. These parts are lower case.
     * 
     */
    @InputImport(name="eventType", required=true)
      private final Input<String> eventType;

    public Input<String> getEventType() {
        return this.eventType;
    }

    /**
     * Specifies policy for failed executions.
     * 
     */
    @InputImport(name="failurePolicy")
      private final @Nullable Input<FailurePolicyArgs> failurePolicy;

    public Input<FailurePolicyArgs> getFailurePolicy() {
        return this.failurePolicy == null ? Input.empty() : this.failurePolicy;
    }

    /**
     * The resource(s) from which to observe events, for example, `projects/_/buckets/myBucket`. Not all syntactically correct values are accepted by all services. For example: 1. The authorization model must support it. Google Cloud Functions only allows EventTriggers to be deployed that observe resources in the same project as the `CloudFunction`. 2. The resource type must match the pattern expected for an `event_type`. For example, an `EventTrigger` that has an `event_type` of "google.pubsub.topic.publish" should have a resource that matches Google Cloud Pub/Sub topics. Additionally, some services may support short names when creating an `EventTrigger`. These will always be returned in the normalized "long" format. See each *service's* documentation for supported formats.
     * 
     */
    @InputImport(name="resource", required=true)
      private final Input<String> resource;

    public Input<String> getResource() {
        return this.resource;
    }

    /**
     * The hostname of the service that should be observed. If no string is provided, the default service implementing the API will be used. For example, `storage.googleapis.com` is the default for all event types in the `google.storage` namespace.
     * 
     */
    @InputImport(name="service")
      private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public EventTriggerArgs(
        Input<String> eventType,
        @Nullable Input<FailurePolicyArgs> failurePolicy,
        Input<String> resource,
        @Nullable Input<String> service) {
        this.eventType = Objects.requireNonNull(eventType, "expected parameter 'eventType' to be non-null");
        this.failurePolicy = failurePolicy;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.service = service;
    }

    private EventTriggerArgs() {
        this.eventType = Input.empty();
        this.failurePolicy = Input.empty();
        this.resource = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> eventType;
        private @Nullable Input<FailurePolicyArgs> failurePolicy;
        private Input<String> resource;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.failurePolicy = defaults.failurePolicy;
    	      this.resource = defaults.resource;
    	      this.service = defaults.service;
        }

        public Builder setEventType(Input<String> eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }

        public Builder setEventType(String eventType) {
            this.eventType = Input.of(Objects.requireNonNull(eventType));
            return this;
        }

        public Builder setFailurePolicy(@Nullable Input<FailurePolicyArgs> failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }

        public Builder setFailurePolicy(@Nullable FailurePolicyArgs failurePolicy) {
            this.failurePolicy = Input.ofNullable(failurePolicy);
            return this;
        }

        public Builder setResource(Input<String> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = Input.of(Objects.requireNonNull(resource));
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }
        public EventTriggerArgs build() {
            return new EventTriggerArgs(eventType, failurePolicy, resource, service);
        }
    }
}