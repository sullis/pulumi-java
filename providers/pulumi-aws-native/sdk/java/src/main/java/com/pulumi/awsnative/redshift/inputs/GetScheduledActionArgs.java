// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.redshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledActionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScheduledActionArgs Empty = new GetScheduledActionArgs();

    /**
     * The name of the scheduled action. The name must be unique within an account.
     * 
     */
    @Import(name="scheduledActionName", required=true)
    private Output<String> scheduledActionName;

    /**
     * @return The name of the scheduled action. The name must be unique within an account.
     * 
     */
    public Output<String> scheduledActionName() {
        return this.scheduledActionName;
    }

    private GetScheduledActionArgs() {}

    private GetScheduledActionArgs(GetScheduledActionArgs $) {
        this.scheduledActionName = $.scheduledActionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScheduledActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScheduledActionArgs $;

        public Builder() {
            $ = new GetScheduledActionArgs();
        }

        public Builder(GetScheduledActionArgs defaults) {
            $ = new GetScheduledActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scheduledActionName The name of the scheduled action. The name must be unique within an account.
         * 
         * @return builder
         * 
         */
        public Builder scheduledActionName(Output<String> scheduledActionName) {
            $.scheduledActionName = scheduledActionName;
            return this;
        }

        /**
         * @param scheduledActionName The name of the scheduled action. The name must be unique within an account.
         * 
         * @return builder
         * 
         */
        public Builder scheduledActionName(String scheduledActionName) {
            return scheduledActionName(Output.of(scheduledActionName));
        }

        public GetScheduledActionArgs build() {
            $.scheduledActionName = Objects.requireNonNull($.scheduledActionName, "expected parameter 'scheduledActionName' to be non-null");
            return $;
        }
    }

}
