// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterNotificationConfigPubsubGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNotificationConfigPubsubGetArgs Empty = new ClusterNotificationConfigPubsubGetArgs();

    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The pubsub topic to push upgrade notifications to. Must be in the same project as the cluster. Must be in the format: `projects/{project}/topics/{topic}`.
     * 
     */
    @Import(name="topic")
    private @Nullable Output<String> topic;

    /**
     * @return The pubsub topic to push upgrade notifications to. Must be in the same project as the cluster. Must be in the format: `projects/{project}/topics/{topic}`.
     * 
     */
    public Optional<Output<String>> topic() {
        return Optional.ofNullable(this.topic);
    }

    private ClusterNotificationConfigPubsubGetArgs() {}

    private ClusterNotificationConfigPubsubGetArgs(ClusterNotificationConfigPubsubGetArgs $) {
        this.enabled = $.enabled;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNotificationConfigPubsubGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNotificationConfigPubsubGetArgs $;

        public Builder() {
            $ = new ClusterNotificationConfigPubsubGetArgs();
        }

        public Builder(ClusterNotificationConfigPubsubGetArgs defaults) {
            $ = new ClusterNotificationConfigPubsubGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable the PodSecurityPolicy controller for this cluster.
         * If enabled, pods must be valid under a PodSecurityPolicy to be created.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable the PodSecurityPolicy controller for this cluster.
         * If enabled, pods must be valid under a PodSecurityPolicy to be created.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param topic The pubsub topic to push upgrade notifications to. Must be in the same project as the cluster. Must be in the format: `projects/{project}/topics/{topic}`.
         * 
         * @return builder
         * 
         */
        public Builder topic(@Nullable Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic The pubsub topic to push upgrade notifications to. Must be in the same project as the cluster. Must be in the format: `projects/{project}/topics/{topic}`.
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public ClusterNotificationConfigPubsubGetArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
