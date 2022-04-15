// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetricStreamIncludeFilter {
    /**
     * Name of the metric namespace in the filter.
     * 
     */
    private final String namespace;

    @CustomType.Constructor
    private MetricStreamIncludeFilter(@CustomType.Parameter("namespace") String namespace) {
        this.namespace = namespace;
    }

    /**
     * Name of the metric namespace in the filter.
     * 
    */
    public String namespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamIncludeFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamIncludeFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }        public MetricStreamIncludeFilter build() {
            return new MetricStreamIncludeFilter(namespace);
        }
    }
}
