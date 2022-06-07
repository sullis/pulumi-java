// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetTcpProxyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetTcpProxyPlainArgs Empty = new GetTargetTcpProxyPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="targetTcpProxy", required=true)
    private String targetTcpProxy;

    public String targetTcpProxy() {
        return this.targetTcpProxy;
    }

    private GetTargetTcpProxyPlainArgs() {}

    private GetTargetTcpProxyPlainArgs(GetTargetTcpProxyPlainArgs $) {
        this.project = $.project;
        this.targetTcpProxy = $.targetTcpProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetTcpProxyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetTcpProxyPlainArgs $;

        public Builder() {
            $ = new GetTargetTcpProxyPlainArgs();
        }

        public Builder(GetTargetTcpProxyPlainArgs defaults) {
            $ = new GetTargetTcpProxyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder targetTcpProxy(String targetTcpProxy) {
            $.targetTcpProxy = targetTcpProxy;
            return this;
        }

        public GetTargetTcpProxyPlainArgs build() {
            $.targetTcpProxy = Objects.requireNonNull($.targetTcpProxy, "expected parameter 'targetTcpProxy' to be non-null");
            return $;
        }
    }

}
