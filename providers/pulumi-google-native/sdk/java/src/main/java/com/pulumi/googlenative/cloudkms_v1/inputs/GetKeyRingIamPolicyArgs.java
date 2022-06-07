// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyRingIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyRingIamPolicyArgs Empty = new GetKeyRingIamPolicyArgs();

    @Import(name="keyRingId", required=true)
    private Output<String> keyRingId;

    public Output<String> keyRingId() {
        return this.keyRingId;
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

    private GetKeyRingIamPolicyArgs() {}

    private GetKeyRingIamPolicyArgs(GetKeyRingIamPolicyArgs $) {
        this.keyRingId = $.keyRingId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyRingIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyRingIamPolicyArgs $;

        public Builder() {
            $ = new GetKeyRingIamPolicyArgs();
        }

        public Builder(GetKeyRingIamPolicyArgs defaults) {
            $ = new GetKeyRingIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyRingId(Output<String> keyRingId) {
            $.keyRingId = keyRingId;
            return this;
        }

        public Builder keyRingId(String keyRingId) {
            return keyRingId(Output.of(keyRingId));
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

        public GetKeyRingIamPolicyArgs build() {
            $.keyRingId = Objects.requireNonNull($.keyRingId, "expected parameter 'keyRingId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
