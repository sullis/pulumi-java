// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGcpUserAccessBindingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGcpUserAccessBindingArgs Empty = new GetGcpUserAccessBindingArgs();

    @Import(name="gcpUserAccessBindingId", required=true)
    private Output<String> gcpUserAccessBindingId;

    public Output<String> gcpUserAccessBindingId() {
        return this.gcpUserAccessBindingId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetGcpUserAccessBindingArgs() {}

    private GetGcpUserAccessBindingArgs(GetGcpUserAccessBindingArgs $) {
        this.gcpUserAccessBindingId = $.gcpUserAccessBindingId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGcpUserAccessBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGcpUserAccessBindingArgs $;

        public Builder() {
            $ = new GetGcpUserAccessBindingArgs();
        }

        public Builder(GetGcpUserAccessBindingArgs defaults) {
            $ = new GetGcpUserAccessBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder gcpUserAccessBindingId(Output<String> gcpUserAccessBindingId) {
            $.gcpUserAccessBindingId = gcpUserAccessBindingId;
            return this;
        }

        public Builder gcpUserAccessBindingId(String gcpUserAccessBindingId) {
            return gcpUserAccessBindingId(Output.of(gcpUserAccessBindingId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetGcpUserAccessBindingArgs build() {
            $.gcpUserAccessBindingId = Objects.requireNonNull($.gcpUserAccessBindingId, "expected parameter 'gcpUserAccessBindingId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
