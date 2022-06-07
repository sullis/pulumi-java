// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetParticipantArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetParticipantArgs Empty = new GetParticipantArgs();

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

    @Import(name="participantId", required=true)
    private Output<String> participantId;

    public Output<String> participantId() {
        return this.participantId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetParticipantArgs() {}

    private GetParticipantArgs(GetParticipantArgs $) {
        this.conversationId = $.conversationId;
        this.location = $.location;
        this.participantId = $.participantId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetParticipantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetParticipantArgs $;

        public Builder() {
            $ = new GetParticipantArgs();
        }

        public Builder(GetParticipantArgs defaults) {
            $ = new GetParticipantArgs(Objects.requireNonNull(defaults));
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

        public Builder participantId(Output<String> participantId) {
            $.participantId = participantId;
            return this;
        }

        public Builder participantId(String participantId) {
            return participantId(Output.of(participantId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetParticipantArgs build() {
            $.conversationId = Objects.requireNonNull($.conversationId, "expected parameter 'conversationId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.participantId = Objects.requireNonNull($.participantId, "expected parameter 'participantId' to be non-null");
            return $;
        }
    }

}
