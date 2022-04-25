// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the cluster auto-delete schedule configuration.
 * 
 */
public final class LifecycleConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final LifecycleConfigResponse Empty = new LifecycleConfigResponse();

    /**
     * Optional. The time when cluster will be auto-deleted. (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="autoDeleteTime", required=true)
    private String autoDeleteTime;

    /**
     * @return Optional. The time when cluster will be auto-deleted. (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public String autoDeleteTime() {
        return this.autoDeleteTime;
    }

    /**
     * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="autoDeleteTtl", required=true)
    private String autoDeleteTtl;

    /**
     * @return Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public String autoDeleteTtl() {
        return this.autoDeleteTtl;
    }

    /**
     * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="idleDeleteTtl", required=true)
    private String idleDeleteTtl;

    /**
     * @return Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public String idleDeleteTtl() {
        return this.idleDeleteTtl;
    }

    /**
     * The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="idleStartTime", required=true)
    private String idleStartTime;

    /**
     * @return The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public String idleStartTime() {
        return this.idleStartTime;
    }

    private LifecycleConfigResponse() {}

    private LifecycleConfigResponse(LifecycleConfigResponse $) {
        this.autoDeleteTime = $.autoDeleteTime;
        this.autoDeleteTtl = $.autoDeleteTtl;
        this.idleDeleteTtl = $.idleDeleteTtl;
        this.idleStartTime = $.idleStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecycleConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecycleConfigResponse $;

        public Builder() {
            $ = new LifecycleConfigResponse();
        }

        public Builder(LifecycleConfigResponse defaults) {
            $ = new LifecycleConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDeleteTime Optional. The time when cluster will be auto-deleted. (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
         * 
         * @return builder
         * 
         */
        public Builder autoDeleteTime(String autoDeleteTime) {
            $.autoDeleteTime = autoDeleteTime;
            return this;
        }

        /**
         * @param autoDeleteTtl Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
         * 
         * @return builder
         * 
         */
        public Builder autoDeleteTtl(String autoDeleteTtl) {
            $.autoDeleteTtl = autoDeleteTtl;
            return this;
        }

        /**
         * @param idleDeleteTtl Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
         * 
         * @return builder
         * 
         */
        public Builder idleDeleteTtl(String idleDeleteTtl) {
            $.idleDeleteTtl = idleDeleteTtl;
            return this;
        }

        /**
         * @param idleStartTime The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
         * 
         * @return builder
         * 
         */
        public Builder idleStartTime(String idleStartTime) {
            $.idleStartTime = idleStartTime;
            return this;
        }

        public LifecycleConfigResponse build() {
            $.autoDeleteTime = Objects.requireNonNull($.autoDeleteTime, "expected parameter 'autoDeleteTime' to be non-null");
            $.autoDeleteTtl = Objects.requireNonNull($.autoDeleteTtl, "expected parameter 'autoDeleteTtl' to be non-null");
            $.idleDeleteTtl = Objects.requireNonNull($.idleDeleteTtl, "expected parameter 'idleDeleteTtl' to be non-null");
            $.idleStartTime = Objects.requireNonNull($.idleStartTime, "expected parameter 'idleStartTime' to be non-null");
            return $;
        }
    }

}
