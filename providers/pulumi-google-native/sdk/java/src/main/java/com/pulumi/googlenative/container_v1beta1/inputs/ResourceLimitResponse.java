// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about amount of some resource in the cluster. For memory, value should be in GB.
 * 
 */
public final class ResourceLimitResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceLimitResponse Empty = new ResourceLimitResponse();

    /**
     * Maximum amount of the resource in the cluster.
     * 
     */
    @Import(name="maximum", required=true)
    private String maximum;

    /**
     * @return Maximum amount of the resource in the cluster.
     * 
     */
    public String maximum() {
        return this.maximum;
    }

    /**
     * Minimum amount of the resource in the cluster.
     * 
     */
    @Import(name="minimum", required=true)
    private String minimum;

    /**
     * @return Minimum amount of the resource in the cluster.
     * 
     */
    public String minimum() {
        return this.minimum;
    }

    /**
     * Resource name &#34;cpu&#34;, &#34;memory&#34; or gpu-specific string.
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return Resource name &#34;cpu&#34;, &#34;memory&#34; or gpu-specific string.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    private ResourceLimitResponse() {}

    private ResourceLimitResponse(ResourceLimitResponse $) {
        this.maximum = $.maximum;
        this.minimum = $.minimum;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceLimitResponse $;

        public Builder() {
            $ = new ResourceLimitResponse();
        }

        public Builder(ResourceLimitResponse defaults) {
            $ = new ResourceLimitResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param maximum Maximum amount of the resource in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder maximum(String maximum) {
            $.maximum = maximum;
            return this;
        }

        /**
         * @param minimum Minimum amount of the resource in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder minimum(String minimum) {
            $.minimum = minimum;
            return this;
        }

        /**
         * @param resourceType Resource name &#34;cpu&#34;, &#34;memory&#34; or gpu-specific string.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public ResourceLimitResponse build() {
            $.maximum = Objects.requireNonNull($.maximum, "expected parameter 'maximum' to be non-null");
            $.minimum = Objects.requireNonNull($.minimum, "expected parameter 'minimum' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
