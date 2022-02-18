// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigPubsubDestinationGetArgs;
import java.util.Objects;


public final class FolderFeedFeedOutputConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FolderFeedFeedOutputConfigGetArgs Empty = new FolderFeedFeedOutputConfigGetArgs();

    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    @InputImport(name="pubsubDestination", required=true)
    private final Input<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination;

    public Input<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> getPubsubDestination() {
        return this.pubsubDestination;
    }

    public FolderFeedFeedOutputConfigGetArgs(Input<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination) {
        this.pubsubDestination = Objects.requireNonNull(pubsubDestination, "expected parameter 'pubsubDestination' to be non-null");
    }

    private FolderFeedFeedOutputConfigGetArgs() {
        this.pubsubDestination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderFeedFeedOutputConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderFeedFeedOutputConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder setPubsubDestination(Input<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }

        public Builder setPubsubDestination(FolderFeedFeedOutputConfigPubsubDestinationGetArgs pubsubDestination) {
            this.pubsubDestination = Input.of(Objects.requireNonNull(pubsubDestination));
            return this;
        }

        public FolderFeedFeedOutputConfigGetArgs build() {
            return new FolderFeedFeedOutputConfigGetArgs(pubsubDestination);
        }
    }
}
