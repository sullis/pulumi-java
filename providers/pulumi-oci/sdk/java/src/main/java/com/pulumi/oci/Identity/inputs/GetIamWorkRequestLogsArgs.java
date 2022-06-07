// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Identity.inputs.GetIamWorkRequestLogsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIamWorkRequestLogsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIamWorkRequestLogsArgs Empty = new GetIamWorkRequestLogsArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetIamWorkRequestLogsFilterArgs>> filters;

    public Optional<Output<List<GetIamWorkRequestLogsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OCID of the IAM work request.
     * 
     */
    @Import(name="iamWorkRequestId", required=true)
    private Output<String> iamWorkRequestId;

    /**
     * @return The OCID of the IAM work request.
     * 
     */
    public Output<String> iamWorkRequestId() {
        return this.iamWorkRequestId;
    }

    private GetIamWorkRequestLogsArgs() {}

    private GetIamWorkRequestLogsArgs(GetIamWorkRequestLogsArgs $) {
        this.filters = $.filters;
        this.iamWorkRequestId = $.iamWorkRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIamWorkRequestLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIamWorkRequestLogsArgs $;

        public Builder() {
            $ = new GetIamWorkRequestLogsArgs();
        }

        public Builder(GetIamWorkRequestLogsArgs defaults) {
            $ = new GetIamWorkRequestLogsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetIamWorkRequestLogsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetIamWorkRequestLogsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetIamWorkRequestLogsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param iamWorkRequestId The OCID of the IAM work request.
         * 
         * @return builder
         * 
         */
        public Builder iamWorkRequestId(Output<String> iamWorkRequestId) {
            $.iamWorkRequestId = iamWorkRequestId;
            return this;
        }

        /**
         * @param iamWorkRequestId The OCID of the IAM work request.
         * 
         * @return builder
         * 
         */
        public Builder iamWorkRequestId(String iamWorkRequestId) {
            return iamWorkRequestId(Output.of(iamWorkRequestId));
        }

        public GetIamWorkRequestLogsArgs build() {
            $.iamWorkRequestId = Objects.requireNonNull($.iamWorkRequestId, "expected parameter 'iamWorkRequestId' to be non-null");
            return $;
        }
    }

}
