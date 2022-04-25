// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.eventarc_v1.inputs.DestinationArgs;
import com.pulumi.googlenative.eventarc_v1.inputs.EventFilterArgs;
import com.pulumi.googlenative.eventarc_v1.inputs.TransportArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * Destination specifies where the events should be sent to.
     * 
     */
    @Import(name="destination", required=true)
    private Output<DestinationArgs> destination;

    /**
     * @return Destination specifies where the events should be sent to.
     * 
     */
    public Output<DestinationArgs> destination() {
        return this.destination;
    }

    /**
     * null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
     * 
     */
    @Import(name="eventFilters", required=true)
    private Output<List<EventFilterArgs>> eventFilters;

    /**
     * @return null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
     * 
     */
    public Output<List<EventFilterArgs>> eventFilters() {
        return this.eventFilters;
    }

    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    @Import(name="transport")
    private @Nullable Output<TransportArgs> transport;

    /**
     * @return Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    public Optional<Output<TransportArgs>> transport() {
        return Optional.ofNullable(this.transport);
    }

    @Import(name="triggerId", required=true)
    private Output<String> triggerId;

    public Output<String> triggerId() {
        return this.triggerId;
    }

    @Import(name="validateOnly", required=true)
    private Output<String> validateOnly;

    public Output<String> validateOnly() {
        return this.validateOnly;
    }

    private TriggerArgs() {}

    private TriggerArgs(TriggerArgs $) {
        this.destination = $.destination;
        this.eventFilters = $.eventFilters;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.serviceAccount = $.serviceAccount;
        this.transport = $.transport;
        this.triggerId = $.triggerId;
        this.validateOnly = $.validateOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerArgs $;

        public Builder() {
            $ = new TriggerArgs();
        }

        public Builder(TriggerArgs defaults) {
            $ = new TriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination Destination specifies where the events should be sent to.
         * 
         * @return builder
         * 
         */
        public Builder destination(Output<DestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Destination specifies where the events should be sent to.
         * 
         * @return builder
         * 
         */
        public Builder destination(DestinationArgs destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param eventFilters null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
         * 
         * @return builder
         * 
         */
        public Builder eventFilters(Output<List<EventFilterArgs>> eventFilters) {
            $.eventFilters = eventFilters;
            return this;
        }

        /**
         * @param eventFilters null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
         * 
         * @return builder
         * 
         */
        public Builder eventFilters(List<EventFilterArgs> eventFilters) {
            return eventFilters(Output.of(eventFilters));
        }

        /**
         * @param eventFilters null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
         * 
         * @return builder
         * 
         */
        public Builder eventFilters(EventFilterArgs... eventFilters) {
            return eventFilters(List.of(eventFilters));
        }

        /**
         * @param labels Optional. User labels attached to the triggers that can be used to group resources.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. User labels attached to the triggers that can be used to group resources.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceAccount Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param transport Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
         * 
         * @return builder
         * 
         */
        public Builder transport(@Nullable Output<TransportArgs> transport) {
            $.transport = transport;
            return this;
        }

        /**
         * @param transport Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
         * 
         * @return builder
         * 
         */
        public Builder transport(TransportArgs transport) {
            return transport(Output.of(transport));
        }

        public Builder triggerId(Output<String> triggerId) {
            $.triggerId = triggerId;
            return this;
        }

        public Builder triggerId(String triggerId) {
            return triggerId(Output.of(triggerId));
        }

        public Builder validateOnly(Output<String> validateOnly) {
            $.validateOnly = validateOnly;
            return this;
        }

        public Builder validateOnly(String validateOnly) {
            return validateOnly(Output.of(validateOnly));
        }

        public TriggerArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.eventFilters = Objects.requireNonNull($.eventFilters, "expected parameter 'eventFilters' to be non-null");
            $.triggerId = Objects.requireNonNull($.triggerId, "expected parameter 'triggerId' to be non-null");
            $.validateOnly = Objects.requireNonNull($.validateOnly, "expected parameter 'validateOnly' to be non-null");
            return $;
        }
    }

}
