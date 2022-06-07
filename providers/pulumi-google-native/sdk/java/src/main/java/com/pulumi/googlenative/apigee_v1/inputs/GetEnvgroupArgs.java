// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnvgroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvgroupArgs Empty = new GetEnvgroupArgs();

    @Import(name="envgroupId", required=true)
    private Output<String> envgroupId;

    public Output<String> envgroupId() {
        return this.envgroupId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetEnvgroupArgs() {}

    private GetEnvgroupArgs(GetEnvgroupArgs $) {
        this.envgroupId = $.envgroupId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvgroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvgroupArgs $;

        public Builder() {
            $ = new GetEnvgroupArgs();
        }

        public Builder(GetEnvgroupArgs defaults) {
            $ = new GetEnvgroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder envgroupId(Output<String> envgroupId) {
            $.envgroupId = envgroupId;
            return this;
        }

        public Builder envgroupId(String envgroupId) {
            return envgroupId(Output.of(envgroupId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetEnvgroupArgs build() {
            $.envgroupId = Objects.requireNonNull($.envgroupId, "expected parameter 'envgroupId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
