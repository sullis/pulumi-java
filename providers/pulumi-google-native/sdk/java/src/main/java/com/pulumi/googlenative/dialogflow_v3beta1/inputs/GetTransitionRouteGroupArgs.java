// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitionRouteGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitionRouteGroupArgs Empty = new GetTransitionRouteGroupArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    @Import(name="flowId", required=true)
    private Output<String> flowId;

    public Output<String> flowId() {
        return this.flowId;
    }

    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
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

    @Import(name="transitionRouteGroupId", required=true)
    private Output<String> transitionRouteGroupId;

    public Output<String> transitionRouteGroupId() {
        return this.transitionRouteGroupId;
    }

    private GetTransitionRouteGroupArgs() {}

    private GetTransitionRouteGroupArgs(GetTransitionRouteGroupArgs $) {
        this.agentId = $.agentId;
        this.flowId = $.flowId;
        this.languageCode = $.languageCode;
        this.location = $.location;
        this.project = $.project;
        this.transitionRouteGroupId = $.transitionRouteGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitionRouteGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitionRouteGroupArgs $;

        public Builder() {
            $ = new GetTransitionRouteGroupArgs();
        }

        public Builder(GetTransitionRouteGroupArgs defaults) {
            $ = new GetTransitionRouteGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        public Builder flowId(Output<String> flowId) {
            $.flowId = flowId;
            return this;
        }

        public Builder flowId(String flowId) {
            return flowId(Output.of(flowId));
        }

        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
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

        public Builder transitionRouteGroupId(Output<String> transitionRouteGroupId) {
            $.transitionRouteGroupId = transitionRouteGroupId;
            return this;
        }

        public Builder transitionRouteGroupId(String transitionRouteGroupId) {
            return transitionRouteGroupId(Output.of(transitionRouteGroupId));
        }

        public GetTransitionRouteGroupArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.flowId = Objects.requireNonNull($.flowId, "expected parameter 'flowId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.transitionRouteGroupId = Objects.requireNonNull($.transitionRouteGroupId, "expected parameter 'transitionRouteGroupId' to be non-null");
            return $;
        }
    }

}
