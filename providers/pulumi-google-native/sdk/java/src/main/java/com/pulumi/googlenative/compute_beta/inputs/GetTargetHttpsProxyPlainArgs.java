// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetHttpsProxyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetHttpsProxyPlainArgs Empty = new GetTargetHttpsProxyPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="targetHttpsProxy", required=true)
    private String targetHttpsProxy;

    public String targetHttpsProxy() {
        return this.targetHttpsProxy;
    }

    private GetTargetHttpsProxyPlainArgs() {}

    private GetTargetHttpsProxyPlainArgs(GetTargetHttpsProxyPlainArgs $) {
        this.project = $.project;
        this.targetHttpsProxy = $.targetHttpsProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetHttpsProxyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetHttpsProxyPlainArgs $;

        public Builder() {
            $ = new GetTargetHttpsProxyPlainArgs();
        }

        public Builder(GetTargetHttpsProxyPlainArgs defaults) {
            $ = new GetTargetHttpsProxyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder targetHttpsProxy(String targetHttpsProxy) {
            $.targetHttpsProxy = targetHttpsProxy;
            return this;
        }

        public GetTargetHttpsProxyPlainArgs build() {
            $.targetHttpsProxy = Objects.requireNonNull($.targetHttpsProxy, "expected parameter 'targetHttpsProxy' to be non-null");
            return $;
        }
    }

}
