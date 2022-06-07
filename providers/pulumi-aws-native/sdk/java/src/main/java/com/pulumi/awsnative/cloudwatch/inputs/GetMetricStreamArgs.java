// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMetricStreamArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetricStreamArgs Empty = new GetMetricStreamArgs();

    /**
     * Name of the metric stream.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the metric stream.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetMetricStreamArgs() {}

    private GetMetricStreamArgs(GetMetricStreamArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetricStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetricStreamArgs $;

        public Builder() {
            $ = new GetMetricStreamArgs();
        }

        public Builder(GetMetricStreamArgs defaults) {
            $ = new GetMetricStreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the metric stream.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the metric stream.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetMetricStreamArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
