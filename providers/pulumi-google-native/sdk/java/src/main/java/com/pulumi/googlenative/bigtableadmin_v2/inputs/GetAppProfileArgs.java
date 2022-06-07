// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppProfileArgs Empty = new GetAppProfileArgs();

    @Import(name="appProfileId", required=true)
    private Output<String> appProfileId;

    public Output<String> appProfileId() {
        return this.appProfileId;
    }

    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAppProfileArgs() {}

    private GetAppProfileArgs(GetAppProfileArgs $) {
        this.appProfileId = $.appProfileId;
        this.instanceId = $.instanceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppProfileArgs $;

        public Builder() {
            $ = new GetAppProfileArgs();
        }

        public Builder(GetAppProfileArgs defaults) {
            $ = new GetAppProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder appProfileId(Output<String> appProfileId) {
            $.appProfileId = appProfileId;
            return this;
        }

        public Builder appProfileId(String appProfileId) {
            return appProfileId(Output.of(appProfileId));
        }

        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetAppProfileArgs build() {
            $.appProfileId = Objects.requireNonNull($.appProfileId, "expected parameter 'appProfileId' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
