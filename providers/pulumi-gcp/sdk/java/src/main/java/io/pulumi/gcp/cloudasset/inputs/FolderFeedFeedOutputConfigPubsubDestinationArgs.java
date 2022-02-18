// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FolderFeedFeedOutputConfigPubsubDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FolderFeedFeedOutputConfigPubsubDestinationArgs Empty = new FolderFeedFeedOutputConfigPubsubDestinationArgs();

    /**
     * Destination on Cloud Pubsub topic.
     * 
     */
    @InputImport(name="topic", required=true)
    private final Input<String> topic;

    public Input<String> getTopic() {
        return this.topic;
    }

    public FolderFeedFeedOutputConfigPubsubDestinationArgs(Input<String> topic) {
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private FolderFeedFeedOutputConfigPubsubDestinationArgs() {
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderFeedFeedOutputConfigPubsubDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderFeedFeedOutputConfigPubsubDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        public Builder setTopic(Input<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Input.of(Objects.requireNonNull(topic));
            return this;
        }

        public FolderFeedFeedOutputConfigPubsubDestinationArgs build() {
            return new FolderFeedFeedOutputConfigPubsubDestinationArgs(topic);
        }
    }
}
