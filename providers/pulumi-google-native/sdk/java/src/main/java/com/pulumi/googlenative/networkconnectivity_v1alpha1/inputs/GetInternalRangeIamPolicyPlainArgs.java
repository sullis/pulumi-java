// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInternalRangeIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInternalRangeIamPolicyPlainArgs Empty = new GetInternalRangeIamPolicyPlainArgs();

    @Import(name="internalRangeId", required=true)
    private String internalRangeId;

    public String internalRangeId() {
        return this.internalRangeId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
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

    private GetInternalRangeIamPolicyPlainArgs() {}

    private GetInternalRangeIamPolicyPlainArgs(GetInternalRangeIamPolicyPlainArgs $) {
        this.internalRangeId = $.internalRangeId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInternalRangeIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInternalRangeIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetInternalRangeIamPolicyPlainArgs();
        }

        public Builder(GetInternalRangeIamPolicyPlainArgs defaults) {
            $ = new GetInternalRangeIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder internalRangeId(String internalRangeId) {
            $.internalRangeId = internalRangeId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
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

        public GetInternalRangeIamPolicyPlainArgs build() {
            $.internalRangeId = Objects.requireNonNull($.internalRangeId, "expected parameter 'internalRangeId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
