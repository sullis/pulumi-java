// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConversationProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConversationProfileArgs Empty = new GetConversationProfileArgs();

    @Import(name="conversationProfileId", required=true)
    private Output<String> conversationProfileId;

    public Output<String> conversationProfileId() {
        return this.conversationProfileId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetConversationProfileArgs() {}

    private GetConversationProfileArgs(GetConversationProfileArgs $) {
        this.conversationProfileId = $.conversationProfileId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConversationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConversationProfileArgs $;

        public Builder() {
            $ = new GetConversationProfileArgs();
        }

        public Builder(GetConversationProfileArgs defaults) {
            $ = new GetConversationProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationProfileId(Output<String> conversationProfileId) {
            $.conversationProfileId = conversationProfileId;
            return this;
        }

        public Builder conversationProfileId(String conversationProfileId) {
            return conversationProfileId(Output.of(conversationProfileId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetConversationProfileArgs build() {
            $.conversationProfileId = Objects.requireNonNull($.conversationProfileId, "expected parameter 'conversationProfileId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
