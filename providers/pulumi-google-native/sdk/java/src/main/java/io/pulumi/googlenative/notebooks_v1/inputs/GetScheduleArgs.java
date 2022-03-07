// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScheduleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScheduleArgs Empty = new GetScheduleArgs();

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

    @InputImport(name="scheduleId", required=true)
      private final String scheduleId;

    public String getScheduleId() {
        return this.scheduleId;
    }

    public GetScheduleArgs(
        String location,
        @Nullable String project,
        String scheduleId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.scheduleId = Objects.requireNonNull(scheduleId, "expected parameter 'scheduleId' to be non-null");
    }

    private GetScheduleArgs() {
        this.location = null;
        this.project = null;
        this.scheduleId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String scheduleId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.scheduleId = defaults.scheduleId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setScheduleId(String scheduleId) {
            this.scheduleId = Objects.requireNonNull(scheduleId);
            return this;
        }
        public GetScheduleArgs build() {
            return new GetScheduleArgs(location, project, scheduleId);
        }
    }
}