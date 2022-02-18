// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetModelBiasJobDefinitionResult {
    /**
     * The time at which the job definition was created.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    private final @Nullable String jobDefinitionArn;

    @OutputCustomType.Constructor({"creationTime","jobDefinitionArn"})
    private GetModelBiasJobDefinitionResult(
        @Nullable String creationTime,
        @Nullable String jobDefinitionArn) {
        this.creationTime = creationTime;
        this.jobDefinitionArn = jobDefinitionArn;
    }

    /**
     * The time at which the job definition was created.
     * 
     */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    public Optional<String> getJobDefinitionArn() {
        return Optional.ofNullable(this.jobDefinitionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelBiasJobDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String jobDefinitionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelBiasJobDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.jobDefinitionArn = defaults.jobDefinitionArn;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setJobDefinitionArn(@Nullable String jobDefinitionArn) {
            this.jobDefinitionArn = jobDefinitionArn;
            return this;
        }

        public GetModelBiasJobDefinitionResult build() {
            return new GetModelBiasJobDefinitionResult(creationTime, jobDefinitionArn);
        }
    }
}
