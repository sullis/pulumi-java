// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.runtimeconfig_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWaiterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWaiterPlainArgs Empty = new GetWaiterPlainArgs();

    @Import(name="configId", required=true)
    private String configId;

    public String configId() {
        return this.configId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="waiterId", required=true)
    private String waiterId;

    public String waiterId() {
        return this.waiterId;
    }

    private GetWaiterPlainArgs() {}

    private GetWaiterPlainArgs(GetWaiterPlainArgs $) {
        this.configId = $.configId;
        this.project = $.project;
        this.waiterId = $.waiterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWaiterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWaiterPlainArgs $;

        public Builder() {
            $ = new GetWaiterPlainArgs();
        }

        public Builder(GetWaiterPlainArgs defaults) {
            $ = new GetWaiterPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(String configId) {
            $.configId = configId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder waiterId(String waiterId) {
            $.waiterId = waiterId;
            return this;
        }

        public GetWaiterPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.waiterId = Objects.requireNonNull($.waiterId, "expected parameter 'waiterId' to be non-null");
            return $;
        }
    }

}
