// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs Empty = new ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs();

    /**
     * The repository filter details.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    /**
     * @return The repository filter details.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }

    /**
     * The repository filter type. The only supported value is `PREFIX_MATCH`, which is a repository name prefix specified with the filter parameter.
     * 
     */
    @Import(name="filterType", required=true)
    private Output<String> filterType;

    /**
     * @return The repository filter type. The only supported value is `PREFIX_MATCH`, which is a repository name prefix specified with the filter parameter.
     * 
     */
    public Output<String> filterType() {
        return this.filterType;
    }

    private ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs() {}

    private ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs $) {
        this.filter = $.filter;
        this.filterType = $.filterType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs $;

        public Builder() {
            $ = new ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs();
        }

        public Builder(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs defaults) {
            $ = new ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter The repository filter details.
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter The repository filter details.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param filterType The repository filter type. The only supported value is `PREFIX_MATCH`, which is a repository name prefix specified with the filter parameter.
         * 
         * @return builder
         * 
         */
        public Builder filterType(Output<String> filterType) {
            $.filterType = filterType;
            return this;
        }

        /**
         * @param filterType The repository filter type. The only supported value is `PREFIX_MATCH`, which is a repository name prefix specified with the filter parameter.
         * 
         * @return builder
         * 
         */
        public Builder filterType(String filterType) {
            return filterType(Output.of(filterType));
        }

        public ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.filterType = Objects.requireNonNull($.filterType, "expected parameter 'filterType' to be non-null");
            return $;
        }
    }

}
