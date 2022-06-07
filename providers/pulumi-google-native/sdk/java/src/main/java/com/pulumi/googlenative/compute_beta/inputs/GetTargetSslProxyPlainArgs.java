// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetSslProxyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetSslProxyPlainArgs Empty = new GetTargetSslProxyPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="targetSslProxy", required=true)
    private String targetSslProxy;

    public String targetSslProxy() {
        return this.targetSslProxy;
    }

    private GetTargetSslProxyPlainArgs() {}

    private GetTargetSslProxyPlainArgs(GetTargetSslProxyPlainArgs $) {
        this.project = $.project;
        this.targetSslProxy = $.targetSslProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetSslProxyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetSslProxyPlainArgs $;

        public Builder() {
            $ = new GetTargetSslProxyPlainArgs();
        }

        public Builder(GetTargetSslProxyPlainArgs defaults) {
            $ = new GetTargetSslProxyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder targetSslProxy(String targetSslProxy) {
            $.targetSslProxy = targetSslProxy;
            return this;
        }

        public GetTargetSslProxyPlainArgs build() {
            $.targetSslProxy = Objects.requireNonNull($.targetSslProxy, "expected parameter 'targetSslProxy' to be non-null");
            return $;
        }
    }

}
