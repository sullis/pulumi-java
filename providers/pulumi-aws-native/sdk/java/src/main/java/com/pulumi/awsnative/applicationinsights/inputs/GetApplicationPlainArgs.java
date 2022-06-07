// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationPlainArgs Empty = new GetApplicationPlainArgs();

    /**
     * The ARN of the ApplicationInsights application.
     * 
     */
    @Import(name="applicationARN", required=true)
    private String applicationARN;

    /**
     * @return The ARN of the ApplicationInsights application.
     * 
     */
    public String applicationARN() {
        return this.applicationARN;
    }

    private GetApplicationPlainArgs() {}

    private GetApplicationPlainArgs(GetApplicationPlainArgs $) {
        this.applicationARN = $.applicationARN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationPlainArgs $;

        public Builder() {
            $ = new GetApplicationPlainArgs();
        }

        public Builder(GetApplicationPlainArgs defaults) {
            $ = new GetApplicationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationARN The ARN of the ApplicationInsights application.
         * 
         * @return builder
         * 
         */
        public Builder applicationARN(String applicationARN) {
            $.applicationARN = applicationARN;
            return this;
        }

        public GetApplicationPlainArgs build() {
            $.applicationARN = Objects.requireNonNull($.applicationARN, "expected parameter 'applicationARN' to be non-null");
            return $;
        }
    }

}
