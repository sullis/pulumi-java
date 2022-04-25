// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DicomStoreNotificationConfig {
    /**
     * @return The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
     * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
     * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
     * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
     * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
     * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
     * 
     */
    private final String pubsubTopic;

    @CustomType.Constructor
    private DicomStoreNotificationConfig(@CustomType.Parameter("pubsubTopic") String pubsubTopic) {
        this.pubsubTopic = pubsubTopic;
    }

    /**
     * @return The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
     * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
     * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
     * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
     * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
     * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
     * 
     */
    public String pubsubTopic() {
        return this.pubsubTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreNotificationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pubsubTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreNotificationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopic = defaults.pubsubTopic;
        }

        public Builder pubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }        public DicomStoreNotificationConfig build() {
            return new DicomStoreNotificationConfig(pubsubTopic);
        }
    }
}
