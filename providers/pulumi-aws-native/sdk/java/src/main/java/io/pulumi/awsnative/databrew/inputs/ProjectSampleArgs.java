// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.enums.ProjectSampleType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectSampleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSampleArgs Empty = new ProjectSampleArgs();

    /**
     * Sample size
     * 
     */
    @InputImport(name="size")
    private final @Nullable Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    /**
     * Sample type
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<ProjectSampleType> type;

    public Input<ProjectSampleType> getType() {
        return this.type;
    }

    public ProjectSampleArgs(
        @Nullable Input<Integer> size,
        Input<ProjectSampleType> type) {
        this.size = size;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ProjectSampleArgs() {
        this.size = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSampleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> size;
        private Input<ProjectSampleType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSampleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder setSize(@Nullable Input<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable Integer size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setType(Input<ProjectSampleType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(ProjectSampleType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ProjectSampleArgs build() {
            return new ProjectSampleArgs(size, type);
        }
    }
}
