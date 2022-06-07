// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionTargetHttpsProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionTargetHttpsProxyArgs Empty = new GetRegionTargetHttpsProxyArgs();

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

    @Import(name="targetHttpsProxy", required=true)
    private Output<String> targetHttpsProxy;

    public Output<String> targetHttpsProxy() {
        return this.targetHttpsProxy;
    }

    private GetRegionTargetHttpsProxyArgs() {}

    private GetRegionTargetHttpsProxyArgs(GetRegionTargetHttpsProxyArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.targetHttpsProxy = $.targetHttpsProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionTargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionTargetHttpsProxyArgs $;

        public Builder() {
            $ = new GetRegionTargetHttpsProxyArgs();
        }

        public Builder(GetRegionTargetHttpsProxyArgs defaults) {
            $ = new GetRegionTargetHttpsProxyArgs(Objects.requireNonNull(defaults));
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

        public Builder targetHttpsProxy(Output<String> targetHttpsProxy) {
            $.targetHttpsProxy = targetHttpsProxy;
            return this;
        }

        public Builder targetHttpsProxy(String targetHttpsProxy) {
            return targetHttpsProxy(Output.of(targetHttpsProxy));
        }

        public GetRegionTargetHttpsProxyArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.targetHttpsProxy = Objects.requireNonNull($.targetHttpsProxy, "expected parameter 'targetHttpsProxy' to be non-null");
            return $;
        }
    }

}
