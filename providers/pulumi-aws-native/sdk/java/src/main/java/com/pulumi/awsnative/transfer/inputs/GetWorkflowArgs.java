// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.transfer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkflowArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkflowArgs Empty = new GetWorkflowArgs();

    /**
     * A unique identifier for the workflow.
     * 
     */
    @Import(name="workflowId", required=true)
    private String workflowId;

    /**
     * @return A unique identifier for the workflow.
     * 
     */
    public String workflowId() {
        return this.workflowId;
    }

    private GetWorkflowArgs() {}

    private GetWorkflowArgs(GetWorkflowArgs $) {
        this.workflowId = $.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkflowArgs $;

        public Builder() {
            $ = new GetWorkflowArgs();
        }

        public Builder(GetWorkflowArgs defaults) {
            $ = new GetWorkflowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param workflowId A unique identifier for the workflow.
         * 
         * @return builder
         * 
         */
        public Builder workflowId(String workflowId) {
            $.workflowId = workflowId;
            return this;
        }

        public GetWorkflowArgs build() {
            $.workflowId = Objects.requireNonNull($.workflowId, "expected parameter 'workflowId' to be non-null");
            return $;
        }
    }

}
