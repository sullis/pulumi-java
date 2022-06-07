// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetAutonomousDbVersionsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAutonomousDbVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutonomousDbVersionsArgs Empty = new GetAutonomousDbVersionsArgs();

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only autonomous database resources that match the specified workload type.
     * 
     */
    @Import(name="dbWorkload")
    private @Nullable Output<String> dbWorkload;

    /**
     * @return A filter to return only autonomous database resources that match the specified workload type.
     * 
     */
    public Optional<Output<String>> dbWorkload() {
        return Optional.ofNullable(this.dbWorkload);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetAutonomousDbVersionsFilterArgs>> filters;

    public Optional<Output<List<GetAutonomousDbVersionsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetAutonomousDbVersionsArgs() {}

    private GetAutonomousDbVersionsArgs(GetAutonomousDbVersionsArgs $) {
        this.compartmentId = $.compartmentId;
        this.dbWorkload = $.dbWorkload;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutonomousDbVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutonomousDbVersionsArgs $;

        public Builder() {
            $ = new GetAutonomousDbVersionsArgs();
        }

        public Builder(GetAutonomousDbVersionsArgs defaults) {
            $ = new GetAutonomousDbVersionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param dbWorkload A filter to return only autonomous database resources that match the specified workload type.
         * 
         * @return builder
         * 
         */
        public Builder dbWorkload(@Nullable Output<String> dbWorkload) {
            $.dbWorkload = dbWorkload;
            return this;
        }

        /**
         * @param dbWorkload A filter to return only autonomous database resources that match the specified workload type.
         * 
         * @return builder
         * 
         */
        public Builder dbWorkload(String dbWorkload) {
            return dbWorkload(Output.of(dbWorkload));
        }

        public Builder filters(@Nullable Output<List<GetAutonomousDbVersionsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetAutonomousDbVersionsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetAutonomousDbVersionsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetAutonomousDbVersionsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
