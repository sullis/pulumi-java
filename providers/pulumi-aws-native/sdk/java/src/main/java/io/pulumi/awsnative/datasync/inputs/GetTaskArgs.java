// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTaskArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTaskArgs Empty = new GetTaskArgs();

    @InputImport(name="taskArn", required=true)
    private final String taskArn;

    public String getTaskArn() {
        return this.taskArn;
    }

    public GetTaskArgs(String taskArn) {
        this.taskArn = Objects.requireNonNull(taskArn, "expected parameter 'taskArn' to be non-null");
    }

    private GetTaskArgs() {
        this.taskArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String taskArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.taskArn = defaults.taskArn;
        }

        public Builder setTaskArn(String taskArn) {
            this.taskArn = Objects.requireNonNull(taskArn);
            return this;
        }

        public GetTaskArgs build() {
            return new GetTaskArgs(taskArn);
        }
    }
}
