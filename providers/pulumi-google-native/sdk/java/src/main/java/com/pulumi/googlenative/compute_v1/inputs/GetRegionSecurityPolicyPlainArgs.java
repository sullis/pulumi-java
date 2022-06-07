// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionSecurityPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionSecurityPolicyPlainArgs Empty = new GetRegionSecurityPolicyPlainArgs();

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

    @Import(name="securityPolicy", required=true)
    private String securityPolicy;

    public String securityPolicy() {
        return this.securityPolicy;
    }

    private GetRegionSecurityPolicyPlainArgs() {}

    private GetRegionSecurityPolicyPlainArgs(GetRegionSecurityPolicyPlainArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.securityPolicy = $.securityPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionSecurityPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionSecurityPolicyPlainArgs $;

        public Builder() {
            $ = new GetRegionSecurityPolicyPlainArgs();
        }

        public Builder(GetRegionSecurityPolicyPlainArgs defaults) {
            $ = new GetRegionSecurityPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public Builder securityPolicy(String securityPolicy) {
            $.securityPolicy = securityPolicy;
            return this;
        }

        public GetRegionSecurityPolicyPlainArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.securityPolicy = Objects.requireNonNull($.securityPolicy, "expected parameter 'securityPolicy' to be non-null");
            return $;
        }
    }

}
