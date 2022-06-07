// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Budget.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Budget.inputs.GetBudgetsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBudgetsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBudgetsPlainArgs Empty = new GetBudgetsPlainArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetBudgetsFilter> filters;

    public Optional<List<GetBudgetsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The current state of the resource to filter by.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The current state of the resource to filter by.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The type of target to filter by.
     * * ALL - List all budgets
     * * COMPARTMENT - List all budgets with targetType == &#34;COMPARTMENT&#34;
     * * TAG - List all budgets with targetType == &#34;TAG&#34;
     * 
     */
    @Import(name="targetType")
    private @Nullable String targetType;

    /**
     * @return The type of target to filter by.
     * * ALL - List all budgets
     * * COMPARTMENT - List all budgets with targetType == &#34;COMPARTMENT&#34;
     * * TAG - List all budgets with targetType == &#34;TAG&#34;
     * 
     */
    public Optional<String> targetType() {
        return Optional.ofNullable(this.targetType);
    }

    private GetBudgetsPlainArgs() {}

    private GetBudgetsPlainArgs(GetBudgetsPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
        this.targetType = $.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBudgetsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBudgetsPlainArgs $;

        public Builder() {
            $ = new GetBudgetsPlainArgs();
        }

        public Builder(GetBudgetsPlainArgs defaults) {
            $ = new GetBudgetsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetBudgetsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetBudgetsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state The current state of the resource to filter by.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param targetType The type of target to filter by.
         * * ALL - List all budgets
         * * COMPARTMENT - List all budgets with targetType == &#34;COMPARTMENT&#34;
         * * TAG - List all budgets with targetType == &#34;TAG&#34;
         * 
         * @return builder
         * 
         */
        public Builder targetType(@Nullable String targetType) {
            $.targetType = targetType;
            return this;
        }

        public GetBudgetsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
