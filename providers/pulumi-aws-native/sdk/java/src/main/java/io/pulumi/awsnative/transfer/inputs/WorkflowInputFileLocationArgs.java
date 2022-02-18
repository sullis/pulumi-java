// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.inputs;

import io.pulumi.awsnative.transfer.inputs.WorkflowS3InputFileLocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the location for the file being copied. Only applicable for the Copy type of workflow steps.
 * 
 */
public final class WorkflowInputFileLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowInputFileLocationArgs Empty = new WorkflowInputFileLocationArgs();

    @InputImport(name="s3FileLocation")
    private final @Nullable Input<WorkflowS3InputFileLocationArgs> s3FileLocation;

    public Input<WorkflowS3InputFileLocationArgs> getS3FileLocation() {
        return this.s3FileLocation == null ? Input.empty() : this.s3FileLocation;
    }

    public WorkflowInputFileLocationArgs(@Nullable Input<WorkflowS3InputFileLocationArgs> s3FileLocation) {
        this.s3FileLocation = s3FileLocation;
    }

    private WorkflowInputFileLocationArgs() {
        this.s3FileLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowInputFileLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkflowS3InputFileLocationArgs> s3FileLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowInputFileLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3FileLocation = defaults.s3FileLocation;
        }

        public Builder setS3FileLocation(@Nullable Input<WorkflowS3InputFileLocationArgs> s3FileLocation) {
            this.s3FileLocation = s3FileLocation;
            return this;
        }

        public Builder setS3FileLocation(@Nullable WorkflowS3InputFileLocationArgs s3FileLocation) {
            this.s3FileLocation = Input.ofNullable(s3FileLocation);
            return this;
        }

        public WorkflowInputFileLocationArgs build() {
            return new WorkflowInputFileLocationArgs(s3FileLocation);
        }
    }
}
