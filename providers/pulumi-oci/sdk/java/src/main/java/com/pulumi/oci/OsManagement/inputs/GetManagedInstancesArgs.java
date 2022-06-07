// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsManagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.OsManagement.inputs.GetManagedInstancesFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagedInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedInstancesArgs Empty = new GetManagedInstancesArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetManagedInstancesFilterArgs>> filters;

    public Optional<Output<List<GetManagedInstancesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OS family for which to list resources.
     * 
     */
    @Import(name="osFamily")
    private @Nullable Output<String> osFamily;

    /**
     * @return The OS family for which to list resources.
     * 
     */
    public Optional<Output<String>> osFamily() {
        return Optional.ofNullable(this.osFamily);
    }

    private GetManagedInstancesArgs() {}

    private GetManagedInstancesArgs(GetManagedInstancesArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.osFamily = $.osFamily;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedInstancesArgs $;

        public Builder() {
            $ = new GetManagedInstancesArgs();
        }

        public Builder(GetManagedInstancesArgs defaults) {
            $ = new GetManagedInstancesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param displayName A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetManagedInstancesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetManagedInstancesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetManagedInstancesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param osFamily The OS family for which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder osFamily(@Nullable Output<String> osFamily) {
            $.osFamily = osFamily;
            return this;
        }

        /**
         * @param osFamily The OS family for which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder osFamily(String osFamily) {
            return osFamily(Output.of(osFamily));
        }

        public GetManagedInstancesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
