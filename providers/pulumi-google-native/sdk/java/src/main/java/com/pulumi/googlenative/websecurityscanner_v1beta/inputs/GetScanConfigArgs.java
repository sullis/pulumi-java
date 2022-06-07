// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScanConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScanConfigArgs Empty = new GetScanConfigArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="scanConfigId", required=true)
    private Output<String> scanConfigId;

    public Output<String> scanConfigId() {
        return this.scanConfigId;
    }

    private GetScanConfigArgs() {}

    private GetScanConfigArgs(GetScanConfigArgs $) {
        this.project = $.project;
        this.scanConfigId = $.scanConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScanConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScanConfigArgs $;

        public Builder() {
            $ = new GetScanConfigArgs();
        }

        public Builder(GetScanConfigArgs defaults) {
            $ = new GetScanConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder scanConfigId(Output<String> scanConfigId) {
            $.scanConfigId = scanConfigId;
            return this;
        }

        public Builder scanConfigId(String scanConfigId) {
            return scanConfigId(Output.of(scanConfigId));
        }

        public GetScanConfigArgs build() {
            $.scanConfigId = Objects.requireNonNull($.scanConfigId, "expected parameter 'scanConfigId' to be non-null");
            return $;
        }
    }

}
