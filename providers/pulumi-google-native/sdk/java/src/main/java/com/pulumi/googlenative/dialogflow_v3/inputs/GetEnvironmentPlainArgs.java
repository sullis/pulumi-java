// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentPlainArgs Empty = new GetEnvironmentPlainArgs();

    @Import(name="agentId", required=true)
    private String agentId;

    public String agentId() {
        return this.agentId;
    }

    @Import(name="environmentId", required=true)
    private String environmentId;

    public String environmentId() {
        return this.environmentId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetEnvironmentPlainArgs() {}

    private GetEnvironmentPlainArgs(GetEnvironmentPlainArgs $) {
        this.agentId = $.agentId;
        this.environmentId = $.environmentId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentPlainArgs $;

        public Builder() {
            $ = new GetEnvironmentPlainArgs();
        }

        public Builder(GetEnvironmentPlainArgs defaults) {
            $ = new GetEnvironmentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(String agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetEnvironmentPlainArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
