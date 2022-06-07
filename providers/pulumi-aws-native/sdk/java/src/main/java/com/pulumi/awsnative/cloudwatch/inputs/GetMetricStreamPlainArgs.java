// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudwatch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMetricStreamPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetricStreamPlainArgs Empty = new GetMetricStreamPlainArgs();

    /**
     * Name of the metric stream.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the metric stream.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetMetricStreamPlainArgs() {}

    private GetMetricStreamPlainArgs(GetMetricStreamPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetricStreamPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetricStreamPlainArgs $;

        public Builder() {
            $ = new GetMetricStreamPlainArgs();
        }

        public Builder(GetMetricStreamPlainArgs defaults) {
            $ = new GetMetricStreamPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the metric stream.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetMetricStreamPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
