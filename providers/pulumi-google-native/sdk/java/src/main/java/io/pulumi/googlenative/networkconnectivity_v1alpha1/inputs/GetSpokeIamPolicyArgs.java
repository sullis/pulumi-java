// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSpokeIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSpokeIamPolicyArgs Empty = new GetSpokeIamPolicyArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="spokeId", required=true)
      private final String spokeId;

    public String getSpokeId() {
        return this.spokeId;
    }

    public GetSpokeIamPolicyArgs(
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String spokeId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.spokeId = Objects.requireNonNull(spokeId, "expected parameter 'spokeId' to be non-null");
    }

    private GetSpokeIamPolicyArgs() {
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.spokeId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpokeIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String spokeId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpokeIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.spokeId = defaults.spokeId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setOptionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSpokeId(String spokeId) {
            this.spokeId = Objects.requireNonNull(spokeId);
            return this;
        }
        public GetSpokeIamPolicyArgs build() {
            return new GetSpokeIamPolicyArgs(location, optionsRequestedPolicyVersion, project, spokeId);
        }
    }
}