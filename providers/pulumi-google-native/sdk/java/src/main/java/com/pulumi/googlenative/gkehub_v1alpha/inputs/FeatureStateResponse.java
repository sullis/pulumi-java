// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * FeatureState describes the high-level state of a Feature. It may be used to describe a Feature&#39;s state at the environ-level, or per-membershop, depending on the context.
 * 
 */
public final class FeatureStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final FeatureStateResponse Empty = new FeatureStateResponse();

    /**
     * The high-level, machine-readable status of this Feature.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    /**
     * @return The high-level, machine-readable status of this Feature.
     * 
     */
    public String code() {
        return this.code;
    }

    /**
     * A human-readable description of the current status.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return A human-readable description of the current status.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * The time this status and any related Feature-specific details were updated.
     * 
     */
    @Import(name="updateTime", required=true)
    private String updateTime;

    /**
     * @return The time this status and any related Feature-specific details were updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    private FeatureStateResponse() {}

    private FeatureStateResponse(FeatureStateResponse $) {
        this.code = $.code;
        this.description = $.description;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureStateResponse $;

        public Builder() {
            $ = new FeatureStateResponse();
        }

        public Builder(FeatureStateResponse defaults) {
            $ = new FeatureStateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The high-level, machine-readable status of this Feature.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            $.code = code;
            return this;
        }

        /**
         * @param description A human-readable description of the current status.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param updateTime The time this status and any related Feature-specific details were updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public FeatureStateResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            return $;
        }
    }

}
