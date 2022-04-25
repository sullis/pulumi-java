// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.inputs.ApprovalConfigResponse;
import com.pulumi.googlenative.cloudbuild_v1.inputs.ApprovalResultResponse;
import java.lang.String;
import java.util.Objects;


/**
 * BuildApproval describes a build&#39;s approval configuration, state, and result.
 * 
 */
public final class BuildApprovalResponse extends com.pulumi.resources.InvokeArgs {

    public static final BuildApprovalResponse Empty = new BuildApprovalResponse();

    /**
     * Configuration for manual approval of this build.
     * 
     */
    @Import(name="config", required=true)
    private ApprovalConfigResponse config;

    /**
     * @return Configuration for manual approval of this build.
     * 
     */
    public ApprovalConfigResponse config() {
        return this.config;
    }

    /**
     * Result of manual approval for this Build.
     * 
     */
    @Import(name="result", required=true)
    private ApprovalResultResponse result;

    /**
     * @return Result of manual approval for this Build.
     * 
     */
    public ApprovalResultResponse result() {
        return this.result;
    }

    /**
     * The state of this build&#39;s approval.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    /**
     * @return The state of this build&#39;s approval.
     * 
     */
    public String state() {
        return this.state;
    }

    private BuildApprovalResponse() {}

    private BuildApprovalResponse(BuildApprovalResponse $) {
        this.config = $.config;
        this.result = $.result;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildApprovalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildApprovalResponse $;

        public Builder() {
            $ = new BuildApprovalResponse();
        }

        public Builder(BuildApprovalResponse defaults) {
            $ = new BuildApprovalResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param config Configuration for manual approval of this build.
         * 
         * @return builder
         * 
         */
        public Builder config(ApprovalConfigResponse config) {
            $.config = config;
            return this;
        }

        /**
         * @param result Result of manual approval for this Build.
         * 
         * @return builder
         * 
         */
        public Builder result(ApprovalResultResponse result) {
            $.result = result;
            return this;
        }

        /**
         * @param state The state of this build&#39;s approval.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public BuildApprovalResponse build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            $.result = Objects.requireNonNull($.result, "expected parameter 'result' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
