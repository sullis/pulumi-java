// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.enums.ProjectSampleType;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectSample extends io.pulumi.resources.InvokeArgs {

    public static final ProjectSample Empty = new ProjectSample();

    @InputImport(name="size")
    private final @Nullable Integer size;

    public Optional<Integer> getSize() {
        return this.size == null ? Optional.empty() : Optional.ofNullable(this.size);
    }

    @InputImport(name="type", required=true)
    private final ProjectSampleType type;

    public ProjectSampleType getType() {
        return this.type;
    }

    public ProjectSample(
        @Nullable Integer size,
        ProjectSampleType type) {
        this.size = size;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ProjectSample() {
        this.size = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSample defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer size;
        private ProjectSampleType type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSample defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder setSize(@Nullable Integer size) {
            this.size = size;
            return this;
        }

        public Builder setType(ProjectSampleType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ProjectSample build() {
            return new ProjectSample(size, type);
        }
    }
}
