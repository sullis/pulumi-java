// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetProjectArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTargetProjectArgs Empty = new GetTargetProjectArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="targetProjectId", required=true)
      private final String targetProjectId;

    public String getTargetProjectId() {
        return this.targetProjectId;
    }

    public GetTargetProjectArgs(
        String location,
        @Nullable String project,
        String targetProjectId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.targetProjectId = Objects.requireNonNull(targetProjectId, "expected parameter 'targetProjectId' to be non-null");
    }

    private GetTargetProjectArgs() {
        this.location = null;
        this.project = null;
        this.targetProjectId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String targetProjectId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.targetProjectId = defaults.targetProjectId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setTargetProjectId(String targetProjectId) {
            this.targetProjectId = Objects.requireNonNull(targetProjectId);
            return this;
        }
        public GetTargetProjectArgs build() {
            return new GetTargetProjectArgs(location, project, targetProjectId);
        }
    }
}