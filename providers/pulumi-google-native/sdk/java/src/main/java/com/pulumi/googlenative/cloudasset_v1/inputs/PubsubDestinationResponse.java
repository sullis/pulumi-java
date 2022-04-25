// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A Pub/Sub destination.
 * 
 */
public final class PubsubDestinationResponse extends com.pulumi.resources.InvokeArgs {

    public static final PubsubDestinationResponse Empty = new PubsubDestinationResponse();

    /**
     * The name of the Pub/Sub topic to publish to. Example: `projects/PROJECT_ID/topics/TOPIC_ID`.
     * 
     */
    @Import(name="topic", required=true)
    private String topic;

    /**
     * @return The name of the Pub/Sub topic to publish to. Example: `projects/PROJECT_ID/topics/TOPIC_ID`.
     * 
     */
    public String topic() {
        return this.topic;
    }

    private PubsubDestinationResponse() {}

    private PubsubDestinationResponse(PubsubDestinationResponse $) {
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PubsubDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PubsubDestinationResponse $;

        public Builder() {
            $ = new PubsubDestinationResponse();
        }

        public Builder(PubsubDestinationResponse defaults) {
            $ = new PubsubDestinationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param topic The name of the Pub/Sub topic to publish to. Example: `projects/PROJECT_ID/topics/TOPIC_ID`.
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            $.topic = topic;
            return this;
        }

        public PubsubDestinationResponse build() {
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}
