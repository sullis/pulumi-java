// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionTargetHttpProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionTargetHttpProxyArgs Empty = new GetRegionTargetHttpProxyArgs();

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

    @Import(name="targetHttpProxy", required=true)
    private Output<String> targetHttpProxy;

    public Output<String> targetHttpProxy() {
        return this.targetHttpProxy;
    }

    private GetRegionTargetHttpProxyArgs() {}

    private GetRegionTargetHttpProxyArgs(GetRegionTargetHttpProxyArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.targetHttpProxy = $.targetHttpProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionTargetHttpProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionTargetHttpProxyArgs $;

        public Builder() {
            $ = new GetRegionTargetHttpProxyArgs();
        }

        public Builder(GetRegionTargetHttpProxyArgs defaults) {
            $ = new GetRegionTargetHttpProxyArgs(Objects.requireNonNull(defaults));
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

        public Builder targetHttpProxy(Output<String> targetHttpProxy) {
            $.targetHttpProxy = targetHttpProxy;
            return this;
        }

        public Builder targetHttpProxy(String targetHttpProxy) {
            return targetHttpProxy(Output.of(targetHttpProxy));
        }

        public GetRegionTargetHttpProxyArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.targetHttpProxy = Objects.requireNonNull($.targetHttpProxy, "expected parameter 'targetHttpProxy' to be non-null");
            return $;
        }
    }

}
