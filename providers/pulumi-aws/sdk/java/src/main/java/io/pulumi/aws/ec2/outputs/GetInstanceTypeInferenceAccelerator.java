// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceTypeInferenceAccelerator {
    private final Integer count;
    private final String manufacturer;
    private final String name;

    @CustomType.Constructor
    private GetInstanceTypeInferenceAccelerator(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("manufacturer") String manufacturer,
        @CustomType.Parameter("name") String name) {
        this.count = count;
        this.manufacturer = manufacturer;
        this.name = name;
    }

    public Integer count() {
        return this.count;
    }
    public String manufacturer() {
        return this.manufacturer;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeInferenceAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String manufacturer;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTypeInferenceAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.manufacturer = defaults.manufacturer;
    	      this.name = defaults.name;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder manufacturer(String manufacturer) {
            this.manufacturer = Objects.requireNonNull(manufacturer);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetInstanceTypeInferenceAccelerator build() {
            return new GetInstanceTypeInferenceAccelerator(count, manufacturer, name);
        }
    }
}
