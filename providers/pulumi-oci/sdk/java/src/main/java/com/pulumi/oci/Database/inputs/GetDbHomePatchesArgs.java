// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetDbHomePatchesFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbHomePatchesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbHomePatchesArgs Empty = new GetDbHomePatchesArgs();

    /**
     * The Database Home [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="dbHomeId", required=true)
    private Output<String> dbHomeId;

    /**
     * @return The Database Home [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> dbHomeId() {
        return this.dbHomeId;
    }

    @Import(name="filters")
    private @Nullable Output<List<GetDbHomePatchesFilterArgs>> filters;

    public Optional<Output<List<GetDbHomePatchesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetDbHomePatchesArgs() {}

    private GetDbHomePatchesArgs(GetDbHomePatchesArgs $) {
        this.dbHomeId = $.dbHomeId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbHomePatchesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbHomePatchesArgs $;

        public Builder() {
            $ = new GetDbHomePatchesArgs();
        }

        public Builder(GetDbHomePatchesArgs defaults) {
            $ = new GetDbHomePatchesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbHomeId The Database Home [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder dbHomeId(Output<String> dbHomeId) {
            $.dbHomeId = dbHomeId;
            return this;
        }

        /**
         * @param dbHomeId The Database Home [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder dbHomeId(String dbHomeId) {
            return dbHomeId(Output.of(dbHomeId));
        }

        public Builder filters(@Nullable Output<List<GetDbHomePatchesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetDbHomePatchesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetDbHomePatchesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetDbHomePatchesArgs build() {
            $.dbHomeId = Objects.requireNonNull($.dbHomeId, "expected parameter 'dbHomeId' to be non-null");
            return $;
        }
    }

}
