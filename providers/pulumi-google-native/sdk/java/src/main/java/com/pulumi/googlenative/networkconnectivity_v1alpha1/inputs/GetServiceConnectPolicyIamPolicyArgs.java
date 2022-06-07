// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceConnectPolicyIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceConnectPolicyIamPolicyArgs Empty = new GetServiceConnectPolicyIamPolicyArgs();

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

    @Import(name="serviceConnectPolicyId", required=true)
    private Output<String> serviceConnectPolicyId;

    public Output<String> serviceConnectPolicyId() {
        return this.serviceConnectPolicyId;
    }

    private GetServiceConnectPolicyIamPolicyArgs() {}

    private GetServiceConnectPolicyIamPolicyArgs(GetServiceConnectPolicyIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.serviceConnectPolicyId = $.serviceConnectPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceConnectPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceConnectPolicyIamPolicyArgs $;

        public Builder() {
            $ = new GetServiceConnectPolicyIamPolicyArgs();
        }

        public Builder(GetServiceConnectPolicyIamPolicyArgs defaults) {
            $ = new GetServiceConnectPolicyIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder serviceConnectPolicyId(Output<String> serviceConnectPolicyId) {
            $.serviceConnectPolicyId = serviceConnectPolicyId;
            return this;
        }

        public Builder serviceConnectPolicyId(String serviceConnectPolicyId) {
            return serviceConnectPolicyId(Output.of(serviceConnectPolicyId));
        }

        public GetServiceConnectPolicyIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.serviceConnectPolicyId = Objects.requireNonNull($.serviceConnectPolicyId, "expected parameter 'serviceConnectPolicyId' to be non-null");
            return $;
        }
    }

}
