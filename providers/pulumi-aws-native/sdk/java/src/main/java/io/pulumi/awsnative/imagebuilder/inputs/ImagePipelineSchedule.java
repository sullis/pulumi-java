// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.enums.ImagePipelineSchedulePipelineExecutionStartCondition;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The schedule of the image pipeline.
 * 
 */
public final class ImagePipelineSchedule extends io.pulumi.resources.InvokeArgs {

    public static final ImagePipelineSchedule Empty = new ImagePipelineSchedule();

    /**
     * The condition configures when the pipeline should trigger a new image build.
     * 
     */
    @Import(name="pipelineExecutionStartCondition")
      private final @Nullable ImagePipelineSchedulePipelineExecutionStartCondition pipelineExecutionStartCondition;

    public Optional<ImagePipelineSchedulePipelineExecutionStartCondition> pipelineExecutionStartCondition() {
        return this.pipelineExecutionStartCondition == null ? Optional.empty() : Optional.ofNullable(this.pipelineExecutionStartCondition);
    }

    /**
     * The expression determines how often EC2 Image Builder evaluates your pipelineExecutionStartCondition.
     * 
     */
    @Import(name="scheduleExpression")
      private final @Nullable String scheduleExpression;

    public Optional<String> scheduleExpression() {
        return this.scheduleExpression == null ? Optional.empty() : Optional.ofNullable(this.scheduleExpression);
    }

    public ImagePipelineSchedule(
        @Nullable ImagePipelineSchedulePipelineExecutionStartCondition pipelineExecutionStartCondition,
        @Nullable String scheduleExpression) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
        this.scheduleExpression = scheduleExpression;
    }

    private ImagePipelineSchedule() {
        this.pipelineExecutionStartCondition = null;
        this.scheduleExpression = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ImagePipelineSchedulePipelineExecutionStartCondition pipelineExecutionStartCondition;
        private @Nullable String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineExecutionStartCondition = defaults.pipelineExecutionStartCondition;
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder pipelineExecutionStartCondition(@Nullable ImagePipelineSchedulePipelineExecutionStartCondition pipelineExecutionStartCondition) {
            this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
            return this;
        }
        public Builder scheduleExpression(@Nullable String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }        public ImagePipelineSchedule build() {
            return new ImagePipelineSchedule(pipelineExecutionStartCondition, scheduleExpression);
        }
    }
}
