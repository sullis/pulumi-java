// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.cloudasset.outputs.ProjectFeedFeedOutputConfigPubsubDestination;
import java.util.Objects;

@OutputCustomType
public final class ProjectFeedFeedOutputConfig {
    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    private final ProjectFeedFeedOutputConfigPubsubDestination pubsubDestination;

    @OutputCustomType.Constructor({"pubsubDestination"})
    private ProjectFeedFeedOutputConfig(ProjectFeedFeedOutputConfigPubsubDestination pubsubDestination) {
        this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
    }

    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    public ProjectFeedFeedOutputConfigPubsubDestination getPubsubDestination() {
        return this.pubsubDestination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFeedFeedOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectFeedFeedOutputConfigPubsubDestination pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFeedFeedOutputConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder setPubsubDestination(ProjectFeedFeedOutputConfigPubsubDestination pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }

        public ProjectFeedFeedOutputConfig build() {
            return new ProjectFeedFeedOutputConfig(pubsubDestination);
        }
    }
}
