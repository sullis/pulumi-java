// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebhookArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebhookArgs Empty = new GetWebhookArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
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

    @Import(name="webhookId", required=true)
    private Output<String> webhookId;

    public Output<String> webhookId() {
        return this.webhookId;
    }

    private GetWebhookArgs() {}

    private GetWebhookArgs(GetWebhookArgs $) {
        this.agentId = $.agentId;
        this.location = $.location;
        this.project = $.project;
        this.webhookId = $.webhookId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebhookArgs $;

        public Builder() {
            $ = new GetWebhookArgs();
        }

        public Builder(GetWebhookArgs defaults) {
            $ = new GetWebhookArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
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

        public Builder webhookId(Output<String> webhookId) {
            $.webhookId = webhookId;
            return this;
        }

        public Builder webhookId(String webhookId) {
            return webhookId(Output.of(webhookId));
        }

        public GetWebhookArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.webhookId = Objects.requireNonNull($.webhookId, "expected parameter 'webhookId' to be non-null");
            return $;
        }
    }

}
