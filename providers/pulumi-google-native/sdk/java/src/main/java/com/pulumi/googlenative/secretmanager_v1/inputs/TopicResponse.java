// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A Pub/Sub topic which Secret Manager will publish to when control plane events occur on this secret.
 * 
 */
public final class TopicResponse extends com.pulumi.resources.InvokeArgs {

    public static final TopicResponse Empty = new TopicResponse();

    /**
     * The resource name of the Pub/Sub topic that will be published to, in the following format: `projects/*{@literal /}topics/*`. For publication to succeed, the Secret Manager P4SA must have `pubsub.publisher` permissions on the topic.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The resource name of the Pub/Sub topic that will be published to, in the following format: `projects/*{@literal /}topics/*`. For publication to succeed, the Secret Manager P4SA must have `pubsub.publisher` permissions on the topic.
     * 
     */
    public String name() {
        return this.name;
    }

    private TopicResponse() {}

    private TopicResponse(TopicResponse $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicResponse $;

        public Builder() {
            $ = new TopicResponse();
        }

        public Builder(TopicResponse defaults) {
            $ = new TopicResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The resource name of the Pub/Sub topic that will be published to, in the following format: `projects/*{@literal /}topics/*`. For publication to succeed, the Secret Manager P4SA must have `pubsub.publisher` permissions on the topic.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public TopicResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
