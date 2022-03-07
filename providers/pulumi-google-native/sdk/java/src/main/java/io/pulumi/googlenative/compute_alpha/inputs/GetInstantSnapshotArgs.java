// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstantSnapshotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstantSnapshotArgs Empty = new GetInstantSnapshotArgs();

    @InputImport(name="instantSnapshot", required=true)
      private final String instantSnapshot;

    public String getInstantSnapshot() {
        return this.instantSnapshot;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public GetInstantSnapshotArgs(
        String instantSnapshot,
        @Nullable String project,
        String zone) {
        this.instantSnapshot = Objects.requireNonNull(instantSnapshot, "expected parameter 'instantSnapshot' to be non-null");
        this.project = project;
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetInstantSnapshotArgs() {
        this.instantSnapshot = null;
        this.project = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstantSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instantSnapshot;
        private @Nullable String project;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstantSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instantSnapshot = defaults.instantSnapshot;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder setInstantSnapshot(String instantSnapshot) {
            this.instantSnapshot = Objects.requireNonNull(instantSnapshot);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetInstantSnapshotArgs build() {
            return new GetInstantSnapshotArgs(instantSnapshot, project, zone);
        }
    }
}