// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMeshIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMeshIamPolicyPlainArgs Empty = new GetMeshIamPolicyPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="meshId", required=true)
    private String meshId;

    public String meshId() {
        return this.meshId;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetMeshIamPolicyPlainArgs() {}

    private GetMeshIamPolicyPlainArgs(GetMeshIamPolicyPlainArgs $) {
        this.location = $.location;
        this.meshId = $.meshId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMeshIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMeshIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetMeshIamPolicyPlainArgs();
        }

        public Builder(GetMeshIamPolicyPlainArgs defaults) {
            $ = new GetMeshIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder meshId(String meshId) {
            $.meshId = meshId;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetMeshIamPolicyPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.meshId = Objects.requireNonNull($.meshId, "expected parameter 'meshId' to be non-null");
            return $;
        }
    }

}
