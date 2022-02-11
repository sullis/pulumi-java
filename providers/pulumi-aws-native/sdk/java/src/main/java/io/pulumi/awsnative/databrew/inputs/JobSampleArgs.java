// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.enums.JobSampleMode;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobSampleArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSampleArgs Empty = new JobSampleArgs();

    @InputImport(name="mode")
    private final @Nullable Input<JobSampleMode> mode;

    public Input<JobSampleMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    @InputImport(name="size")
    private final @Nullable Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    public JobSampleArgs(
        @Nullable Input<JobSampleMode> mode,
        @Nullable Input<Integer> size) {
        this.mode = mode;
        this.size = size;
    }

    private JobSampleArgs() {
        this.mode = Input.empty();
        this.size = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSampleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobSampleMode> mode;
        private @Nullable Input<Integer> size;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSampleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.size = defaults.size;
        }

        public Builder setMode(@Nullable Input<JobSampleMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable JobSampleMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setSize(@Nullable Input<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable Integer size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public JobSampleArgs build() {
            return new JobSampleArgs(mode, size);
        }
    }
}
