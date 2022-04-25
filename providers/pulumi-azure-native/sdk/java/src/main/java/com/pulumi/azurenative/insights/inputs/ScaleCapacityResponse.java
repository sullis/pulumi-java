// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The number of instances that can be used during this profile.
 * 
 */
public final class ScaleCapacityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScaleCapacityResponse Empty = new ScaleCapacityResponse();

    /**
     * the number of instances that will be set if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default.
     * 
     */
    @Import(name="default", required=true)
    private String default_;

    /**
     * @return the number of instances that will be set if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default.
     * 
     */
    public String default_() {
        return this.default_;
    }

    /**
     * the maximum number of instances for the resource. The actual maximum number of instances is limited by the cores that are available in the subscription.
     * 
     */
    @Import(name="maximum", required=true)
    private String maximum;

    /**
     * @return the maximum number of instances for the resource. The actual maximum number of instances is limited by the cores that are available in the subscription.
     * 
     */
    public String maximum() {
        return this.maximum;
    }

    /**
     * the minimum number of instances for the resource.
     * 
     */
    @Import(name="minimum", required=true)
    private String minimum;

    /**
     * @return the minimum number of instances for the resource.
     * 
     */
    public String minimum() {
        return this.minimum;
    }

    private ScaleCapacityResponse() {}

    private ScaleCapacityResponse(ScaleCapacityResponse $) {
        this.default_ = $.default_;
        this.maximum = $.maximum;
        this.minimum = $.minimum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScaleCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleCapacityResponse $;

        public Builder() {
            $ = new ScaleCapacityResponse();
        }

        public Builder(ScaleCapacityResponse defaults) {
            $ = new ScaleCapacityResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param default_ the number of instances that will be set if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default.
         * 
         * @return builder
         * 
         */
        public Builder default_(String default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param maximum the maximum number of instances for the resource. The actual maximum number of instances is limited by the cores that are available in the subscription.
         * 
         * @return builder
         * 
         */
        public Builder maximum(String maximum) {
            $.maximum = maximum;
            return this;
        }

        /**
         * @param minimum the minimum number of instances for the resource.
         * 
         * @return builder
         * 
         */
        public Builder minimum(String minimum) {
            $.minimum = minimum;
            return this;
        }

        public ScaleCapacityResponse build() {
            $.default_ = Objects.requireNonNull($.default_, "expected parameter 'default' to be non-null");
            $.maximum = Objects.requireNonNull($.maximum, "expected parameter 'maximum' to be non-null");
            $.minimum = Objects.requireNonNull($.minimum, "expected parameter 'minimum' to be non-null");
            return $;
        }
    }

}
