// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCanaryEvaluationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCanaryEvaluationPlainArgs Empty = new GetCanaryEvaluationPlainArgs();

    @Import(name="canaryevaluationId", required=true)
    private String canaryevaluationId;

    public String canaryevaluationId() {
        return this.canaryevaluationId;
    }

    @Import(name="instanceId", required=true)
    private String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    private GetCanaryEvaluationPlainArgs() {}

    private GetCanaryEvaluationPlainArgs(GetCanaryEvaluationPlainArgs $) {
        this.canaryevaluationId = $.canaryevaluationId;
        this.instanceId = $.instanceId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCanaryEvaluationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCanaryEvaluationPlainArgs $;

        public Builder() {
            $ = new GetCanaryEvaluationPlainArgs();
        }

        public Builder(GetCanaryEvaluationPlainArgs defaults) {
            $ = new GetCanaryEvaluationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder canaryevaluationId(String canaryevaluationId) {
            $.canaryevaluationId = canaryevaluationId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetCanaryEvaluationPlainArgs build() {
            $.canaryevaluationId = Objects.requireNonNull($.canaryevaluationId, "expected parameter 'canaryevaluationId' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
