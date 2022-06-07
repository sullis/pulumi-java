// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetInstancePoolInstancesFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePoolInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancePoolInstancesArgs Empty = new GetInstancePoolInstancesArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only resources that match the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetInstancePoolInstancesFilterArgs>> filters;

    public Optional<Output<List<GetInstancePoolInstancesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool.
     * 
     */
    @Import(name="instancePoolId", required=true)
    private Output<String> instancePoolId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool.
     * 
     */
    public Output<String> instancePoolId() {
        return this.instancePoolId;
    }

    private GetInstancePoolInstancesArgs() {}

    private GetInstancePoolInstancesArgs(GetInstancePoolInstancesArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.instancePoolId = $.instancePoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancePoolInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancePoolInstancesArgs $;

        public Builder() {
            $ = new GetInstancePoolInstancesArgs();
        }

        public Builder(GetInstancePoolInstancesArgs defaults) {
            $ = new GetInstancePoolInstancesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetInstancePoolInstancesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetInstancePoolInstancesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetInstancePoolInstancesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param instancePoolId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder instancePoolId(Output<String> instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        /**
         * @param instancePoolId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder instancePoolId(String instancePoolId) {
            return instancePoolId(Output.of(instancePoolId));
        }

        public GetInstancePoolInstancesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.instancePoolId = Objects.requireNonNull($.instancePoolId, "expected parameter 'instancePoolId' to be non-null");
            return $;
        }
    }

}
