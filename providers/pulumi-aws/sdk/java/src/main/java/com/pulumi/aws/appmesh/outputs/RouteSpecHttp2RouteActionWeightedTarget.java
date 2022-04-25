// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouteSpecHttp2RouteActionWeightedTarget {
    /**
     * @return The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
     * 
     */
    private final String virtualNode;
    /**
     * @return The relative weight of the weighted target. An integer between 0 and 100.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private RouteSpecHttp2RouteActionWeightedTarget(
        @CustomType.Parameter("virtualNode") String virtualNode,
        @CustomType.Parameter("weight") Integer weight) {
        this.virtualNode = virtualNode;
        this.weight = weight;
    }

    /**
     * @return The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
     * 
     */
    public String virtualNode() {
        return this.virtualNode;
    }
    /**
     * @return The relative weight of the weighted target. An integer between 0 and 100.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteActionWeightedTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String virtualNode;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteActionWeightedTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNode = defaults.virtualNode;
    	      this.weight = defaults.weight;
        }

        public Builder virtualNode(String virtualNode) {
            this.virtualNode = Objects.requireNonNull(virtualNode);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public RouteSpecHttp2RouteActionWeightedTarget build() {
            return new RouteSpecHttp2RouteActionWeightedTarget(virtualNode, weight);
        }
    }
}
