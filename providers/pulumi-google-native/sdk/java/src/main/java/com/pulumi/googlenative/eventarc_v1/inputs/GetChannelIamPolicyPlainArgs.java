// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetChannelIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetChannelIamPolicyPlainArgs Empty = new GetChannelIamPolicyPlainArgs();

    @Import(name="channelId", required=true)
    private String channelId;

    public String channelId() {
        return this.channelId;
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

    private GetChannelIamPolicyPlainArgs() {}

    private GetChannelIamPolicyPlainArgs(GetChannelIamPolicyPlainArgs $) {
        this.channelId = $.channelId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetChannelIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetChannelIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetChannelIamPolicyPlainArgs();
        }

        public Builder(GetChannelIamPolicyPlainArgs defaults) {
            $ = new GetChannelIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder channelId(String channelId) {
            $.channelId = channelId;
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

        public GetChannelIamPolicyPlainArgs build() {
            $.channelId = Objects.requireNonNull($.channelId, "expected parameter 'channelId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
