// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReadinessCheckArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReadinessCheckArgs Empty = new GetReadinessCheckArgs();

    /**
     * Name of the ReadinessCheck to create.
     * 
     */
    @Import(name="readinessCheckName", required=true)
    private Output<String> readinessCheckName;

    /**
     * @return Name of the ReadinessCheck to create.
     * 
     */
    public Output<String> readinessCheckName() {
        return this.readinessCheckName;
    }

    private GetReadinessCheckArgs() {}

    private GetReadinessCheckArgs(GetReadinessCheckArgs $) {
        this.readinessCheckName = $.readinessCheckName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReadinessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReadinessCheckArgs $;

        public Builder() {
            $ = new GetReadinessCheckArgs();
        }

        public Builder(GetReadinessCheckArgs defaults) {
            $ = new GetReadinessCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param readinessCheckName Name of the ReadinessCheck to create.
         * 
         * @return builder
         * 
         */
        public Builder readinessCheckName(Output<String> readinessCheckName) {
            $.readinessCheckName = readinessCheckName;
            return this;
        }

        /**
         * @param readinessCheckName Name of the ReadinessCheck to create.
         * 
         * @return builder
         * 
         */
        public Builder readinessCheckName(String readinessCheckName) {
            return readinessCheckName(Output.of(readinessCheckName));
        }

        public GetReadinessCheckArgs build() {
            $.readinessCheckName = Objects.requireNonNull($.readinessCheckName, "expected parameter 'readinessCheckName' to be non-null");
            return $;
        }
    }

}
