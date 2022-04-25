// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MetricStreamIncludeFilterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricStreamIncludeFilterGetArgs Empty = new MetricStreamIncludeFilterGetArgs();

    /**
     * Name of the metric namespace in the filter.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return Name of the metric namespace in the filter.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    private MetricStreamIncludeFilterGetArgs() {}

    private MetricStreamIncludeFilterGetArgs(MetricStreamIncludeFilterGetArgs $) {
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricStreamIncludeFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricStreamIncludeFilterGetArgs $;

        public Builder() {
            $ = new MetricStreamIncludeFilterGetArgs();
        }

        public Builder(MetricStreamIncludeFilterGetArgs defaults) {
            $ = new MetricStreamIncludeFilterGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace Name of the metric namespace in the filter.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Name of the metric namespace in the filter.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public MetricStreamIncludeFilterGetArgs build() {
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
