// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainIamPolicyArgs Empty = new GetDomainIamPolicyArgs();

    @InputImport(name="domainId", required=true)
      private final String domainId;

    public String getDomainId() {
        return this.domainId;
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

    public GetDomainIamPolicyArgs(
        String domainId,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetDomainIamPolicyArgs() {
        this.domainId = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainId;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainId = defaults.domainId;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder setDomainId(String domainId) {
            this.domainId = Objects.requireNonNull(domainId);
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
        public GetDomainIamPolicyArgs build() {
            return new GetDomainIamPolicyArgs(domainId, optionsRequestedPolicyVersion, project);
        }
    }
}