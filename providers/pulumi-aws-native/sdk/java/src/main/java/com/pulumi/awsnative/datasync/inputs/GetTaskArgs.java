// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTaskArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTaskArgs Empty = new GetTaskArgs();

    /**
     * The ARN of the task.
     * 
     */
    @Import(name="taskArn", required=true)
    private Output<String> taskArn;

    /**
     * @return The ARN of the task.
     * 
     */
    public Output<String> taskArn() {
        return this.taskArn;
    }

    private GetTaskArgs() {}

    private GetTaskArgs(GetTaskArgs $) {
        this.taskArn = $.taskArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTaskArgs $;

        public Builder() {
            $ = new GetTaskArgs();
        }

        public Builder(GetTaskArgs defaults) {
            $ = new GetTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param taskArn The ARN of the task.
         * 
         * @return builder
         * 
         */
        public Builder taskArn(Output<String> taskArn) {
            $.taskArn = taskArn;
            return this;
        }

        /**
         * @param taskArn The ARN of the task.
         * 
         * @return builder
         * 
         */
        public Builder taskArn(String taskArn) {
            return taskArn(Output.of(taskArn));
        }

        public GetTaskArgs build() {
            $.taskArn = Objects.requireNonNull($.taskArn, "expected parameter 'taskArn' to be non-null");
            return $;
        }
    }

}
