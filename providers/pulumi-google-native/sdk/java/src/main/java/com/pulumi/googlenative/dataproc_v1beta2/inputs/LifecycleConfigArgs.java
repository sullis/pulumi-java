// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the cluster auto-delete schedule configuration.
 * 
 */
public final class LifecycleConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecycleConfigArgs Empty = new LifecycleConfigArgs();

    /**
     * Optional. The time when cluster will be auto-deleted. (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="autoDeleteTime")
    private @Nullable Output<String> autoDeleteTime;

    /**
     * @return Optional. The time when cluster will be auto-deleted. (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public Optional<Output<String>> autoDeleteTime() {
        return Optional.ofNullable(this.autoDeleteTime);
    }

    /**
     * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="autoDeleteTtl")
    private @Nullable Output<String> autoDeleteTtl;

    /**
     * @return Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public Optional<Output<String>> autoDeleteTtl() {
        return Optional.ofNullable(this.autoDeleteTtl);
    }

    /**
     * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="idleDeleteTtl")
    private @Nullable Output<String> idleDeleteTtl;

    /**
     * @return Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public Optional<Output<String>> idleDeleteTtl() {
        return Optional.ofNullable(this.idleDeleteTtl);
    }

    private LifecycleConfigArgs() {}

    private LifecycleConfigArgs(LifecycleConfigArgs $) {
        this.autoDeleteTime = $.autoDeleteTime;
        this.autoDeleteTtl = $.autoDeleteTtl;
        this.idleDeleteTtl = $.idleDeleteTtl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecycleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecycleConfigArgs $;

        public Builder() {
            $ = new LifecycleConfigArgs();
        }

        public Builder(LifecycleConfigArgs defaults) {
            $ = new LifecycleConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDeleteTime Optional. The time when cluster will be auto-deleted. (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
         * 
         * @return builder
         * 
         */
        public Builder autoDeleteTime(@Nullable Output<String> autoDeleteTime) {
            $.autoDeleteTime = autoDeleteTime;
            return this;
        }

        /**
         * @param autoDeleteTime Optional. The time when cluster will be auto-deleted. (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
         * 
         * @return builder
         * 
         */
        public Builder autoDeleteTime(String autoDeleteTime) {
            return autoDeleteTime(Output.of(autoDeleteTime));
        }

        /**
         * @param autoDeleteTtl Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
         * 
         * @return builder
         * 
         */
        public Builder autoDeleteTtl(@Nullable Output<String> autoDeleteTtl) {
            $.autoDeleteTtl = autoDeleteTtl;
            return this;
        }

        /**
         * @param autoDeleteTtl Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
         * 
         * @return builder
         * 
         */
        public Builder autoDeleteTtl(String autoDeleteTtl) {
            return autoDeleteTtl(Output.of(autoDeleteTtl));
        }

        /**
         * @param idleDeleteTtl Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
         * 
         * @return builder
         * 
         */
        public Builder idleDeleteTtl(@Nullable Output<String> idleDeleteTtl) {
            $.idleDeleteTtl = idleDeleteTtl;
            return this;
        }

        /**
         * @param idleDeleteTtl Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
         * 
         * @return builder
         * 
         */
        public Builder idleDeleteTtl(String idleDeleteTtl) {
            return idleDeleteTtl(Output.of(idleDeleteTtl));
        }

        public LifecycleConfigArgs build() {
            return $;
        }
    }

}
