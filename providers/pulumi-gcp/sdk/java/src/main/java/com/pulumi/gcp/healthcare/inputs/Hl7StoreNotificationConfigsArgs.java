// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Hl7StoreNotificationConfigsArgs extends com.pulumi.resources.ResourceArgs {

    public static final Hl7StoreNotificationConfigsArgs Empty = new Hl7StoreNotificationConfigsArgs();

    /**
     * Restricts notifications sent for messages matching a filter. If this is empty, all messages
     * are matched. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings
     * Fields/functions available for filtering are:
     * * messageType, from the MSH-9.1 field. For example, NOT messageType = &#34;ADT&#34;.
     * * send_date or sendDate, the YYYY-MM-DD date the message was sent in the dataset&#39;s timeZone, from the MSH-7 segment. For example, send_date &lt; &#34;2017-01-02&#34;.
     * * sendTime, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, sendTime &lt; &#34;2017-01-02T00:00:00-05:00&#34;.
     * * sendFacility, the care center that the message came from, from the MSH-4 segment. For example, sendFacility = &#34;ABC&#34;.
     * * PatientId(value, type), which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, PatientId(&#34;123456&#34;, &#34;MRN&#34;).
     * * labels.x, a string value of the label with key x as set using the Message.labels map. For example, labels.&#34;priority&#34;=&#34;high&#34;. The operator :* can be used to assert the existence of a label. For example, labels.&#34;priority&#34;:*.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return Restricts notifications sent for messages matching a filter. If this is empty, all messages
     * are matched. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings
     * Fields/functions available for filtering are:
     * * messageType, from the MSH-9.1 field. For example, NOT messageType = &#34;ADT&#34;.
     * * send_date or sendDate, the YYYY-MM-DD date the message was sent in the dataset&#39;s timeZone, from the MSH-7 segment. For example, send_date &lt; &#34;2017-01-02&#34;.
     * * sendTime, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, sendTime &lt; &#34;2017-01-02T00:00:00-05:00&#34;.
     * * sendFacility, the care center that the message came from, from the MSH-4 segment. For example, sendFacility = &#34;ABC&#34;.
     * * PatientId(value, type), which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, PatientId(&#34;123456&#34;, &#34;MRN&#34;).
     * * labels.x, a string value of the label with key x as set using the Message.labels map. For example, labels.&#34;priority&#34;=&#34;high&#34;. The operator :* can be used to assert the existence of a label. For example, labels.&#34;priority&#34;:*.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
     * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
     * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
     * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
     * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
     * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
     * 
     */
    @Import(name="pubsubTopic", required=true)
    private Output<String> pubsubTopic;

    /**
     * @return The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
     * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
     * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
     * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
     * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
     * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
     * 
     */
    public Output<String> pubsubTopic() {
        return this.pubsubTopic;
    }

    private Hl7StoreNotificationConfigsArgs() {}

    private Hl7StoreNotificationConfigsArgs(Hl7StoreNotificationConfigsArgs $) {
        this.filter = $.filter;
        this.pubsubTopic = $.pubsubTopic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Hl7StoreNotificationConfigsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Hl7StoreNotificationConfigsArgs $;

        public Builder() {
            $ = new Hl7StoreNotificationConfigsArgs();
        }

        public Builder(Hl7StoreNotificationConfigsArgs defaults) {
            $ = new Hl7StoreNotificationConfigsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter Restricts notifications sent for messages matching a filter. If this is empty, all messages
         * are matched. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings
         * Fields/functions available for filtering are:
         * * messageType, from the MSH-9.1 field. For example, NOT messageType = &#34;ADT&#34;.
         * * send_date or sendDate, the YYYY-MM-DD date the message was sent in the dataset&#39;s timeZone, from the MSH-7 segment. For example, send_date &lt; &#34;2017-01-02&#34;.
         * * sendTime, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, sendTime &lt; &#34;2017-01-02T00:00:00-05:00&#34;.
         * * sendFacility, the care center that the message came from, from the MSH-4 segment. For example, sendFacility = &#34;ABC&#34;.
         * * PatientId(value, type), which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, PatientId(&#34;123456&#34;, &#34;MRN&#34;).
         * * labels.x, a string value of the label with key x as set using the Message.labels map. For example, labels.&#34;priority&#34;=&#34;high&#34;. The operator :* can be used to assert the existence of a label. For example, labels.&#34;priority&#34;:*.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Restricts notifications sent for messages matching a filter. If this is empty, all messages
         * are matched. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings
         * Fields/functions available for filtering are:
         * * messageType, from the MSH-9.1 field. For example, NOT messageType = &#34;ADT&#34;.
         * * send_date or sendDate, the YYYY-MM-DD date the message was sent in the dataset&#39;s timeZone, from the MSH-7 segment. For example, send_date &lt; &#34;2017-01-02&#34;.
         * * sendTime, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, sendTime &lt; &#34;2017-01-02T00:00:00-05:00&#34;.
         * * sendFacility, the care center that the message came from, from the MSH-4 segment. For example, sendFacility = &#34;ABC&#34;.
         * * PatientId(value, type), which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, PatientId(&#34;123456&#34;, &#34;MRN&#34;).
         * * labels.x, a string value of the label with key x as set using the Message.labels map. For example, labels.&#34;priority&#34;=&#34;high&#34;. The operator :* can be used to assert the existence of a label. For example, labels.&#34;priority&#34;:*.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param pubsubTopic The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
         * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
         * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
         * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
         * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
         * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(Output<String> pubsubTopic) {
            $.pubsubTopic = pubsubTopic;
            return this;
        }

        /**
         * @param pubsubTopic The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
         * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
         * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
         * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
         * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
         * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(String pubsubTopic) {
            return pubsubTopic(Output.of(pubsubTopic));
        }

        public Hl7StoreNotificationConfigsArgs build() {
            $.pubsubTopic = Objects.requireNonNull($.pubsubTopic, "expected parameter 'pubsubTopic' to be non-null");
            return $;
        }
    }

}
