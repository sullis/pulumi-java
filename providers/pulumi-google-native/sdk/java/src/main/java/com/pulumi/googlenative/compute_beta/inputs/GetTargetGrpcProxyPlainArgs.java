// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetGrpcProxyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetGrpcProxyPlainArgs Empty = new GetTargetGrpcProxyPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="targetGrpcProxy", required=true)
    private String targetGrpcProxy;

    public String targetGrpcProxy() {
        return this.targetGrpcProxy;
    }

    private GetTargetGrpcProxyPlainArgs() {}

    private GetTargetGrpcProxyPlainArgs(GetTargetGrpcProxyPlainArgs $) {
        this.project = $.project;
        this.targetGrpcProxy = $.targetGrpcProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetGrpcProxyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetGrpcProxyPlainArgs $;

        public Builder() {
            $ = new GetTargetGrpcProxyPlainArgs();
        }

        public Builder(GetTargetGrpcProxyPlainArgs defaults) {
            $ = new GetTargetGrpcProxyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder targetGrpcProxy(String targetGrpcProxy) {
            $.targetGrpcProxy = targetGrpcProxy;
            return this;
        }

        public GetTargetGrpcProxyPlainArgs build() {
            $.targetGrpcProxy = Objects.requireNonNull($.targetGrpcProxy, "expected parameter 'targetGrpcProxy' to be non-null");
            return $;
        }
    }

}
