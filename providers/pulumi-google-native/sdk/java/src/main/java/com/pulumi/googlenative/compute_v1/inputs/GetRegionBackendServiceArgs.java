// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionBackendServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionBackendServiceArgs Empty = new GetRegionBackendServiceArgs();

    @Import(name="backendService", required=true)
    private Output<String> backendService;

    public Output<String> backendService() {
        return this.backendService;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    private GetRegionBackendServiceArgs() {}

    private GetRegionBackendServiceArgs(GetRegionBackendServiceArgs $) {
        this.backendService = $.backendService;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionBackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionBackendServiceArgs $;

        public Builder() {
            $ = new GetRegionBackendServiceArgs();
        }

        public Builder(GetRegionBackendServiceArgs defaults) {
            $ = new GetRegionBackendServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendService(Output<String> backendService) {
            $.backendService = backendService;
            return this;
        }

        public Builder backendService(String backendService) {
            return backendService(Output.of(backendService));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetRegionBackendServiceArgs build() {
            $.backendService = Objects.requireNonNull($.backendService, "expected parameter 'backendService' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
