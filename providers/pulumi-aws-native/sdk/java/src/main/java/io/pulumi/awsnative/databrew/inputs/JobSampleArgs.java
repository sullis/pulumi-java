// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.enums.JobSampleMode;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Job Sample
 * 
 */
public final class JobSampleArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSampleArgs Empty = new JobSampleArgs();

    @Import(name="mode")
      private final @Nullable Output<JobSampleMode> mode;

    public Output<JobSampleMode> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    @Import(name="size")
      private final @Nullable Output<Integer> size;

    public Output<Integer> size() {
        return this.size == null ? Codegen.empty() : this.size;
    }

    public JobSampleArgs(
        @Nullable Output<JobSampleMode> mode,
        @Nullable Output<Integer> size) {
        this.mode = mode;
        this.size = size;
    }

    private JobSampleArgs() {
        this.mode = Codegen.empty();
        this.size = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSampleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobSampleMode> mode;
        private @Nullable Output<Integer> size;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSampleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.size = defaults.size;
        }

        public Builder mode(@Nullable Output<JobSampleMode> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable JobSampleMode mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder size(@Nullable Output<Integer> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable Integer size) {
            this.size = Codegen.ofNullable(size);
            return this;
        }        public JobSampleArgs build() {
            return new JobSampleArgs(mode, size);
        }
    }
}
