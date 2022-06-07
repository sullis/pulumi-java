// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConversationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConversationArgs Empty = new GetConversationArgs();

    @Import(name="conversationId", required=true)
    private Output<String> conversationId;

    public Output<String> conversationId() {
        return this.conversationId;
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

    @Import(name="view")
    private @Nullable Output<String> view;

    public Optional<Output<String>> view() {
        return Optional.ofNullable(this.view);
    }

    private GetConversationArgs() {}

    private GetConversationArgs(GetConversationArgs $) {
        this.conversationId = $.conversationId;
        this.location = $.location;
        this.project = $.project;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConversationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConversationArgs $;

        public Builder() {
            $ = new GetConversationArgs();
        }

        public Builder(GetConversationArgs defaults) {
            $ = new GetConversationArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationId(Output<String> conversationId) {
            $.conversationId = conversationId;
            return this;
        }

        public Builder conversationId(String conversationId) {
            return conversationId(Output.of(conversationId));
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

        public Builder view(@Nullable Output<String> view) {
            $.view = view;
            return this;
        }

        public Builder view(String view) {
            return view(Output.of(view));
        }

        public GetConversationArgs build() {
            $.conversationId = Objects.requireNonNull($.conversationId, "expected parameter 'conversationId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
