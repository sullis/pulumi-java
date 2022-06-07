// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionTargetHttpsProxyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionTargetHttpsProxyPlainArgs Empty = new GetRegionTargetHttpsProxyPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    @Import(name="targetHttpsProxy", required=true)
    private String targetHttpsProxy;

    public String targetHttpsProxy() {
        return this.targetHttpsProxy;
    }

    private GetRegionTargetHttpsProxyPlainArgs() {}

    private GetRegionTargetHttpsProxyPlainArgs(GetRegionTargetHttpsProxyPlainArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.targetHttpsProxy = $.targetHttpsProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionTargetHttpsProxyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionTargetHttpsProxyPlainArgs $;

        public Builder() {
            $ = new GetRegionTargetHttpsProxyPlainArgs();
        }

        public Builder(GetRegionTargetHttpsProxyPlainArgs defaults) {
            $ = new GetRegionTargetHttpsProxyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public Builder targetHttpsProxy(String targetHttpsProxy) {
            $.targetHttpsProxy = targetHttpsProxy;
            return this;
        }

        public GetRegionTargetHttpsProxyPlainArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.targetHttpsProxy = Objects.requireNonNull($.targetHttpsProxy, "expected parameter 'targetHttpsProxy' to be non-null");
            return $;
        }
    }

}
