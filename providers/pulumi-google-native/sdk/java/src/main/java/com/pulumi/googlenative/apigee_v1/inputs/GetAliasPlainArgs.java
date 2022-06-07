// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAliasPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAliasPlainArgs Empty = new GetAliasPlainArgs();

    @Import(name="aliasId", required=true)
    private String aliasId;

    public String aliasId() {
        return this.aliasId;
    }

    @Import(name="environmentId", required=true)
    private String environmentId;

    public String environmentId() {
        return this.environmentId;
    }

    @Import(name="keystoreId", required=true)
    private String keystoreId;

    public String keystoreId() {
        return this.keystoreId;
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    private GetAliasPlainArgs() {}

    private GetAliasPlainArgs(GetAliasPlainArgs $) {
        this.aliasId = $.aliasId;
        this.environmentId = $.environmentId;
        this.keystoreId = $.keystoreId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAliasPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAliasPlainArgs $;

        public Builder() {
            $ = new GetAliasPlainArgs();
        }

        public Builder(GetAliasPlainArgs defaults) {
            $ = new GetAliasPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder aliasId(String aliasId) {
            $.aliasId = aliasId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder keystoreId(String keystoreId) {
            $.keystoreId = keystoreId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetAliasPlainArgs build() {
            $.aliasId = Objects.requireNonNull($.aliasId, "expected parameter 'aliasId' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.keystoreId = Objects.requireNonNull($.keystoreId, "expected parameter 'keystoreId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
