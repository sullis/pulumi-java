// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFeatureIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFeatureIamPolicyArgs Empty = new GetFeatureIamPolicyArgs();

    @Import(name="featureId", required=true)
    private Output<String> featureId;

    public Output<String> featureId() {
        return this.featureId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetFeatureIamPolicyArgs() {}

    private GetFeatureIamPolicyArgs(GetFeatureIamPolicyArgs $) {
        this.featureId = $.featureId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureIamPolicyArgs $;

        public Builder() {
            $ = new GetFeatureIamPolicyArgs();
        }

        public Builder(GetFeatureIamPolicyArgs defaults) {
            $ = new GetFeatureIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder featureId(Output<String> featureId) {
            $.featureId = featureId;
            return this;
        }

        public Builder featureId(String featureId) {
            return featureId(Output.of(featureId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetFeatureIamPolicyArgs build() {
            $.featureId = Objects.requireNonNull($.featureId, "expected parameter 'featureId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
