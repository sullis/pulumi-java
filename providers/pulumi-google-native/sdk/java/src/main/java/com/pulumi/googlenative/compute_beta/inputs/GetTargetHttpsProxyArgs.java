// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetHttpsProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetHttpsProxyArgs Empty = new GetTargetHttpsProxyArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="targetHttpsProxy", required=true)
    private Output<String> targetHttpsProxy;

    public Output<String> targetHttpsProxy() {
        return this.targetHttpsProxy;
    }

    private GetTargetHttpsProxyArgs() {}

    private GetTargetHttpsProxyArgs(GetTargetHttpsProxyArgs $) {
        this.project = $.project;
        this.targetHttpsProxy = $.targetHttpsProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetHttpsProxyArgs $;

        public Builder() {
            $ = new GetTargetHttpsProxyArgs();
        }

        public Builder(GetTargetHttpsProxyArgs defaults) {
            $ = new GetTargetHttpsProxyArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder targetHttpsProxy(Output<String> targetHttpsProxy) {
            $.targetHttpsProxy = targetHttpsProxy;
            return this;
        }

        public Builder targetHttpsProxy(String targetHttpsProxy) {
            return targetHttpsProxy(Output.of(targetHttpsProxy));
        }

        public GetTargetHttpsProxyArgs build() {
            $.targetHttpsProxy = Objects.requireNonNull($.targetHttpsProxy, "expected parameter 'targetHttpsProxy' to be non-null");
            return $;
        }
    }

}
