// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse Empty = new ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse();

    /**
     * The last time the schedule successfully ran. The timestamp is an RFC3339 string.
     * 
     */
    @Import(name="lastRunStartTime", required=true)
    private String lastRunStartTime;

    /**
     * @return The last time the schedule successfully ran. The timestamp is an RFC3339 string.
     * 
     */
    public String lastRunStartTime() {
        return this.lastRunStartTime;
    }

    /**
     * The next time the schedule is planned to run. The actual time might be slightly different. The timestamp is an RFC3339 string.
     * 
     */
    @Import(name="nextRunStartTime", required=true)
    private String nextRunStartTime;

    /**
     * @return The next time the schedule is planned to run. The actual time might be slightly different. The timestamp is an RFC3339 string.
     * 
     */
    public String nextRunStartTime() {
        return this.nextRunStartTime;
    }

    private ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse() {}

    private ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse $) {
        this.lastRunStartTime = $.lastRunStartTime;
        this.nextRunStartTime = $.nextRunStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse $;

        public Builder() {
            $ = new ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse();
        }

        public Builder(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse defaults) {
            $ = new ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastRunStartTime The last time the schedule successfully ran. The timestamp is an RFC3339 string.
         * 
         * @return builder
         * 
         */
        public Builder lastRunStartTime(String lastRunStartTime) {
            $.lastRunStartTime = lastRunStartTime;
            return this;
        }

        /**
         * @param nextRunStartTime The next time the schedule is planned to run. The actual time might be slightly different. The timestamp is an RFC3339 string.
         * 
         * @return builder
         * 
         */
        public Builder nextRunStartTime(String nextRunStartTime) {
            $.nextRunStartTime = nextRunStartTime;
            return this;
        }

        public ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse build() {
            $.lastRunStartTime = Objects.requireNonNull($.lastRunStartTime, "expected parameter 'lastRunStartTime' to be non-null");
            $.nextRunStartTime = Objects.requireNonNull($.nextRunStartTime, "expected parameter 'nextRunStartTime' to be non-null");
            return $;
        }
    }

}
