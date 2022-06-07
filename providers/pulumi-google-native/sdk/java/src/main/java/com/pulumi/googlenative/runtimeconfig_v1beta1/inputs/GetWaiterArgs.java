// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.runtimeconfig_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWaiterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWaiterArgs Empty = new GetWaiterArgs();

    @Import(name="configId", required=true)
    private Output<String> configId;

    public Output<String> configId() {
        return this.configId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="waiterId", required=true)
    private Output<String> waiterId;

    public Output<String> waiterId() {
        return this.waiterId;
    }

    private GetWaiterArgs() {}

    private GetWaiterArgs(GetWaiterArgs $) {
        this.configId = $.configId;
        this.project = $.project;
        this.waiterId = $.waiterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWaiterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWaiterArgs $;

        public Builder() {
            $ = new GetWaiterArgs();
        }

        public Builder(GetWaiterArgs defaults) {
            $ = new GetWaiterArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<String> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(String configId) {
            return configId(Output.of(configId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder waiterId(Output<String> waiterId) {
            $.waiterId = waiterId;
            return this;
        }

        public Builder waiterId(String waiterId) {
            return waiterId(Output.of(waiterId));
        }

        public GetWaiterArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.waiterId = Objects.requireNonNull($.waiterId, "expected parameter 'waiterId' to be non-null");
            return $;
        }
    }

}
