// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerTlsPolicyIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerTlsPolicyIamPolicyArgs Empty = new GetServerTlsPolicyIamPolicyArgs();

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

    @Import(name="serverTlsPolicyId", required=true)
    private Output<String> serverTlsPolicyId;

    public Output<String> serverTlsPolicyId() {
        return this.serverTlsPolicyId;
    }

    private GetServerTlsPolicyIamPolicyArgs() {}

    private GetServerTlsPolicyIamPolicyArgs(GetServerTlsPolicyIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.serverTlsPolicyId = $.serverTlsPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerTlsPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerTlsPolicyIamPolicyArgs $;

        public Builder() {
            $ = new GetServerTlsPolicyIamPolicyArgs();
        }

        public Builder(GetServerTlsPolicyIamPolicyArgs defaults) {
            $ = new GetServerTlsPolicyIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder serverTlsPolicyId(Output<String> serverTlsPolicyId) {
            $.serverTlsPolicyId = serverTlsPolicyId;
            return this;
        }

        public Builder serverTlsPolicyId(String serverTlsPolicyId) {
            return serverTlsPolicyId(Output.of(serverTlsPolicyId));
        }

        public GetServerTlsPolicyIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.serverTlsPolicyId = Objects.requireNonNull($.serverTlsPolicyId, "expected parameter 'serverTlsPolicyId' to be non-null");
            return $;
        }
    }

}
