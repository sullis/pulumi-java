// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouteSpecGrpcRouteRetryPolicyPerRetryTimeout {
    /**
     * Retry unit. Valid values: `ms`, `s`.
     * 
     */
    private final String unit;
    /**
     * Retry value.
     * 
     */
    private final Integer value;

    @CustomType.Constructor
    private RouteSpecGrpcRouteRetryPolicyPerRetryTimeout(
        @CustomType.Parameter("unit") String unit,
        @CustomType.Parameter("value") Integer value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Retry unit. Valid values: `ms`, `s`.
     * 
    */
    public String unit() {
        return this.unit;
    }
    /**
     * Retry value.
     * 
    */
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteRetryPolicyPerRetryTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String unit;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteRetryPolicyPerRetryTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public RouteSpecGrpcRouteRetryPolicyPerRetryTimeout build() {
            return new RouteSpecGrpcRouteRetryPolicyPerRetryTimeout(unit, value);
        }
    }
}
