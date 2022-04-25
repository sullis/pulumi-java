// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1NotificationConfigResponse {
    /**
     * @return Format of message.
     * 
     */
    private final String messageFormat;
    /**
     * @return Name of the Pub/Sub topic to publish conversation events like CONVERSATION_STARTED as serialized ConversationEvent protos. Notification works for phone calls, if this topic either is in the same project as the conversation or you grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service Agent` role in the topic project. Format: `projects//locations//topics/`.
     * 
     */
    private final String topic;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1NotificationConfigResponse(
        @CustomType.Parameter("messageFormat") String messageFormat,
        @CustomType.Parameter("topic") String topic) {
        this.messageFormat = messageFormat;
        this.topic = topic;
    }

    /**
     * @return Format of message.
     * 
     */
    public String messageFormat() {
        return this.messageFormat;
    }
    /**
     * @return Name of the Pub/Sub topic to publish conversation events like CONVERSATION_STARTED as serialized ConversationEvent protos. Notification works for phone calls, if this topic either is in the same project as the conversation or you grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service Agent` role in the topic project. Format: `projects//locations//topics/`.
     * 
     */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1NotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageFormat;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1NotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.topic = defaults.topic;
        }

        public Builder messageFormat(String messageFormat) {
            this.messageFormat = Objects.requireNonNull(messageFormat);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public GoogleCloudDialogflowV2beta1NotificationConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1NotificationConfigResponse(messageFormat, topic);
        }
    }
}
